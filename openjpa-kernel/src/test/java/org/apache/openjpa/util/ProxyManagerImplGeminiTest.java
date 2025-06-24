package org.apache.openjpa.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.Array;
import java.sql.Timestamp;
import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@Timeout(30)
class ProxyManagerImplGeminiTest {

    private ProxyManagerImpl proxyManager;

    private static Stream<Arguments> provideDataCopyMapTest() {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);

        SortedMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "three");
        treeMap.put(4, "four");

        return Stream.of(
                Arguments.of(new HashMap<>()),
                Arguments.of(hashMap),
                Arguments.of(treeMap)
        );
    }

    // --- Configuration Methods Tests ---

    private static Stream<Arguments> provideCollectionTypesForNewProxy() {
        return Stream.of(
                Arguments.of(ArrayList.class),
                Arguments.of(HashSet.class),
                Arguments.of(LinkedList.class),
                Arguments.of(TreeSet.class),
                Arguments.of(Vector.class) // Adding Vector as it's a concrete collection type
        );
    }

    private static Stream<Arguments> provideMapTypesForNewProxy() {
        return Stream.of(
                Arguments.of(HashMap.class),
                Arguments.of(TreeMap.class)
        );
    }

    @BeforeEach
    void setup() {
        proxyManager = new ProxyManagerImpl();
    }

    @Test
    void testGetSetTrackChanges() {
        assertTrue(proxyManager.getTrackChanges());
        proxyManager.setTrackChanges(false);
        assertFalse(proxyManager.getTrackChanges());
    }

    // --- Copy Methods Tests ---

    @Test
    void testGetSetAssertAllowedType() {
        assertFalse(proxyManager.getAssertAllowedType());
        proxyManager.setAssertAllowedType(true);
        assertTrue(proxyManager.getAssertAllowedType());
    }

    @Test
    void testGetSetDelayCollectionLoading() {
        assertFalse(proxyManager.getDelayCollectionLoading());
        proxyManager.setDelayCollectionLoading(true);
        assertTrue(proxyManager.getDelayCollectionLoading());
    }

    @Test
    void testGetSetUnproxyable() {
        Collection unproxyable = proxyManager.getUnproxyable();
        assertTrue(unproxyable.contains(TimeZone.class.getName()));
        assertEquals(1, unproxyable.size());

        proxyManager.setUnproxyable("java.lang.String;java.lang.Integer");
        unproxyable = proxyManager.getUnproxyable();
        assertTrue(unproxyable.contains("java.lang.String"));
        assertTrue(unproxyable.contains("java.lang.Integer"));
        assertTrue(unproxyable.contains(TimeZone.class.getName()));
        assertEquals(3, unproxyable.size());

        proxyManager.setUnproxyable(null); // Should not add null or change existing
        unproxyable = proxyManager.getUnproxyable();
        assertEquals(3, unproxyable.size()); // Size should remain 3
    }

    @Test
    void copyArrayNull() {
        Object copy = proxyManager.copyArray(null);
        assertNull(copy);
    }

    @Test
    void copyArrayTest() {
        Integer[] intArray = new Integer[]{1, 2, 3};
        String[] stringArray = new String[]{"a", "b", "c"};
        Object[] mixedArray = new Object[]{"hello", 123, true};
        Object[][] arrays = new Object[][]{intArray, stringArray, mixedArray};
        for (Object[] array : arrays) {
            Object copy = proxyManager.copyArray(array);
            assertNotNull(copy);
            assertNotSame(array, copy);
            assertTrue(copy.getClass().isArray());
            assertEquals(array.length, Array.getLength(copy));
            for (int i = 0; i < array.length; i++) {
                assertEquals(((Object[]) array)[i], Array.get(copy, i));
            }
        }
    }

    @Test
    void copyArrayThrowsUnsupportedException() {
        // Example of a type that might cause issues with Array.newInstance or System.arraycopy
        // This test might need a specific scenario where the underlying array operations fail.
        // For now, testing with a primitive array as it's directly handled.
        int[] intArray = {1, 2, 3};
        int[] copy = (int[]) proxyManager.copyArray(intArray);
        assertNotNull(copy);
        assertArrayEquals(intArray, copy);
    }

    @Test
    void copyMapNull() {
        Map copy = proxyManager.copyMap(null);
        assertNull(copy);
    }

    @ParameterizedTest
    @MethodSource("provideDataCopyMapTest")
    void copyMapTest(Map<?, ?> originalMap) {
        Map<?, ?> copy = proxyManager.copyMap(originalMap);
        assertNotNull(copy);
        assertNotSame(originalMap, copy);
        assertEquals(originalMap.size(), copy.size());
        assertEquals(originalMap, copy); // Checks content equality
    }

    @Test
    void copyDateNull() {
        Date copy = proxyManager.copyDate(null);
        assertNull(copy);
    }

    @Test
    void copyDateTest() {
        Date originalDate = new Date();
        Date copy = proxyManager.copyDate(originalDate);
        assertNotNull(copy);
        assertNotSame(originalDate, copy);
        assertEquals(originalDate.getTime(), copy.getTime());
    }

    @Test
    void copyTimestampTest() {
        Timestamp originalTimestamp = new Timestamp(System.currentTimeMillis());
        originalTimestamp.setNanos(123456789);
        Date copy = proxyManager.copyDate(originalTimestamp);
        assertNotNull(copy);
        assertNotSame(originalTimestamp, copy);
        assertInstanceOf(Timestamp.class, copy);
        assertEquals(originalTimestamp.getTime(), copy.getTime());
        assertEquals(originalTimestamp.getNanos(), ((Timestamp) copy).getNanos());
    }

    @Test
    void copyCalendarNull() {
        Calendar copy = proxyManager.copyCalendar(null);
        assertNull(copy);
    }

    @Test
    void copyCalendarTest() {
        Calendar originalCalendar = Calendar.getInstance();
        originalCalendar.set(2023, Calendar.JANUARY, 1, 10, 30, 0);
        Calendar copy = proxyManager.copyCalendar(originalCalendar);
        assertNotNull(copy);
        assertNotSame(originalCalendar, copy);
        assertEquals(originalCalendar.getTimeInMillis(), copy.getTimeInMillis());
        assertEquals(originalCalendar.getTimeZone(), copy.getTimeZone());
    }

    @Test
    void copyCustomNull() {
        Object copy = proxyManager.copyCustom(null);
        assertNull(copy);
    }

    @Test
    void copyCustomCollection() {
        Collection<String> original = new ArrayList<>(Arrays.asList("a", "b"));
        Object copy = proxyManager.copyCustom(original);
        assertNotNull(copy);
        assertInstanceOf(Collection.class, copy);
        assertNotSame(original, copy);
        assertEquals(original, copy);
    }

    @Test
    void copyCustomMap() {
        Map<String, Integer> original = new HashMap<>();
        original.put("x", 1);
        Object copy = proxyManager.copyCustom(original);
        assertNotNull(copy);
        assertInstanceOf(Map.class, copy);
        assertNotSame(original, copy);
        assertEquals(original, copy);
    }

    // --- New Proxy Methods Tests ---

    @Test
    void copyCustomDate() {
        Date original = new Date();
        Object copy = proxyManager.copyCustom(original);
        assertNotNull(copy);
        assertInstanceOf(Date.class, copy);
        assertNotSame(original, copy);
        assertEquals(original.getTime(), ((Date) copy).getTime());
    }

    @Test
    void copyCustomCalendar() {
        Calendar original = Calendar.getInstance();
        Object copy = proxyManager.copyCustom(original);
        assertNotNull(copy);
        assertInstanceOf(Calendar.class, copy);
        assertNotSame(original, copy);
        assertEquals(original.getTimeInMillis(), ((Calendar) copy).getTimeInMillis());
    }

    @ParameterizedTest
    @MethodSource("provideCollectionTypesForNewProxy")
    void newCollectionProxyTest(Class<? extends Collection> collectionType) {
        Proxy proxy = proxyManager.newCollectionProxy(collectionType, String.class, null, false);
        assertNotNull(proxy);
        assertInstanceOf(Collection.class, proxy);
        // Verify basic behavior of the proxied collection
        Collection<String> proxiedCollection = (Collection<String>) proxy;
        assertTrue(proxiedCollection.isEmpty());
        proxiedCollection.add("item1");
        assertEquals(1, proxiedCollection.size());
        assertTrue(proxiedCollection.contains("item1"));
    }

    @Test
    void newCollectionProxyWithInterfaceType() {
        Proxy proxy = proxyManager.newCollectionProxy(List.class, Integer.class, null, false);
        assertNotNull(proxy);
        assertInstanceOf(List.class, proxy); // Should proxy to ArrayList by default
        List<Integer> proxiedList = (List<Integer>) proxy;
        proxiedList.add(1);
        assertEquals(1, proxiedList.get(0));
    }

    @Test
    void newCollectionProxyWithSortedSetAndComparator() {
        Comparator<Integer> reverseOrder = (a, b) -> b.compareTo(a);
        Proxy proxy = proxyManager.newCollectionProxy(SortedSet.class, Integer.class, reverseOrder, false);
        assertNotNull(proxy);
        assertInstanceOf(SortedSet.class, proxy);
        SortedSet<Integer> proxiedSet = (SortedSet<Integer>) proxy;
        proxiedSet.add(3);
        proxiedSet.add(1);
        proxiedSet.add(2);
        assertEquals(3, proxiedSet.first()); // Due to reverse order comparator
        assertEquals(1, proxiedSet.last());
    }

    @Test
    void newCollectionProxyAssertType() {
        proxyManager.setAssertAllowedType(true);
        Proxy proxy = proxyManager.newCollectionProxy(ArrayList.class, String.class, null, false);
        Collection<String> proxiedCollection = (Collection<String>) proxy;
        proxiedCollection.add("valid");
        assertThrows(ClassCastException.class, () -> proxiedCollection.add((String) (Object) 123)); // Expecting CCE due to assertType
    }

    @ParameterizedTest
    @MethodSource("provideMapTypesForNewProxy")
    void newMapProxyTest(Class<? extends Map> mapType) {
        Proxy proxy = proxyManager.newMapProxy(mapType, String.class, Integer.class, null, false);
        assertNotNull(proxy);
        assertInstanceOf(Map.class, proxy);
        Map<String, Integer> proxiedMap = (Map<String, Integer>) proxy;
        assertTrue(proxiedMap.isEmpty());
        proxiedMap.put("key1", 1);
        assertEquals(1, proxiedMap.get("key1"));
    }

    @Test
    void newMapProxyWithInterfaceType() {
        Proxy proxy = proxyManager.newMapProxy(Map.class, String.class, String.class, null, false);
        assertNotNull(proxy);
        assertInstanceOf(Map.class, proxy); // Should proxy to HashMap by default
    }

    @Test
    void newMapProxyWithSortedMapAndComparator() {
        Comparator<Integer> reverseOrderKeys = (a, b) -> b.compareTo(a);
        Proxy proxy = proxyManager.newMapProxy(SortedMap.class, Integer.class, String.class, reverseOrderKeys, false);
        assertNotNull(proxy);
        assertInstanceOf(SortedMap.class, proxy);
        SortedMap<Integer, String> proxiedMap = (SortedMap<Integer, String>) proxy;
        proxiedMap.put(3, "three");
        proxiedMap.put(1, "one");
        proxiedMap.put(2, "two");
        assertEquals(3, proxiedMap.firstKey()); // Due to reverse order comparator
        assertEquals(1, proxiedMap.lastKey());
    }

    @Test
    void newDateProxyTest() {
        Proxy proxy = proxyManager.newDateProxy(Date.class);
        assertNotNull(proxy);
        assertInstanceOf(Date.class, proxy);
        Date proxiedDate = (Date) proxy;
        // Verify basic functionality
        assertNotNull(proxiedDate);
        long currentTime = System.currentTimeMillis();
        proxiedDate.setTime(currentTime);
        assertEquals(currentTime, proxiedDate.getTime());
    }

    @Test
    void newCalendarProxyTest() {
        Proxy proxy = proxyManager.newCalendarProxy(Calendar.class, TimeZone.getDefault());
        assertNotNull(proxy);
        assertInstanceOf(Calendar.class, proxy);
        Calendar proxiedCalendar = (Calendar) proxy;
        // Verify basic functionality
        assertNotNull(proxiedCalendar);
        assertEquals(TimeZone.getDefault(), proxiedCalendar.getTimeZone());
        proxiedCalendar.set(2024, Calendar.FEBRUARY, 1);
        assertEquals(2024, proxiedCalendar.get(Calendar.YEAR));
    }

    @Test
    void newCalendarProxyWithSpecificType() {
        Proxy proxy = proxyManager.newCalendarProxy(GregorianCalendar.class, null);
        assertNotNull(proxy);
        assertInstanceOf(GregorianCalendar.class, proxy);
        Calendar proxiedCalendar = (Calendar) proxy;
        assertNotNull(proxiedCalendar);
    }

    @Test
    void newCustomProxyNull() {
        Proxy proxy = proxyManager.newCustomProxy(null, false);
        assertNull(proxy);
    }

    @Test
    void newCustomProxyCollection() {
        Collection<String> original = new HashSet<>(Arrays.asList("x", "y"));
        Proxy proxy = proxyManager.newCustomProxy(original, false);
        assertNotNull(proxy);
        assertInstanceOf(Collection.class, proxy);
        Collection<String> proxiedCollection = (Collection<String>) proxy;
        assertEquals(original, proxiedCollection);
        assertNotSame(original, proxiedCollection);
    }

    @Test
    void newCustomProxyMap() {
        Map<String, String> original = new TreeMap<>();
        original.put("k1", "v1");
        Proxy proxy = proxyManager.newCustomProxy(original, false);
        assertNotNull(proxy);
        assertInstanceOf(Map.class, proxy);
        Map<String, String> proxiedMap = (Map<String, String>) proxy;
        assertEquals(original, proxiedMap);
        assertNotSame(original, proxiedMap);
    }

    @Test
    void newCustomProxyDate() {
        Date original = new Date(123456789L);
        Proxy proxy = proxyManager.newCustomProxy(original, false);
        assertNotNull(proxy);
        assertInstanceOf(Date.class, proxy);
        Date proxiedDate = (Date) proxy;
        assertEquals(original.getTime(), proxiedDate.getTime());
        assertNotSame(original, proxiedDate);
    }

    @Test
    void newCustomProxyCalendar() {
        Calendar original = Calendar.getInstance();
        original.set(2025, Calendar.JUNE, 23);
        Proxy proxy = proxyManager.newCustomProxy(original, false);
        assertNotNull(proxy);
        assertInstanceOf(Calendar.class, proxy);
        Calendar proxiedCalendar = (Calendar) proxy;
        assertEquals(original.getTimeInMillis(), proxiedCalendar.getTimeInMillis());
        assertNotSame(original, proxiedCalendar);
    }

    @Test
    void newCustomProxyUnproxyableClass() {
        // Class.class is an example of a final class that is unproxyable
        proxyManager.setUnproxyable(Class.class.getName());
        Proxy proxy = proxyManager.newCustomProxy(new Object(), false);
        assertNull(proxy);
    }

    // --- Helper Method Coverage (implicit via public method calls or direct simple tests) ---

    @Test
    void isUnproxyableTest() {
        // Test a class added to unproxyable set
        proxyManager.setUnproxyable("java.lang.String");
        assertTrue(proxyManager.isUnproxyable(String.class));

        // Test a class not in the unproxyable set
        assertFalse(proxyManager.isUnproxyable(Integer.class));

        // Test a subclass of an unproxyable class (if applicable)
        class MyUnproxyableSubclass extends TimeZone {
            @Override
            public int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds) {
                return 0;
            }

            @Override
            public int getRawOffset() {
                return 0;
            }

            @Override
            public void setRawOffset(int offsetMillis) {
            }

            @Override
            public boolean useDaylightTime() {
                return false;
            }

            @Override
            public boolean inDaylightTime(Date date) {
                return false;
            }
        }
        assertTrue(proxyManager.isUnproxyable(MyUnproxyableSubclass.class));
    }
}

