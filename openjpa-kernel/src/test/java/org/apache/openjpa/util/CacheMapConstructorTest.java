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
    private static float load;
    private static boolean expectedBehavior;

    public CacheMapConstructorTest(ConstructorParams params) {
        configure(params);
    }

    @Parameterized.Parameters
    public static Collection<ConstructorParams[]> getTestParameters() {
        return Arrays.asList(new ConstructorParams[][]{
                {new ConstructorParams(true, MAX, SIZE, .75F, PASS)}, //0
                {new ConstructorParams(false, MAX, SIZE, .75F, PASS)}, //1
                {new ConstructorParams(true, SIZE, MAX, .75F, PASS)},
                {new ConstructorParams(false, SIZE, MAX, .75F, PASS)},
                {new ConstructorParams(true, MAX, MAX, .75F, PASS)},
                {new ConstructorParams(false, MAX, MAX, .75F, PASS)},
                {new ConstructorParams(true, -1, SIZE, .75F, PASS)},
                {new ConstructorParams(false, -1, SIZE, .75F, PASS)},
                {new ConstructorParams(true, 0, SIZE, .75F, FAIL)}, // FAIL because I can't put anything
                {new ConstructorParams(false, 0, SIZE, .75F, FAIL)}, //10
                {new ConstructorParams(true, MAX, -1, .75F, PASS)}, //11
                {new ConstructorParams(false, MAX, -1, .75F, PASS)}, //12
                {new ConstructorParams(true, MAX, 0, .75F, FAIL)}, //13
                {new ConstructorParams(false, MAX, 0, .75F, FAIL)}, //14 //ArithmeticException
        });
    }

    public void configure(ConstructorParams params) {
        lru = params.lru;
        max = params.max;
        size = params.size;
        load = params.load;
        expectedBehavior = params.expectedBehavior;
    }

    @Test
    public void cacheMapConstructorTest() {
        System.out.println("lru = " + lru + ", max = " + max + ", size = " + size);
        CacheMap cacheMap;
        try {
            cacheMap = new CacheMap(lru, max, size, load, 16);
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
        private final float load;
        private final boolean expectedBehavior;

        public ConstructorParams(boolean lru, int max, int size, float load, boolean expectedBehavior) {
            this.lru = lru;
            this.max = max;
            this.size = size;
            this.load = load;
            this.expectedBehavior = expectedBehavior;
        }
    }

}
