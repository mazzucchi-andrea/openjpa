package org.apache.openjpa.util;

import org.apache.openjpa.util.dummies.Dummy;
import org.junit.jupiter.api.Test;
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
                Arguments.of(true, SIZE, SIZE),
                Arguments.of(false, SIZE, SIZE),
                Arguments.of(true, -1, SIZE),
                Arguments.of(false, -1, SIZE),
                Arguments.of(true, MAX, -1),
                Arguments.of(false, MAX, -1),
                Arguments.of(true, 1, 1),
                Arguments.of(false, 1, 1)
        );
    }

    private static Stream<Arguments> provideInvalidDataConstructorTest() {
        return Stream.of(
                Arguments.of(true, 0, SIZE, 0), // Invalid because I can't put anything
                Arguments.of(false, 0, SIZE, 0),
                Arguments.of(true, MAX, 0, 0),
                Arguments.of(false, MAX, 0, 0) //ArithmeticException
        );
    }

    private static Stream<Arguments> provideDataLRUConstructorTest() {
        return Stream.of(
                Arguments.of(true),
                Arguments.of(false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideDataConstructorTest")
    void cacheMapConstructorTest(boolean lru, int max, int size) {
        CacheMap cacheMap = new CacheMap(lru, max, size, LOAD, CONCURRENCY_LEVEL);
        assertEquals(lru, cacheMap.isLRU());
        int maxSize = cacheMap.cacheMap.getMaxSize();
        int cacheSize = cacheMap.getCacheSize();
        assertEquals(max, cacheSize);
        assertTrue(cacheMap.isEmpty());
        if (maxSize != Integer.MAX_VALUE) {
            for (int i = 0; i < cacheSize + 1; i++) {
                cacheMap.put(i, new Dummy("Test" + i, i));
            }
            assertEquals(cacheSize + 1, cacheMap.size());
            assertEquals(1, cacheMap.softMap.size());
        }
    }

    @ParameterizedTest
    @MethodSource("provideInvalidDataConstructorTest")
    void cacheMapConstructorInvalidDataTest(boolean lru, int max, int size, int expectedSize) {
        CacheMap cacheMap;
        if (lru && size <= 0) {
            assertThrows(Exception.class, () -> new CacheMap(true, max, size, LOAD, CONCURRENCY_LEVEL));
            return;
        } else {
            cacheMap = new CacheMap(lru, max, size, LOAD, CONCURRENCY_LEVEL);
        }
        assertEquals(lru, cacheMap.isLRU());
        int cacheSize = cacheMap.getCacheSize();
        assertEquals(max, cacheSize);
        assertTrue(cacheMap.isEmpty());
        if (lru) {
            for (int i = 0; i < cacheSize + 1; i++) {
                cacheMap.put(i, new Dummy("Test" + i, i));
            }
        }
        assertEquals(expectedSize, cacheMap.size());
    }

    @Test
    void cacheMapConstructor2Test() {
        CacheMap cacheMap = new CacheMap();
        assertFalse(cacheMap.isLRU());
        int cacheSize = cacheMap.getCacheSize();
        assertEquals(1000, cacheSize);
        assertTrue(cacheMap.isEmpty());
        for (int i = 0; i < cacheSize + 1; i++) {
            cacheMap.put(i, new Dummy("Test" + i, i));
        }
        assertEquals(cacheSize + 1, cacheMap.size());
        assertEquals(1, cacheMap.softMap.size());
    }

    @ParameterizedTest
    @MethodSource("provideDataLRUConstructorTest")
    void cacheMapConstructorLRUTest(boolean lru) {
        CacheMap cacheMap = new CacheMap(lru);
        assertEquals(lru, cacheMap.isLRU());
        int cacheSize = cacheMap.getCacheSize();
        assertEquals(1000, cacheSize);
        assertTrue(cacheMap.isEmpty());
        for (int i = 0; i < cacheSize + 1; i++) {
            cacheMap.put(i, new Dummy("Test" + i, i));
        }
        assertEquals(cacheSize + 1, cacheMap.size());
        assertEquals(1, cacheMap.softMap.size());
    }
}
