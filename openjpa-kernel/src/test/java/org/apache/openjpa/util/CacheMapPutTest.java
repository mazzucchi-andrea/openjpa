package org.apache.openjpa.util;

import org.apache.openjpa.util.dummies.Dummy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.apache.openjpa.TestMacros.CONCURRENCY_LEVEL;
import static org.apache.openjpa.TestMacros.LOAD;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CacheMapPutTest {
    private boolean softMap;
    private boolean pinned; //pin a certain key


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

    @Test
    public void putTest() {
        CacheMap cacheMap = new CacheMap(true, 1, 1, LOAD, CONCURRENCY_LEVEL);
        if (pinned) {
            cacheMap.pin(0);
        }
        cacheMap.put(0, new Dummy("Test" + 0, 0));
        assertEquals(1, cacheMap.size());
        if (pinned) {
            assertEquals(0, cacheMap.softMap.size() + cacheMap.cacheMap.size());
        }
        int toInsert = 1;
        if (softMap) {
            toInsert = 2;
            if (pinned) toInsert++;
        }
        for (int i = 0; i < toInsert; i++) {
            cacheMap.put(i, new Dummy("Test" + i, i));
        }
        if (softMap) {
            assertFalse(cacheMap.softMap.isEmpty());
        }
        for (int i = 0; i < toInsert; i++) {
            cacheMap.put(i, new Dummy("Test" + i, i));
        }
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
