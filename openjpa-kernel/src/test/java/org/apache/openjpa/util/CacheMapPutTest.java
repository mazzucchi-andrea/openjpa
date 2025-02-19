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
import static org.mockito.Mockito.*;

@RunWith(Parameterized.class)
public class CacheMapPutTest {
    private boolean softMap;
    private boolean pinned; //pin a certain key

    CacheMap cacheMap;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    public CacheMapPutTest(CachePutTestParams params) {
        configure(params);
    }

    @Parameterized.Parameters
    public static Collection<CachePutTestParams[]> getParameters() {
        return Arrays.asList(new CachePutTestParams[][]{
                {new CachePutTestParams(true, true)},
                {new CachePutTestParams(false, true)},
                {new CachePutTestParams(true, false)},
                {new CachePutTestParams(false, false)},
        });
    }

    private void configure(CachePutTestParams params) {
        softMap = params.softMap;
        pinned = params.pinned;
    }

    @Before
    public void setup() {
        cacheMap = new CacheMap(true, 1, 1, LOAD, CONCURRENCY_LEVEL);
        if (pinned) {
            cacheMap.pin(0);
        }
        cacheMap = spy(cacheMap);
    }

    @Test
    public void putTest() {
        assertTrue(cacheMap.isEmpty());

        cacheMap.put(0, new Dummy("Test" + 0, 0));
        assertEquals(1, cacheMap.size());

        if (pinned) {
            assertEquals(0, cacheMap.softMap.size() + cacheMap.cacheMap.size());
            assertEquals(1, cacheMap.pinnedMap.size());
        }
        int toInsert = 1;
        if (softMap) {
            toInsert = 2;
            if (pinned) toInsert++;
        }
        for (int i = 0; i < toInsert; i++) {
            cacheMap.put(i, new Dummy("Test" + i, i));
        }
        assertEquals(toInsert, cacheMap.size());

        if (softMap) {
            assertFalse(cacheMap.softMap.isEmpty());
        }

        for (int i = 0; i < toInsert; i++) {
            cacheMap.put(i, new Dummy("Test" + i, i));
        }
        assertEquals(toInsert, cacheMap.size());

        verify(cacheMap, times(1 + toInsert * 2)).writeLock();
        verify(cacheMap, times(1 + toInsert * 2)).writeUnlock();
    }

    public static class CachePutTestParams {
        private final boolean softMap;
        private final boolean pinned;

        public CachePutTestParams(boolean softMap, boolean pinned) {
            this.softMap = softMap;
            this.pinned = pinned;
        }
    }

}
