package org.apache.openjpa.util;

import org.apache.openjpa.util.dummies.Dummy;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.apache.openjpa.TestMacros.CONCURRENCY_LEVEL;
import static org.apache.openjpa.TestMacros.LOAD;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CacheMapRemoveFromSoftMapTest {
    private CacheMap cacheMap;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Before
    public void setup() {
        cacheMap = new CacheMap(true, 1, 1, LOAD, CONCURRENCY_LEVEL);
        cacheMap = spy(cacheMap);
    }

    @Test
    public void removeTest() {
        Dummy dummy = new Dummy("Test" + 0, 0);
        cacheMap.put(0, dummy);
        for (int i = 1; i < 3; i++) {
            cacheMap.put(i, new Dummy("Test" + i, i));
        }
        Object deletedValue = cacheMap.remove(0);
        verify(cacheMap, times(4)).writeLock();
        verify(cacheMap, times(4)).writeUnlock();
        assertEquals(dummy, deletedValue);
    }
}
