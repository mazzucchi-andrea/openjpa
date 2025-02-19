package org.apache.openjpa.util;

import org.apache.openjpa.util.dummies.Dummy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.apache.openjpa.TestMacros.*;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CacheMapConstructorTest {
    private static boolean lru;
    private static int max;
    private static int size;
    private static boolean expectedBehavior;

    public CacheMapConstructorTest(ConstructorParams params) {
        configure(params);
    }

    @Parameterized.Parameters
    public static Collection<ConstructorParams[]> getTestParameters() {
        return Arrays.asList(new ConstructorParams[][]{
                {new ConstructorParams(true, MAX, SIZE, PASS)}, //0
                {new ConstructorParams(false, MAX, SIZE, PASS)}, //1
                {new ConstructorParams(true, SIZE, MAX, PASS)},
                {new ConstructorParams(false, SIZE, MAX, PASS)},
                {new ConstructorParams(true, MAX, MAX, PASS)},
                {new ConstructorParams(false, MAX, MAX, PASS)},
                {new ConstructorParams(true, -1, SIZE, PASS)},
                {new ConstructorParams(false, -1, SIZE, PASS)},
                {new ConstructorParams(true, 0, SIZE, FAIL)}, // FAIL because I can't put anything
                {new ConstructorParams(false, 0, SIZE, FAIL)}, //9
                {new ConstructorParams(true, MAX, -1, PASS)}, //10
                {new ConstructorParams(false, MAX, -1, PASS)}, //11
                {new ConstructorParams(true, MAX, 0, FAIL)}, //12
                {new ConstructorParams(false, MAX, 0, FAIL)}, //13 //ArithmeticException
        });
    }

    public void configure(ConstructorParams params) {
        lru = params.lru;
        max = params.max;
        size = params.size;
        expectedBehavior = params.expectedBehavior;
    }

    @Test
    public void cacheMapConstructorTest() {
        CacheMap cacheMap;
        try {
            cacheMap = new CacheMap(lru, max, size, LOAD, CONCURRENCY_LEVEL);
        } catch (IllegalArgumentException iae) {
            assertFalse(iae.getMessage(), expectedBehavior);
            return;
        }
        if (lru) {
            assertTrue(cacheMap.isLRU());
        } else {
            assertFalse(cacheMap.isLRU());
        }
        assertEquals("Max: ", max, cacheMap.getCacheSize());
        assertTrue(cacheMap.isEmpty());
        int numPuts;
        if (max < 0)
            numPuts = size;
        else if (max == 0)
            numPuts = 1;
        else {
            numPuts = max;
        }
        try {
            for (int i = 0; i < numPuts * 2; i++)
                cacheMap.put(i, new Dummy("Test" + i, i));
        } catch (ArithmeticException ae) {
            assertFalse(ae.getMessage(), expectedBehavior);
            return;
        }
        if (cacheMap.isEmpty() && !expectedBehavior) {
            return;
        }
        assertEquals(cacheMap.size(), numPuts * 2);
        assertTrue(expectedBehavior);
    }

    public static class ConstructorParams {
        private final boolean lru;
        private final int max;
        private final int size;
        private final boolean expectedBehavior;

        public ConstructorParams(boolean lru, int max, int size, boolean expectedBehavior) {
            this.lru = lru;
            this.max = max;
            this.size = size;
            this.expectedBehavior = expectedBehavior;
        }
    }

}
