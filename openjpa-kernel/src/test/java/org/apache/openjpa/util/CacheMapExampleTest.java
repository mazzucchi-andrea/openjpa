package org.apache.openjpa.util;

import org.apache.openjpa.util.dummies.Dummy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@Timeout(30)
public class CacheMapExampleTest {
    public static final int MAX = 100;
    public static final int SIZE = MAX / 2;
    public static final float LOAD = .75F;
    public static final int CONCURRENCY_LEVEL = 16;

    private CacheMap cacheMap;

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

    @BeforeEach
    void setup() {
        cacheMap = new CacheMap(true, MAX, SIZE, LOAD, CONCURRENCY_LEVEL);
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
        Object deletedValue = cacheMap.remove(key);
        assertTrue(cacheMap.isEmpty());
        if (pinned) {
            assertEquals(1, cacheMap.getPinnedKeys().size());
        }
        if (!empty) {
            assertEquals(value, deletedValue);
        } else {
            assertNull(deletedValue);
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
}
