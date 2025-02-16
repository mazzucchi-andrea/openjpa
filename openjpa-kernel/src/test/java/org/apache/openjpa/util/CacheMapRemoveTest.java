package org.apache.openjpa.util;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(Parameterized.class)
public class CacheMapRemoveTest {
    private Object key;
    private Object value;
    private boolean empty;

    private CacheMap cacheMap;

    public CacheMapRemoveTest(CacheRemoveTestParams params) {
        configure(params);
    }

    @Parameterized.Parameters
    public static Collection<CacheRemoveTestParams> getParameters() {
        List<CacheRemoveTestParams> cacheRemoveTestParams = new ArrayList<>();

        cacheRemoveTestParams.add(new CacheRemoveTestParams(null, null, false));
        cacheRemoveTestParams.add(new CacheRemoveTestParams(new Object(), null, false));
        cacheRemoveTestParams.add(new CacheRemoveTestParams(new Object(), new Object(), true));
        cacheRemoveTestParams.add(new CacheRemoveTestParams(new Object(), null, true));
        return cacheRemoveTestParams;

    }

    private void configure(CacheRemoveTestParams params) {
        key = params.key;
        value = params.value;
        empty = params.empty;
    }

    @Before
    public void setup() {
        cacheMap = new CacheMap(true);
        if (!empty) {
            cacheMap.put(key, value);
        }
    }

    @Test
    public void removeTest() {
        Object deletedValue = cacheMap.remove(key);
        if (!empty) {
            assertEquals(value, deletedValue);
        } else {
            assertNull(deletedValue);
        }
        Object val = cacheMap.get(key);
        assertNull(val);
    }

    public static class CacheRemoveTestParams {
        private final Object key;
        private final Object value;
        private final boolean empty;

        public CacheRemoveTestParams(Object key, Object value, boolean empty) {
            this.key = key;
            this.value = value;
            this.empty = empty;
        }
    }

}
