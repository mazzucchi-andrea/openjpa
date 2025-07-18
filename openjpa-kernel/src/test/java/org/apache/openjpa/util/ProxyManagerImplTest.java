package org.apache.openjpa.util;

import org.apache.openjpa.util.dummies.Dummy;
import org.apache.openjpa.util.dummies.DummyBean;
import org.apache.openjpa.util.dummies.DummyPersistenceCapable;
import org.apache.openjpa.util.dummies.DummyProxy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@Timeout(30)
class ProxyManagerImplTest {
    private static final int NUM_ELEM = 10;
    private ProxyManager proxyManager;

    private static Stream<Arguments> provideDataCopyCustomTest() {
        return Stream.of(
                Arguments.of(fillCollectionWithInteger(new HashSet<>())),
                Arguments.of(fillCollectionWithString(new LinkedList<>())),
                Arguments.of(fillCollectionWithDummy(new ArrayList<>())),
                Arguments.of(fillMapWithInteger(new HashMap<>())),
                Arguments.of(fillMapWithString(new HashMap<>())),
                Arguments.of(fillMapWithDummy(new HashMap<>())),
                Arguments.of(new DummyProxy(-1)),
                Arguments.of(new DummyBean()),
                Arguments.of(new DummyBean("Mario", 30, true)),
                Arguments.of(new HashMap<>()),
                Arguments.of(new ArrayList<>()),
                Arguments.of(new Date(685098000000L)),
                Arguments.of(new Date()),
                Arguments.of(new GregorianCalendar(TimeZone.getTimeZone("Europe/Rome"))),
                Arguments.of(new GregorianCalendar()),
                Arguments.of(Calendar.getInstance()),
                Arguments.of(Calendar.getInstance(Locale.forLanguageTag("jp")))
        );
    }

    private static Stream<Arguments> provideInvalidDataCopyCustomTest() {
        return Stream.of(
                Arguments.of(1),
                Arguments.of(new Dummy("Test", 0)),
                Arguments.of(new DummyPersistenceCapable()),
                Arguments.of("Test")
        );
    }

    private static Stream<Arguments> provideDataCopyCollectionTest() {
        return Stream.of(
                Arguments.of(fillCollectionWithInteger(new HashSet<>())),
                Arguments.of(fillCollectionWithString(new LinkedList<>())),
                Arguments.of(fillCollectionWithDummy(new ArrayList<>()))
        );
    }

    private static Stream<Arguments> provideDataCopyMapTest() {
        return Stream.of(
                Arguments.of(fillMapWithInteger(new HashMap<>())),
                Arguments.of(fillMapWithString(new TreeMap<>())),
                Arguments.of(fillMapWithDummy(new LinkedHashMap<>()))
        );
    }

    private static Stream<Arguments> provideDataCopyDateTest() {
        return Stream.of(
                Arguments.of(new Date(685098000000L)),
                Arguments.of(new Date())
        );
    }

    private static Stream<Arguments> provideDataCopyCalendarTest() {
        return Stream.of(
                Arguments.of(new GregorianCalendar(TimeZone.getTimeZone("Europe/Rome"))),
                Arguments.of(new GregorianCalendar()),
                Arguments.of(Calendar.getInstance()),
                Arguments.of(Calendar.getInstance(Locale.forLanguageTag("jp")))
        );
    }

    private static Collection<String> fillCollectionWithString(Collection<String> collection) {
        for (int i = 0; i < NUM_ELEM; i++) {
            collection.add("Test" + i);
        }
        return collection;
    }

    private static Collection<Integer> fillCollectionWithInteger(Collection<Integer> collection) {
        for (int i = 0; i < NUM_ELEM; i++) {
            collection.add(i);
        }
        return collection;
    }

    private static Collection<Dummy> fillCollectionWithDummy(Collection<Dummy> collection) {
        for (int i = 0; i < NUM_ELEM; i++) {
            collection.add(new Dummy(("Test" + i), i));
        }
        return collection;
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

    @BeforeEach
    void setup() {
        proxyManager = new ProxyManagerImpl();
    }

    // copyArray

    @Test
    void copyArrayTest() {
        Integer[] intArray = new Integer[]{1, 2, 3};
        Integer[] empty = new Integer[3];
        Object[] objArray = new Object[]{1, 2L, null, "Test"};

        Object copy = proxyManager.copyArray(intArray);
        assertArrayEquals(intArray, (Integer[]) copy);

        copy = proxyManager.copyArray(empty);
        assertArrayEquals(empty, (Integer[]) copy);

        copy = proxyManager.copyArray(objArray);
        assertArrayEquals(objArray, (Object[]) copy);

        copy = proxyManager.copyArray(null);
        assertNull(copy);

        assertThrows(Exception.class, () -> proxyManager.copyArray(""));

        assertThrows(Exception.class, () -> proxyManager.copyArray("Test"));
    }

    // copyCollection

    @ParameterizedTest
    @MethodSource("provideDataCopyCollectionTest")
    void copyCollectionTest(Collection<?> collection) {
        Collection<?> copy = proxyManager.copyCollection(collection);
        assertIterableEquals(collection, copy);
    }

    @Test
    void copyCollectionProxyTest() {
        Proxy proxy = proxyManager.newCollectionProxy(List.class, Dummy.class, null, false);
        assertTrue(((Collection<?>) proxy).isEmpty());
        assertTrue(((Collection<Dummy>) proxy).add(new Dummy("Test", 0)));
        Collection<?> copy = proxyManager.copyCollection((Collection<?>) proxy);
        assertIterableEquals((Collection<?>) proxy, copy);
    }

    @Test
    void copyCollectionNullTest() {
        Object copy = proxyManager.copyCollection(null);
        assertNull(copy);
    }

    // copyMap

    @ParameterizedTest
    @MethodSource("provideDataCopyMapTest")
    void copyMapTest(Map<?, ?> map) {
        Map<?, ?> copy = proxyManager.copyMap(map);
        assertTrue(assertMap(map, copy));
    }

    @Test
    void copyMapProxyTest() {
        Proxy proxy = proxyManager.newMapProxy(HashMap.class, Integer.class, Dummy.class, null, false);
        assertTrue(((Map<?, ?>) proxy).isEmpty());
        assertNull(((Map<Object, Object>) proxy).put(0, new Dummy("Test", 0)));
        Map<?, ?> copy = proxyManager.copyMap((Map<?, ?>) proxy);
        assertTrue(assertMap((Map<?, ?>) proxy, copy));
    }

    @Test
    void copyMapNull() {
        Object copy = proxyManager.copyMap(null);
        assertNull(copy);
    }

    // copyDate

    @ParameterizedTest
    @MethodSource("provideDataCopyDateTest")
    void copyDateTest(Date date) {
        Date copy = proxyManager.copyDate(date);
        assertEquals(date, copy);
    }

    @Test
    void copyDateProxyTest() {
        Proxy proxy = proxyManager.newDateProxy(Date.class);
        Date copy = proxyManager.copyDate((Date) proxy);
        assertEquals(proxy, copy);
    }

    @Test
    void copyDateNullTest() {
        Object copy = proxyManager.copyDate(null);
        assertNull(copy);
    }

    // copyCalendar

    @ParameterizedTest
    @MethodSource("provideDataCopyCalendarTest")
    void copyCalendarTest(Calendar calendar) {
        Calendar copy = proxyManager.copyCalendar(calendar);
        assertEquals(calendar, copy);
    }

    @Test
    void copyCalendarProxyTest() {
        Proxy proxy = proxyManager.newCalendarProxy(GregorianCalendar.class, TimeZone.getTimeZone("Europe/Rome"));
        Calendar copy = proxyManager.copyCalendar((Calendar) proxy);
        assertEquals(proxy, copy);
    }

    @Test
    void copyCalendarNull() {
        Object copy = proxyManager.copyCalendar(null);
        assertNull(copy);
    }

    // copyCustom

    @ParameterizedTest
    @MethodSource("provideDataCopyCustomTest")
    void copyCustomTest(Object obj) {
        Object copy = proxyManager.copyCustom(obj);
        if (obj == null) {
            assertNull(copy);
        }
        assertNotNull(copy);
        if (obj instanceof Collection)
            assertIterableEquals((Collection<?>) obj, (Collection<?>) copy);
        else if (obj instanceof Map)
            assertTrue(assertMap((Map<?, ?>) obj, (Map<?, ?>) copy));
        else {
            assertEquals(obj, copy);
        }
    }

    @ParameterizedTest
    @MethodSource("provideInvalidDataCopyCustomTest")
    void copyCustomInvalidDataTest(Object obj) {
        Object copy = proxyManager.copyCustom(obj);
        assertNull(copy);
    }

    @Test
    void copyCustomNull() {
        Object copy = proxyManager.copyCustom(null);
        assertNull(copy);
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
}
