package org.apache.openjpa.util;

import org.apache.openjpa.util.dummies.Dummy;
import org.apache.openjpa.util.dummies.DummyBean;
import org.apache.openjpa.util.dummies.DummyPersistenceCapable;
import org.apache.openjpa.util.dummies.DummyProxy;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.apache.openjpa.TestMacros.*;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CopyCustomTest {
    private Object obj;
    private boolean expectedBehavior;

    private ProxyManager proxyManager;

    public CopyCustomTest(CopyCustomTestParams params) {
        configure(params);
    }

    @Parameterized.Parameters
    public static Collection<CopyCustomTestParams[]> getTestParameters() {
        return Arrays.asList(new CopyCustomTestParams[][]{
                {new CopyCustomTestParams(fillCollectionWithInteger(new HashSet<>()), PASS)},
                {new CopyCustomTestParams(fillCollectionWithString(new LinkedList<>()), PASS)},
                {new CopyCustomTestParams(fillCollectionWithDummy(new ArrayList<>()), PASS)},
                {new CopyCustomTestParams(fillMapWithInteger(new HashMap<>()), PASS)},
                {new CopyCustomTestParams(fillMapWithString(new HashMap<>()), PASS)},
                {new CopyCustomTestParams(fillMapWithDummy(new HashMap<>()), PASS)},
                {new CopyCustomTestParams(null, PASS)},
                {new CopyCustomTestParams(new Dummy("Test", 0), FAIL)},
                {new CopyCustomTestParams(new DummyProxy(-1), PASS)},
                {new CopyCustomTestParams(new DummyBean(), PASS)},
                {new CopyCustomTestParams(new DummyBean("Mario", 30, true), PASS)},
                {new CopyCustomTestParams(new DummyPersistenceCapable(), FAIL)},
                {new CopyCustomTestParams("Test", FAIL)},
                {new CopyCustomTestParams(1, FAIL)},
                {new CopyCustomTestParams(new HashMap<>(), PASS)},
                {new CopyCustomTestParams(new ArrayList<>(), PASS)},
                {new CopyCustomTestParams(new Date(685098000000L), PASS)},
                {new CopyCustomTestParams(new Date(), PASS)},
                {new CopyCustomTestParams(new GregorianCalendar(TimeZone.getTimeZone("Europe/Rome")), PASS)},
                {new CopyCustomTestParams(new GregorianCalendar(), PASS)},
        });
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

    public void configure(CopyCustomTestParams params) {
        obj = params.obj;
        expectedBehavior = params.expectedBehavior;
    }

    @Before
    public void setUp() {
        proxyManager = new ProxyManagerImpl();
    }

    @Test
    public void copyCustomTest() {
        try {
            Object copy = proxyManager.copyCustom(obj);
            if (obj == null) {
                assertNull(copy);
                return;
            }
            if (!expectedBehavior) {
                assertNull(copy);
                return;
            }
            assertNotNull(copy);
            if (obj instanceof Collection)
                assertTrue(assertCollection((Collection<?>) obj, (Collection<?>) copy));
            else if (obj instanceof Map)
                assertTrue(assertMap((Map<?, ?>) obj, (Map<?, ?>) copy));
            else {
                assertEquals(obj, copy);
            }
        } catch (Exception e) {
            assertFalse(expectedBehavior);
            return;
        }
        assertTrue("Fail expected", expectedBehavior);
    }

    private boolean assertCollection(Collection<?> orig, Collection<?> copy) {
        if (orig.size() != copy.size()) {
            return false;
        }
        Iterator<?> origIt = orig.iterator();
        Iterator<?> copyIt = copy.iterator();
        while (origIt.hasNext() && copyIt.hasNext()) {
            Object o = origIt.next();
            Object c = copyIt.next();
            if (o instanceof Dummy && c instanceof Dummy) {
                Dummy oe = (Dummy) o;
                Dummy ce = (Dummy) c;
                if (!(oe.getStr().equals(ce.getStr()) && oe.getI() == ce.getI())) {
                    return false;
                }
            }
            if (!o.equals(c)) {
                return false;
            }
        }
        return true;
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

    public static class CopyCustomTestParams {
        private final Object obj;
        private final boolean expectedBehavior;

        public CopyCustomTestParams(Object obj, boolean expectedBehavior) {
            this.obj = obj;
            this.expectedBehavior = expectedBehavior;
        }
    }
}
