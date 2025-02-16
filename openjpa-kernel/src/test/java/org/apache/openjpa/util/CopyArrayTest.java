package org.apache.openjpa.util;

import org.junit.Before;
import org.junit.Test;

import static org.apache.openjpa.TestMacros.PASS;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;

public class CopyArrayTest {
    private ProxyManagerImpl proxyManager;

    @Before
    public void setUp() {
        proxyManager = new ProxyManagerImpl();
    }

    @Test
    public void copyArrayIntegerTest() {
        Integer[] orig = new Integer[]{1, 2, 3};
        Integer[] empty = new Integer[3];
        try {
            Object copy = proxyManager.copyArray(orig);
            assertArrayEquals(orig, (Integer[]) copy);
        } catch (Exception e) {
            assertFalse(PASS);
        }
        try {
            Object copy = proxyManager.copyArray(empty);
            assertArrayEquals(empty, (Integer[]) copy);
        } catch (Exception e) {
            assertFalse(PASS);
        }
    }

    @Test
    public void copyArrayObjectTest() {
        Object[] orig = new Object[]{1, 2L, null, "Test"};
        try {
            Object copy = proxyManager.copyArray(orig);
            assertArrayEquals(orig, (Object[]) copy);
        } catch (Exception e) {
            assertFalse(PASS);
        }
    }
}
