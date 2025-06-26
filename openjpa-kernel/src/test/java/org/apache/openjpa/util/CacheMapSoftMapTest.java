package org.apache.openjpa.util;

import org.apache.openjpa.util.dummies.Dummy;
import org.apache.openjpa.util.dummies.DummyBean;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@Timeout(30)
class CacheMapSoftMapTest {
    public static final float LOAD = .75F;
    public static final int CONCURRENCY_LEVEL = 16;
    private CacheMap cacheMap;

    private static Stream<Arguments> provideDataPutTest() {
        return Stream.of(
                Arguments.of(true, true),
                Arguments.of(false, true),
                Arguments.of(true, false),
                Arguments.of(false, false)
        );
    }

    @BeforeEach
    void setup() {
        cacheMap = new CacheMap(true, 1, 1, LOAD, CONCURRENCY_LEVEL);
        cacheMap.setSoftReferenceSize(1);
    }

    @Test
    void removeTest() {
        Dummy dummy = new Dummy("Test" + 0, 0);
        cacheMap.put(0, dummy);
        for (int i = 1; i < 3; i++) {
            cacheMap.put(i, new Dummy("Test" + i, i));
        }
        assertTrue(cacheMap.softMap.containsKey(0));
        Object deletedValue = cacheMap.remove(0);
        assertEquals(dummy, deletedValue);
    }

    // put/get

    @ParameterizedTest
    @MethodSource("provideDataPutTest")
    void put_getTest(boolean softMap, boolean pinned) {
        if (pinned) {
            cacheMap.pin(0);
        }
        assertTrue(cacheMap.isEmpty());
        cacheMap.put(0, new DummyBean("Test" + 0, 0, false));
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
            cacheMap.put(i, new DummyBean("Test" + i, i, false));
        }
        assertEquals(toInsert, cacheMap.size());
        if (softMap) {
            assertFalse(cacheMap.softMap.isEmpty());
        }
        for (int i = 0; i < toInsert; i++) {
            DummyBean bean = new DummyBean("Test" + i, i, false);
            cacheMap.put(i, bean);
            assertEquals(bean, cacheMap.get(i));
        }
        assertEquals(toInsert, cacheMap.size());
    }

    // containsKey/containsValue

    @Test
    void containsKeyContainsValueTest() {
        assertNull(cacheMap.put(0,0));
        assertTrue(cacheMap.pin(0));
        for (int i = 1; i < 3; i++) {
            assertNull(cacheMap.put(i, i));
        }
        for (int i = 0; i < 3; i++) {
            assertTrue(cacheMap.containsKey(i));
        }
        for (int i = 0; i < 3; i++) {
            assertTrue(cacheMap.containsValue(i));
        }
    }
}
