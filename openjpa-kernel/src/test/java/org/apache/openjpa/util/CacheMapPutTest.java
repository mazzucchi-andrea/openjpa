package org.apache.openjpa.util;

import org.apache.openjpa.util.dummies.Dummy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.apache.openjpa.TestMacros.MAX;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CacheMapPutTest {

    private int maxSize;
    private boolean pinned; //pin a certain key
    private boolean full;
    private boolean over; //put something in softMap

    public CacheMapPutTest(CachePutTestParams params) {
        configure(params);
    }

    @Parameterized.Parameters
    public static Collection<CachePutTestParams[]> getParameters() {
        return Arrays.asList(new CachePutTestParams[][]{
                {new CachePutTestParams(MAX, true, false, true)},
                {new CachePutTestParams(MAX, false, false, true)},
                {new CachePutTestParams(MAX, true, false, false)},
                {new CachePutTestParams(MAX, false, false, false)},
                {new CachePutTestParams(MAX, true, true, true)},
                {new CachePutTestParams(MAX, true, true, false)},
        });
    }

    private void configure(CachePutTestParams params) {
        maxSize = params.maxSize;
        pinned = params.pinned;
        full = params.full;
        over = params.over;
    }

    @Test
    public void putTest() {
        CacheMap cacheMap;
        if (maxSize == 1) {
            cacheMap = new CacheMap(true, 1, 1, .75F, 16);
        } else {
            cacheMap = new CacheMap(true, maxSize);
        }

        if (pinned)
            cacheMap.pin(0);

        int numPuts = maxSize / 2;
        if (full)
            numPuts = maxSize;
        if (over)
            numPuts = maxSize * 2;

        for (int i = 0; i < numPuts; i++) {
            cacheMap.put(i, new Dummy("Test" + i, i));
        }
        assertEquals(numPuts, cacheMap.size()); //check all puts

        if (over) {
            assertFalse(cacheMap.softMap.isEmpty());
        }

        if (pinned) {
            assertTrue(cacheMap.softMap.size() + cacheMap.cacheMap.size() < numPuts);
        }
    }

    public static class CachePutTestParams {
        private final int maxSize;
        private final boolean full;
        private final boolean over;
        private final boolean pinned;

        public CachePutTestParams(int maxSize, boolean full, boolean over, boolean pinned) {
            this.maxSize = maxSize;
            this.full = full;
            this.over = over;
            this.pinned = pinned;
        }
    }

}
