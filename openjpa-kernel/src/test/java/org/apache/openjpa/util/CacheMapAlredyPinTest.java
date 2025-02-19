package org.apache.openjpa.util;

import org.apache.openjpa.util.dummies.Dummy;
import org.junit.Test;

import static org.apache.openjpa.TestMacros.*;
import static org.apache.openjpa.TestMacros.CONCURRENCY_LEVEL;
import static org.junit.Assert.*;

public class CacheMapAlredyPinTest {

    @Test
    public void alreadyPinTest() {
        CacheMap cacheMap = new CacheMap(true, MAX, SIZE, LOAD, CONCURRENCY_LEVEL);
        cacheMap.pin(0);
        assertTrue(cacheMap.getPinnedKeys().contains(0));
        cacheMap.pin(0);
        assertTrue(cacheMap.getPinnedKeys().contains(0));
    }

    @Test
    public void alreadyPinPutTest() {
        CacheMap cacheMap = new CacheMap(true, MAX, SIZE, LOAD, CONCURRENCY_LEVEL);
        cacheMap.put(0, new Dummy("Test" + 0, 0));
        cacheMap.pin(0);
        assertTrue(cacheMap.getPinnedKeys().contains(0));
        cacheMap.pin(0);
        assertTrue(cacheMap.getPinnedKeys().contains(0));
    }

}
