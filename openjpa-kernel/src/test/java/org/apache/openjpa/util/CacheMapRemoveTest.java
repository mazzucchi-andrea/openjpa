package org.apache.openjpa.util;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.apache.openjpa.TestMacros.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(Parameterized.class)
public class CacheMapRemoveTest {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    private Object key;
    private Object value;
    private boolean empty;
    private boolean pinned;
    private CacheMap cacheMap;

    public CacheMapRemoveTest(CacheRemoveTestParams params) {
        configure(params);
    }

    @Parameterized.Parameters
    public static Collection<CacheRemoveTestParams> getParameters() {
        List<CacheRemoveTestParams> cacheRemoveTestParams = new ArrayList<>();

        cacheRemoveTestParams.add(new CacheRemoveTestParams(null, null, true, true));
        cacheRemoveTestParams.add(new CacheRemoveTestParams(null, null, true, false));
        cacheRemoveTestParams.add(new CacheRemoveTestParams(null, null, false, true));
        cacheRemoveTestParams.add(new CacheRemoveTestParams(null, null, false, false));

        cacheRemoveTestParams.add(new CacheRemoveTestParams(new Object(), null, true, true));
        cacheRemoveTestParams.add(new CacheRemoveTestParams(new Object(), null, true, false));
        cacheRemoveTestParams.add(new CacheRemoveTestParams(new Object(), null, false, true));
        cacheRemoveTestParams.add(new CacheRemoveTestParams(new Object(), null, false, false));

        cacheRemoveTestParams.add(new CacheRemoveTestParams(new Object(), new Object(), true, true));
        cacheRemoveTestParams.add(new CacheRemoveTestParams(new Object(), new Object(), true, false));
        cacheRemoveTestParams.add(new CacheRemoveTestParams(new Object(), new Object(), false, true));
        cacheRemoveTestParams.add(new CacheRemoveTestParams(new Object(), new Object(), false, false));
        return cacheRemoveTestParams;
    }

    private void configure(CacheRemoveTestParams params) {
        key = params.key;
        value = params.value;
        empty = params.empty;
        pinned = params.pinned;
    }

    @Before
    public void setup() {
        cacheMap = new CacheMap(true, MAX, SIZE, LOAD, CONCURRENCY_LEVEL);
        if (!empty) {
            cacheMap.put(key, value);
        }
        if (pinned) {
            cacheMap.pin(key);
        }
        cacheMap = spy(cacheMap);
    }

    @Test
    public void removeTest() {
        Object deletedValue = cacheMap.remove(key);
        verify(cacheMap).writeLock();
        verify(cacheMap).writeUnlock();

        assertTrue(cacheMap.isEmpty());
        if (pinned) {
            assertEquals(1, cacheMap.getPinnedKeys().size());
        }
        if (!empty) {
            assertEquals(value, deletedValue);
        } else {
            assertNull(deletedValue);
        }
        Object val = cacheMap.get(key);
        if (pinned) {
            verify(cacheMap, times(3)).readLock();
            verify(cacheMap, times(3)).readUnlock();
        } else {
            verify(cacheMap, times(2)).readLock();
            verify(cacheMap, times(2)).readUnlock();
        }
        assertNull(val);
    }

    public static class CacheRemoveTestParams {
        private final Object key;
        private final Object value;
        private final boolean empty;
        private final boolean pinned;

        public CacheRemoveTestParams(Object key, Object value, boolean empty, boolean pinned) {
            this.key = key;
            this.value = value;
            this.empty = empty;
            this.pinned = pinned;
        }
    }

}
