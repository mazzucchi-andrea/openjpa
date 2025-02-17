package org.apache.openjpa.util;

import org.apache.openjpa.util.dummies.Dummy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.apache.openjpa.TestMacros.PASS;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(Parameterized.class)
public class CacheMapPinTest {
    private static Object key;
    private static Object value;
    private static boolean empty;
    private static boolean expectedBehaviour;

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

    @Test
    public void pinUnpinTest() {
        CacheMap cacheMap = new CacheMap(true);
        if (!empty) {
            cacheMap.put(key, value);
            System.out.println("cacheMap size after put: " + cacheMap.size());
            assertFalse(cacheMap.isEmpty());
        }
        cacheMap.pin(key); //test pin
        System.out.println("PinnedMap size after pin: " + cacheMap.getPinnedKeys().size());
        assertEquals(expectedBehaviour, cacheMap.getPinnedKeys().contains(key));

        if (expectedBehaviour) {
            cacheMap.unpin(key);
            assertEquals(!expectedBehaviour, cacheMap.getPinnedKeys().contains(key));
        }
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
