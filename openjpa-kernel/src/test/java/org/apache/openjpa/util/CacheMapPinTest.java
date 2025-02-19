package org.apache.openjpa.util;

import org.apache.openjpa.util.dummies.Dummy;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.Arrays;
import java.util.Collection;

import static org.apache.openjpa.TestMacros.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

@RunWith(Parameterized.class)
public class CacheMapPinTest {
    private static Object key;
    private static Object value;
    private static boolean empty;
    private static boolean expectedBehaviour;

    CacheMap cacheMap;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    public CacheMapPinTest(CacheMapPinTestParams params) {
        configure(params);
    }

    @Parameterized.Parameters
    public static Collection<CacheMapPinTestParams[]> getParameters() {
        return Arrays.asList(new CacheMapPinTestParams[][]{
                {new CacheMapPinTestParams(null, null, false, PASS)},
                {new CacheMapPinTestParams(new Object(), new Object(), false, PASS)},
                {new CacheMapPinTestParams(0, new Dummy("Test" + 0, 0), false, PASS)},
                {new CacheMapPinTestParams(new Object(), null, false, PASS)},
                {new CacheMapPinTestParams(null, new Object(), false, PASS)},
                {new CacheMapPinTestParams(null, null, true, PASS)},
                {new CacheMapPinTestParams(new Object(), new Object(), true, PASS)},
                {new CacheMapPinTestParams(0, new Dummy("Test" + 0, 0), true, PASS)},
                {new CacheMapPinTestParams(new Object(), null, true, PASS)},
                {new CacheMapPinTestParams(null, new Object(), true, PASS)},
        });

    }

    public void configure(CacheMapPinTestParams params) {
        key = params.key;
        value = params.value;
        empty = params.empty;
        expectedBehaviour = params.expectedBehaviour;
    }

    @Before
    public void setup() {
        cacheMap = new CacheMap(true, MAX, SIZE, LOAD, CONCURRENCY_LEVEL);
        if (!empty) {
            cacheMap.put(key, value);
            assertFalse(cacheMap.isEmpty());
        }
        cacheMap = spy(cacheMap);
    }

    @Test
    public void pinTest() {
        cacheMap.pin(key);
        verify(cacheMap).writeLock();
        verify(cacheMap).writeUnlock();

        assertEquals(expectedBehaviour, cacheMap.getPinnedKeys().contains(key));
        assertTrue(expectedBehaviour);
    }

    public static class CacheMapPinTestParams {
        private final Object key;
        private final Object value;
        private final boolean empty;
        private final boolean expectedBehaviour;

        public CacheMapPinTestParams(Object key, Object value, boolean empty, boolean expectedBehaviour) {
            this.key = key;
            this.value = value;
            this.empty = empty;
            this.expectedBehaviour = expectedBehaviour;
        }
    }
}
