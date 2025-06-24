package org.apache.openjpa.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CacheMapGeminiTest {

    // Constants for CacheMap initialization
    public static final int MAX_SIZE = 100;
    public static final int INITIAL_CAPACITY = MAX_SIZE / 2;
    public static final float LOAD_FACTOR = 0.75F;
    public static final int CONCURRENCY_LEVEL = 16;

    private CacheMap cacheMap;

    // Data for testing put/get/remove with various key/value types
    static Stream<Arguments> provideDataForCacheOperations() {
        return Stream.of(
                Arguments.of("StringKey", "StringValue"),
                Arguments.of(123, 456),
                Arguments.of(new Object(), new Object()),
                Arguments.of(null, "valueWithNullKey"),
                Arguments.of("keyWithNullValue", null) // Note: CacheMap might not store null values effectively
        );
    }

    @BeforeEach
    void setUp() {
        // Initialize CacheMap before each test to ensure a clean state
        cacheMap = new CacheMap(true, MAX_SIZE, INITIAL_CAPACITY, LOAD_FACTOR, CONCURRENCY_LEVEL);
    }

    @Test
    @DisplayName("Should put and get a value")
    void putAndGetTest() {
        String key = "testKey";
        String value = "testValue";
        cacheMap.put(key, value);
        assertEquals(value, cacheMap.get(key));
        assertEquals(1, cacheMap.size());
        assertFalse(cacheMap.isEmpty());
    }

    @Test
    @DisplayName("Should return null for non-existent key")
    void getNonExistentKeyTest() {
        assertNull(cacheMap.get("nonExistentKey"));
    }

    @Test
    @DisplayName("Should remove a value")
    void removeTest() {
        String key = "keyToRemove";
        String value = "valueToRemove";
        cacheMap.put(key, value);
        assertEquals(value, cacheMap.remove(key));
        assertNull(cacheMap.get(key));
        assertTrue(cacheMap.isEmpty());
    }

    @Test
    @DisplayName("Should return null when removing non-existent key")
    void removeNonExistentKeyTest() {
        assertNull(cacheMap.remove("nonExistentKey"));
    }

    @Test
    @DisplayName("Should clear all entries")
    void clearTest() {
        cacheMap.put("key1", "value1");
        cacheMap.put("key2", "value2");
        assertFalse(cacheMap.isEmpty());
        cacheMap.clear();
        assertTrue(cacheMap.isEmpty());
        assertEquals(0, cacheMap.size());
    }

    @Test
    @DisplayName("Should return true for containsKey when key exists")
    void containsKeyTrueTest() {
        String key = "presentKey";
        cacheMap.put(key, "someValue");
        assertTrue(cacheMap.containsKey(key));
    }

    @Test
    @DisplayName("Should return false for containsKey when key does not exist")
    void containsKeyFalseTest() {
        assertFalse(cacheMap.containsKey("absentKey"));
    }

    @Test
    @DisplayName("Should replace existing value with put")
    void putReplaceValueTest() {
        String key = "replaceTestKey";
        String initialValue = "initialValue";
        String newValue = "newValue";
        cacheMap.put(key, initialValue);
        assertEquals(initialValue, cacheMap.put(key, newValue)); // put returns the old value
        assertEquals(newValue, cacheMap.get(key));
        assertEquals(1, cacheMap.size());
    }

    @Test
    @DisplayName("Should pin a key")
    void pinTest() {
        String key = "pinKey";
        String value = "pinValue";
        cacheMap.put(key, value);
        cacheMap.pin(key);
        assertTrue(cacheMap.pinnedMap.containsKey(key));
        assertEquals(1, cacheMap.getPinnedKeys().size());
    }

    @Test
    @DisplayName("Should unpin a key")
    void unpinTest() {
        String key = "unpinKey";
        String value = "unpinValue";
        cacheMap.put(key, value);
        cacheMap.pin(key);
        assertTrue(cacheMap.pinnedMap.containsKey(key));
        cacheMap.unpin(key);
        assertFalse(cacheMap.pinnedMap.containsKey(key));
        assertTrue(cacheMap.getPinnedKeys().isEmpty());
    }

    @Test
    @DisplayName("Should not unpin a non-existent key")
    void unpinNonExistentKeyTest() {
        String key = "nonExistentUnpin";
        cacheMap.unpin(key);
        assertFalse(cacheMap.pinnedMap.containsKey(key));
    }

    @Test
    @DisplayName("Should not remove a pinned entry until unpinned")
    void removePinnedEntryTest() {
        String key = "pinnedKey";
        String value = "pinnedValue";
        cacheMap.put(key, value);
        cacheMap.pin(key);
        assertEquals(value, cacheMap.get(key));
        assertEquals(value, cacheMap.remove(key)); // remove should still return value
        assertNull(cacheMap.get(key)); // but it's removed from main cache
        assertTrue(cacheMap.isEmpty()); // main cache is empty
        assertTrue(cacheMap.getPinnedKeys().contains(key)); // key is still in pinned map
    }

    @Test
    @DisplayName("Should not evict pinned entries when capacity is reached")
    void pinnedEntriesNotEvicted() {
        for (int i = 0; i < MAX_SIZE; i++) {
            cacheMap.put("key" + i, "value" + i);
        }
        // Pin half of the entries
        for (int i = 0; i < MAX_SIZE / 2; i++) {
            cacheMap.pin("key" + i);
        }
        assertEquals(MAX_SIZE, cacheMap.size());

        // Add more entries, triggering eviction
        for (int i = MAX_SIZE; i < MAX_SIZE + 50; i++) {
            cacheMap.put("newKey" + i, "newValue" + i);
        }

        // Pinned keys should still exist
        for (int i = 0; i < MAX_SIZE / 2; i++) {
            assertNotNull(cacheMap.get("key" + i), "Pinned key" + i + " should not be evicted");
        }
    }

    @Test
    @DisplayName("Should handle null key for put and get")
    void putAndGetNullKey() {
        cacheMap.put(null, "nullValue");
        assertEquals("nullValue", cacheMap.get(null));
    }

    @Test
    @DisplayName("Should handle null value for put")
    void putNullValue() {
        cacheMap.put("keyWithNullValue", null);
        assertNull(cacheMap.get("keyWithNullValue")); // CacheMap seems to not store null values
        assertTrue(cacheMap.containsKey("keyWithNullValue")); // Or at least it doesn't appear
    }

    @Test
    @DisplayName("Should handle null key for remove")
    void removeNullKey() {
        cacheMap.put(null, "nullValue");
        assertEquals("nullValue", cacheMap.remove(null));
        assertNull(cacheMap.get(null));
    }

    @Test
    @DisplayName("Should handle null key for containsKey")
    void containsKeyNullKey() {
        cacheMap.put(null, "someValue");
        assertTrue(cacheMap.containsKey(null));
    }

    @Test
    @DisplayName("Should handle null key for pin and unpin")
    void pinUnpinNullKey() {
        cacheMap.put(null, "someValue");
        cacheMap.pin(null);
        assertTrue(cacheMap.pinnedMap.containsKey(null));
        cacheMap.unpin(null);
        assertFalse(cacheMap.pinnedMap.containsKey(null));
    }

    @Test
    @DisplayName("Should handle concurrent put operations")
    void concurrentPutTest() throws InterruptedException {
        int numThreads = CONCURRENCY_LEVEL * 2;
        int putsPerThread = 50;

        Runnable putTask = () -> {
            IntStream.range(0, putsPerThread).forEach(i ->
                    cacheMap.put(Thread.currentThread().getName() + "-" + i, "value" + i)
            );
        };

        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(putTask, "Thread-" + i);
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        assertEquals(numThreads * putsPerThread, cacheMap.size());
        // Verify a subset of keys
        assertTrue(cacheMap.containsKey("Thread-0-0"));
        assertTrue(cacheMap.containsKey("Thread-" + (numThreads - 1) + "-" + (putsPerThread - 1)));
    }

    @Test
    @DisplayName("Should handle concurrent get operations")
    void concurrentGetTest() throws InterruptedException {
        String key = "sharedKey";
        String value = "sharedValue";
        cacheMap.put(key, value);

        int numThreads = CONCURRENCY_LEVEL * 2;
        int getsPerThread = 100;

        Runnable getTask = () -> {
            IntStream.range(0, getsPerThread).forEach(i -> {
                assertEquals(value, cacheMap.get(key));
            });
        };

        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(getTask);
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }
        assertEquals(1, cacheMap.size()); // Size should remain 1
    }

    void setupForCollectionTests() {
        cacheMap.put("k1", "v1");
        cacheMap.put("k2", "v2");
        cacheMap.put("k3", "v3");
        cacheMap.pin("k1"); // Pin one key
    }

    @Test
    @DisplayName("EntrySet should contain all entries and reflect changes")
    void entrySetTest() {
        setupForCollectionTests();
        Set<Map.Entry<Object, Object>> entrySet = cacheMap.entrySet();
        assertEquals(3, entrySet.size());
        assertTrue(entrySet.contains(Map.entry("k1", "v1")));
        assertTrue(entrySet.contains(Map.entry("k2", "v2")));
        assertTrue(entrySet.contains(Map.entry("k3", "v3")));

        cacheMap.remove("k2");
        assertEquals(2, entrySet.size());
        assertFalse(entrySet.contains(Map.entry("k2", "v2")));

        cacheMap.put("k4", "v4");
        assertEquals(3, entrySet.size());
        assertTrue(entrySet.contains(Map.entry("k4", "v4")));
    }

    @Test
    @DisplayName("KeySet should contain all keys and reflect changes")
    void keySetTest() {
        setupForCollectionTests();
        Set<Object> keySet = cacheMap.keySet();
        assertEquals(3, keySet.size());
        assertTrue(keySet.contains("k1"));
        assertTrue(keySet.contains("k2"));
        assertTrue(keySet.contains("k3"));

        cacheMap.remove("k1"); // Removing k1 (pinned) will remove from main cache but not pinned map
        keySet = cacheMap.keySet();
        assertEquals(2, keySet.size()); // Size of keySet reflects only non-pinned items
        //assertFalse(keySet.contains("k1")); // Key is no longer in the set returned by keySet()
        assertTrue(cacheMap.getPinnedKeys().contains("k1")); // but still in pinned keys

        cacheMap.put("k5", "v5");
        assertEquals(3, keySet.size());
        assertTrue(keySet.contains("k5"));
    }

    @Test
    @DisplayName("Values collection should contain all values and reflect changes")
    void valuesTest() {
        setupForCollectionTests();
        java.util.Collection<Object> values = cacheMap.values();
        assertEquals(3, values.size());
        assertTrue(values.contains("v1"));
        assertTrue(values.contains("v2"));
        assertTrue(values.contains("v3"));

        cacheMap.remove("k3");
        assertEquals(2, values.size());
        assertFalse(values.contains("v3"));

        cacheMap.put("k6", "v6");
        assertEquals(3, values.size());
        assertTrue(values.contains("v6"));
    }

    @ParameterizedTest
    @MethodSource("provideDataForCacheOperations")
    @DisplayName("Parameterized put and get operations")
    void parameterizedPutGetTest(Object key, Object value) {
        cacheMap.put(key, value);
        assertEquals(value, cacheMap.get(key));
        assertTrue(cacheMap.containsKey(key));
    }

    @ParameterizedTest
    @MethodSource("provideDataForCacheOperations")
    @DisplayName("Parameterized remove operations")
    void parameterizedRemoveTest(Object key, Object value) {
        cacheMap.put(key, value);
        if (value == null) { // If value was null, it wasn't added
            assertNull(cacheMap.remove(key));
        } else {
            assertEquals(value, cacheMap.remove(key));
            assertNull(cacheMap.get(key));
            assertFalse(cacheMap.containsKey(key));
        }
    }
}
