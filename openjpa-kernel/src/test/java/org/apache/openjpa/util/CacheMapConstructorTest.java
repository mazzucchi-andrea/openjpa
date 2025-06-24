package org.apache.openjpa.util;

import org.apache.openjpa.util.dummies.Dummy;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


@Timeout(30)
class CacheMapConstructorTest {
    public static final float LOAD = .75F;
    public static final int CONCURRENCY_LEVEL = 16;
    private static final int MAX = 100;
    private static final int SIZE = MAX / 2;

    private static Stream<Arguments> provideDataConstructorTest() {
        return Stream.of(
                Arguments.of(true, MAX, SIZE),
                Arguments.of(false, MAX, SIZE),
                Arguments.of(true, SIZE, MAX),
                Arguments.of(false, SIZE, MAX),
                Arguments.of(true, MAX, MAX),
                Arguments.of(false, MAX, MAX),
                Arguments.of(true, -1, SIZE),
                Arguments.of(false, -1, SIZE),
                Arguments.of(true, MAX, -1),
                Arguments.of(false, MAX, -1)
        );
    }

    private static Stream<Arguments> provideInvalidDataConstructorTest() {
        return Stream.of(
                Arguments.of(true, 0, SIZE), // Invalid because I can't put anything
                Arguments.of(false, 0, SIZE),
                Arguments.of(true, MAX, 0),
                Arguments.of(false, MAX, 0) //ArithmeticException
        );
    }

    @ParameterizedTest
    @MethodSource("provideDataConstructorTest")
    void cacheMapConstructorTest(boolean lru, int max, int size) {
        CacheMap cacheMap = new CacheMap(lru, max, size, LOAD, CONCURRENCY_LEVEL);
        if (lru) {
            assertTrue(cacheMap.isLRU());
        } else {
            assertFalse(cacheMap.isLRU());
        }
        assertEquals(max, cacheMap.getCacheSize());
        assertTrue(cacheMap.isEmpty());
        int numPuts;
        if (max < 0)
            numPuts = size;
        else if (max == 0)
            numPuts = 1;
        else {
            numPuts = max;
        }
        for (int i = 0; i < numPuts * 2; i++)
            cacheMap.put(i, new Dummy("Test" + i, i));
        assertEquals(cacheMap.size(), numPuts * 2);
    }

    @ParameterizedTest
    @MethodSource("provideInvalidDataConstructorTest")
    void cacheMapConstructorInvalidDataTest(boolean lru, int max, int size) {
        CacheMap cacheMap;
        if (lru && size <= 0) {
            assertThrows(Exception.class, () -> new CacheMap(true, max, size, LOAD, CONCURRENCY_LEVEL));
            return;
        } else {
            cacheMap = new CacheMap(lru, max, size, LOAD, CONCURRENCY_LEVEL);
        }
        if (lru) {
            assertTrue(cacheMap.isLRU());
        } else {
            assertFalse(cacheMap.isLRU());
        }
        assertEquals(max, cacheMap.getCacheSize());
        assertTrue(cacheMap.isEmpty());
        int numPuts;
        if (max < 0)
            numPuts = size;
        else if (max == 0)
            numPuts = 1;
        else {
            numPuts = max;
        }
        for (int i = 0; i < numPuts * 2; i++) {
            if (size <= 0) {
                int j = i;
                Dummy dummy = new Dummy("Test" + j, j);
                assertThrows(ArithmeticException.class, () -> cacheMap.put(j, dummy));
                return;
            } else {
                cacheMap.put(i, new Dummy("Test" + i, i));
            }
        }
        assertNotEquals(cacheMap.size(), numPuts * 2);
    }
}
