package org.apache.openjpa.util;

import org.apache.openjpa.util.dummies.Dummy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@Timeout(30)
class CacheMapTest {
    public static final int MAX = 100;
    public static final int SIZE = MAX / 2;
    public static final float LOAD = .75F;
    public static final int CONCURRENCY_LEVEL = 16;
    private static final int NUM_ELEM = 10;

    private CacheMap cacheMap;

    @BeforeEach
    void setup() {
        cacheMap = new CacheMap(true, MAX, SIZE, LOAD, CONCURRENCY_LEVEL);
    }

    public static Stream<Arguments> provideDataRemoveTest() {
        return Stream.of(
                Arguments.of(null, null, true, true),
                Arguments.of(null, null, true, false),
                Arguments.of(null, null, false, true),
                Arguments.of(null, null, false, false),

                Arguments.of(new Object(), null, true, true),
                Arguments.of(new Object(), null, true, false),
                Arguments.of(new Object(), null, false, true),
                Arguments.of(new Object(), null, false, false),

                Arguments.of(new Object(), new Object(), true, true),
                Arguments.of(new Object(), new Object(), true, false),
                Arguments.of(new Object(), new Object(), false, true),
                Arguments.of(new Object(), new Object(), false, false)
        );
    }

    public static Stream<Arguments> provideDataPinTest() {
        return Stream.of(
                Arguments.of(null, null, false),
                Arguments.of(new Object(), new Object(), false),
                Arguments.of(0, new Dummy("Test" + 0, 0), false),
                Arguments.of(new Object(), null, false),
                Arguments.of(null, new Object(), false),
                Arguments.of(null, null, true),
                Arguments.of(new Object(), new Object(), true),
                Arguments.of(0, new Dummy("Test" + 0, 0), true),
                Arguments.of(new Object(), null, true),
                Arguments.of(null, new Object(), true)
        );

    }

    public static Stream<Arguments> provideDataPutTest() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(1L, 1),
                Arguments.of("k1", 1),
                Arguments.of(1, 1L),
                Arguments.of(1L, 1L),
                Arguments.of("k1", 1L),
                Arguments.of(1, "v1"),
                Arguments.of(1L, "v1"),
                Arguments.of("k1", "v1"),
                Arguments.of(1, null),
                Arguments.of(1L, null),
                Arguments.of("k1", null),
                Arguments.of(0, new Dummy("Test" + 0, 0)),
                Arguments.of(null, 1)
        );
    }

    static Stream<Arguments> provideDataPutAllTest() {
        return Stream.of(
                Arguments.of(fillMapWithInteger(new HashMap<>())),
                Arguments.of(fillMapWithString(new HashMap<>())),
                Arguments.of(fillMapWithDummy(new HashMap<>()))
        );
    }

    private static Map<Integer, String> fillMapWithString(Map<Integer, String> map) {
        for (int i = 0; i < NUM_ELEM; i++) {
            map.put(i, ("Test" + i));
        }
        return map;
    }

    private static Map<Integer, Integer> fillMapWithInteger(Map<Integer, Integer> map) {
        for (int i = 0; i < NUM_ELEM; i++) {
            map.put(i, i);
        }
        return map;
    }

    private static Map<Integer, Dummy> fillMapWithDummy(Map<Integer, Dummy> map) {
        for (int i = 0; i < NUM_ELEM; i++) {
            map.put(i, new Dummy(("Test" + i), i));
        }
        return map;
    }

    private boolean assertMap(Map<?, ?> orig, Map<?, ?> copy) {
        if (orig.size() != copy.size()) {
            return false; // Different sizes = Not equal
        }

        for (Map.Entry<?, ?> entry : orig.entrySet()) {
            Object key = entry.getKey();
            Object origValue = entry.getValue();
            Object copyValue = copy.get(key);

            // If key is missing in copy
            if (!copy.containsKey(key)) {
                return false;
            }

            // Special handling for Example class
            if (origValue instanceof Dummy && copyValue instanceof Dummy) {
                Dummy o = (Dummy) origValue;
                Dummy c = (Dummy) copyValue;
                if (!o.getStr().equals(c.getStr()) || o.getI() != c.getI()) {
                    return false;
                }
            }
            // Use standard equals() for other types
            else if (!Objects.equals(origValue, copyValue)) {
                return false;
            }
        }

        return true; // If all keys and values match
    }

    // put/get

    @ParameterizedTest
    @MethodSource("provideDataPutTest")
    void put_getTest(Object key, Object value) {
        cacheMap.put(key, value);
        assertEquals(value, cacheMap.get(key));
        assertEquals(1, cacheMap.size());
    }

    // putAll

    @ParameterizedTest
    @MethodSource("provideDataPutAllTest")
    void putAllTest(Map<?, ?> map) {
        cacheMap.putAll(map);
        assertEquals(map.size(), cacheMap.size());
        assertTrue(assertMap(map, cacheMap.cacheMap));
    }

    // remove

    @ParameterizedTest
    @MethodSource("provideDataRemoveTest")
    void removeTest(Object key, Object value, boolean empty, boolean pinned) {
        if (!empty) {
            cacheMap.put(key, value);
        }
        if (pinned) {
            cacheMap.pin(key);
        }
        Object removedValue = cacheMap.remove(key);
        assertTrue(cacheMap.isEmpty());
        if (pinned) {
            assertEquals(1, cacheMap.getPinnedKeys().size());
        }
        if (!empty) {
            assertEquals(value, removedValue);
        } else {
            assertNull(removedValue);
        }
        Object val = cacheMap.get(key);
        assertNull(val);
    }

    // pin

    @ParameterizedTest
    @MethodSource("provideDataPinTest")
    void pinTest(Object key, Object value, boolean empty) {
        if (!empty) {
            cacheMap.put(key, value);
            assertFalse(cacheMap.isEmpty());
        }
        cacheMap.pin(key);
        assertTrue(cacheMap.getPinnedKeys().contains(key));
    }

    @Test
    void alreadyPinTest() {
        cacheMap.pin(0);
        assertTrue(cacheMap.getPinnedKeys().contains(0));

        cacheMap.pin(0);
        assertTrue(cacheMap.getPinnedKeys().contains(0));
    }

    @Test
    void alreadyPinPutTest() {
        cacheMap.put(0, new Dummy("Test" + 0, 0));
        cacheMap.pin(0);
        assertTrue(cacheMap.getPinnedKeys().contains(0));

        cacheMap.pin(0);

        assertTrue(cacheMap.getPinnedKeys().contains(0));
    }
}
