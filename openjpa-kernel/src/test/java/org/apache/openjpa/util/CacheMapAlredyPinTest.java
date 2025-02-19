package org.apache.openjpa.util;

import org.apache.openjpa.util.dummies.Dummy;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.apache.openjpa.TestMacros.*;
import static org.apache.openjpa.TestMacros.CONCURRENCY_LEVEL;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CacheMapAlredyPinTest {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    private CacheMap cacheMap;

    @Before
    public void setup() {
        cacheMap =  new CacheMap(true, MAX, SIZE, LOAD, CONCURRENCY_LEVEL);
        cacheMap = spy(cacheMap);
    }

    @Test
    public void alreadyPinTest() {
        cacheMap.pin(0);
        assertTrue(cacheMap.getPinnedKeys().contains(0));

        cacheMap.pin(0);
        verify(cacheMap, times(2)).writeLock();
        verify(cacheMap, times(2)).writeUnlock();
        assertTrue(cacheMap.getPinnedKeys().contains(0));
    }

    @Test
    public void alreadyPinPutTest() {
        cacheMap.put(0, new Dummy("Test" + 0, 0));
        cacheMap.pin(0);
        assertTrue(cacheMap.getPinnedKeys().contains(0));

        cacheMap.pin(0);
        verify(cacheMap, times(3)).writeLock();
        verify(cacheMap, times(3)).writeUnlock();
        assertTrue(cacheMap.getPinnedKeys().contains(0));
    }

}
