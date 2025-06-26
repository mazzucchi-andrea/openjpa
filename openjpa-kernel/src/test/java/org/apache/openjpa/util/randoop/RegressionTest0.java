package org.apache.openjpa.util.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.apache.xbean.asm9.Type type0 = org.apache.openjpa.util.ProxyManagerImpl.TYPE_OBJECT;
        org.junit.Assert.assertNotNull(type0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (short) 1, (int) (byte) 1, (float) (-1L), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: -1.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, (int) '#', (int) 'a', (float) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 52.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: LRUMap max size must be greater than 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) (short) 0, (int) ' ', 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 0.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        cacheMap2.clear();
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean10 = cacheMap8.pin((Object) "CacheMap:{}::{}");
        java.util.Set set11 = cacheMap8.getPinnedKeys();
        // The following exception was thrown during execution in test generation
        try {
            Object obj13 = cacheMap2.put((Object) cacheMap8, (Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (short) -1, (int) '#', 10.0f, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 10.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        boolean boolean4 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str8 = cacheMap7.toString();
        cacheMap7.setSoftReferenceSize(1);
        boolean boolean12 = cacheMap7.containsValue((Object) 100.0f);
        boolean boolean13 = cacheMap2.unpin((Object) cacheMap7);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap7.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        boolean boolean4 = cacheMap2.isEmpty();
        boolean boolean5 = cacheMap2.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str9 = cacheMap8.toString();
        java.util.Set set10 = cacheMap8.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = cacheMap2.containsKey((Object) cacheMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        boolean boolean4 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str8 = cacheMap7.toString();
        cacheMap7.setSoftReferenceSize(1);
        boolean boolean12 = cacheMap7.containsValue((Object) 100.0f);
        boolean boolean13 = cacheMap2.unpin((Object) cacheMap7);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean17 = cacheMap15.pin((Object) "CacheMap:{}::{}");
        java.util.Set set18 = cacheMap15.getPinnedKeys();
        // The following exception was thrown during execution in test generation
        try {
            Object obj19 = cacheMap7.remove((Object) cacheMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean2 = cacheMap0.containsKey((Object) 10.0f);
        boolean boolean4 = cacheMap0.unpin((Object) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        boolean boolean4 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str8 = cacheMap7.toString();
        cacheMap7.setSoftReferenceSize(1);
        boolean boolean12 = cacheMap7.containsValue((Object) 100.0f);
        boolean boolean13 = cacheMap2.unpin((Object) cacheMap7);
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set15 = cacheMap14.getPinnedKeys();
        boolean boolean16 = cacheMap14.isEmpty();
        boolean boolean18 = cacheMap14.unpin((Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = cacheMap7.containsKey((Object) boolean18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        boolean boolean6 = cacheMap4.isEmpty();
        boolean boolean8 = cacheMap4.unpin((Object) 10);
        cacheMap0.putAll((java.util.Map) cacheMap4);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        java.util.Map map3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cacheMap1.putAll(map3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, 10, (int) (short) -1, (float) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 10.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        boolean boolean2 = cacheMap0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean6 = cacheMap4.pin((Object) "CacheMap:{}::{}");
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean10 = cacheMap9.isLRU();
        boolean boolean11 = cacheMap9.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str15 = cacheMap14.toString();
        cacheMap14.setSoftReferenceSize(1);
        boolean boolean19 = cacheMap14.containsValue((Object) 100.0f);
        boolean boolean20 = cacheMap9.unpin((Object) cacheMap14);
        boolean boolean21 = cacheMap9.isLRU();
        java.util.Set set22 = cacheMap9.getPinnedKeys();
        boolean boolean23 = cacheMap4.containsKey((Object) cacheMap9);
        Object obj25 = cacheMap0.put((Object) boolean23, (Object) (-1L));
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CacheMap:{}::{}" + "'", str15, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str5 = cacheMap4.toString();
        cacheMap4.setSoftReferenceSize(1);
        java.util.Collection collection8 = cacheMap4.values();
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCustomProxy((Object) cacheMap4, false);
        java.util.Date date11 = null;
        java.util.Date date12 = proxyManagerImpl0.copyDate(date11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (short) 0, (int) (short) 1, (float) (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: -1.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str5 = cacheMap4.toString();
        cacheMap4.setSoftReferenceSize(1);
        cacheMap4.readLock();
        // The following exception was thrown during execution in test generation
        try {
            Object obj9 = proxyManagerImpl0.copyArray((Object) cacheMap4);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UnsupportedException; message: Unable to copy array: Argument is not an array.");
        } catch (org.apache.openjpa.util.UnsupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap2.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        boolean boolean4 = cacheMap2.isLRU();
        // The following exception was thrown during execution in test generation
        try {
            Object obj6 = cacheMap2.get((Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap3.containsKey((Object) 10.0f);
        java.util.Map map6 = proxyManagerImpl0.copyMap((java.util.Map) cacheMap3);
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set8 = cacheMap7.getPinnedKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection9 = proxyManagerImpl0.copyCollection((java.util.Collection) set8);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.GeneralException; message: org.apache.openjpa.util.java$util$Collections$UnmodifiableSet$9$proxy");
        } catch (org.apache.openjpa.util.GeneralException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap5.readLock();
        java.util.Set set7 = cacheMap5.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection8 = proxyManagerImpl0.copyCollection((java.util.Collection) set7);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.GeneralException; message: org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$KeySet$10$proxy");
        } catch (org.apache.openjpa.util.GeneralException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        proxyManagerImpl0.setUnproxyable("");
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean8 = cacheMap7.isLRU();
        boolean boolean9 = cacheMap7.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str13 = cacheMap12.toString();
        cacheMap12.setSoftReferenceSize(1);
        boolean boolean17 = cacheMap12.containsValue((Object) 100.0f);
        boolean boolean18 = cacheMap7.unpin((Object) cacheMap12);
        boolean boolean19 = cacheMap7.isLRU();
        java.util.Set set20 = cacheMap7.getPinnedKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection21 = proxyManagerImpl0.copyCollection((java.util.Collection) set20);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.GeneralException; message: org.apache.openjpa.util.java$util$Collections$UnmodifiableSet$13$proxy");
        } catch (org.apache.openjpa.util.GeneralException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CacheMap:{}::{}" + "'", str13, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        // The following exception was thrown during execution in test generation
        try {
            Object obj2 = proxyManagerImpl0.copyArray((Object) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UnsupportedException; message: Unable to copy array: Argument is not an array.");
        } catch (org.apache.openjpa.util.UnsupportedException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl0.setTrackChanges(false);
        java.util.Collection collection3 = proxyManagerImpl0.getUnproxyable();
        // The following exception was thrown during execution in test generation
        try {
            Object obj5 = proxyManagerImpl0.copyArray((Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UnsupportedException; message: Unable to copy array: Argument is not an array.");
        } catch (org.apache.openjpa.util.UnsupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        int int2 = cacheMap0.size();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        java.util.Set set4 = cacheMap2.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str10 = cacheMap9.toString();
        cacheMap9.setSoftReferenceSize(1);
        java.util.Set set13 = cacheMap9.entrySet();
        boolean boolean14 = cacheMap6.unpin((Object) set13);
        // The following exception was thrown during execution in test generation
        try {
            Object obj15 = cacheMap2.put((Object) (byte) 10, (Object) cacheMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CacheMap:{}::{}" + "'", str10, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        java.util.Collection collection6 = cacheMap2.values();
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(true, 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cacheMap2.pin((Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        boolean boolean4 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str8 = cacheMap7.toString();
        cacheMap7.setSoftReferenceSize(1);
        boolean boolean12 = cacheMap7.containsValue((Object) 100.0f);
        boolean boolean13 = cacheMap2.unpin((Object) cacheMap7);
        int int14 = cacheMap7.getCacheSize();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl15 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean16 = proxyManagerImpl15.getTrackChanges();
        java.util.Calendar calendar17 = null;
        java.util.Calendar calendar18 = proxyManagerImpl15.copyCalendar(calendar17);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl19 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set21 = cacheMap20.getPinnedKeys();
        Class<?> wildcardClass22 = cacheMap20.getClass();
        org.apache.openjpa.util.Proxy proxy23 = proxyManagerImpl19.newDateProxy((Class) wildcardClass22);
        // The following exception was thrown during execution in test generation
        try {
            Object obj24 = cacheMap7.put((Object) proxyManagerImpl15, (Object) proxy23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(calendar18);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(proxy23);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, 1, (int) '#', (float) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 0.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        java.util.Set set4 = cacheMap2.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean10 = cacheMap9.isLRU();
        boolean boolean11 = cacheMap9.isLRU();
        java.util.Set set12 = cacheMap9.getPinnedKeys();
        // The following exception was thrown during execution in test generation
        try {
            Object obj13 = cacheMap2.put((Object) cacheMap5, (Object) cacheMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1, (int) (byte) 10, (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 100.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean4 = cacheMap3.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.entrySet();
        java.util.Collection collection7 = cacheMap5.values();
        cacheMap3.putAll((java.util.Map) cacheMap5, true);
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl12 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean13 = proxyManagerImpl12.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl14 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean15 = proxyManagerImpl14.getTrackChanges();
        boolean boolean16 = proxyManagerImpl14.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap19.setCacheSize(0);
        Class<?> wildcardClass22 = cacheMap19.getClass();
        java.util.TimeZone timeZone23 = null;
        org.apache.openjpa.util.Proxy proxy24 = proxyManagerImpl14.newCalendarProxy((Class) wildcardClass22, timeZone23);
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass28 = cacheMap27.getClass();
        java.util.Comparator comparator29 = null;
        org.apache.openjpa.util.Proxy proxy31 = proxyManagerImpl12.newCollectionProxy((Class) wildcardClass22, (Class) wildcardClass28, comparator29, true);
        boolean boolean32 = cacheMap0.containsValue((Object) proxyManagerImpl12);
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean36 = cacheMap35.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap37 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set38 = cacheMap37.entrySet();
        java.util.Collection collection39 = cacheMap37.values();
        cacheMap35.putAll((java.util.Map) cacheMap37, true);
        cacheMap37.setCacheSize((int) 'a');
        cacheMap37.setCacheSize((int) (byte) 0);
        org.apache.openjpa.util.CacheMap cacheMap48 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str49 = cacheMap48.toString();
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap53 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean54 = cacheMap53.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap55 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set56 = cacheMap55.entrySet();
        java.util.Collection collection57 = cacheMap55.values();
        cacheMap53.putAll((java.util.Map) cacheMap55, true);
        cacheMap50.putAll((java.util.Map) cacheMap55, false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl62 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean63 = proxyManagerImpl62.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl64 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean65 = proxyManagerImpl64.getTrackChanges();
        boolean boolean66 = proxyManagerImpl64.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap69 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap69.setCacheSize(0);
        Class<?> wildcardClass72 = cacheMap69.getClass();
        java.util.TimeZone timeZone73 = null;
        org.apache.openjpa.util.Proxy proxy74 = proxyManagerImpl64.newCalendarProxy((Class) wildcardClass72, timeZone73);
        org.apache.openjpa.util.CacheMap cacheMap77 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass78 = cacheMap77.getClass();
        java.util.Comparator comparator79 = null;
        org.apache.openjpa.util.Proxy proxy81 = proxyManagerImpl62.newCollectionProxy((Class) wildcardClass72, (Class) wildcardClass78, comparator79, true);
        boolean boolean82 = cacheMap50.containsValue((Object) proxyManagerImpl62);
        Object obj83 = cacheMap37.put((Object) str49, (Object) cacheMap50);
        // The following exception was thrown during execution in test generation
        try {
            Object obj84 = proxyManagerImpl12.copyCustom((Object) cacheMap37);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$37$proxy cannot be cast to class org.apache.openjpa.util.proxy.ProxyMap (org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$37$proxy is in unnamed module of loader org.apache.openjpa.util.ClassLoaderProxyService$ProxiesClassLoader @71f17cae; org.apache.openjpa.util.proxy.ProxyMap is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(proxy24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(proxy31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "CacheMap:{}::{}" + "'", str49, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(proxy74);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(proxy81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(obj83);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, 10, 1, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 100.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean3 = cacheMap1.pin((Object) "CacheMap:{}::{}");
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean7 = cacheMap6.isLRU();
        boolean boolean8 = cacheMap6.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str12 = cacheMap11.toString();
        cacheMap11.setSoftReferenceSize(1);
        boolean boolean16 = cacheMap11.containsValue((Object) 100.0f);
        boolean boolean17 = cacheMap6.unpin((Object) cacheMap11);
        boolean boolean18 = cacheMap6.isLRU();
        java.util.Set set19 = cacheMap6.getPinnedKeys();
        boolean boolean20 = cacheMap1.containsKey((Object) cacheMap6);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap1.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CacheMap:{}::{}" + "'", str12, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        boolean boolean6 = cacheMap4.isEmpty();
        boolean boolean8 = cacheMap4.unpin((Object) 10);
        cacheMap0.putAll((java.util.Map) cacheMap4);
        cacheMap4.setCacheSize((int) (byte) -1);
        cacheMap4.writeLock();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str4 = cacheMap3.toString();
        boolean boolean5 = cacheMap3.isEmpty();
        boolean boolean6 = cacheMap3.isEmpty();
        cacheMap3.clear();
        java.util.Map map8 = proxyManagerImpl0.copyMap((java.util.Map) cacheMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CacheMap:{}::{}" + "'", str4, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap2.setCacheSize(0);
        java.util.Set set5 = cacheMap2.entrySet();
        boolean boolean6 = cacheMap2.isEmpty();
        int int7 = cacheMap2.size();
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap5.setCacheSize(0);
        Class<?> wildcardClass8 = cacheMap5.getClass();
        java.util.TimeZone timeZone9 = null;
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass8, timeZone9);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl11 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean12 = proxyManagerImpl11.getTrackChanges();
        boolean boolean13 = proxyManagerImpl11.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl14 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean15 = proxyManagerImpl14.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl16 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean17 = proxyManagerImpl16.getTrackChanges();
        boolean boolean18 = proxyManagerImpl16.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap21.setCacheSize(0);
        Class<?> wildcardClass24 = cacheMap21.getClass();
        java.util.TimeZone timeZone25 = null;
        org.apache.openjpa.util.Proxy proxy26 = proxyManagerImpl16.newCalendarProxy((Class) wildcardClass24, timeZone25);
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass30 = cacheMap29.getClass();
        java.util.Comparator comparator31 = null;
        org.apache.openjpa.util.Proxy proxy33 = proxyManagerImpl14.newCollectionProxy((Class) wildcardClass24, (Class) wildcardClass30, comparator31, true);
        org.apache.openjpa.util.Proxy proxy34 = proxyManagerImpl11.newDateProxy((Class) wildcardClass30);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl35 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean36 = proxyManagerImpl35.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl37 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean38 = proxyManagerImpl37.getTrackChanges();
        boolean boolean39 = proxyManagerImpl37.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap42.setCacheSize(0);
        Class<?> wildcardClass45 = cacheMap42.getClass();
        java.util.TimeZone timeZone46 = null;
        org.apache.openjpa.util.Proxy proxy47 = proxyManagerImpl37.newCalendarProxy((Class) wildcardClass45, timeZone46);
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass51 = cacheMap50.getClass();
        java.util.Comparator comparator52 = null;
        org.apache.openjpa.util.Proxy proxy54 = proxyManagerImpl35.newCollectionProxy((Class) wildcardClass45, (Class) wildcardClass51, comparator52, true);
        java.util.Comparator comparator55 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.Proxy proxy57 = proxyManagerImpl0.newCollectionProxy((Class) wildcardClass30, (Class) wildcardClass45, comparator55, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$53$proxy cannot be cast to class org.apache.openjpa.util.proxy.ProxyCollection (org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$53$proxy is in unnamed module of loader org.apache.openjpa.util.ClassLoaderProxyService$ProxiesClassLoader @7ffd0a17; org.apache.openjpa.util.proxy.ProxyCollection is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(proxy26);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(proxy33);
        org.junit.Assert.assertNotNull(proxy34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(proxy47);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(proxy54);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap3.containsKey((Object) 10.0f);
        java.util.Map map6 = proxyManagerImpl0.copyMap((java.util.Map) cacheMap3);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass10 = cacheMap9.getClass();
        java.util.TimeZone timeZone11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.Proxy proxy12 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass10, timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$59$proxy cannot be cast to class org.apache.openjpa.util.proxy.ProxyCalendar (org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$59$proxy is in unnamed module of loader org.apache.openjpa.util.ClassLoaderProxyService$ProxiesClassLoader @55816a34; org.apache.openjpa.util.proxy.ProxyCalendar is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        java.util.Set set6 = cacheMap2.entrySet();
        int int7 = cacheMap2.size();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        proxyManagerImpl0.setUnproxyable("CacheMap:{}::{}");
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str8 = cacheMap7.toString();
        cacheMap7.setSoftReferenceSize(1);
        java.util.Set set11 = cacheMap7.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection12 = proxyManagerImpl0.copyCollection((java.util.Collection) set11);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.GeneralException; message: org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$EntrySet$60$proxy");
        } catch (org.apache.openjpa.util.GeneralException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str5 = cacheMap4.toString();
        cacheMap4.setSoftReferenceSize(1);
        java.util.Collection collection8 = cacheMap4.values();
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCustomProxy((Object) cacheMap4, false);
        proxyManagerImpl0.setTrackChanges(true);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean16 = cacheMap15.isLRU();
        boolean boolean17 = cacheMap15.isLRU();
        // The following exception was thrown during execution in test generation
        try {
            Object obj18 = proxyManagerImpl0.copyArray((Object) cacheMap15);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UnsupportedException; message: Unable to copy array: Argument is not an array.");
        } catch (org.apache.openjpa.util.UnsupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, (int) '4', (int) '4', (float) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 100.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl3 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean4 = proxyManagerImpl3.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl5 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean6 = proxyManagerImpl5.getTrackChanges();
        boolean boolean7 = proxyManagerImpl5.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap10.setCacheSize(0);
        Class<?> wildcardClass13 = cacheMap10.getClass();
        java.util.TimeZone timeZone14 = null;
        org.apache.openjpa.util.Proxy proxy15 = proxyManagerImpl5.newCalendarProxy((Class) wildcardClass13, timeZone14);
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass19 = cacheMap18.getClass();
        java.util.Comparator comparator20 = null;
        org.apache.openjpa.util.Proxy proxy22 = proxyManagerImpl3.newCollectionProxy((Class) wildcardClass13, (Class) wildcardClass19, comparator20, true);
        org.apache.openjpa.util.Proxy proxy23 = proxyManagerImpl0.newDateProxy((Class) wildcardClass19);
        // The following exception was thrown during execution in test generation
        try {
            Object obj25 = proxyManagerImpl0.copyArray((Object) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UnsupportedException; message: Unable to copy array: Argument is not an array.");
        } catch (org.apache.openjpa.util.UnsupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(proxy15);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(proxy22);
        org.junit.Assert.assertNotNull(proxy23);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        cacheMap2.clear();
        cacheMap2.writeLock();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap2.setCacheSize(0);
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str8 = cacheMap7.toString();
        cacheMap7.setSoftReferenceSize(1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = cacheMap2.pin((Object) cacheMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.entrySet();
        java.util.Collection collection6 = cacheMap4.values();
        cacheMap2.putAll((java.util.Map) cacheMap4, true);
        int int9 = cacheMap2.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap(false);
        int int12 = cacheMap11.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean16 = cacheMap15.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set18 = cacheMap17.entrySet();
        java.util.Collection collection19 = cacheMap17.values();
        cacheMap15.putAll((java.util.Map) cacheMap17, true);
        cacheMap17.setCacheSize((int) 'a');
        java.util.Set set24 = cacheMap17.entrySet();
        Object obj25 = cacheMap11.get((Object) cacheMap17);
        boolean boolean26 = cacheMap2.unpin((Object) cacheMap11);
        java.util.Collection collection27 = cacheMap2.values();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl0.setTrackChanges(false);
        proxyManagerImpl0.setTrackChanges(false);
        java.util.Collection collection5 = proxyManagerImpl0.getUnproxyable();
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        boolean boolean7 = cacheMap2.containsValue((Object) 100.0f);
        int int8 = cacheMap2.size();
        int int9 = cacheMap2.size();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set11 = cacheMap10.entrySet();
        java.util.Collection collection12 = cacheMap10.values();
        java.util.Set set13 = cacheMap10.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set15 = cacheMap14.getPinnedKeys();
        boolean boolean16 = cacheMap14.isEmpty();
        boolean boolean18 = cacheMap14.unpin((Object) 10);
        cacheMap10.putAll((java.util.Map) cacheMap14);
        boolean boolean20 = cacheMap2.unpin((Object) cacheMap14);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap2.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        Class<?> wildcardClass3 = cacheMap1.getClass();
        org.apache.openjpa.util.Proxy proxy4 = proxyManagerImpl0.newDateProxy((Class) wildcardClass3);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl5 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean6 = proxyManagerImpl5.getTrackChanges();
        boolean boolean7 = proxyManagerImpl5.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap10.setCacheSize(0);
        Class<?> wildcardClass13 = cacheMap10.getClass();
        java.util.TimeZone timeZone14 = null;
        org.apache.openjpa.util.Proxy proxy15 = proxyManagerImpl5.newCalendarProxy((Class) wildcardClass13, timeZone14);
        org.apache.openjpa.util.Proxy proxy16 = proxyManagerImpl0.newDateProxy((Class) wildcardClass13);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl17 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean18 = proxyManagerImpl17.getTrackChanges();
        boolean boolean19 = proxyManagerImpl17.getDelayCollectionLoading();
        boolean boolean20 = proxyManagerImpl17.getTrackChanges();
        Class<?> wildcardClass21 = proxyManagerImpl17.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl22 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean23 = proxyManagerImpl22.getTrackChanges();
        boolean boolean24 = proxyManagerImpl22.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl25 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean26 = proxyManagerImpl25.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl27 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean28 = proxyManagerImpl27.getTrackChanges();
        boolean boolean29 = proxyManagerImpl27.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap32 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap32.setCacheSize(0);
        Class<?> wildcardClass35 = cacheMap32.getClass();
        java.util.TimeZone timeZone36 = null;
        org.apache.openjpa.util.Proxy proxy37 = proxyManagerImpl27.newCalendarProxy((Class) wildcardClass35, timeZone36);
        org.apache.openjpa.util.CacheMap cacheMap40 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass41 = cacheMap40.getClass();
        java.util.Comparator comparator42 = null;
        org.apache.openjpa.util.Proxy proxy44 = proxyManagerImpl25.newCollectionProxy((Class) wildcardClass35, (Class) wildcardClass41, comparator42, true);
        org.apache.openjpa.util.Proxy proxy45 = proxyManagerImpl22.newDateProxy((Class) wildcardClass41);
        java.util.Comparator comparator46 = null;
        org.apache.openjpa.util.Proxy proxy48 = proxyManagerImpl0.newCollectionProxy((Class) wildcardClass21, (Class) wildcardClass41, comparator46, true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl49 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set51 = cacheMap50.getPinnedKeys();
        Class<?> wildcardClass52 = cacheMap50.getClass();
        org.apache.openjpa.util.Proxy proxy53 = proxyManagerImpl49.newDateProxy((Class) wildcardClass52);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl54 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean55 = proxyManagerImpl54.getTrackChanges();
        boolean boolean56 = proxyManagerImpl54.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap59 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap59.setCacheSize(0);
        Class<?> wildcardClass62 = cacheMap59.getClass();
        java.util.TimeZone timeZone63 = null;
        org.apache.openjpa.util.Proxy proxy64 = proxyManagerImpl54.newCalendarProxy((Class) wildcardClass62, timeZone63);
        org.apache.openjpa.util.Proxy proxy65 = proxyManagerImpl49.newDateProxy((Class) wildcardClass62);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl66 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap67 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set68 = cacheMap67.getPinnedKeys();
        Class<?> wildcardClass69 = cacheMap67.getClass();
        org.apache.openjpa.util.Proxy proxy70 = proxyManagerImpl66.newDateProxy((Class) wildcardClass69);
        java.util.Comparator comparator71 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.Proxy proxy73 = proxyManagerImpl0.newCollectionProxy((Class) wildcardClass62, (Class) wildcardClass69, comparator71, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$75$proxy cannot be cast to class org.apache.openjpa.util.proxy.ProxyCollection (org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$75$proxy is in unnamed module of loader org.apache.openjpa.util.ClassLoaderProxyService$ProxiesClassLoader @2c7e4148; org.apache.openjpa.util.proxy.ProxyCollection is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(proxy15);
        org.junit.Assert.assertNotNull(proxy16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(proxy37);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(proxy44);
        org.junit.Assert.assertNotNull(proxy45);
        org.junit.Assert.assertNotNull(proxy48);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(proxy53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(proxy64);
        org.junit.Assert.assertNotNull(proxy65);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(proxy70);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.entrySet();
        java.util.Collection collection6 = cacheMap4.values();
        cacheMap2.putAll((java.util.Map) cacheMap4, true);
        cacheMap4.setCacheSize((int) 'a');
        cacheMap4.setCacheSize((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap4.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getDelayCollectionLoading();
        java.util.Calendar calendar2 = null;
        java.util.Calendar calendar3 = proxyManagerImpl0.copyCalendar(calendar2);
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str7 = cacheMap6.toString();
        Object obj8 = proxyManagerImpl0.copyCustom((Object) str7);
        proxyManagerImpl0.setDelayCollectionLoading(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(calendar3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CacheMap:{}::{}" + "'", str7, "CacheMap:{}::{}");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        boolean boolean4 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str8 = cacheMap7.toString();
        cacheMap7.setSoftReferenceSize(1);
        boolean boolean12 = cacheMap7.containsValue((Object) 100.0f);
        boolean boolean13 = cacheMap2.unpin((Object) cacheMap7);
        int int14 = cacheMap2.getCacheSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setAssertAllowedType(true);
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str7 = cacheMap6.toString();
        boolean boolean8 = cacheMap6.isEmpty();
        java.util.Set set9 = cacheMap6.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection10 = proxyManagerImpl0.copyCollection((java.util.Collection) set9);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.GeneralException; message: org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$EntrySet$123$proxy");
        } catch (org.apache.openjpa.util.GeneralException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CacheMap:{}::{}" + "'", str7, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: LRUMap max size must be greater than 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        boolean boolean7 = cacheMap2.containsValue((Object) 100.0f);
        int int8 = cacheMap2.size();
        int int9 = cacheMap2.size();
        cacheMap2.writeLock();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) 'a', (int) (byte) 1, (float) 10L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 10.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl2 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean3 = proxyManagerImpl2.getTrackChanges();
        boolean boolean4 = proxyManagerImpl2.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap7.setCacheSize(0);
        Class<?> wildcardClass10 = cacheMap7.getClass();
        java.util.TimeZone timeZone11 = null;
        org.apache.openjpa.util.Proxy proxy12 = proxyManagerImpl2.newCalendarProxy((Class) wildcardClass10, timeZone11);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass16 = cacheMap15.getClass();
        java.util.Comparator comparator17 = null;
        org.apache.openjpa.util.Proxy proxy19 = proxyManagerImpl0.newCollectionProxy((Class) wildcardClass10, (Class) wildcardClass16, comparator17, true);
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean23 = cacheMap21.pin((Object) "CacheMap:{}::{}");
        java.util.Set set24 = cacheMap21.getPinnedKeys();
        // The following exception was thrown during execution in test generation
        try {
            Object obj25 = proxyManagerImpl0.copyCustom((Object) set24);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.GeneralException; message: org.apache.openjpa.util.java$util$Collections$UnmodifiableSet$137$proxy");
        } catch (org.apache.openjpa.util.GeneralException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(proxy12);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(proxy19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap5.setCacheSize(0);
        Class<?> wildcardClass8 = cacheMap5.getClass();
        java.util.TimeZone timeZone9 = null;
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass8, timeZone9);
        proxyManagerImpl0.setDelayCollectionLoading(true);
        boolean boolean13 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl14 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl15 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean16 = proxyManagerImpl15.getDelayCollectionLoading();
        java.util.Calendar calendar17 = null;
        java.util.Calendar calendar18 = proxyManagerImpl15.copyCalendar(calendar17);
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass22 = cacheMap21.getClass();
        org.apache.openjpa.util.Proxy proxy23 = proxyManagerImpl15.newDateProxy((Class) wildcardClass22);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl24 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean25 = proxyManagerImpl24.getTrackChanges();
        boolean boolean26 = proxyManagerImpl24.getDelayCollectionLoading();
        boolean boolean27 = proxyManagerImpl24.getTrackChanges();
        Class<?> wildcardClass28 = proxyManagerImpl24.getClass();
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap31.setCacheSize(0);
        Class<?> wildcardClass34 = cacheMap31.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl35 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean36 = proxyManagerImpl35.getDelayCollectionLoading();
        java.util.Calendar calendar37 = null;
        java.util.Calendar calendar38 = proxyManagerImpl35.copyCalendar(calendar37);
        org.apache.openjpa.util.CacheMap cacheMap41 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass42 = cacheMap41.getClass();
        org.apache.openjpa.util.Proxy proxy43 = proxyManagerImpl35.newDateProxy((Class) wildcardClass42);
        java.util.Comparator comparator44 = null;
        org.apache.openjpa.util.Proxy proxy46 = proxyManagerImpl15.newMapProxy((Class) wildcardClass28, (Class) wildcardClass34, (Class) wildcardClass42, comparator44, false);
        java.util.TimeZone timeZone47 = null;
        org.apache.openjpa.util.Proxy proxy48 = proxyManagerImpl14.newCalendarProxy((Class) wildcardClass42, timeZone47);
        Class class49 = null;
        java.util.Comparator comparator50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.Proxy proxy52 = proxyManagerImpl0.newCollectionProxy((Class) wildcardClass42, class49, comparator50, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$138$proxy cannot be cast to class org.apache.openjpa.util.proxy.ProxyCollection (org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$138$proxy is in unnamed module of loader org.apache.openjpa.util.ClassLoaderProxyService$ProxiesClassLoader @43504aef; org.apache.openjpa.util.proxy.ProxyCollection is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(calendar18);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(proxy23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(calendar38);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(proxy43);
        org.junit.Assert.assertNotNull(proxy46);
        org.junit.Assert.assertNotNull(proxy48);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.entrySet();
        java.util.Collection collection6 = cacheMap4.values();
        cacheMap2.putAll((java.util.Map) cacheMap4, true);
        int int9 = cacheMap2.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set11 = cacheMap10.entrySet();
        java.util.Collection collection12 = cacheMap10.values();
        java.util.Set set13 = cacheMap10.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set15 = cacheMap14.getPinnedKeys();
        boolean boolean16 = cacheMap14.isEmpty();
        boolean boolean18 = cacheMap14.unpin((Object) 10);
        cacheMap10.putAll((java.util.Map) cacheMap14);
        java.util.Set set20 = cacheMap10.keySet();
        // The following exception was thrown during execution in test generation
        try {
            Object obj22 = cacheMap2.put((Object) set20, (Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap5.setCacheSize(0);
        Class<?> wildcardClass8 = cacheMap5.getClass();
        java.util.TimeZone timeZone9 = null;
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass8, timeZone9);
        proxyManagerImpl0.setAssertAllowedType(true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl13 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean14 = proxyManagerImpl13.getTrackChanges();
        boolean boolean15 = proxyManagerImpl13.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl16 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean17 = proxyManagerImpl16.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl18 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean19 = proxyManagerImpl18.getTrackChanges();
        boolean boolean20 = proxyManagerImpl18.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap23.setCacheSize(0);
        Class<?> wildcardClass26 = cacheMap23.getClass();
        java.util.TimeZone timeZone27 = null;
        org.apache.openjpa.util.Proxy proxy28 = proxyManagerImpl18.newCalendarProxy((Class) wildcardClass26, timeZone27);
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass32 = cacheMap31.getClass();
        java.util.Comparator comparator33 = null;
        org.apache.openjpa.util.Proxy proxy35 = proxyManagerImpl16.newCollectionProxy((Class) wildcardClass26, (Class) wildcardClass32, comparator33, true);
        org.apache.openjpa.util.Proxy proxy36 = proxyManagerImpl13.newDateProxy((Class) wildcardClass32);
        org.apache.openjpa.util.CacheMap cacheMap37 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set38 = cacheMap37.getPinnedKeys();
        Class<?> wildcardClass39 = cacheMap37.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl40 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean41 = proxyManagerImpl40.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl42 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean43 = proxyManagerImpl42.getTrackChanges();
        boolean boolean44 = proxyManagerImpl42.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap47 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap47.setCacheSize(0);
        Class<?> wildcardClass50 = cacheMap47.getClass();
        java.util.TimeZone timeZone51 = null;
        org.apache.openjpa.util.Proxy proxy52 = proxyManagerImpl42.newCalendarProxy((Class) wildcardClass50, timeZone51);
        org.apache.openjpa.util.CacheMap cacheMap55 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass56 = cacheMap55.getClass();
        java.util.Comparator comparator57 = null;
        org.apache.openjpa.util.Proxy proxy59 = proxyManagerImpl40.newCollectionProxy((Class) wildcardClass50, (Class) wildcardClass56, comparator57, true);
        java.util.Comparator comparator60 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.Proxy proxy62 = proxyManagerImpl0.newMapProxy((Class) wildcardClass32, (Class) wildcardClass39, (Class) wildcardClass56, comparator60, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$149$proxy cannot be cast to class org.apache.openjpa.util.proxy.ProxyMap (org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$149$proxy is in unnamed module of loader org.apache.openjpa.util.ClassLoaderProxyService$ProxiesClassLoader @155ae527; org.apache.openjpa.util.proxy.ProxyMap is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(proxy28);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(proxy35);
        org.junit.Assert.assertNotNull(proxy36);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(proxy52);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(proxy59);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, 0, (int) (short) 100, (float) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: -1.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.getSoftReferenceSize();
        java.util.Map map5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.putAll(map5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap3.containsKey((Object) 10.0f);
        java.util.Map map6 = proxyManagerImpl0.copyMap((java.util.Map) cacheMap3);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean10 = cacheMap8.pin((Object) "CacheMap:{}::{}");
        int int11 = cacheMap8.getSoftReferenceSize();
        java.util.Collection collection12 = cacheMap8.values();
        cacheMap3.putAll((java.util.Map) cacheMap8, true);
        boolean boolean15 = cacheMap8.isLRU();
        String str16 = cacheMap8.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{}::{}" + "'", str16, "CacheMap:{}::{}");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setAssertAllowedType(true);
        boolean boolean4 = proxyManagerImpl0.getAssertAllowedType();
        boolean boolean5 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set7 = cacheMap6.entrySet();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl8 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl8.setTrackChanges(false);
        java.util.Collection collection11 = proxyManagerImpl8.getUnproxyable();
        boolean boolean12 = cacheMap6.containsKey((Object) collection11);
        Class<?> wildcardClass13 = cacheMap6.getClass();
        java.util.TimeZone timeZone14 = null;
        org.apache.openjpa.util.Proxy proxy15 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass13, timeZone14);
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set17 = cacheMap16.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection18 = proxyManagerImpl0.copyCollection((java.util.Collection) set17);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.GeneralException; message: org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$EntrySet$168$proxy");
        } catch (org.apache.openjpa.util.GeneralException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(proxy15);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) 'a', 100, (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 0.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean6 = cacheMap5.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set8 = cacheMap7.entrySet();
        java.util.Collection collection9 = cacheMap7.values();
        cacheMap5.putAll((java.util.Map) cacheMap7, true);
        cacheMap2.putAll((java.util.Map) cacheMap7, false);
        boolean boolean14 = cacheMap0.unpin((Object) false);
        Object obj16 = cacheMap0.get((Object) 10);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean6 = cacheMap5.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set8 = cacheMap7.entrySet();
        java.util.Collection collection9 = cacheMap7.values();
        cacheMap5.putAll((java.util.Map) cacheMap7, true);
        cacheMap2.putAll((java.util.Map) cacheMap7, false);
        boolean boolean14 = cacheMap0.unpin((Object) false);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        boolean boolean6 = cacheMap2.isEmpty();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl7 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl7.setTrackChanges(false);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        boolean boolean12 = cacheMap10.containsKey((Object) 10.0f);
        java.util.Map map13 = proxyManagerImpl7.copyMap((java.util.Map) cacheMap10);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean17 = cacheMap15.pin((Object) "CacheMap:{}::{}");
        int int18 = cacheMap15.getSoftReferenceSize();
        java.util.Collection collection19 = cacheMap15.values();
        cacheMap10.putAll((java.util.Map) cacheMap15, true);
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap(true, 100);
        // The following exception was thrown during execution in test generation
        try {
            Object obj25 = cacheMap2.put((Object) cacheMap15, (Object) cacheMap24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap2.setCacheSize(0);
        java.util.Set set5 = cacheMap2.entrySet();
        boolean boolean6 = cacheMap2.isEmpty();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl7 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean8 = proxyManagerImpl7.getTrackChanges();
        boolean boolean9 = proxyManagerImpl7.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl10 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean11 = proxyManagerImpl10.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl12 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean13 = proxyManagerImpl12.getTrackChanges();
        boolean boolean14 = proxyManagerImpl12.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap17.setCacheSize(0);
        Class<?> wildcardClass20 = cacheMap17.getClass();
        java.util.TimeZone timeZone21 = null;
        org.apache.openjpa.util.Proxy proxy22 = proxyManagerImpl12.newCalendarProxy((Class) wildcardClass20, timeZone21);
        org.apache.openjpa.util.CacheMap cacheMap25 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass26 = cacheMap25.getClass();
        java.util.Comparator comparator27 = null;
        org.apache.openjpa.util.Proxy proxy29 = proxyManagerImpl10.newCollectionProxy((Class) wildcardClass20, (Class) wildcardClass26, comparator27, true);
        org.apache.openjpa.util.Proxy proxy30 = proxyManagerImpl7.newDateProxy((Class) wildcardClass26);
        Object obj31 = null;
        Object obj32 = cacheMap2.put((Object) proxy30, obj31);
        int int33 = cacheMap2.getCacheSize();
        String str34 = cacheMap2.toString();
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(proxy22);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(proxy29);
        org.junit.Assert.assertNotNull(proxy30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "CacheMap:{}::{}" + "'", str34, "CacheMap:{}::{}");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap2.setCacheSize(0);
        java.util.Set set5 = cacheMap2.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set7 = cacheMap6.getPinnedKeys();
        boolean boolean8 = cacheMap6.isEmpty();
        boolean boolean10 = cacheMap6.unpin((Object) 10);
        boolean boolean11 = cacheMap2.containsValue((Object) cacheMap6);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl12 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean13 = proxyManagerImpl12.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str17 = cacheMap16.toString();
        cacheMap16.setSoftReferenceSize(1);
        java.util.Collection collection20 = cacheMap16.values();
        org.apache.openjpa.util.Proxy proxy22 = proxyManagerImpl12.newCustomProxy((Object) cacheMap16, false);
        java.util.Collection collection23 = proxyManagerImpl12.getUnproxyable();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = cacheMap2.containsKey((Object) proxyManagerImpl12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CacheMap:{}::{}" + "'", str17, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(proxy22);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.entrySet();
        java.util.Collection collection6 = cacheMap4.values();
        cacheMap2.putAll((java.util.Map) cacheMap4, true);
        cacheMap4.setCacheSize((int) 'a');
        int int11 = cacheMap4.getSoftReferenceSize();
        java.util.Set set12 = cacheMap4.keySet();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        cacheMap2.readLock();
        cacheMap2.readLock();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cacheMap2.containsKey((Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        java.util.Date date1 = null;
        java.util.Date date2 = proxyManagerImpl0.copyDate(date1);
        boolean boolean3 = proxyManagerImpl0.getDelayCollectionLoading();
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, (int) (short) 0, (int) (byte) -1, 100.0f, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 100.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl3 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        Class<?> wildcardClass6 = cacheMap4.getClass();
        org.apache.openjpa.util.Proxy proxy7 = proxyManagerImpl3.newDateProxy((Class) wildcardClass6);
        java.util.TimeZone timeZone8 = null;
        org.apache.openjpa.util.Proxy proxy9 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass6, timeZone8);
        boolean boolean10 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setTrackChanges(true);
        java.util.Collection collection13 = proxyManagerImpl0.getUnproxyable();
        proxyManagerImpl0.setTrackChanges(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.entrySet();
        java.util.Collection collection6 = cacheMap4.values();
        cacheMap2.putAll((java.util.Map) cacheMap4, true);
        cacheMap4.setCacheSize((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            cacheMap4.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean2 = cacheMap0.containsKey((Object) 10.0f);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set4 = cacheMap3.entrySet();
        Object obj5 = cacheMap0.remove((Object) set4);
        boolean boolean6 = cacheMap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl4 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.getPinnedKeys();
        Class<?> wildcardClass7 = cacheMap5.getClass();
        org.apache.openjpa.util.Proxy proxy8 = proxyManagerImpl4.newDateProxy((Class) wildcardClass7);
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCustomProxy((Object) proxyManagerImpl4, true);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set12 = cacheMap11.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.Proxy proxy14 = proxyManagerImpl4.newCustomProxy((Object) cacheMap11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$194$proxy cannot be cast to class org.apache.openjpa.util.proxy.ProxyMap (org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$194$proxy is in unnamed module of loader org.apache.openjpa.util.ClassLoaderProxyService$ProxiesClassLoader @3e7aabea; org.apache.openjpa.util.proxy.ProxyMap is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) 1, (int) (short) 10, (float) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 100.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str5 = cacheMap4.toString();
        cacheMap4.setSoftReferenceSize(1);
        java.util.Collection collection8 = cacheMap4.values();
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCustomProxy((Object) cacheMap4, false);
        proxyManagerImpl0.setTrackChanges(true);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap15.setCacheSize(0);
        java.util.Set set18 = cacheMap15.entrySet();
        boolean boolean19 = cacheMap15.isEmpty();
        Object obj20 = proxyManagerImpl0.copyCustom((Object) boolean19);
        proxyManagerImpl0.setUnproxyable("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl4 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.getPinnedKeys();
        Class<?> wildcardClass7 = cacheMap5.getClass();
        org.apache.openjpa.util.Proxy proxy8 = proxyManagerImpl4.newDateProxy((Class) wildcardClass7);
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCustomProxy((Object) proxyManagerImpl4, true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl11 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean12 = proxyManagerImpl11.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str16 = cacheMap15.toString();
        cacheMap15.setSoftReferenceSize(1);
        java.util.Collection collection19 = cacheMap15.values();
        org.apache.openjpa.util.Proxy proxy21 = proxyManagerImpl11.newCustomProxy((Object) cacheMap15, false);
        proxyManagerImpl11.setTrackChanges(true);
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap26.setCacheSize(0);
        java.util.Set set29 = cacheMap26.entrySet();
        boolean boolean30 = cacheMap26.isEmpty();
        Object obj31 = proxyManagerImpl11.copyCustom((Object) boolean30);
        Object obj32 = proxyManagerImpl0.copyArray(obj31);
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean36 = cacheMap35.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap37 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set38 = cacheMap37.entrySet();
        java.util.Collection collection39 = cacheMap37.values();
        cacheMap35.putAll((java.util.Map) cacheMap37, true);
        cacheMap37.setCacheSize((int) 'a');
        java.util.Set set44 = cacheMap37.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection45 = proxyManagerImpl0.copyCollection((java.util.Collection) set44);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.GeneralException; message: org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$EntrySet$202$proxy");
        } catch (org.apache.openjpa.util.GeneralException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{}::{}" + "'", str16, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(proxy21);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean3 = cacheMap1.pin((Object) "CacheMap:{}::{}");
        java.util.Set set4 = cacheMap1.getPinnedKeys();
        int int5 = cacheMap1.getSoftReferenceSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        boolean boolean2 = cacheMap0.isEmpty();
        cacheMap0.readLock();
        boolean boolean4 = cacheMap0.isLRU();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        boolean boolean6 = cacheMap4.isEmpty();
        boolean boolean8 = cacheMap4.unpin((Object) 10);
        cacheMap0.putAll((java.util.Map) cacheMap4);
        java.util.Set set10 = cacheMap0.keySet();
        Class<?> wildcardClass11 = set10.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (short) 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean4 = cacheMap3.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.entrySet();
        java.util.Collection collection7 = cacheMap5.values();
        cacheMap3.putAll((java.util.Map) cacheMap5, true);
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl12 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean13 = proxyManagerImpl12.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl14 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean15 = proxyManagerImpl14.getTrackChanges();
        boolean boolean16 = proxyManagerImpl14.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap19.setCacheSize(0);
        Class<?> wildcardClass22 = cacheMap19.getClass();
        java.util.TimeZone timeZone23 = null;
        org.apache.openjpa.util.Proxy proxy24 = proxyManagerImpl14.newCalendarProxy((Class) wildcardClass22, timeZone23);
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass28 = cacheMap27.getClass();
        java.util.Comparator comparator29 = null;
        org.apache.openjpa.util.Proxy proxy31 = proxyManagerImpl12.newCollectionProxy((Class) wildcardClass22, (Class) wildcardClass28, comparator29, true);
        boolean boolean32 = cacheMap0.containsValue((Object) proxyManagerImpl12);
        Object obj34 = cacheMap0.get((Object) 1000);
        java.util.Collection collection35 = cacheMap0.values();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(proxy24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(proxy31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (-1), (-1), (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: -1.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean3 = cacheMap1.pin((Object) "CacheMap:{}::{}");
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean7 = cacheMap6.isLRU();
        boolean boolean8 = cacheMap6.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str12 = cacheMap11.toString();
        cacheMap11.setSoftReferenceSize(1);
        boolean boolean16 = cacheMap11.containsValue((Object) 100.0f);
        boolean boolean17 = cacheMap6.unpin((Object) cacheMap11);
        boolean boolean18 = cacheMap6.isLRU();
        java.util.Set set19 = cacheMap6.getPinnedKeys();
        boolean boolean20 = cacheMap1.containsKey((Object) cacheMap6);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap6.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CacheMap:{}::{}" + "'", str12, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        boolean boolean7 = cacheMap2.containsValue((Object) 100.0f);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean11 = cacheMap10.isLRU();
        boolean boolean12 = cacheMap10.isLRU();
        cacheMap2.putAll((java.util.Map) cacheMap10);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap2.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap5.setCacheSize(0);
        Class<?> wildcardClass8 = cacheMap5.getClass();
        java.util.TimeZone timeZone9 = null;
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass8, timeZone9);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set12 = cacheMap11.entrySet();
        java.util.Collection collection13 = cacheMap11.values();
        java.util.Set set14 = cacheMap11.entrySet();
        int int15 = cacheMap11.getSoftReferenceSize();
        Object obj17 = cacheMap11.remove((Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set19 = cacheMap18.entrySet();
        java.util.Collection collection20 = cacheMap18.values();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl21 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl22 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean23 = proxyManagerImpl22.getDelayCollectionLoading();
        java.util.Calendar calendar24 = null;
        java.util.Calendar calendar25 = proxyManagerImpl22.copyCalendar(calendar24);
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass29 = cacheMap28.getClass();
        org.apache.openjpa.util.Proxy proxy30 = proxyManagerImpl22.newDateProxy((Class) wildcardClass29);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl31 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean32 = proxyManagerImpl31.getTrackChanges();
        boolean boolean33 = proxyManagerImpl31.getDelayCollectionLoading();
        boolean boolean34 = proxyManagerImpl31.getTrackChanges();
        Class<?> wildcardClass35 = proxyManagerImpl31.getClass();
        org.apache.openjpa.util.CacheMap cacheMap38 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap38.setCacheSize(0);
        Class<?> wildcardClass41 = cacheMap38.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl42 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean43 = proxyManagerImpl42.getDelayCollectionLoading();
        java.util.Calendar calendar44 = null;
        java.util.Calendar calendar45 = proxyManagerImpl42.copyCalendar(calendar44);
        org.apache.openjpa.util.CacheMap cacheMap48 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass49 = cacheMap48.getClass();
        org.apache.openjpa.util.Proxy proxy50 = proxyManagerImpl42.newDateProxy((Class) wildcardClass49);
        java.util.Comparator comparator51 = null;
        org.apache.openjpa.util.Proxy proxy53 = proxyManagerImpl22.newMapProxy((Class) wildcardClass35, (Class) wildcardClass41, (Class) wildcardClass49, comparator51, false);
        java.util.TimeZone timeZone54 = null;
        org.apache.openjpa.util.Proxy proxy55 = proxyManagerImpl21.newCalendarProxy((Class) wildcardClass49, timeZone54);
        Object obj56 = cacheMap11.put((Object) collection20, (Object) proxy55);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map57 = proxyManagerImpl0.copyMap((java.util.Map) cacheMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$212$proxy cannot be cast to class org.apache.openjpa.util.proxy.ProxyMap (org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$212$proxy is in unnamed module of loader org.apache.openjpa.util.ClassLoaderProxyService$ProxiesClassLoader @3754445d; org.apache.openjpa.util.proxy.ProxyMap is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(calendar25);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(proxy30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(calendar45);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(proxy50);
        org.junit.Assert.assertNotNull(proxy53);
        org.junit.Assert.assertNotNull(proxy55);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, (int) '4', 1000, (float) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 10.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap2.readLock();
        java.util.Set set4 = cacheMap2.keySet();
        java.util.Set set5 = cacheMap2.getPinnedKeys();
        int int6 = cacheMap2.getSoftReferenceSize();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        proxyManagerImpl0.setUnproxyable("");
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean8 = cacheMap7.isLRU();
        cacheMap7.clear();
        java.util.Collection collection10 = cacheMap7.values();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection11 = proxyManagerImpl0.copyCollection(collection10);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.GeneralException; message: org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$ValueCollection$224$proxy");
        } catch (org.apache.openjpa.util.GeneralException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        boolean boolean4 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str8 = cacheMap7.toString();
        cacheMap7.setSoftReferenceSize(1);
        boolean boolean12 = cacheMap7.containsValue((Object) 100.0f);
        boolean boolean13 = cacheMap2.unpin((Object) cacheMap7);
        boolean boolean14 = cacheMap2.isLRU();
        java.util.Set set15 = cacheMap2.getPinnedKeys();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap2.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str6 = cacheMap5.toString();
        cacheMap5.setSoftReferenceSize(1);
        cacheMap5.readLock();
        cacheMap1.putAll((java.util.Map) cacheMap5);
        int int11 = cacheMap5.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, 0, 100, (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 52.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        boolean boolean7 = cacheMap2.containsValue((Object) 100.0f);
        int int8 = cacheMap2.size();
        int int9 = cacheMap2.size();
        boolean boolean10 = cacheMap2.isEmpty();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl11 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean12 = proxyManagerImpl11.getTrackChanges();
        boolean boolean13 = proxyManagerImpl11.getDelayCollectionLoading();
        proxyManagerImpl11.setUnproxyable("CacheMap:{}::{}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = cacheMap2.containsKey((Object) "CacheMap:{}::{}");
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.entrySet();
        java.util.Collection collection6 = cacheMap4.values();
        cacheMap2.putAll((java.util.Map) cacheMap4, true);
        cacheMap4.setCacheSize((int) 'a');
        cacheMap4.setCacheSize((int) (byte) 0);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str16 = cacheMap15.toString();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean21 = cacheMap20.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set23 = cacheMap22.entrySet();
        java.util.Collection collection24 = cacheMap22.values();
        cacheMap20.putAll((java.util.Map) cacheMap22, true);
        cacheMap17.putAll((java.util.Map) cacheMap22, false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl29 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean30 = proxyManagerImpl29.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl31 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean32 = proxyManagerImpl31.getTrackChanges();
        boolean boolean33 = proxyManagerImpl31.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap36 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap36.setCacheSize(0);
        Class<?> wildcardClass39 = cacheMap36.getClass();
        java.util.TimeZone timeZone40 = null;
        org.apache.openjpa.util.Proxy proxy41 = proxyManagerImpl31.newCalendarProxy((Class) wildcardClass39, timeZone40);
        org.apache.openjpa.util.CacheMap cacheMap44 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass45 = cacheMap44.getClass();
        java.util.Comparator comparator46 = null;
        org.apache.openjpa.util.Proxy proxy48 = proxyManagerImpl29.newCollectionProxy((Class) wildcardClass39, (Class) wildcardClass45, comparator46, true);
        boolean boolean49 = cacheMap17.containsValue((Object) proxyManagerImpl29);
        Object obj50 = cacheMap4.put((Object) str16, (Object) cacheMap17);
        org.apache.openjpa.util.CacheMap cacheMap53 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean54 = cacheMap53.isLRU();
        boolean boolean55 = cacheMap53.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap58 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap58.setCacheSize(0);
        boolean boolean61 = cacheMap53.containsValue((Object) cacheMap58);
        boolean boolean62 = cacheMap53.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap65 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean66 = cacheMap65.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap67 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set68 = cacheMap67.entrySet();
        java.util.Collection collection69 = cacheMap67.values();
        cacheMap65.putAll((java.util.Map) cacheMap67, true);
        cacheMap67.setCacheSize((int) 'a');
        cacheMap53.putAll((java.util.Map) cacheMap67);
        cacheMap17.putAll((java.util.Map) cacheMap67);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{}::{}" + "'", str16, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(proxy41);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(proxy48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(collection69);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str5 = cacheMap4.toString();
        cacheMap4.setSoftReferenceSize(1);
        java.util.Collection collection8 = cacheMap4.values();
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCustomProxy((Object) cacheMap4, false);
        java.util.Map map11 = null;
        java.util.Map map12 = proxyManagerImpl0.copyMap(map11);
        java.util.Collection collection13 = proxyManagerImpl0.getUnproxyable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        Class<?> wildcardClass3 = cacheMap1.getClass();
        org.apache.openjpa.util.Proxy proxy4 = proxyManagerImpl0.newDateProxy((Class) wildcardClass3);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl5 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean6 = proxyManagerImpl5.getTrackChanges();
        boolean boolean7 = proxyManagerImpl5.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap10.setCacheSize(0);
        Class<?> wildcardClass13 = cacheMap10.getClass();
        java.util.TimeZone timeZone14 = null;
        org.apache.openjpa.util.Proxy proxy15 = proxyManagerImpl5.newCalendarProxy((Class) wildcardClass13, timeZone14);
        org.apache.openjpa.util.Proxy proxy16 = proxyManagerImpl0.newDateProxy((Class) wildcardClass13);
        java.util.Date date17 = null;
        java.util.Date date18 = proxyManagerImpl0.copyDate(date17);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(proxy15);
        org.junit.Assert.assertNotNull(proxy16);
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        boolean boolean4 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap7.setCacheSize(0);
        boolean boolean10 = cacheMap2.containsValue((Object) cacheMap7);
        boolean boolean11 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean15 = cacheMap14.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set17 = cacheMap16.entrySet();
        java.util.Collection collection18 = cacheMap16.values();
        cacheMap14.putAll((java.util.Map) cacheMap16, true);
        cacheMap16.setCacheSize((int) 'a');
        cacheMap2.putAll((java.util.Map) cacheMap16);
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean28 = cacheMap27.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set30 = cacheMap29.entrySet();
        java.util.Collection collection31 = cacheMap29.values();
        cacheMap27.putAll((java.util.Map) cacheMap29, true);
        Object obj34 = cacheMap16.put((Object) '4', (Object) cacheMap29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        boolean boolean6 = cacheMap4.isEmpty();
        boolean boolean8 = cacheMap4.unpin((Object) 10);
        cacheMap0.putAll((java.util.Map) cacheMap4);
        boolean boolean10 = cacheMap4.isLRU();
        cacheMap4.setSoftReferenceSize(0);
        boolean boolean13 = cacheMap4.isLRU();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        proxyManagerImpl0.setUnproxyable("");
        proxyManagerImpl0.setUnproxyable("");
        boolean boolean7 = proxyManagerImpl0.getAssertAllowedType();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str11 = cacheMap10.toString();
        cacheMap10.setSoftReferenceSize(1);
        boolean boolean15 = cacheMap10.containsValue((Object) 100.0f);
        int int16 = cacheMap10.size();
        int int17 = cacheMap10.size();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set19 = cacheMap18.entrySet();
        java.util.Collection collection20 = cacheMap18.values();
        java.util.Set set21 = cacheMap18.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set23 = cacheMap22.getPinnedKeys();
        boolean boolean24 = cacheMap22.isEmpty();
        boolean boolean26 = cacheMap22.unpin((Object) 10);
        cacheMap18.putAll((java.util.Map) cacheMap22);
        boolean boolean28 = cacheMap10.unpin((Object) cacheMap22);
        Object obj29 = proxyManagerImpl0.copyCustom((Object) boolean28);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CacheMap:{}::{}" + "'", str11, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap3.containsKey((Object) 10.0f);
        java.util.Map map6 = proxyManagerImpl0.copyMap((java.util.Map) cacheMap3);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean10 = cacheMap8.pin((Object) "CacheMap:{}::{}");
        int int11 = cacheMap8.getSoftReferenceSize();
        java.util.Collection collection12 = cacheMap8.values();
        cacheMap3.putAll((java.util.Map) cacheMap8, true);
        boolean boolean15 = cacheMap8.isLRU();
        int int16 = cacheMap8.getSoftReferenceSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) (short) -1, 1, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: -1.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        boolean boolean4 = cacheMap2.isEmpty();
        java.util.Set set5 = cacheMap2.entrySet();
        java.util.Set set6 = cacheMap2.keySet();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, 0, 0, (float) (short) 1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean4 = cacheMap3.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.entrySet();
        java.util.Collection collection7 = cacheMap5.values();
        cacheMap3.putAll((java.util.Map) cacheMap5, true);
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl12 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean13 = proxyManagerImpl12.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl14 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean15 = proxyManagerImpl14.getTrackChanges();
        boolean boolean16 = proxyManagerImpl14.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap19.setCacheSize(0);
        Class<?> wildcardClass22 = cacheMap19.getClass();
        java.util.TimeZone timeZone23 = null;
        org.apache.openjpa.util.Proxy proxy24 = proxyManagerImpl14.newCalendarProxy((Class) wildcardClass22, timeZone23);
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass28 = cacheMap27.getClass();
        java.util.Comparator comparator29 = null;
        org.apache.openjpa.util.Proxy proxy31 = proxyManagerImpl12.newCollectionProxy((Class) wildcardClass22, (Class) wildcardClass28, comparator29, true);
        boolean boolean32 = cacheMap0.containsValue((Object) proxyManagerImpl12);
        int int33 = cacheMap0.getSoftReferenceSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(proxy24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(proxy31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) 'a', (int) (short) -1, (float) (short) 1);
        boolean boolean5 = cacheMap4.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap3.containsKey((Object) 10.0f);
        java.util.Map map6 = proxyManagerImpl0.copyMap((java.util.Map) cacheMap3);
        boolean boolean7 = proxyManagerImpl0.getAssertAllowedType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean5 = cacheMap3.pin((Object) "CacheMap:{}::{}");
        boolean boolean6 = cacheMap0.pin((Object) "CacheMap:{}::{}");
        cacheMap0.setCacheSize((int) (byte) 10);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap5.readLock();
        java.util.Set set7 = cacheMap5.keySet();
        java.util.Set set8 = cacheMap5.getPinnedKeys();
        // The following exception was thrown during execution in test generation
        try {
            Object obj9 = cacheMap2.remove((Object) set8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        boolean boolean4 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap7.setCacheSize(0);
        boolean boolean10 = cacheMap2.containsValue((Object) cacheMap7);
        boolean boolean11 = cacheMap2.isLRU();
        cacheMap2.readLock();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.clear();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        proxyManagerImpl0.setUnproxyable("");
        proxyManagerImpl0.setUnproxyable("");
        proxyManagerImpl0.setDelayCollectionLoading(true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl9 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean10 = proxyManagerImpl9.getTrackChanges();
        boolean boolean11 = proxyManagerImpl9.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl12 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set14 = cacheMap13.getPinnedKeys();
        Class<?> wildcardClass15 = cacheMap13.getClass();
        org.apache.openjpa.util.Proxy proxy16 = proxyManagerImpl12.newDateProxy((Class) wildcardClass15);
        java.util.TimeZone timeZone17 = null;
        org.apache.openjpa.util.Proxy proxy18 = proxyManagerImpl9.newCalendarProxy((Class) wildcardClass15, timeZone17);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl19 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean20 = proxyManagerImpl19.getTrackChanges();
        boolean boolean21 = proxyManagerImpl19.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap24.setCacheSize(0);
        Class<?> wildcardClass27 = cacheMap24.getClass();
        java.util.TimeZone timeZone28 = null;
        org.apache.openjpa.util.Proxy proxy29 = proxyManagerImpl19.newCalendarProxy((Class) wildcardClass27, timeZone28);
        java.util.Comparator comparator30 = null;
        org.apache.openjpa.util.Proxy proxy32 = proxyManagerImpl0.newCollectionProxy((Class) wildcardClass15, (Class) wildcardClass27, comparator30, true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl33 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl33.setTrackChanges(false);
        org.apache.openjpa.util.CacheMap cacheMap36 = new org.apache.openjpa.util.CacheMap();
        boolean boolean38 = cacheMap36.containsKey((Object) 10.0f);
        java.util.Map map39 = proxyManagerImpl33.copyMap((java.util.Map) cacheMap36);
        org.apache.openjpa.util.CacheMap cacheMap41 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean43 = cacheMap41.pin((Object) "CacheMap:{}::{}");
        int int44 = cacheMap41.getSoftReferenceSize();
        java.util.Collection collection45 = cacheMap41.values();
        cacheMap36.putAll((java.util.Map) cacheMap41, true);
        boolean boolean48 = cacheMap41.isLRU();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.Proxy proxy50 = proxyManagerImpl0.newCustomProxy((Object) cacheMap41, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$260$proxy cannot be cast to class org.apache.openjpa.util.proxy.ProxyMap (org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$260$proxy is in unnamed module of loader org.apache.openjpa.util.ClassLoaderProxyService$ProxiesClassLoader @66dce093; org.apache.openjpa.util.proxy.ProxyMap is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(proxy16);
        org.junit.Assert.assertNotNull(proxy18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(proxy29);
        org.junit.Assert.assertNotNull(proxy32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean3 = cacheMap1.pin((Object) "CacheMap:{}::{}");
        java.util.Set set4 = cacheMap1.getPinnedKeys();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap1.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, (int) 'a', 10, (float) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 35.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str5 = cacheMap4.toString();
        cacheMap4.setSoftReferenceSize(1);
        java.util.Collection collection8 = cacheMap4.values();
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCustomProxy((Object) cacheMap4, false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl11 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set13 = cacheMap12.getPinnedKeys();
        Class<?> wildcardClass14 = cacheMap12.getClass();
        org.apache.openjpa.util.Proxy proxy15 = proxyManagerImpl11.newDateProxy((Class) wildcardClass14);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl16 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean17 = proxyManagerImpl16.getTrackChanges();
        boolean boolean18 = proxyManagerImpl16.getDelayCollectionLoading();
        boolean boolean19 = proxyManagerImpl16.getTrackChanges();
        boolean boolean20 = proxyManagerImpl16.getAssertAllowedType();
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set22 = cacheMap21.getPinnedKeys();
        Class<?> wildcardClass23 = cacheMap21.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl24 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean25 = proxyManagerImpl24.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl26 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean27 = proxyManagerImpl26.getTrackChanges();
        boolean boolean28 = proxyManagerImpl26.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap31.setCacheSize(0);
        Class<?> wildcardClass34 = cacheMap31.getClass();
        java.util.TimeZone timeZone35 = null;
        org.apache.openjpa.util.Proxy proxy36 = proxyManagerImpl26.newCalendarProxy((Class) wildcardClass34, timeZone35);
        org.apache.openjpa.util.CacheMap cacheMap39 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass40 = cacheMap39.getClass();
        java.util.Comparator comparator41 = null;
        org.apache.openjpa.util.Proxy proxy43 = proxyManagerImpl24.newCollectionProxy((Class) wildcardClass34, (Class) wildcardClass40, comparator41, true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl44 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean45 = proxyManagerImpl44.getTrackChanges();
        boolean boolean46 = proxyManagerImpl44.getDelayCollectionLoading();
        boolean boolean47 = proxyManagerImpl44.getTrackChanges();
        Class<?> wildcardClass48 = proxyManagerImpl44.getClass();
        java.util.Comparator comparator49 = null;
        org.apache.openjpa.util.Proxy proxy51 = proxyManagerImpl16.newMapProxy((Class) wildcardClass23, (Class) wildcardClass40, (Class) wildcardClass48, comparator49, false);
        org.apache.openjpa.util.Proxy proxy52 = proxyManagerImpl11.newDateProxy((Class) wildcardClass40);
        // The following exception was thrown during execution in test generation
        try {
            Object obj53 = proxyManagerImpl0.copyArray((Object) proxy52);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UnsupportedException; message: Unable to copy array: Argument is not an array.");
        } catch (org.apache.openjpa.util.UnsupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(proxy15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(proxy36);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(proxy43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(proxy51);
        org.junit.Assert.assertNotNull(proxy52);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        boolean boolean4 = cacheMap2.isEmpty();
        boolean boolean5 = cacheMap2.isEmpty();
        cacheMap2.clear();
        String str7 = cacheMap2.toString();
        Class<?> wildcardClass8 = cacheMap2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CacheMap:{}::{}" + "'", str7, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        Class<?> wildcardClass3 = cacheMap1.getClass();
        org.apache.openjpa.util.Proxy proxy4 = proxyManagerImpl0.newDateProxy((Class) wildcardClass3);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl5 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set7 = cacheMap6.getPinnedKeys();
        Class<?> wildcardClass8 = cacheMap6.getClass();
        org.apache.openjpa.util.Proxy proxy9 = proxyManagerImpl5.newDateProxy((Class) wildcardClass8);
        java.util.TimeZone timeZone10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.Proxy proxy11 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass8, timeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$273$proxy cannot be cast to class org.apache.openjpa.util.proxy.ProxyCalendar (org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$273$proxy is in unnamed module of loader org.apache.openjpa.util.ClassLoaderProxyService$ProxiesClassLoader @2df414db; org.apache.openjpa.util.proxy.ProxyCalendar is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(proxy9);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        proxyManagerImpl0.setUnproxyable("");
        proxyManagerImpl0.setUnproxyable("");
        java.util.Calendar calendar7 = null;
        java.util.Calendar calendar8 = proxyManagerImpl0.copyCalendar(calendar7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(calendar8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean6 = cacheMap5.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set8 = cacheMap7.entrySet();
        java.util.Collection collection9 = cacheMap7.values();
        cacheMap5.putAll((java.util.Map) cacheMap7, true);
        cacheMap2.putAll((java.util.Map) cacheMap7, false);
        boolean boolean14 = cacheMap0.unpin((Object) false);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str18 = cacheMap17.toString();
        boolean boolean19 = cacheMap17.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set21 = cacheMap20.entrySet();
        java.util.Collection collection22 = cacheMap20.values();
        java.util.Set set23 = cacheMap20.entrySet();
        cacheMap17.putAll((java.util.Map) cacheMap20, true);
        Object obj27 = cacheMap0.put((Object) cacheMap20, (Object) (-1L));
        String str28 = cacheMap0.toString();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CacheMap:{}::{}" + "'", str18, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "CacheMap:{CacheMap:{}::{}=-1}::{}" + "'", str28, "CacheMap:{CacheMap:{}::{}=-1}::{}");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        Class<?> wildcardClass3 = cacheMap1.getClass();
        org.apache.openjpa.util.Proxy proxy4 = proxyManagerImpl0.newDateProxy((Class) wildcardClass3);
        Object obj6 = proxyManagerImpl0.copyCustom((Object) true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl7 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl7.setTrackChanges(false);
        Object obj10 = proxyManagerImpl0.copyCustom((Object) false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl11 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl11.setTrackChanges(false);
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        boolean boolean16 = cacheMap14.containsKey((Object) 10.0f);
        java.util.Map map17 = proxyManagerImpl11.copyMap((java.util.Map) cacheMap14);
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean21 = cacheMap19.pin((Object) "CacheMap:{}::{}");
        int int22 = cacheMap19.getSoftReferenceSize();
        java.util.Collection collection23 = cacheMap19.values();
        cacheMap14.putAll((java.util.Map) cacheMap19, true);
        boolean boolean26 = cacheMap19.isLRU();
        Object obj27 = proxyManagerImpl0.copyCustom((Object) boolean26);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str6 = cacheMap5.toString();
        cacheMap5.setSoftReferenceSize(1);
        cacheMap5.readLock();
        cacheMap1.putAll((java.util.Map) cacheMap5);
        java.util.Collection collection11 = cacheMap5.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean9 = cacheMap8.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set11 = cacheMap10.entrySet();
        java.util.Collection collection12 = cacheMap10.values();
        cacheMap8.putAll((java.util.Map) cacheMap10, true);
        boolean boolean15 = cacheMap2.unpin((Object) cacheMap8);
        cacheMap2.setCacheSize((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        boolean boolean4 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap7.setCacheSize(0);
        boolean boolean10 = cacheMap2.containsValue((Object) cacheMap7);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set12 = cacheMap11.entrySet();
        java.util.Collection collection13 = cacheMap11.values();
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str17 = cacheMap16.toString();
        java.util.Set set18 = cacheMap16.entrySet();
        boolean boolean19 = cacheMap11.containsKey((Object) set18);
        boolean boolean20 = cacheMap2.containsValue((Object) boolean19);
        java.util.Collection collection21 = cacheMap2.values();
        int int22 = cacheMap2.getCacheSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CacheMap:{}::{}" + "'", str17, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean9 = cacheMap8.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set11 = cacheMap10.entrySet();
        java.util.Collection collection12 = cacheMap10.values();
        cacheMap8.putAll((java.util.Map) cacheMap10, true);
        boolean boolean15 = cacheMap2.unpin((Object) cacheMap8);
        java.util.Set set16 = cacheMap2.entrySet();
        boolean boolean17 = cacheMap2.isLRU();
        cacheMap2.readLock();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) 'a', (int) (short) -1, (float) (short) 1);
        String str5 = cacheMap4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        String str4 = cacheMap2.toString();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap2.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CacheMap:{}::{}" + "'", str4, "CacheMap:{}::{}");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        boolean boolean4 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str8 = cacheMap7.toString();
        cacheMap7.setSoftReferenceSize(1);
        boolean boolean12 = cacheMap7.containsValue((Object) 100.0f);
        boolean boolean13 = cacheMap2.unpin((Object) cacheMap7);
        boolean boolean14 = cacheMap2.isLRU();
        java.util.Set set15 = cacheMap2.getPinnedKeys();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl16 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean17 = proxyManagerImpl16.getTrackChanges();
        boolean boolean18 = proxyManagerImpl16.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap21.setCacheSize(0);
        Class<?> wildcardClass24 = cacheMap21.getClass();
        java.util.TimeZone timeZone25 = null;
        org.apache.openjpa.util.Proxy proxy26 = proxyManagerImpl16.newCalendarProxy((Class) wildcardClass24, timeZone25);
        boolean boolean27 = cacheMap2.containsValue((Object) proxyManagerImpl16);
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set29 = cacheMap28.entrySet();
        java.util.Collection collection30 = cacheMap28.values();
        java.util.Set set31 = cacheMap28.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.Proxy proxy33 = proxyManagerImpl16.newCustomProxy((Object) set31, false);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.GeneralException; message: org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$EntrySet$287$proxy");
        } catch (org.apache.openjpa.util.GeneralException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(proxy26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set31);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        boolean boolean4 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str8 = cacheMap7.toString();
        cacheMap7.setSoftReferenceSize(1);
        boolean boolean12 = cacheMap7.containsValue((Object) 100.0f);
        boolean boolean13 = cacheMap2.unpin((Object) cacheMap7);
        int int14 = cacheMap7.getCacheSize();
        int int15 = cacheMap7.getCacheSize();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap7.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setAssertAllowedType(true);
        boolean boolean4 = proxyManagerImpl0.getAssertAllowedType();
        boolean boolean5 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set7 = cacheMap6.entrySet();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl8 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl8.setTrackChanges(false);
        java.util.Collection collection11 = proxyManagerImpl8.getUnproxyable();
        boolean boolean12 = cacheMap6.containsKey((Object) collection11);
        Class<?> wildcardClass13 = cacheMap6.getClass();
        java.util.TimeZone timeZone14 = null;
        org.apache.openjpa.util.Proxy proxy15 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass13, timeZone14);
        proxyManagerImpl0.setDelayCollectionLoading(false);
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap();
        boolean boolean20 = cacheMap18.containsKey((Object) 10.0f);
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set22 = cacheMap21.entrySet();
        Object obj23 = cacheMap18.remove((Object) set22);
        int int24 = cacheMap18.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean28 = cacheMap27.isLRU();
        boolean boolean29 = cacheMap27.isLRU();
        java.util.Set set30 = cacheMap27.getPinnedKeys();
        boolean boolean31 = cacheMap18.containsValue((Object) set30);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection32 = proxyManagerImpl0.copyCollection((java.util.Collection) set30);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.GeneralException; message: org.apache.openjpa.util.java$util$Collections$UnmodifiableSet$289$proxy");
        } catch (org.apache.openjpa.util.GeneralException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(proxy15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setAssertAllowedType(true);
        boolean boolean4 = proxyManagerImpl0.getAssertAllowedType();
        boolean boolean5 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set7 = cacheMap6.entrySet();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl8 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl8.setTrackChanges(false);
        java.util.Collection collection11 = proxyManagerImpl8.getUnproxyable();
        boolean boolean12 = cacheMap6.containsKey((Object) collection11);
        Class<?> wildcardClass13 = cacheMap6.getClass();
        java.util.TimeZone timeZone14 = null;
        org.apache.openjpa.util.Proxy proxy15 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass13, timeZone14);
        proxyManagerImpl0.setDelayCollectionLoading(false);
        boolean boolean18 = proxyManagerImpl0.getAssertAllowedType();
        java.util.Calendar calendar19 = null;
        java.util.Calendar calendar20 = proxyManagerImpl0.copyCalendar(calendar19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(proxy15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(calendar20);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap5.setCacheSize(0);
        Class<?> wildcardClass8 = cacheMap5.getClass();
        java.util.TimeZone timeZone9 = null;
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass8, timeZone9);
        proxyManagerImpl0.setDelayCollectionLoading(true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl13 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean14 = proxyManagerImpl13.getTrackChanges();
        boolean boolean15 = proxyManagerImpl13.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl16 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean17 = proxyManagerImpl16.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl18 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean19 = proxyManagerImpl18.getTrackChanges();
        boolean boolean20 = proxyManagerImpl18.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap23.setCacheSize(0);
        Class<?> wildcardClass26 = cacheMap23.getClass();
        java.util.TimeZone timeZone27 = null;
        org.apache.openjpa.util.Proxy proxy28 = proxyManagerImpl18.newCalendarProxy((Class) wildcardClass26, timeZone27);
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass32 = cacheMap31.getClass();
        java.util.Comparator comparator33 = null;
        org.apache.openjpa.util.Proxy proxy35 = proxyManagerImpl16.newCollectionProxy((Class) wildcardClass26, (Class) wildcardClass32, comparator33, true);
        org.apache.openjpa.util.Proxy proxy36 = proxyManagerImpl13.newDateProxy((Class) wildcardClass32);
        java.util.TimeZone timeZone37 = null;
        org.apache.openjpa.util.Proxy proxy38 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass32, timeZone37);
        org.apache.openjpa.util.Proxy proxy41 = proxyManagerImpl0.newCustomProxy((Object) 10, false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(proxy28);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(proxy35);
        org.junit.Assert.assertNotNull(proxy36);
        org.junit.Assert.assertNotNull(proxy38);
        org.junit.Assert.assertNull(proxy41);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap3.containsKey((Object) 10.0f);
        java.util.Map map6 = proxyManagerImpl0.copyMap((java.util.Map) cacheMap3);
        cacheMap3.clear();
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean11 = cacheMap9.pin((Object) "CacheMap:{}::{}");
        int int12 = cacheMap9.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean16 = cacheMap15.isLRU();
        boolean boolean17 = cacheMap15.isLRU();
        java.util.Set set18 = cacheMap15.getPinnedKeys();
        cacheMap9.putAll((java.util.Map) cacheMap15);
        cacheMap15.setCacheSize((int) (byte) 100);
        boolean boolean22 = cacheMap3.containsKey((Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getDelayCollectionLoading();
        proxyManagerImpl0.setUnproxyable("CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, 1, (int) (byte) 1, (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 0.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.entrySet();
        java.util.Collection collection6 = cacheMap4.values();
        cacheMap2.putAll((java.util.Map) cacheMap4, true);
        cacheMap4.setCacheSize((int) 'a');
        int int11 = cacheMap4.getSoftReferenceSize();
        boolean boolean12 = cacheMap4.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str16 = cacheMap15.toString();
        String str17 = cacheMap15.toString();
        cacheMap4.putAll((java.util.Map) cacheMap15, false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{}::{}" + "'", str16, "CacheMap:{}::{}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CacheMap:{}::{}" + "'", str17, "CacheMap:{}::{}");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        Class<?> wildcardClass3 = cacheMap1.getClass();
        org.apache.openjpa.util.Proxy proxy4 = proxyManagerImpl0.newDateProxy((Class) wildcardClass3);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl5 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean6 = proxyManagerImpl5.getTrackChanges();
        boolean boolean7 = proxyManagerImpl5.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap10.setCacheSize(0);
        Class<?> wildcardClass13 = cacheMap10.getClass();
        java.util.TimeZone timeZone14 = null;
        org.apache.openjpa.util.Proxy proxy15 = proxyManagerImpl5.newCalendarProxy((Class) wildcardClass13, timeZone14);
        org.apache.openjpa.util.Proxy proxy16 = proxyManagerImpl0.newDateProxy((Class) wildcardClass13);
        proxyManagerImpl0.setTrackChanges(true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(proxy15);
        org.junit.Assert.assertNotNull(proxy16);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setAssertAllowedType(true);
        boolean boolean4 = proxyManagerImpl0.getAssertAllowedType();
        boolean boolean5 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set7 = cacheMap6.entrySet();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl8 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl8.setTrackChanges(false);
        java.util.Collection collection11 = proxyManagerImpl8.getUnproxyable();
        boolean boolean12 = cacheMap6.containsKey((Object) collection11);
        Class<?> wildcardClass13 = cacheMap6.getClass();
        java.util.TimeZone timeZone14 = null;
        org.apache.openjpa.util.Proxy proxy15 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass13, timeZone14);
        proxyManagerImpl0.setDelayCollectionLoading(false);
        boolean boolean18 = proxyManagerImpl0.getAssertAllowedType();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl19 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl19.setTrackChanges(false);
        java.util.Collection collection22 = proxyManagerImpl19.getUnproxyable();
        // The following exception was thrown during execution in test generation
        try {
            Object obj23 = proxyManagerImpl0.copyArray((Object) collection22);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UnsupportedException; message: Unable to copy array: Argument is not an array.");
        } catch (org.apache.openjpa.util.UnsupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(proxy15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        cacheMap2.clear();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean11 = cacheMap10.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set13 = cacheMap12.entrySet();
        java.util.Collection collection14 = cacheMap12.values();
        cacheMap10.putAll((java.util.Map) cacheMap12, true);
        cacheMap7.putAll((java.util.Map) cacheMap12, false);
        boolean boolean19 = cacheMap5.unpin((Object) false);
        cacheMap2.putAll((java.util.Map) cacheMap5, false);
        java.util.Set set22 = cacheMap2.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap25 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap25.readLock();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl27 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set29 = cacheMap28.getPinnedKeys();
        Class<?> wildcardClass30 = cacheMap28.getClass();
        org.apache.openjpa.util.Proxy proxy31 = proxyManagerImpl27.newDateProxy((Class) wildcardClass30);
        Object obj33 = proxyManagerImpl27.copyCustom((Object) true);
        java.util.Collection collection34 = proxyManagerImpl27.getUnproxyable();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl35 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean36 = proxyManagerImpl35.getTrackChanges();
        boolean boolean37 = proxyManagerImpl35.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl38 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean39 = proxyManagerImpl38.getTrackChanges();
        boolean boolean40 = proxyManagerImpl38.getDelayCollectionLoading();
        boolean boolean41 = proxyManagerImpl38.getTrackChanges();
        Class<?> wildcardClass42 = proxyManagerImpl38.getClass();
        org.apache.openjpa.util.Proxy proxy43 = proxyManagerImpl35.newDateProxy((Class) wildcardClass42);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl44 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean45 = proxyManagerImpl44.getDelayCollectionLoading();
        java.util.Calendar calendar46 = null;
        java.util.Calendar calendar47 = proxyManagerImpl44.copyCalendar(calendar46);
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass51 = cacheMap50.getClass();
        org.apache.openjpa.util.Proxy proxy52 = proxyManagerImpl44.newDateProxy((Class) wildcardClass51);
        Object obj53 = new Object();
        Class<?> wildcardClass54 = obj53.getClass();
        java.util.Comparator comparator55 = null;
        org.apache.openjpa.util.Proxy proxy57 = proxyManagerImpl27.newMapProxy((Class) wildcardClass42, (Class) wildcardClass51, (Class) wildcardClass54, comparator55, true);
        // The following exception was thrown during execution in test generation
        try {
            Object obj58 = cacheMap2.put((Object) cacheMap25, (Object) wildcardClass54);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(proxy31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(proxy43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(calendar47);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(proxy52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(proxy57);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getDelayCollectionLoading();
        java.util.Calendar calendar2 = null;
        java.util.Calendar calendar3 = proxyManagerImpl0.copyCalendar(calendar2);
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean7 = cacheMap6.isLRU();
        cacheMap6.clear();
        String str9 = cacheMap6.toString();
        // The following exception was thrown during execution in test generation
        try {
            Object obj10 = proxyManagerImpl0.copyArray((Object) str9);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UnsupportedException; message: Unable to copy array: Argument is not an array.");
        } catch (org.apache.openjpa.util.UnsupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(calendar3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean4 = cacheMap3.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.entrySet();
        java.util.Collection collection7 = cacheMap5.values();
        cacheMap3.putAll((java.util.Map) cacheMap5, true);
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl12 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean13 = proxyManagerImpl12.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl14 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean15 = proxyManagerImpl14.getTrackChanges();
        boolean boolean16 = proxyManagerImpl14.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap19.setCacheSize(0);
        Class<?> wildcardClass22 = cacheMap19.getClass();
        java.util.TimeZone timeZone23 = null;
        org.apache.openjpa.util.Proxy proxy24 = proxyManagerImpl14.newCalendarProxy((Class) wildcardClass22, timeZone23);
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass28 = cacheMap27.getClass();
        java.util.Comparator comparator29 = null;
        org.apache.openjpa.util.Proxy proxy31 = proxyManagerImpl12.newCollectionProxy((Class) wildcardClass22, (Class) wildcardClass28, comparator29, true);
        boolean boolean32 = cacheMap0.containsValue((Object) proxyManagerImpl12);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl33 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean34 = proxyManagerImpl33.getTrackChanges();
        boolean boolean35 = proxyManagerImpl33.getDelayCollectionLoading();
        boolean boolean36 = proxyManagerImpl33.getTrackChanges();
        Class<?> wildcardClass37 = proxyManagerImpl33.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl38 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean39 = proxyManagerImpl38.getTrackChanges();
        boolean boolean40 = proxyManagerImpl38.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl41 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean42 = proxyManagerImpl41.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl43 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean44 = proxyManagerImpl43.getTrackChanges();
        boolean boolean45 = proxyManagerImpl43.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap48 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap48.setCacheSize(0);
        Class<?> wildcardClass51 = cacheMap48.getClass();
        java.util.TimeZone timeZone52 = null;
        org.apache.openjpa.util.Proxy proxy53 = proxyManagerImpl43.newCalendarProxy((Class) wildcardClass51, timeZone52);
        org.apache.openjpa.util.CacheMap cacheMap56 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass57 = cacheMap56.getClass();
        java.util.Comparator comparator58 = null;
        org.apache.openjpa.util.Proxy proxy60 = proxyManagerImpl41.newCollectionProxy((Class) wildcardClass51, (Class) wildcardClass57, comparator58, true);
        org.apache.openjpa.util.Proxy proxy61 = proxyManagerImpl38.newDateProxy((Class) wildcardClass57);
        java.util.Comparator comparator62 = null;
        org.apache.openjpa.util.Proxy proxy64 = proxyManagerImpl12.newCollectionProxy((Class) wildcardClass37, (Class) wildcardClass57, comparator62, false);
        Class<?> wildcardClass65 = proxy64.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(proxy24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(proxy31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(proxy53);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(proxy60);
        org.junit.Assert.assertNotNull(proxy61);
        org.junit.Assert.assertNotNull(proxy64);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.entrySet();
        java.util.Collection collection6 = cacheMap4.values();
        cacheMap2.putAll((java.util.Map) cacheMap4, true);
        cacheMap4.setCacheSize((int) 'a');
        cacheMap4.setCacheSize((int) (byte) 0);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str16 = cacheMap15.toString();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean21 = cacheMap20.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set23 = cacheMap22.entrySet();
        java.util.Collection collection24 = cacheMap22.values();
        cacheMap20.putAll((java.util.Map) cacheMap22, true);
        cacheMap17.putAll((java.util.Map) cacheMap22, false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl29 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean30 = proxyManagerImpl29.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl31 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean32 = proxyManagerImpl31.getTrackChanges();
        boolean boolean33 = proxyManagerImpl31.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap36 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap36.setCacheSize(0);
        Class<?> wildcardClass39 = cacheMap36.getClass();
        java.util.TimeZone timeZone40 = null;
        org.apache.openjpa.util.Proxy proxy41 = proxyManagerImpl31.newCalendarProxy((Class) wildcardClass39, timeZone40);
        org.apache.openjpa.util.CacheMap cacheMap44 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass45 = cacheMap44.getClass();
        java.util.Comparator comparator46 = null;
        org.apache.openjpa.util.Proxy proxy48 = proxyManagerImpl29.newCollectionProxy((Class) wildcardClass39, (Class) wildcardClass45, comparator46, true);
        boolean boolean49 = cacheMap17.containsValue((Object) proxyManagerImpl29);
        Object obj50 = cacheMap4.put((Object) str16, (Object) cacheMap17);
        cacheMap17.setCacheSize(10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{}::{}" + "'", str16, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(proxy41);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(proxy48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean4 = cacheMap3.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.entrySet();
        java.util.Collection collection7 = cacheMap5.values();
        cacheMap3.putAll((java.util.Map) cacheMap5, true);
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str16 = cacheMap15.toString();
        cacheMap15.setSoftReferenceSize(1);
        java.util.Set set19 = cacheMap15.entrySet();
        boolean boolean20 = cacheMap12.unpin((Object) set19);
        boolean boolean21 = cacheMap0.containsValue((Object) boolean20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{}::{}" + "'", str16, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        java.util.Set set4 = cacheMap2.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(true, (int) (short) 100, (int) 'a', (float) 1, (int) (byte) 1);
        boolean boolean11 = cacheMap2.containsValue((Object) true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        proxyManagerImpl0.setUnproxyable("");
        proxyManagerImpl0.setUnproxyable("");
        boolean boolean7 = proxyManagerImpl0.getAssertAllowedType();
        proxyManagerImpl0.setAssertAllowedType(true);
        proxyManagerImpl0.setUnproxyable("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (short) 1);
        int int3 = cacheMap2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        proxyManagerImpl0.setUnproxyable("");
        proxyManagerImpl0.setUnproxyable("");
        boolean boolean7 = proxyManagerImpl0.getAssertAllowedType();
        proxyManagerImpl0.setAssertAllowedType(true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl10 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean11 = proxyManagerImpl10.getTrackChanges();
        boolean boolean12 = proxyManagerImpl10.getDelayCollectionLoading();
        boolean boolean13 = proxyManagerImpl10.getTrackChanges();
        boolean boolean14 = proxyManagerImpl10.getAssertAllowedType();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set16 = cacheMap15.getPinnedKeys();
        Class<?> wildcardClass17 = cacheMap15.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl18 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean19 = proxyManagerImpl18.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl20 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean21 = proxyManagerImpl20.getTrackChanges();
        boolean boolean22 = proxyManagerImpl20.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap25 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap25.setCacheSize(0);
        Class<?> wildcardClass28 = cacheMap25.getClass();
        java.util.TimeZone timeZone29 = null;
        org.apache.openjpa.util.Proxy proxy30 = proxyManagerImpl20.newCalendarProxy((Class) wildcardClass28, timeZone29);
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass34 = cacheMap33.getClass();
        java.util.Comparator comparator35 = null;
        org.apache.openjpa.util.Proxy proxy37 = proxyManagerImpl18.newCollectionProxy((Class) wildcardClass28, (Class) wildcardClass34, comparator35, true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl38 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean39 = proxyManagerImpl38.getTrackChanges();
        boolean boolean40 = proxyManagerImpl38.getDelayCollectionLoading();
        boolean boolean41 = proxyManagerImpl38.getTrackChanges();
        Class<?> wildcardClass42 = proxyManagerImpl38.getClass();
        java.util.Comparator comparator43 = null;
        org.apache.openjpa.util.Proxy proxy45 = proxyManagerImpl10.newMapProxy((Class) wildcardClass17, (Class) wildcardClass34, (Class) wildcardClass42, comparator43, false);
        java.util.TimeZone timeZone46 = null;
        org.apache.openjpa.util.Proxy proxy47 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass17, timeZone46);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(proxy30);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(proxy37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(proxy45);
        org.junit.Assert.assertNotNull(proxy47);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        boolean boolean6 = cacheMap4.isEmpty();
        boolean boolean8 = cacheMap4.unpin((Object) 10);
        cacheMap0.putAll((java.util.Map) cacheMap4);
        boolean boolean10 = cacheMap4.isLRU();
        String str11 = cacheMap4.toString();
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean15 = cacheMap13.pin((Object) "CacheMap:{}::{}");
        java.util.Set set16 = cacheMap13.getPinnedKeys();
        boolean boolean17 = cacheMap4.unpin((Object) cacheMap13);
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str21 = cacheMap20.toString();
        cacheMap20.setSoftReferenceSize(1);
        boolean boolean25 = cacheMap20.containsValue((Object) 100.0f);
        int int26 = cacheMap20.size();
        int int27 = cacheMap20.size();
        boolean boolean28 = cacheMap20.isEmpty();
        cacheMap13.putAll((java.util.Map) cacheMap20, true);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CacheMap:{}::{}" + "'", str11, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CacheMap:{}::{}" + "'", str21, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap5.setCacheSize(0);
        Class<?> wildcardClass8 = cacheMap5.getClass();
        java.util.TimeZone timeZone9 = null;
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass8, timeZone9);
        proxyManagerImpl0.setDelayCollectionLoading(true);
        boolean boolean13 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap(false, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            Object obj17 = proxyManagerImpl0.copyArray((Object) cacheMap16);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UnsupportedException; message: Unable to copy array: Argument is not an array.");
        } catch (org.apache.openjpa.util.UnsupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        boolean boolean6 = cacheMap4.isEmpty();
        boolean boolean8 = cacheMap4.unpin((Object) 10);
        cacheMap0.putAll((java.util.Map) cacheMap4);
        java.util.Set set10 = cacheMap0.keySet();
        java.util.Set set11 = cacheMap0.keySet();
        cacheMap0.readLock();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        int int1 = cacheMap0.getSoftReferenceSize();
        int int2 = cacheMap0.getCacheSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1000 + "'", int2 == 1000);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.entrySet();
        java.util.Collection collection6 = cacheMap4.values();
        cacheMap2.putAll((java.util.Map) cacheMap4, true);
        cacheMap4.setCacheSize((int) 'a');
        int int11 = cacheMap4.getSoftReferenceSize();
        boolean boolean12 = cacheMap4.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str16 = cacheMap15.toString();
        cacheMap15.setSoftReferenceSize(1);
        cacheMap4.putAll((java.util.Map) cacheMap15, false);
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean24 = cacheMap23.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap25 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set26 = cacheMap25.entrySet();
        java.util.Collection collection27 = cacheMap25.values();
        cacheMap23.putAll((java.util.Map) cacheMap25, true);
        org.apache.openjpa.util.CacheMap cacheMap32 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean33 = cacheMap32.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set35 = cacheMap34.entrySet();
        java.util.Collection collection36 = cacheMap34.values();
        cacheMap32.putAll((java.util.Map) cacheMap34, true);
        int int39 = cacheMap32.getSoftReferenceSize();
        // The following exception was thrown during execution in test generation
        try {
            Object obj40 = cacheMap15.put((Object) cacheMap23, (Object) int39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{}::{}" + "'", str16, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean3 = cacheMap1.pin((Object) "CacheMap:{}::{}");
        int int4 = cacheMap1.getSoftReferenceSize();
        java.util.Collection collection5 = cacheMap1.values();
        java.util.Set set6 = cacheMap1.entrySet();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap3.containsKey((Object) 10.0f);
        java.util.Map map6 = proxyManagerImpl0.copyMap((java.util.Map) cacheMap3);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean10 = cacheMap8.pin((Object) "CacheMap:{}::{}");
        int int11 = cacheMap8.getSoftReferenceSize();
        java.util.Collection collection12 = cacheMap8.values();
        cacheMap3.putAll((java.util.Map) cacheMap8, true);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean18 = cacheMap17.isLRU();
        boolean boolean19 = cacheMap17.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str23 = cacheMap22.toString();
        cacheMap22.setSoftReferenceSize(1);
        boolean boolean27 = cacheMap22.containsValue((Object) 100.0f);
        boolean boolean28 = cacheMap17.unpin((Object) cacheMap22);
        boolean boolean29 = cacheMap17.isLRU();
        java.util.Set set30 = cacheMap17.getPinnedKeys();
        cacheMap17.clear();
        org.apache.openjpa.util.CacheMap cacheMap32 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set33 = cacheMap32.entrySet();
        java.util.Collection collection34 = cacheMap32.values();
        java.util.Set set35 = cacheMap32.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap36 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set37 = cacheMap36.getPinnedKeys();
        boolean boolean38 = cacheMap36.isEmpty();
        boolean boolean40 = cacheMap36.unpin((Object) 10);
        cacheMap32.putAll((java.util.Map) cacheMap36);
        cacheMap36.setCacheSize((int) (byte) -1);
        org.apache.openjpa.util.CacheMap cacheMap44 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set45 = cacheMap44.getPinnedKeys();
        boolean boolean46 = cacheMap44.isEmpty();
        boolean boolean48 = cacheMap44.unpin((Object) 10);
        org.apache.openjpa.util.CacheMap cacheMap49 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set50 = cacheMap49.entrySet();
        java.util.Collection collection51 = cacheMap49.values();
        java.util.Set set52 = cacheMap49.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap53 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set54 = cacheMap53.getPinnedKeys();
        boolean boolean55 = cacheMap53.isEmpty();
        boolean boolean57 = cacheMap53.unpin((Object) 10);
        cacheMap49.putAll((java.util.Map) cacheMap53);
        java.util.Set set59 = cacheMap49.keySet();
        boolean boolean60 = cacheMap44.pin((Object) set59);
        boolean boolean61 = cacheMap36.unpin((Object) cacheMap44);
        java.util.Collection collection62 = cacheMap36.values();
        cacheMap17.putAll((java.util.Map) cacheMap36, false);
        boolean boolean65 = cacheMap8.containsValue((Object) cacheMap36);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "CacheMap:{}::{}" + "'", str23, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean6 = cacheMap5.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set8 = cacheMap7.entrySet();
        java.util.Collection collection9 = cacheMap7.values();
        cacheMap5.putAll((java.util.Map) cacheMap7, true);
        cacheMap2.putAll((java.util.Map) cacheMap7, false);
        boolean boolean14 = cacheMap0.unpin((Object) false);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str18 = cacheMap17.toString();
        boolean boolean19 = cacheMap17.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set21 = cacheMap20.entrySet();
        java.util.Collection collection22 = cacheMap20.values();
        java.util.Set set23 = cacheMap20.entrySet();
        cacheMap17.putAll((java.util.Map) cacheMap20, true);
        Object obj27 = cacheMap0.put((Object) cacheMap20, (Object) (-1L));
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl28 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean29 = proxyManagerImpl28.getTrackChanges();
        boolean boolean30 = proxyManagerImpl28.getDelayCollectionLoading();
        proxyManagerImpl28.setUnproxyable("CacheMap:{}::{}");
        proxyManagerImpl28.setUnproxyable("");
        java.util.Collection collection35 = proxyManagerImpl28.getUnproxyable();
        boolean boolean36 = cacheMap20.unpin((Object) collection35);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CacheMap:{}::{}" + "'", str18, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.getSoftReferenceSize();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl5 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean6 = proxyManagerImpl5.getTrackChanges();
        java.util.Calendar calendar7 = null;
        java.util.Calendar calendar8 = proxyManagerImpl5.copyCalendar(calendar7);
        Object obj9 = cacheMap0.remove((Object) proxyManagerImpl5);
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str13 = cacheMap12.toString();
        boolean boolean14 = cacheMap12.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set16 = cacheMap15.entrySet();
        java.util.Collection collection17 = cacheMap15.values();
        java.util.Set set18 = cacheMap15.entrySet();
        cacheMap12.putAll((java.util.Map) cacheMap15, true);
        java.util.Set set21 = cacheMap12.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection22 = proxyManagerImpl5.copyCollection((java.util.Collection) set21);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.GeneralException; message: org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$EntrySet$351$proxy");
        } catch (org.apache.openjpa.util.GeneralException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(calendar8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CacheMap:{}::{}" + "'", str13, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        boolean boolean6 = cacheMap4.isEmpty();
        boolean boolean8 = cacheMap4.unpin((Object) 10);
        cacheMap0.putAll((java.util.Map) cacheMap4);
        cacheMap4.setCacheSize((int) (byte) -1);
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set13 = cacheMap12.getPinnedKeys();
        boolean boolean14 = cacheMap12.isEmpty();
        boolean boolean16 = cacheMap12.unpin((Object) 10);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set18 = cacheMap17.entrySet();
        java.util.Collection collection19 = cacheMap17.values();
        java.util.Set set20 = cacheMap17.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set22 = cacheMap21.getPinnedKeys();
        boolean boolean23 = cacheMap21.isEmpty();
        boolean boolean25 = cacheMap21.unpin((Object) 10);
        cacheMap17.putAll((java.util.Map) cacheMap21);
        java.util.Set set27 = cacheMap17.keySet();
        boolean boolean28 = cacheMap12.pin((Object) set27);
        boolean boolean29 = cacheMap4.unpin((Object) cacheMap12);
        Object obj32 = cacheMap4.put((Object) false, (Object) (short) 1);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl3 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        Class<?> wildcardClass6 = cacheMap4.getClass();
        org.apache.openjpa.util.Proxy proxy7 = proxyManagerImpl3.newDateProxy((Class) wildcardClass6);
        java.util.TimeZone timeZone8 = null;
        org.apache.openjpa.util.Proxy proxy9 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass6, timeZone8);
        boolean boolean10 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setTrackChanges(true);
        java.util.Collection collection13 = proxyManagerImpl0.getUnproxyable();
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str17 = cacheMap16.toString();
        cacheMap16.setSoftReferenceSize(1);
        boolean boolean21 = cacheMap16.containsValue((Object) 100.0f);
        int int22 = cacheMap16.size();
        int int23 = cacheMap16.size();
        boolean boolean24 = cacheMap16.isEmpty();
        java.util.Set set25 = cacheMap16.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection26 = proxyManagerImpl0.copyCollection((java.util.Collection) set25);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.GeneralException; message: org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$EntrySet$354$proxy");
        } catch (org.apache.openjpa.util.GeneralException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CacheMap:{}::{}" + "'", str17, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        proxyManagerImpl0.setUnproxyable("CacheMap:{}::{}");
        proxyManagerImpl0.setUnproxyable("");
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set10 = cacheMap9.entrySet();
        java.util.Collection collection11 = cacheMap9.values();
        java.util.Set set12 = cacheMap9.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set14 = cacheMap13.getPinnedKeys();
        boolean boolean15 = cacheMap13.isEmpty();
        boolean boolean17 = cacheMap13.unpin((Object) 10);
        cacheMap9.putAll((java.util.Map) cacheMap13);
        java.util.Set set19 = cacheMap9.keySet();
        java.util.Set set20 = cacheMap9.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection21 = proxyManagerImpl0.copyCollection((java.util.Collection) set20);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.GeneralException; message: org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$KeySet$355$proxy");
        } catch (org.apache.openjpa.util.GeneralException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        Class<?> wildcardClass3 = cacheMap1.getClass();
        org.apache.openjpa.util.Proxy proxy4 = proxyManagerImpl0.newDateProxy((Class) wildcardClass3);
        Object obj6 = proxyManagerImpl0.copyCustom((Object) true);
        java.util.Collection collection7 = proxyManagerImpl0.getUnproxyable();
        proxyManagerImpl0.setDelayCollectionLoading(false);
        java.util.Collection collection10 = proxyManagerImpl0.getUnproxyable();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        Class<?> wildcardClass3 = cacheMap1.getClass();
        org.apache.openjpa.util.Proxy proxy4 = proxyManagerImpl0.newDateProxy((Class) wildcardClass3);
        Object obj6 = proxyManagerImpl0.copyCustom((Object) true);
        java.util.Date date7 = null;
        java.util.Date date8 = proxyManagerImpl0.copyDate(date7);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl9 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set11 = cacheMap10.getPinnedKeys();
        Class<?> wildcardClass12 = cacheMap10.getClass();
        org.apache.openjpa.util.Proxy proxy13 = proxyManagerImpl9.newDateProxy((Class) wildcardClass12);
        org.apache.openjpa.util.Proxy proxy14 = proxyManagerImpl0.newDateProxy((Class) wildcardClass12);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl15 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl16 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean17 = proxyManagerImpl16.getDelayCollectionLoading();
        java.util.Calendar calendar18 = null;
        java.util.Calendar calendar19 = proxyManagerImpl16.copyCalendar(calendar18);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass23 = cacheMap22.getClass();
        org.apache.openjpa.util.Proxy proxy24 = proxyManagerImpl16.newDateProxy((Class) wildcardClass23);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl25 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean26 = proxyManagerImpl25.getTrackChanges();
        boolean boolean27 = proxyManagerImpl25.getDelayCollectionLoading();
        boolean boolean28 = proxyManagerImpl25.getTrackChanges();
        Class<?> wildcardClass29 = proxyManagerImpl25.getClass();
        org.apache.openjpa.util.CacheMap cacheMap32 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap32.setCacheSize(0);
        Class<?> wildcardClass35 = cacheMap32.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl36 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean37 = proxyManagerImpl36.getDelayCollectionLoading();
        java.util.Calendar calendar38 = null;
        java.util.Calendar calendar39 = proxyManagerImpl36.copyCalendar(calendar38);
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass43 = cacheMap42.getClass();
        org.apache.openjpa.util.Proxy proxy44 = proxyManagerImpl36.newDateProxy((Class) wildcardClass43);
        java.util.Comparator comparator45 = null;
        org.apache.openjpa.util.Proxy proxy47 = proxyManagerImpl16.newMapProxy((Class) wildcardClass29, (Class) wildcardClass35, (Class) wildcardClass43, comparator45, false);
        java.util.TimeZone timeZone48 = null;
        org.apache.openjpa.util.Proxy proxy49 = proxyManagerImpl15.newCalendarProxy((Class) wildcardClass43, timeZone48);
        java.util.TimeZone timeZone50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.Proxy proxy51 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass43, timeZone50);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$364$proxy cannot be cast to class org.apache.openjpa.util.proxy.ProxyCalendar (org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$364$proxy is in unnamed module of loader org.apache.openjpa.util.ClassLoaderProxyService$ProxiesClassLoader @2a32890d; org.apache.openjpa.util.proxy.ProxyCalendar is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(proxy13);
        org.junit.Assert.assertNotNull(proxy14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(calendar19);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(proxy24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(calendar39);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(proxy44);
        org.junit.Assert.assertNotNull(proxy47);
        org.junit.Assert.assertNotNull(proxy49);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        boolean boolean4 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str8 = cacheMap7.toString();
        cacheMap7.setSoftReferenceSize(1);
        boolean boolean12 = cacheMap7.containsValue((Object) 100.0f);
        boolean boolean13 = cacheMap2.unpin((Object) cacheMap7);
        boolean boolean14 = cacheMap2.isLRU();
        java.util.Set set15 = cacheMap2.getPinnedKeys();
        cacheMap2.clear();
        cacheMap2.setSoftReferenceSize((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean4 = cacheMap3.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.entrySet();
        java.util.Collection collection7 = cacheMap5.values();
        cacheMap3.putAll((java.util.Map) cacheMap5, true);
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl12 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean13 = proxyManagerImpl12.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl14 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean15 = proxyManagerImpl14.getTrackChanges();
        boolean boolean16 = proxyManagerImpl14.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap19.setCacheSize(0);
        Class<?> wildcardClass22 = cacheMap19.getClass();
        java.util.TimeZone timeZone23 = null;
        org.apache.openjpa.util.Proxy proxy24 = proxyManagerImpl14.newCalendarProxy((Class) wildcardClass22, timeZone23);
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass28 = cacheMap27.getClass();
        java.util.Comparator comparator29 = null;
        org.apache.openjpa.util.Proxy proxy31 = proxyManagerImpl12.newCollectionProxy((Class) wildcardClass22, (Class) wildcardClass28, comparator29, true);
        boolean boolean32 = cacheMap0.containsValue((Object) proxyManagerImpl12);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl33 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean34 = proxyManagerImpl33.getTrackChanges();
        boolean boolean35 = proxyManagerImpl33.getDelayCollectionLoading();
        boolean boolean36 = proxyManagerImpl33.getTrackChanges();
        Class<?> wildcardClass37 = proxyManagerImpl33.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl38 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean39 = proxyManagerImpl38.getTrackChanges();
        boolean boolean40 = proxyManagerImpl38.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl41 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean42 = proxyManagerImpl41.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl43 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean44 = proxyManagerImpl43.getTrackChanges();
        boolean boolean45 = proxyManagerImpl43.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap48 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap48.setCacheSize(0);
        Class<?> wildcardClass51 = cacheMap48.getClass();
        java.util.TimeZone timeZone52 = null;
        org.apache.openjpa.util.Proxy proxy53 = proxyManagerImpl43.newCalendarProxy((Class) wildcardClass51, timeZone52);
        org.apache.openjpa.util.CacheMap cacheMap56 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass57 = cacheMap56.getClass();
        java.util.Comparator comparator58 = null;
        org.apache.openjpa.util.Proxy proxy60 = proxyManagerImpl41.newCollectionProxy((Class) wildcardClass51, (Class) wildcardClass57, comparator58, true);
        org.apache.openjpa.util.Proxy proxy61 = proxyManagerImpl38.newDateProxy((Class) wildcardClass57);
        java.util.Comparator comparator62 = null;
        org.apache.openjpa.util.Proxy proxy64 = proxyManagerImpl12.newCollectionProxy((Class) wildcardClass37, (Class) wildcardClass57, comparator62, false);
        proxyManagerImpl12.setAssertAllowedType(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(proxy24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(proxy31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(proxy53);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(proxy60);
        org.junit.Assert.assertNotNull(proxy61);
        org.junit.Assert.assertNotNull(proxy64);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean3 = cacheMap1.pin((Object) "CacheMap:{}::{}");
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean7 = cacheMap6.isLRU();
        boolean boolean8 = cacheMap6.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str12 = cacheMap11.toString();
        cacheMap11.setSoftReferenceSize(1);
        boolean boolean16 = cacheMap11.containsValue((Object) 100.0f);
        boolean boolean17 = cacheMap6.unpin((Object) cacheMap11);
        boolean boolean18 = cacheMap6.isLRU();
        java.util.Set set19 = cacheMap6.getPinnedKeys();
        boolean boolean20 = cacheMap1.containsKey((Object) cacheMap6);
        int int21 = cacheMap1.getCacheSize();
        String str22 = cacheMap1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CacheMap:{}::{}" + "'", str12, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1000 + "'", int21 == 1000);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CacheMap:{}::{}" + "'", str22, "CacheMap:{}::{}");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        boolean boolean4 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap7.setCacheSize(0);
        boolean boolean10 = cacheMap2.containsValue((Object) cacheMap7);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set12 = cacheMap11.entrySet();
        java.util.Collection collection13 = cacheMap11.values();
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str17 = cacheMap16.toString();
        java.util.Set set18 = cacheMap16.entrySet();
        boolean boolean19 = cacheMap11.containsKey((Object) set18);
        boolean boolean20 = cacheMap2.containsValue((Object) boolean19);
        java.util.Collection collection21 = cacheMap2.values();
        cacheMap2.setCacheSize((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CacheMap:{}::{}" + "'", str17, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl4 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.getPinnedKeys();
        Class<?> wildcardClass7 = cacheMap5.getClass();
        org.apache.openjpa.util.Proxy proxy8 = proxyManagerImpl4.newDateProxy((Class) wildcardClass7);
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCustomProxy((Object) proxyManagerImpl4, true);
        boolean boolean11 = proxyManagerImpl4.getAssertAllowedType();
        boolean boolean12 = proxyManagerImpl4.getAssertAllowedType();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl13 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean14 = proxyManagerImpl13.getDelayCollectionLoading();
        java.util.Calendar calendar15 = null;
        java.util.Calendar calendar16 = proxyManagerImpl13.copyCalendar(calendar15);
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass20 = cacheMap19.getClass();
        org.apache.openjpa.util.Proxy proxy21 = proxyManagerImpl13.newDateProxy((Class) wildcardClass20);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl22 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean23 = proxyManagerImpl22.getTrackChanges();
        boolean boolean24 = proxyManagerImpl22.getDelayCollectionLoading();
        boolean boolean25 = proxyManagerImpl22.getTrackChanges();
        Class<?> wildcardClass26 = proxyManagerImpl22.getClass();
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap29.setCacheSize(0);
        Class<?> wildcardClass32 = cacheMap29.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl33 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean34 = proxyManagerImpl33.getDelayCollectionLoading();
        java.util.Calendar calendar35 = null;
        java.util.Calendar calendar36 = proxyManagerImpl33.copyCalendar(calendar35);
        org.apache.openjpa.util.CacheMap cacheMap39 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass40 = cacheMap39.getClass();
        org.apache.openjpa.util.Proxy proxy41 = proxyManagerImpl33.newDateProxy((Class) wildcardClass40);
        java.util.Comparator comparator42 = null;
        org.apache.openjpa.util.Proxy proxy44 = proxyManagerImpl13.newMapProxy((Class) wildcardClass26, (Class) wildcardClass32, (Class) wildcardClass40, comparator42, false);
        org.apache.openjpa.util.Proxy proxy45 = proxyManagerImpl4.newDateProxy((Class) wildcardClass32);
        boolean boolean46 = proxyManagerImpl4.getAssertAllowedType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(calendar16);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(proxy21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(calendar36);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(proxy41);
        org.junit.Assert.assertNotNull(proxy44);
        org.junit.Assert.assertNotNull(proxy45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Set set2 = cacheMap0.keySet();
        java.util.Set set3 = cacheMap0.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean8 = cacheMap7.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set10 = cacheMap9.entrySet();
        java.util.Collection collection11 = cacheMap9.values();
        cacheMap7.putAll((java.util.Map) cacheMap9, true);
        cacheMap4.putAll((java.util.Map) cacheMap9, false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl16 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean17 = proxyManagerImpl16.getTrackChanges();
        boolean boolean18 = proxyManagerImpl16.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl19 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean20 = proxyManagerImpl19.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl21 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean22 = proxyManagerImpl21.getTrackChanges();
        boolean boolean23 = proxyManagerImpl21.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap26.setCacheSize(0);
        Class<?> wildcardClass29 = cacheMap26.getClass();
        java.util.TimeZone timeZone30 = null;
        org.apache.openjpa.util.Proxy proxy31 = proxyManagerImpl21.newCalendarProxy((Class) wildcardClass29, timeZone30);
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass35 = cacheMap34.getClass();
        java.util.Comparator comparator36 = null;
        org.apache.openjpa.util.Proxy proxy38 = proxyManagerImpl19.newCollectionProxy((Class) wildcardClass29, (Class) wildcardClass35, comparator36, true);
        org.apache.openjpa.util.Proxy proxy39 = proxyManagerImpl16.newDateProxy((Class) wildcardClass35);
        boolean boolean40 = cacheMap4.containsValue((Object) proxyManagerImpl16);
        boolean boolean41 = cacheMap0.unpin((Object) boolean40);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(proxy31);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(proxy38);
        org.junit.Assert.assertNotNull(proxy39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: LRUMap max size must be greater than 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str5 = cacheMap4.toString();
        cacheMap4.setSoftReferenceSize(1);
        java.util.Collection collection8 = cacheMap4.values();
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCustomProxy((Object) cacheMap4, false);
        proxyManagerImpl0.setTrackChanges(true);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean16 = cacheMap15.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set18 = cacheMap17.entrySet();
        java.util.Collection collection19 = cacheMap17.values();
        cacheMap15.putAll((java.util.Map) cacheMap17, true);
        int int22 = cacheMap15.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap(false);
        int int25 = cacheMap24.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean29 = cacheMap28.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap30 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set31 = cacheMap30.entrySet();
        java.util.Collection collection32 = cacheMap30.values();
        cacheMap28.putAll((java.util.Map) cacheMap30, true);
        cacheMap30.setCacheSize((int) 'a');
        java.util.Set set37 = cacheMap30.entrySet();
        Object obj38 = cacheMap24.get((Object) cacheMap30);
        boolean boolean39 = cacheMap15.unpin((Object) cacheMap24);
        Object obj40 = proxyManagerImpl0.copyCustom((Object) cacheMap24);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "CacheMap:{}::{}");
        org.junit.Assert.assertEquals(String.valueOf(obj40), "CacheMap:{}::{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "CacheMap:{}::{}");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        boolean boolean5 = cacheMap2.containsValue((Object) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getDelayCollectionLoading();
        java.util.Calendar calendar2 = null;
        java.util.Calendar calendar3 = proxyManagerImpl0.copyCalendar(calendar2);
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass7 = cacheMap6.getClass();
        org.apache.openjpa.util.Proxy proxy8 = proxyManagerImpl0.newDateProxy((Class) wildcardClass7);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl9 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean10 = proxyManagerImpl9.getTrackChanges();
        boolean boolean11 = proxyManagerImpl9.getDelayCollectionLoading();
        boolean boolean12 = proxyManagerImpl9.getTrackChanges();
        Class<?> wildcardClass13 = proxyManagerImpl9.getClass();
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap16.setCacheSize(0);
        Class<?> wildcardClass19 = cacheMap16.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl20 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean21 = proxyManagerImpl20.getDelayCollectionLoading();
        java.util.Calendar calendar22 = null;
        java.util.Calendar calendar23 = proxyManagerImpl20.copyCalendar(calendar22);
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass27 = cacheMap26.getClass();
        org.apache.openjpa.util.Proxy proxy28 = proxyManagerImpl20.newDateProxy((Class) wildcardClass27);
        java.util.Comparator comparator29 = null;
        org.apache.openjpa.util.Proxy proxy31 = proxyManagerImpl0.newMapProxy((Class) wildcardClass13, (Class) wildcardClass19, (Class) wildcardClass27, comparator29, false);
        boolean boolean32 = proxyManagerImpl0.getDelayCollectionLoading();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(calendar3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(calendar23);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(proxy28);
        org.junit.Assert.assertNotNull(proxy31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean3 = cacheMap1.pin((Object) "CacheMap:{}::{}");
        int int4 = cacheMap1.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean8 = cacheMap7.isLRU();
        boolean boolean9 = cacheMap7.isLRU();
        java.util.Set set10 = cacheMap7.getPinnedKeys();
        cacheMap1.putAll((java.util.Map) cacheMap7);
        cacheMap7.setCacheSize((int) (byte) 100);
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set15 = cacheMap14.entrySet();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl16 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl16.setTrackChanges(false);
        java.util.Collection collection19 = proxyManagerImpl16.getUnproxyable();
        boolean boolean20 = cacheMap14.containsKey((Object) collection19);
        cacheMap14.readLock();
        boolean boolean22 = cacheMap7.containsValue((Object) cacheMap14);
        boolean boolean23 = cacheMap14.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str6 = cacheMap5.toString();
        java.util.Set set7 = cacheMap5.entrySet();
        boolean boolean8 = cacheMap0.containsKey((Object) set7);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean13 = cacheMap12.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set15 = cacheMap14.entrySet();
        java.util.Collection collection16 = cacheMap14.values();
        cacheMap12.putAll((java.util.Map) cacheMap14, true);
        cacheMap9.putAll((java.util.Map) cacheMap14, false);
        cacheMap0.putAll((java.util.Map) cacheMap14);
        java.util.Set set22 = cacheMap14.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean26 = cacheMap24.pin((Object) "CacheMap:{}::{}");
        int int27 = cacheMap24.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap30 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean31 = cacheMap30.isLRU();
        boolean boolean32 = cacheMap30.isLRU();
        java.util.Set set33 = cacheMap30.getPinnedKeys();
        cacheMap24.putAll((java.util.Map) cacheMap30);
        cacheMap30.writeLock();
        boolean boolean36 = cacheMap14.containsKey((Object) cacheMap30);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl37 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean38 = proxyManagerImpl37.getTrackChanges();
        boolean boolean39 = proxyManagerImpl37.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl40 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean41 = proxyManagerImpl40.getTrackChanges();
        boolean boolean42 = proxyManagerImpl40.getDelayCollectionLoading();
        boolean boolean43 = proxyManagerImpl40.getTrackChanges();
        Class<?> wildcardClass44 = proxyManagerImpl40.getClass();
        org.apache.openjpa.util.Proxy proxy45 = proxyManagerImpl37.newDateProxy((Class) wildcardClass44);
        boolean boolean46 = cacheMap14.unpin((Object) proxyManagerImpl37);
        org.apache.openjpa.util.CacheMap cacheMap49 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean50 = cacheMap49.isLRU();
        boolean boolean51 = cacheMap49.isLRU();
        java.util.Set set52 = cacheMap49.getPinnedKeys();
        cacheMap14.putAll((java.util.Map) cacheMap49);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(proxy45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(set52);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str6 = cacheMap5.toString();
        java.util.Set set7 = cacheMap5.entrySet();
        boolean boolean8 = cacheMap0.containsKey((Object) set7);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean13 = cacheMap12.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set15 = cacheMap14.entrySet();
        java.util.Collection collection16 = cacheMap14.values();
        cacheMap12.putAll((java.util.Map) cacheMap14, true);
        cacheMap9.putAll((java.util.Map) cacheMap14, false);
        cacheMap0.putAll((java.util.Map) cacheMap14);
        String str22 = cacheMap0.toString();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CacheMap:{}::{}" + "'", str22, "CacheMap:{}::{}");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        proxyManagerImpl0.setUnproxyable("");
        proxyManagerImpl0.setUnproxyable("");
        boolean boolean7 = proxyManagerImpl0.getTrackChanges();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        boolean boolean4 = cacheMap2.isEmpty();
        int int5 = cacheMap2.getSoftReferenceSize();
        cacheMap2.writeLock();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        boolean boolean6 = cacheMap4.isEmpty();
        boolean boolean8 = cacheMap4.unpin((Object) 10);
        cacheMap0.putAll((java.util.Map) cacheMap4);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set11 = cacheMap10.entrySet();
        java.util.Collection collection12 = cacheMap10.values();
        java.util.Set set13 = cacheMap10.entrySet();
        Object obj14 = cacheMap4.remove((Object) cacheMap10);
        java.util.Collection collection15 = cacheMap10.values();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        java.util.Date date1 = null;
        java.util.Date date2 = proxyManagerImpl0.copyDate(date1);
        proxyManagerImpl0.setDelayCollectionLoading(false);
        org.junit.Assert.assertNull(date2);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, 1, (int) (byte) -1, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 0.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        boolean boolean2 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str6 = cacheMap5.toString();
        boolean boolean7 = cacheMap5.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set9 = cacheMap8.entrySet();
        java.util.Collection collection10 = cacheMap8.values();
        java.util.Set set11 = cacheMap8.entrySet();
        cacheMap5.putAll((java.util.Map) cacheMap8, true);
        boolean boolean14 = cacheMap0.unpin((Object) true);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set16 = cacheMap15.entrySet();
        boolean boolean17 = cacheMap0.containsValue((Object) cacheMap15);
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set19 = cacheMap18.entrySet();
        java.util.Collection collection20 = cacheMap18.values();
        java.util.Set set21 = cacheMap18.entrySet();
        int int22 = cacheMap18.getSoftReferenceSize();
        Object obj24 = cacheMap18.remove((Object) (short) 1);
        Object obj25 = cacheMap0.remove((Object) (short) 1);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        int int4 = cacheMap2.size();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap2.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean6 = cacheMap5.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set8 = cacheMap7.entrySet();
        java.util.Collection collection9 = cacheMap7.values();
        cacheMap5.putAll((java.util.Map) cacheMap7, true);
        cacheMap2.putAll((java.util.Map) cacheMap7, false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl14 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean15 = proxyManagerImpl14.getTrackChanges();
        boolean boolean16 = proxyManagerImpl14.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl17 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean18 = proxyManagerImpl17.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl19 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean20 = proxyManagerImpl19.getTrackChanges();
        boolean boolean21 = proxyManagerImpl19.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap24.setCacheSize(0);
        Class<?> wildcardClass27 = cacheMap24.getClass();
        java.util.TimeZone timeZone28 = null;
        org.apache.openjpa.util.Proxy proxy29 = proxyManagerImpl19.newCalendarProxy((Class) wildcardClass27, timeZone28);
        org.apache.openjpa.util.CacheMap cacheMap32 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass33 = cacheMap32.getClass();
        java.util.Comparator comparator34 = null;
        org.apache.openjpa.util.Proxy proxy36 = proxyManagerImpl17.newCollectionProxy((Class) wildcardClass27, (Class) wildcardClass33, comparator34, true);
        org.apache.openjpa.util.Proxy proxy37 = proxyManagerImpl14.newDateProxy((Class) wildcardClass33);
        boolean boolean38 = cacheMap2.containsValue((Object) proxyManagerImpl14);
        org.apache.openjpa.util.CacheMap cacheMap41 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str42 = cacheMap41.toString();
        cacheMap41.setSoftReferenceSize(1);
        boolean boolean46 = cacheMap41.containsValue((Object) 100.0f);
        int int47 = cacheMap41.size();
        int int48 = cacheMap41.size();
        org.apache.openjpa.util.CacheMap cacheMap51 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean52 = cacheMap51.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap53 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set54 = cacheMap53.entrySet();
        java.util.Collection collection55 = cacheMap53.values();
        cacheMap51.putAll((java.util.Map) cacheMap53, true);
        cacheMap53.setCacheSize((int) 'a');
        java.util.Set set60 = cacheMap53.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap61 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set62 = cacheMap61.entrySet();
        java.util.Collection collection63 = cacheMap61.values();
        cacheMap53.putAll((java.util.Map) cacheMap61, true);
        int int66 = cacheMap53.getCacheSize();
        boolean boolean67 = cacheMap41.unpin((Object) cacheMap53);
        Object obj68 = cacheMap0.put((Object) boolean38, (Object) cacheMap53);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(proxy29);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(proxy36);
        org.junit.Assert.assertNotNull(proxy37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "CacheMap:{}::{}" + "'", str42, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 97 + "'", int66 == 97);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl0.setTrackChanges(false);
        proxyManagerImpl0.setTrackChanges(false);
        boolean boolean5 = proxyManagerImpl0.getAssertAllowedType();
        proxyManagerImpl0.setAssertAllowedType(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        boolean boolean4 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap7.setCacheSize(0);
        boolean boolean10 = cacheMap2.containsValue((Object) cacheMap7);
        boolean boolean11 = cacheMap2.isLRU();
        java.util.Set set12 = cacheMap2.entrySet();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl3 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        Class<?> wildcardClass6 = cacheMap4.getClass();
        org.apache.openjpa.util.Proxy proxy7 = proxyManagerImpl3.newDateProxy((Class) wildcardClass6);
        java.util.TimeZone timeZone8 = null;
        org.apache.openjpa.util.Proxy proxy9 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass6, timeZone8);
        boolean boolean10 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setTrackChanges(true);
        java.util.Collection collection13 = proxyManagerImpl0.getUnproxyable();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl14 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set16 = cacheMap15.getPinnedKeys();
        Class<?> wildcardClass17 = cacheMap15.getClass();
        org.apache.openjpa.util.Proxy proxy18 = proxyManagerImpl14.newDateProxy((Class) wildcardClass17);
        Object obj20 = proxyManagerImpl14.copyCustom((Object) true);
        java.util.Date date21 = null;
        java.util.Date date22 = proxyManagerImpl14.copyDate(date21);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl23 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set25 = cacheMap24.getPinnedKeys();
        Class<?> wildcardClass26 = cacheMap24.getClass();
        org.apache.openjpa.util.Proxy proxy27 = proxyManagerImpl23.newDateProxy((Class) wildcardClass26);
        org.apache.openjpa.util.Proxy proxy28 = proxyManagerImpl14.newDateProxy((Class) wildcardClass26);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl29 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean30 = proxyManagerImpl29.getTrackChanges();
        boolean boolean31 = proxyManagerImpl29.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl32 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean33 = proxyManagerImpl32.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl34 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean35 = proxyManagerImpl34.getTrackChanges();
        boolean boolean36 = proxyManagerImpl34.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap39 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap39.setCacheSize(0);
        Class<?> wildcardClass42 = cacheMap39.getClass();
        java.util.TimeZone timeZone43 = null;
        org.apache.openjpa.util.Proxy proxy44 = proxyManagerImpl34.newCalendarProxy((Class) wildcardClass42, timeZone43);
        org.apache.openjpa.util.CacheMap cacheMap47 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass48 = cacheMap47.getClass();
        java.util.Comparator comparator49 = null;
        org.apache.openjpa.util.Proxy proxy51 = proxyManagerImpl32.newCollectionProxy((Class) wildcardClass42, (Class) wildcardClass48, comparator49, true);
        org.apache.openjpa.util.Proxy proxy52 = proxyManagerImpl29.newDateProxy((Class) wildcardClass48);
        java.util.Comparator comparator53 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.Proxy proxy55 = proxyManagerImpl0.newCollectionProxy((Class) wildcardClass26, (Class) wildcardClass48, comparator53, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$418$proxy cannot be cast to class org.apache.openjpa.util.proxy.ProxyCollection (org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$418$proxy is in unnamed module of loader org.apache.openjpa.util.ClassLoaderProxyService$ProxiesClassLoader @477b5620; org.apache.openjpa.util.proxy.ProxyCollection is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(proxy18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(proxy27);
        org.junit.Assert.assertNotNull(proxy28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(proxy44);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(proxy51);
        org.junit.Assert.assertNotNull(proxy52);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, 1000, (int) (byte) 0, (float) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 97.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        Object obj2 = null;
        boolean boolean3 = cacheMap0.containsKey(obj2);
        int int4 = cacheMap0.getSoftReferenceSize();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        boolean boolean3 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl4 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean5 = proxyManagerImpl4.getTrackChanges();
        boolean boolean6 = proxyManagerImpl4.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl7 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean8 = proxyManagerImpl7.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl9 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean10 = proxyManagerImpl9.getTrackChanges();
        boolean boolean11 = proxyManagerImpl9.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap14.setCacheSize(0);
        Class<?> wildcardClass17 = cacheMap14.getClass();
        java.util.TimeZone timeZone18 = null;
        org.apache.openjpa.util.Proxy proxy19 = proxyManagerImpl9.newCalendarProxy((Class) wildcardClass17, timeZone18);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass23 = cacheMap22.getClass();
        java.util.Comparator comparator24 = null;
        org.apache.openjpa.util.Proxy proxy26 = proxyManagerImpl7.newCollectionProxy((Class) wildcardClass17, (Class) wildcardClass23, comparator24, true);
        org.apache.openjpa.util.Proxy proxy27 = proxyManagerImpl4.newDateProxy((Class) wildcardClass23);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl28 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean29 = proxyManagerImpl28.getTrackChanges();
        boolean boolean30 = proxyManagerImpl28.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl31 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean32 = proxyManagerImpl31.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl33 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean34 = proxyManagerImpl33.getTrackChanges();
        boolean boolean35 = proxyManagerImpl33.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap38 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap38.setCacheSize(0);
        Class<?> wildcardClass41 = cacheMap38.getClass();
        java.util.TimeZone timeZone42 = null;
        org.apache.openjpa.util.Proxy proxy43 = proxyManagerImpl33.newCalendarProxy((Class) wildcardClass41, timeZone42);
        org.apache.openjpa.util.CacheMap cacheMap46 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass47 = cacheMap46.getClass();
        java.util.Comparator comparator48 = null;
        org.apache.openjpa.util.Proxy proxy50 = proxyManagerImpl31.newCollectionProxy((Class) wildcardClass41, (Class) wildcardClass47, comparator48, true);
        org.apache.openjpa.util.Proxy proxy51 = proxyManagerImpl28.newDateProxy((Class) wildcardClass47);
        org.apache.openjpa.util.Proxy proxy52 = proxyManagerImpl4.newDateProxy((Class) wildcardClass47);
        java.util.TimeZone timeZone53 = null;
        org.apache.openjpa.util.Proxy proxy54 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass47, timeZone53);
        boolean boolean55 = proxyManagerImpl0.getTrackChanges();
        boolean boolean56 = proxyManagerImpl0.getAssertAllowedType();
        org.apache.openjpa.util.CacheMap cacheMap59 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass60 = cacheMap59.getClass();
        Object obj61 = new Object();
        Class<?> wildcardClass62 = obj61.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl63 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean64 = proxyManagerImpl63.getTrackChanges();
        boolean boolean65 = proxyManagerImpl63.getDelayCollectionLoading();
        proxyManagerImpl63.setUnproxyable("");
        proxyManagerImpl63.setUnproxyable("");
        proxyManagerImpl63.setDelayCollectionLoading(true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl72 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean73 = proxyManagerImpl72.getTrackChanges();
        boolean boolean74 = proxyManagerImpl72.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl75 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap76 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set77 = cacheMap76.getPinnedKeys();
        Class<?> wildcardClass78 = cacheMap76.getClass();
        org.apache.openjpa.util.Proxy proxy79 = proxyManagerImpl75.newDateProxy((Class) wildcardClass78);
        java.util.TimeZone timeZone80 = null;
        org.apache.openjpa.util.Proxy proxy81 = proxyManagerImpl72.newCalendarProxy((Class) wildcardClass78, timeZone80);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl82 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean83 = proxyManagerImpl82.getTrackChanges();
        boolean boolean84 = proxyManagerImpl82.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap87 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap87.setCacheSize(0);
        Class<?> wildcardClass90 = cacheMap87.getClass();
        java.util.TimeZone timeZone91 = null;
        org.apache.openjpa.util.Proxy proxy92 = proxyManagerImpl82.newCalendarProxy((Class) wildcardClass90, timeZone91);
        java.util.Comparator comparator93 = null;
        org.apache.openjpa.util.Proxy proxy95 = proxyManagerImpl63.newCollectionProxy((Class) wildcardClass78, (Class) wildcardClass90, comparator93, true);
        java.util.Comparator comparator96 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.Proxy proxy98 = proxyManagerImpl0.newMapProxy((Class) wildcardClass60, (Class) wildcardClass62, (Class) wildcardClass90, comparator96, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$440$proxy cannot be cast to class org.apache.openjpa.util.proxy.ProxyMap (org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$440$proxy is in unnamed module of loader org.apache.openjpa.util.ClassLoaderProxyService$ProxiesClassLoader @7e3dc2da; org.apache.openjpa.util.proxy.ProxyMap is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(proxy19);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(proxy26);
        org.junit.Assert.assertNotNull(proxy27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(proxy43);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(proxy50);
        org.junit.Assert.assertNotNull(proxy51);
        org.junit.Assert.assertNotNull(proxy52);
        org.junit.Assert.assertNotNull(proxy54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(proxy79);
        org.junit.Assert.assertNotNull(proxy81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertNotNull(proxy92);
        org.junit.Assert.assertNotNull(proxy95);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        boolean boolean2 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str6 = cacheMap5.toString();
        cacheMap5.setSoftReferenceSize(1);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean12 = cacheMap11.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set14 = cacheMap13.entrySet();
        java.util.Collection collection15 = cacheMap13.values();
        cacheMap11.putAll((java.util.Map) cacheMap13, true);
        boolean boolean18 = cacheMap5.unpin((Object) cacheMap11);
        boolean boolean19 = cacheMap0.containsValue((Object) cacheMap5);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        boolean boolean4 = cacheMap2.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.entrySet();
        java.util.Collection collection7 = cacheMap5.values();
        java.util.Set set8 = cacheMap5.entrySet();
        cacheMap2.putAll((java.util.Map) cacheMap5, true);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str14 = cacheMap13.toString();
        cacheMap13.setSoftReferenceSize(1);
        boolean boolean18 = cacheMap13.containsValue((Object) 100.0f);
        int int19 = cacheMap13.size();
        int int20 = cacheMap13.size();
        boolean boolean21 = cacheMap13.isEmpty();
        java.util.Set set22 = cacheMap13.keySet();
        Object obj23 = cacheMap5.get((Object) set22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CacheMap:{}::{}" + "'", str14, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        boolean boolean3 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl4 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean5 = proxyManagerImpl4.getTrackChanges();
        boolean boolean6 = proxyManagerImpl4.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl7 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean8 = proxyManagerImpl7.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl9 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean10 = proxyManagerImpl9.getTrackChanges();
        boolean boolean11 = proxyManagerImpl9.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap14.setCacheSize(0);
        Class<?> wildcardClass17 = cacheMap14.getClass();
        java.util.TimeZone timeZone18 = null;
        org.apache.openjpa.util.Proxy proxy19 = proxyManagerImpl9.newCalendarProxy((Class) wildcardClass17, timeZone18);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass23 = cacheMap22.getClass();
        java.util.Comparator comparator24 = null;
        org.apache.openjpa.util.Proxy proxy26 = proxyManagerImpl7.newCollectionProxy((Class) wildcardClass17, (Class) wildcardClass23, comparator24, true);
        org.apache.openjpa.util.Proxy proxy27 = proxyManagerImpl4.newDateProxy((Class) wildcardClass23);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl28 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean29 = proxyManagerImpl28.getTrackChanges();
        boolean boolean30 = proxyManagerImpl28.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl31 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean32 = proxyManagerImpl31.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl33 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean34 = proxyManagerImpl33.getTrackChanges();
        boolean boolean35 = proxyManagerImpl33.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap38 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap38.setCacheSize(0);
        Class<?> wildcardClass41 = cacheMap38.getClass();
        java.util.TimeZone timeZone42 = null;
        org.apache.openjpa.util.Proxy proxy43 = proxyManagerImpl33.newCalendarProxy((Class) wildcardClass41, timeZone42);
        org.apache.openjpa.util.CacheMap cacheMap46 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass47 = cacheMap46.getClass();
        java.util.Comparator comparator48 = null;
        org.apache.openjpa.util.Proxy proxy50 = proxyManagerImpl31.newCollectionProxy((Class) wildcardClass41, (Class) wildcardClass47, comparator48, true);
        org.apache.openjpa.util.Proxy proxy51 = proxyManagerImpl28.newDateProxy((Class) wildcardClass47);
        org.apache.openjpa.util.Proxy proxy52 = proxyManagerImpl4.newDateProxy((Class) wildcardClass47);
        java.util.TimeZone timeZone53 = null;
        org.apache.openjpa.util.Proxy proxy54 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass47, timeZone53);
        boolean boolean55 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl56 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap57 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set58 = cacheMap57.getPinnedKeys();
        Class<?> wildcardClass59 = cacheMap57.getClass();
        org.apache.openjpa.util.Proxy proxy60 = proxyManagerImpl56.newDateProxy((Class) wildcardClass59);
        Object obj62 = proxyManagerImpl56.copyCustom((Object) true);
        java.util.Collection collection63 = proxyManagerImpl56.getUnproxyable();
        java.util.Collection collection64 = proxyManagerImpl0.copyCollection(collection63);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(proxy19);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(proxy26);
        org.junit.Assert.assertNotNull(proxy27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(proxy43);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(proxy50);
        org.junit.Assert.assertNotNull(proxy51);
        org.junit.Assert.assertNotNull(proxy52);
        org.junit.Assert.assertNotNull(proxy54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(proxy60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(collection64);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl1 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean2 = proxyManagerImpl1.getTrackChanges();
        proxyManagerImpl1.setTrackChanges(false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl5 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set7 = cacheMap6.getPinnedKeys();
        Class<?> wildcardClass8 = cacheMap6.getClass();
        org.apache.openjpa.util.Proxy proxy9 = proxyManagerImpl5.newDateProxy((Class) wildcardClass8);
        org.apache.openjpa.util.Proxy proxy11 = proxyManagerImpl1.newCustomProxy((Object) proxyManagerImpl5, true);
        boolean boolean12 = proxyManagerImpl5.getAssertAllowedType();
        boolean boolean13 = proxyManagerImpl5.getAssertAllowedType();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl14 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean15 = proxyManagerImpl14.getDelayCollectionLoading();
        java.util.Calendar calendar16 = null;
        java.util.Calendar calendar17 = proxyManagerImpl14.copyCalendar(calendar16);
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass21 = cacheMap20.getClass();
        org.apache.openjpa.util.Proxy proxy22 = proxyManagerImpl14.newDateProxy((Class) wildcardClass21);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl23 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean24 = proxyManagerImpl23.getTrackChanges();
        boolean boolean25 = proxyManagerImpl23.getDelayCollectionLoading();
        boolean boolean26 = proxyManagerImpl23.getTrackChanges();
        Class<?> wildcardClass27 = proxyManagerImpl23.getClass();
        org.apache.openjpa.util.CacheMap cacheMap30 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap30.setCacheSize(0);
        Class<?> wildcardClass33 = cacheMap30.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl34 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean35 = proxyManagerImpl34.getDelayCollectionLoading();
        java.util.Calendar calendar36 = null;
        java.util.Calendar calendar37 = proxyManagerImpl34.copyCalendar(calendar36);
        org.apache.openjpa.util.CacheMap cacheMap40 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass41 = cacheMap40.getClass();
        org.apache.openjpa.util.Proxy proxy42 = proxyManagerImpl34.newDateProxy((Class) wildcardClass41);
        java.util.Comparator comparator43 = null;
        org.apache.openjpa.util.Proxy proxy45 = proxyManagerImpl14.newMapProxy((Class) wildcardClass27, (Class) wildcardClass33, (Class) wildcardClass41, comparator43, false);
        java.util.TimeZone timeZone46 = null;
        org.apache.openjpa.util.Proxy proxy47 = proxyManagerImpl5.newCalendarProxy((Class) wildcardClass27, timeZone46);
        boolean boolean48 = cacheMap0.containsValue((Object) proxyManagerImpl5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(proxy11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(calendar17);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(proxy22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(calendar37);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(proxy42);
        org.junit.Assert.assertNotNull(proxy45);
        org.junit.Assert.assertNotNull(proxy47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        Class<?> wildcardClass3 = cacheMap1.getClass();
        org.apache.openjpa.util.Proxy proxy4 = proxyManagerImpl0.newDateProxy((Class) wildcardClass3);
        Object obj6 = proxyManagerImpl0.copyCustom((Object) true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl7 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl7.setTrackChanges(false);
        Object obj10 = proxyManagerImpl0.copyCustom((Object) false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl11 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean12 = proxyManagerImpl11.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str16 = cacheMap15.toString();
        cacheMap15.setSoftReferenceSize(1);
        java.util.Collection collection19 = cacheMap15.values();
        org.apache.openjpa.util.Proxy proxy21 = proxyManagerImpl11.newCustomProxy((Object) cacheMap15, false);
        java.util.Collection collection22 = proxyManagerImpl11.getUnproxyable();
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set24 = cacheMap23.entrySet();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl25 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl25.setTrackChanges(false);
        java.util.Collection collection28 = proxyManagerImpl25.getUnproxyable();
        boolean boolean29 = cacheMap23.containsKey((Object) collection28);
        java.util.Collection collection30 = proxyManagerImpl11.copyCollection(collection28);
        java.util.Collection collection31 = proxyManagerImpl0.copyCollection(collection30);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{}::{}" + "'", str16, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(proxy21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        Class<?> wildcardClass3 = cacheMap1.getClass();
        org.apache.openjpa.util.Proxy proxy4 = proxyManagerImpl0.newDateProxy((Class) wildcardClass3);
        Object obj6 = proxyManagerImpl0.copyCustom((Object) true);
        java.util.Date date7 = null;
        java.util.Date date8 = proxyManagerImpl0.copyDate(date7);
        proxyManagerImpl0.setUnproxyable("CacheMap:{}::{}");
        java.util.Collection collection11 = proxyManagerImpl0.getUnproxyable();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        proxyManagerImpl0.setUnproxyable("");
        proxyManagerImpl0.setUnproxyable("");
        boolean boolean7 = proxyManagerImpl0.getAssertAllowedType();
        proxyManagerImpl0.setAssertAllowedType(true);
        boolean boolean10 = proxyManagerImpl0.getTrackChanges();
        java.util.Date date11 = null;
        java.util.Date date12 = proxyManagerImpl0.copyDate(date11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, (int) 'a', (int) (byte) 1, (float) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 100.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap5.setCacheSize(0);
        Class<?> wildcardClass8 = cacheMap5.getClass();
        java.util.TimeZone timeZone9 = null;
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass8, timeZone9);
        proxyManagerImpl0.setDelayCollectionLoading(false);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str16 = cacheMap15.toString();
        cacheMap15.setSoftReferenceSize(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map19 = proxyManagerImpl0.copyMap((java.util.Map) cacheMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$468$proxy cannot be cast to class org.apache.openjpa.util.proxy.ProxyMap (org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$468$proxy is in unnamed module of loader org.apache.openjpa.util.ClassLoaderProxyService$ProxiesClassLoader @2345517; org.apache.openjpa.util.proxy.ProxyMap is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{}::{}" + "'", str16, "CacheMap:{}::{}");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        Class<?> wildcardClass3 = cacheMap1.getClass();
        org.apache.openjpa.util.Proxy proxy4 = proxyManagerImpl0.newDateProxy((Class) wildcardClass3);
        Object obj6 = proxyManagerImpl0.copyCustom((Object) true);
        java.util.Date date7 = null;
        java.util.Date date8 = proxyManagerImpl0.copyDate(date7);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str12 = cacheMap11.toString();
        cacheMap11.setSoftReferenceSize(1);
        cacheMap11.readLock();
        // The following exception was thrown during execution in test generation
        try {
            Object obj16 = proxyManagerImpl0.copyArray((Object) cacheMap11);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UnsupportedException; message: Unable to copy array: Argument is not an array.");
        } catch (org.apache.openjpa.util.UnsupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CacheMap:{}::{}" + "'", str12, "CacheMap:{}::{}");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        Class<?> wildcardClass3 = cacheMap1.getClass();
        org.apache.openjpa.util.Proxy proxy4 = proxyManagerImpl0.newDateProxy((Class) wildcardClass3);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl5 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean6 = proxyManagerImpl5.getTrackChanges();
        boolean boolean7 = proxyManagerImpl5.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap10.setCacheSize(0);
        Class<?> wildcardClass13 = cacheMap10.getClass();
        java.util.TimeZone timeZone14 = null;
        org.apache.openjpa.util.Proxy proxy15 = proxyManagerImpl5.newCalendarProxy((Class) wildcardClass13, timeZone14);
        org.apache.openjpa.util.Proxy proxy16 = proxyManagerImpl0.newDateProxy((Class) wildcardClass13);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl17 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean18 = proxyManagerImpl17.getTrackChanges();
        boolean boolean19 = proxyManagerImpl17.getDelayCollectionLoading();
        boolean boolean20 = proxyManagerImpl17.getTrackChanges();
        Class<?> wildcardClass21 = proxyManagerImpl17.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl22 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean23 = proxyManagerImpl22.getTrackChanges();
        boolean boolean24 = proxyManagerImpl22.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl25 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean26 = proxyManagerImpl25.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl27 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean28 = proxyManagerImpl27.getTrackChanges();
        boolean boolean29 = proxyManagerImpl27.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap32 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap32.setCacheSize(0);
        Class<?> wildcardClass35 = cacheMap32.getClass();
        java.util.TimeZone timeZone36 = null;
        org.apache.openjpa.util.Proxy proxy37 = proxyManagerImpl27.newCalendarProxy((Class) wildcardClass35, timeZone36);
        org.apache.openjpa.util.CacheMap cacheMap40 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass41 = cacheMap40.getClass();
        java.util.Comparator comparator42 = null;
        org.apache.openjpa.util.Proxy proxy44 = proxyManagerImpl25.newCollectionProxy((Class) wildcardClass35, (Class) wildcardClass41, comparator42, true);
        org.apache.openjpa.util.Proxy proxy45 = proxyManagerImpl22.newDateProxy((Class) wildcardClass41);
        java.util.Comparator comparator46 = null;
        org.apache.openjpa.util.Proxy proxy48 = proxyManagerImpl0.newCollectionProxy((Class) wildcardClass21, (Class) wildcardClass41, comparator46, true);
        java.util.Date date49 = null;
        java.util.Date date50 = proxyManagerImpl0.copyDate(date49);
        proxyManagerImpl0.setAssertAllowedType(true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl53 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl53.setTrackChanges(false);
        org.apache.openjpa.util.CacheMap cacheMap56 = new org.apache.openjpa.util.CacheMap();
        boolean boolean58 = cacheMap56.containsKey((Object) 10.0f);
        java.util.Map map59 = proxyManagerImpl53.copyMap((java.util.Map) cacheMap56);
        org.apache.openjpa.util.CacheMap cacheMap61 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean63 = cacheMap61.pin((Object) "CacheMap:{}::{}");
        int int64 = cacheMap61.getSoftReferenceSize();
        java.util.Collection collection65 = cacheMap61.values();
        cacheMap56.putAll((java.util.Map) cacheMap61, true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map68 = proxyManagerImpl0.copyMap((java.util.Map) cacheMap56);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$471$proxy cannot be cast to class org.apache.openjpa.util.proxy.ProxyMap (org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$471$proxy is in unnamed module of loader org.apache.openjpa.util.ClassLoaderProxyService$ProxiesClassLoader @4bccb053; org.apache.openjpa.util.proxy.ProxyMap is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(proxy15);
        org.junit.Assert.assertNotNull(proxy16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(proxy37);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(proxy44);
        org.junit.Assert.assertNotNull(proxy45);
        org.junit.Assert.assertNotNull(proxy48);
        org.junit.Assert.assertNull(date50);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(collection65);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, 0, (int) (byte) 1, 1.0f);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, 100);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap5.setCacheSize(0);
        Class<?> wildcardClass8 = cacheMap5.getClass();
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set10 = cacheMap9.getPinnedKeys();
        boolean boolean11 = cacheMap9.isEmpty();
        boolean boolean13 = cacheMap9.unpin((Object) 10);
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set15 = cacheMap14.entrySet();
        java.util.Collection collection16 = cacheMap14.values();
        java.util.Set set17 = cacheMap14.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set19 = cacheMap18.getPinnedKeys();
        boolean boolean20 = cacheMap18.isEmpty();
        boolean boolean22 = cacheMap18.unpin((Object) 10);
        cacheMap14.putAll((java.util.Map) cacheMap18);
        java.util.Set set24 = cacheMap14.keySet();
        boolean boolean25 = cacheMap9.pin((Object) set24);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl26 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean27 = proxyManagerImpl26.getTrackChanges();
        boolean boolean28 = proxyManagerImpl26.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap31.setCacheSize(0);
        Class<?> wildcardClass34 = cacheMap31.getClass();
        java.util.TimeZone timeZone35 = null;
        org.apache.openjpa.util.Proxy proxy36 = proxyManagerImpl26.newCalendarProxy((Class) wildcardClass34, timeZone35);
        proxyManagerImpl26.setDelayCollectionLoading(true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl39 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean40 = proxyManagerImpl39.getTrackChanges();
        boolean boolean41 = proxyManagerImpl39.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl42 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean43 = proxyManagerImpl42.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl44 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean45 = proxyManagerImpl44.getTrackChanges();
        boolean boolean46 = proxyManagerImpl44.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap49 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap49.setCacheSize(0);
        Class<?> wildcardClass52 = cacheMap49.getClass();
        java.util.TimeZone timeZone53 = null;
        org.apache.openjpa.util.Proxy proxy54 = proxyManagerImpl44.newCalendarProxy((Class) wildcardClass52, timeZone53);
        org.apache.openjpa.util.CacheMap cacheMap57 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass58 = cacheMap57.getClass();
        java.util.Comparator comparator59 = null;
        org.apache.openjpa.util.Proxy proxy61 = proxyManagerImpl42.newCollectionProxy((Class) wildcardClass52, (Class) wildcardClass58, comparator59, true);
        org.apache.openjpa.util.Proxy proxy62 = proxyManagerImpl39.newDateProxy((Class) wildcardClass58);
        java.util.TimeZone timeZone63 = null;
        org.apache.openjpa.util.Proxy proxy64 = proxyManagerImpl26.newCalendarProxy((Class) wildcardClass58, timeZone63);
        org.apache.openjpa.util.CacheMap cacheMap67 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str68 = cacheMap67.toString();
        boolean boolean69 = cacheMap67.isEmpty();
        Object obj70 = cacheMap9.put((Object) proxy64, (Object) boolean69);
        Object obj71 = cacheMap2.put((Object) wildcardClass8, (Object) cacheMap9);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(proxy36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(proxy54);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(proxy61);
        org.junit.Assert.assertNotNull(proxy62);
        org.junit.Assert.assertNotNull(proxy64);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "CacheMap:{}::{}" + "'", str68, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj71);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean4 = cacheMap3.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.entrySet();
        java.util.Collection collection7 = cacheMap5.values();
        cacheMap3.putAll((java.util.Map) cacheMap5, true);
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl12 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean13 = cacheMap0.unpin((Object) proxyManagerImpl12);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl14 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl14.setAssertAllowedType(false);
        boolean boolean17 = cacheMap0.pin((Object) false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        Class<?> wildcardClass3 = cacheMap1.getClass();
        org.apache.openjpa.util.Proxy proxy4 = proxyManagerImpl0.newDateProxy((Class) wildcardClass3);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl5 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean6 = proxyManagerImpl5.getTrackChanges();
        boolean boolean7 = proxyManagerImpl5.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap10.setCacheSize(0);
        Class<?> wildcardClass13 = cacheMap10.getClass();
        java.util.TimeZone timeZone14 = null;
        org.apache.openjpa.util.Proxy proxy15 = proxyManagerImpl5.newCalendarProxy((Class) wildcardClass13, timeZone14);
        org.apache.openjpa.util.Proxy proxy16 = proxyManagerImpl0.newDateProxy((Class) wildcardClass13);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl17 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean18 = proxyManagerImpl17.getTrackChanges();
        boolean boolean19 = proxyManagerImpl17.getDelayCollectionLoading();
        boolean boolean20 = proxyManagerImpl17.getTrackChanges();
        Class<?> wildcardClass21 = proxyManagerImpl17.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl22 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean23 = proxyManagerImpl22.getTrackChanges();
        boolean boolean24 = proxyManagerImpl22.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl25 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean26 = proxyManagerImpl25.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl27 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean28 = proxyManagerImpl27.getTrackChanges();
        boolean boolean29 = proxyManagerImpl27.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap32 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap32.setCacheSize(0);
        Class<?> wildcardClass35 = cacheMap32.getClass();
        java.util.TimeZone timeZone36 = null;
        org.apache.openjpa.util.Proxy proxy37 = proxyManagerImpl27.newCalendarProxy((Class) wildcardClass35, timeZone36);
        org.apache.openjpa.util.CacheMap cacheMap40 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass41 = cacheMap40.getClass();
        java.util.Comparator comparator42 = null;
        org.apache.openjpa.util.Proxy proxy44 = proxyManagerImpl25.newCollectionProxy((Class) wildcardClass35, (Class) wildcardClass41, comparator42, true);
        org.apache.openjpa.util.Proxy proxy45 = proxyManagerImpl22.newDateProxy((Class) wildcardClass41);
        java.util.Comparator comparator46 = null;
        org.apache.openjpa.util.Proxy proxy48 = proxyManagerImpl0.newCollectionProxy((Class) wildcardClass21, (Class) wildcardClass41, comparator46, true);
        java.util.Date date49 = null;
        java.util.Date date50 = proxyManagerImpl0.copyDate(date49);
        proxyManagerImpl0.setUnproxyable("CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(proxy15);
        org.junit.Assert.assertNotNull(proxy16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(proxy37);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(proxy44);
        org.junit.Assert.assertNotNull(proxy45);
        org.junit.Assert.assertNotNull(proxy48);
        org.junit.Assert.assertNull(date50);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setAssertAllowedType(true);
        boolean boolean4 = proxyManagerImpl0.getAssertAllowedType();
        boolean boolean5 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setAssertAllowedType(false);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean11 = cacheMap10.isLRU();
        boolean boolean12 = cacheMap10.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap15.setCacheSize(0);
        boolean boolean18 = cacheMap10.containsValue((Object) cacheMap15);
        int int19 = cacheMap15.getCacheSize();
        java.util.Map map20 = proxyManagerImpl0.copyMap((java.util.Map) cacheMap15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl2 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean3 = proxyManagerImpl2.getTrackChanges();
        boolean boolean4 = proxyManagerImpl2.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap7.setCacheSize(0);
        Class<?> wildcardClass10 = cacheMap7.getClass();
        java.util.TimeZone timeZone11 = null;
        org.apache.openjpa.util.Proxy proxy12 = proxyManagerImpl2.newCalendarProxy((Class) wildcardClass10, timeZone11);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass16 = cacheMap15.getClass();
        java.util.Comparator comparator17 = null;
        org.apache.openjpa.util.Proxy proxy19 = proxyManagerImpl0.newCollectionProxy((Class) wildcardClass10, (Class) wildcardClass16, comparator17, true);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap22.setCacheSize(0);
        java.util.Set set25 = cacheMap22.entrySet();
        boolean boolean26 = cacheMap22.isEmpty();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl27 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean28 = proxyManagerImpl27.getTrackChanges();
        boolean boolean29 = proxyManagerImpl27.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl30 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean31 = proxyManagerImpl30.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl32 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean33 = proxyManagerImpl32.getTrackChanges();
        boolean boolean34 = proxyManagerImpl32.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap37 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap37.setCacheSize(0);
        Class<?> wildcardClass40 = cacheMap37.getClass();
        java.util.TimeZone timeZone41 = null;
        org.apache.openjpa.util.Proxy proxy42 = proxyManagerImpl32.newCalendarProxy((Class) wildcardClass40, timeZone41);
        org.apache.openjpa.util.CacheMap cacheMap45 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass46 = cacheMap45.getClass();
        java.util.Comparator comparator47 = null;
        org.apache.openjpa.util.Proxy proxy49 = proxyManagerImpl30.newCollectionProxy((Class) wildcardClass40, (Class) wildcardClass46, comparator47, true);
        org.apache.openjpa.util.Proxy proxy50 = proxyManagerImpl27.newDateProxy((Class) wildcardClass46);
        Object obj51 = null;
        Object obj52 = cacheMap22.put((Object) proxy50, obj51);
        int int53 = cacheMap22.getCacheSize();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map54 = proxyManagerImpl0.copyMap((java.util.Map) cacheMap22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$504$proxy cannot be cast to class org.apache.openjpa.util.proxy.ProxyMap (org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$504$proxy is in unnamed module of loader org.apache.openjpa.util.ClassLoaderProxyService$ProxiesClassLoader @21f867e1; org.apache.openjpa.util.proxy.ProxyMap is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(proxy12);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(proxy19);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(proxy42);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(proxy49);
        org.junit.Assert.assertNotNull(proxy50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, (int) (short) 10, 1, (float) (short) 1, 97);
        String str6 = cacheMap5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        String str4 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CacheMap:{}::{}" + "'", str4, "CacheMap:{}::{}");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Set set2 = cacheMap0.keySet();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl4 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.getPinnedKeys();
        Class<?> wildcardClass7 = cacheMap5.getClass();
        org.apache.openjpa.util.Proxy proxy8 = proxyManagerImpl4.newDateProxy((Class) wildcardClass7);
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCustomProxy((Object) proxyManagerImpl4, true);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str14 = cacheMap13.toString();
        cacheMap13.setSoftReferenceSize(1);
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean20 = cacheMap19.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set22 = cacheMap21.entrySet();
        java.util.Collection collection23 = cacheMap21.values();
        cacheMap19.putAll((java.util.Map) cacheMap21, true);
        boolean boolean26 = cacheMap13.unpin((Object) cacheMap19);
        cacheMap19.readLock();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.Proxy proxy29 = proxyManagerImpl4.newCustomProxy((Object) cacheMap19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$508$proxy cannot be cast to class org.apache.openjpa.util.proxy.ProxyMap (org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$508$proxy is in unnamed module of loader org.apache.openjpa.util.ClassLoaderProxyService$ProxiesClassLoader @3b35f672; org.apache.openjpa.util.proxy.ProxyMap is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CacheMap:{}::{}" + "'", str14, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl2 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean3 = proxyManagerImpl2.getTrackChanges();
        boolean boolean4 = proxyManagerImpl2.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap7.setCacheSize(0);
        Class<?> wildcardClass10 = cacheMap7.getClass();
        java.util.TimeZone timeZone11 = null;
        org.apache.openjpa.util.Proxy proxy12 = proxyManagerImpl2.newCalendarProxy((Class) wildcardClass10, timeZone11);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass16 = cacheMap15.getClass();
        java.util.Comparator comparator17 = null;
        org.apache.openjpa.util.Proxy proxy19 = proxyManagerImpl0.newCollectionProxy((Class) wildcardClass10, (Class) wildcardClass16, comparator17, true);
        boolean boolean20 = proxyManagerImpl0.getTrackChanges();
        java.util.Collection collection21 = proxyManagerImpl0.getUnproxyable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(proxy12);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(proxy19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        boolean boolean4 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap7.setCacheSize(0);
        boolean boolean10 = cacheMap2.containsValue((Object) cacheMap7);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set12 = cacheMap11.entrySet();
        java.util.Collection collection13 = cacheMap11.values();
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str17 = cacheMap16.toString();
        java.util.Set set18 = cacheMap16.entrySet();
        boolean boolean19 = cacheMap11.containsKey((Object) set18);
        boolean boolean20 = cacheMap2.containsValue((Object) boolean19);
        cacheMap2.clear();
        cacheMap2.readLock();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CacheMap:{}::{}" + "'", str17, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        java.util.Set set6 = cacheMap2.entrySet();
        int int7 = cacheMap2.getCacheSize();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl8 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean9 = proxyManagerImpl8.getTrackChanges();
        boolean boolean10 = proxyManagerImpl8.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl11 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean12 = proxyManagerImpl11.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl13 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean14 = proxyManagerImpl13.getTrackChanges();
        boolean boolean15 = proxyManagerImpl13.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap18.setCacheSize(0);
        Class<?> wildcardClass21 = cacheMap18.getClass();
        java.util.TimeZone timeZone22 = null;
        org.apache.openjpa.util.Proxy proxy23 = proxyManagerImpl13.newCalendarProxy((Class) wildcardClass21, timeZone22);
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass27 = cacheMap26.getClass();
        java.util.Comparator comparator28 = null;
        org.apache.openjpa.util.Proxy proxy30 = proxyManagerImpl11.newCollectionProxy((Class) wildcardClass21, (Class) wildcardClass27, comparator28, true);
        org.apache.openjpa.util.Proxy proxy31 = proxyManagerImpl8.newDateProxy((Class) wildcardClass27);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl32 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean33 = proxyManagerImpl32.getTrackChanges();
        boolean boolean34 = proxyManagerImpl32.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl35 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean36 = proxyManagerImpl35.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl37 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean38 = proxyManagerImpl37.getTrackChanges();
        boolean boolean39 = proxyManagerImpl37.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap42.setCacheSize(0);
        Class<?> wildcardClass45 = cacheMap42.getClass();
        java.util.TimeZone timeZone46 = null;
        org.apache.openjpa.util.Proxy proxy47 = proxyManagerImpl37.newCalendarProxy((Class) wildcardClass45, timeZone46);
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass51 = cacheMap50.getClass();
        java.util.Comparator comparator52 = null;
        org.apache.openjpa.util.Proxy proxy54 = proxyManagerImpl35.newCollectionProxy((Class) wildcardClass45, (Class) wildcardClass51, comparator52, true);
        org.apache.openjpa.util.Proxy proxy55 = proxyManagerImpl32.newDateProxy((Class) wildcardClass51);
        org.apache.openjpa.util.Proxy proxy56 = proxyManagerImpl8.newDateProxy((Class) wildcardClass51);
        boolean boolean57 = cacheMap2.unpin((Object) proxy56);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(proxy23);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(proxy30);
        org.junit.Assert.assertNotNull(proxy31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(proxy47);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(proxy54);
        org.junit.Assert.assertNotNull(proxy55);
        org.junit.Assert.assertNotNull(proxy56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean2 = cacheMap0.containsKey((Object) 10.0f);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set4 = cacheMap3.entrySet();
        Object obj5 = cacheMap0.remove((Object) set4);
        cacheMap0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        boolean boolean6 = cacheMap4.isEmpty();
        boolean boolean8 = cacheMap4.unpin((Object) 10);
        cacheMap0.putAll((java.util.Map) cacheMap4);
        boolean boolean10 = cacheMap4.isLRU();
        String str11 = cacheMap4.toString();
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean15 = cacheMap13.pin((Object) "CacheMap:{}::{}");
        java.util.Set set16 = cacheMap13.getPinnedKeys();
        boolean boolean17 = cacheMap4.unpin((Object) cacheMap13);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap4.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CacheMap:{}::{}" + "'", str11, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getDelayCollectionLoading();
        java.util.Calendar calendar2 = null;
        java.util.Calendar calendar3 = proxyManagerImpl0.copyCalendar(calendar2);
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass7 = cacheMap6.getClass();
        org.apache.openjpa.util.Proxy proxy8 = proxyManagerImpl0.newDateProxy((Class) wildcardClass7);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl9 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean10 = proxyManagerImpl9.getTrackChanges();
        boolean boolean11 = proxyManagerImpl9.getDelayCollectionLoading();
        boolean boolean12 = proxyManagerImpl9.getTrackChanges();
        Class<?> wildcardClass13 = proxyManagerImpl9.getClass();
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap16.setCacheSize(0);
        Class<?> wildcardClass19 = cacheMap16.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl20 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean21 = proxyManagerImpl20.getDelayCollectionLoading();
        java.util.Calendar calendar22 = null;
        java.util.Calendar calendar23 = proxyManagerImpl20.copyCalendar(calendar22);
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass27 = cacheMap26.getClass();
        org.apache.openjpa.util.Proxy proxy28 = proxyManagerImpl20.newDateProxy((Class) wildcardClass27);
        java.util.Comparator comparator29 = null;
        org.apache.openjpa.util.Proxy proxy31 = proxyManagerImpl0.newMapProxy((Class) wildcardClass13, (Class) wildcardClass19, (Class) wildcardClass27, comparator29, false);
        java.util.Collection collection32 = proxyManagerImpl0.getUnproxyable();
        boolean boolean33 = proxyManagerImpl0.getAssertAllowedType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(calendar3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(calendar23);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(proxy28);
        org.junit.Assert.assertNotNull(proxy31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: LRUMap max size must be greater than 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl4 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.getPinnedKeys();
        Class<?> wildcardClass7 = cacheMap5.getClass();
        org.apache.openjpa.util.Proxy proxy8 = proxyManagerImpl4.newDateProxy((Class) wildcardClass7);
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCustomProxy((Object) proxyManagerImpl4, true);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set12 = cacheMap11.entrySet();
        java.util.Set set13 = cacheMap11.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map14 = proxyManagerImpl4.copyMap((java.util.Map) cacheMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$522$proxy cannot be cast to class org.apache.openjpa.util.proxy.ProxyMap (org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$522$proxy is in unnamed module of loader org.apache.openjpa.util.ClassLoaderProxyService$ProxiesClassLoader @3b663ff2; org.apache.openjpa.util.proxy.ProxyMap is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl3 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean4 = proxyManagerImpl3.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl5 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean6 = proxyManagerImpl5.getTrackChanges();
        boolean boolean7 = proxyManagerImpl5.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap10.setCacheSize(0);
        Class<?> wildcardClass13 = cacheMap10.getClass();
        java.util.TimeZone timeZone14 = null;
        org.apache.openjpa.util.Proxy proxy15 = proxyManagerImpl5.newCalendarProxy((Class) wildcardClass13, timeZone14);
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass19 = cacheMap18.getClass();
        java.util.Comparator comparator20 = null;
        org.apache.openjpa.util.Proxy proxy22 = proxyManagerImpl3.newCollectionProxy((Class) wildcardClass13, (Class) wildcardClass19, comparator20, true);
        org.apache.openjpa.util.Proxy proxy23 = proxyManagerImpl0.newDateProxy((Class) wildcardClass19);
        boolean boolean24 = proxyManagerImpl0.getAssertAllowedType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(proxy15);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(proxy22);
        org.junit.Assert.assertNotNull(proxy23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.entrySet();
        java.util.Collection collection6 = cacheMap4.values();
        cacheMap2.putAll((java.util.Map) cacheMap4, true);
        cacheMap4.setCacheSize((int) 'a');
        cacheMap4.setCacheSize((int) (byte) 0);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str16 = cacheMap15.toString();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean21 = cacheMap20.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set23 = cacheMap22.entrySet();
        java.util.Collection collection24 = cacheMap22.values();
        cacheMap20.putAll((java.util.Map) cacheMap22, true);
        cacheMap17.putAll((java.util.Map) cacheMap22, false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl29 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean30 = proxyManagerImpl29.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl31 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean32 = proxyManagerImpl31.getTrackChanges();
        boolean boolean33 = proxyManagerImpl31.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap36 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap36.setCacheSize(0);
        Class<?> wildcardClass39 = cacheMap36.getClass();
        java.util.TimeZone timeZone40 = null;
        org.apache.openjpa.util.Proxy proxy41 = proxyManagerImpl31.newCalendarProxy((Class) wildcardClass39, timeZone40);
        org.apache.openjpa.util.CacheMap cacheMap44 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass45 = cacheMap44.getClass();
        java.util.Comparator comparator46 = null;
        org.apache.openjpa.util.Proxy proxy48 = proxyManagerImpl29.newCollectionProxy((Class) wildcardClass39, (Class) wildcardClass45, comparator46, true);
        boolean boolean49 = cacheMap17.containsValue((Object) proxyManagerImpl29);
        Object obj50 = cacheMap4.put((Object) str16, (Object) cacheMap17);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl51 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean52 = proxyManagerImpl51.getTrackChanges();
        boolean boolean53 = proxyManagerImpl51.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl54 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap55 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set56 = cacheMap55.getPinnedKeys();
        Class<?> wildcardClass57 = cacheMap55.getClass();
        org.apache.openjpa.util.Proxy proxy58 = proxyManagerImpl54.newDateProxy((Class) wildcardClass57);
        java.util.TimeZone timeZone59 = null;
        org.apache.openjpa.util.Proxy proxy60 = proxyManagerImpl51.newCalendarProxy((Class) wildcardClass57, timeZone59);
        boolean boolean61 = proxyManagerImpl51.getTrackChanges();
        proxyManagerImpl51.setTrackChanges(true);
        java.util.Collection collection64 = proxyManagerImpl51.getUnproxyable();
        Object obj65 = cacheMap4.remove((Object) collection64);
        int int66 = cacheMap4.size();
        cacheMap4.readLock();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{}::{}" + "'", str16, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(proxy41);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(proxy48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(proxy58);
        org.junit.Assert.assertNotNull(proxy60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl3 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean4 = proxyManagerImpl3.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl5 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean6 = proxyManagerImpl5.getTrackChanges();
        boolean boolean7 = proxyManagerImpl5.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap10.setCacheSize(0);
        Class<?> wildcardClass13 = cacheMap10.getClass();
        java.util.TimeZone timeZone14 = null;
        org.apache.openjpa.util.Proxy proxy15 = proxyManagerImpl5.newCalendarProxy((Class) wildcardClass13, timeZone14);
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass19 = cacheMap18.getClass();
        java.util.Comparator comparator20 = null;
        org.apache.openjpa.util.Proxy proxy22 = proxyManagerImpl3.newCollectionProxy((Class) wildcardClass13, (Class) wildcardClass19, comparator20, true);
        org.apache.openjpa.util.Proxy proxy23 = proxyManagerImpl0.newDateProxy((Class) wildcardClass19);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl24 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean25 = proxyManagerImpl24.getTrackChanges();
        boolean boolean26 = proxyManagerImpl24.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl27 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean28 = proxyManagerImpl27.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl29 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean30 = proxyManagerImpl29.getTrackChanges();
        boolean boolean31 = proxyManagerImpl29.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap34.setCacheSize(0);
        Class<?> wildcardClass37 = cacheMap34.getClass();
        java.util.TimeZone timeZone38 = null;
        org.apache.openjpa.util.Proxy proxy39 = proxyManagerImpl29.newCalendarProxy((Class) wildcardClass37, timeZone38);
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass43 = cacheMap42.getClass();
        java.util.Comparator comparator44 = null;
        org.apache.openjpa.util.Proxy proxy46 = proxyManagerImpl27.newCollectionProxy((Class) wildcardClass37, (Class) wildcardClass43, comparator44, true);
        org.apache.openjpa.util.Proxy proxy47 = proxyManagerImpl24.newDateProxy((Class) wildcardClass43);
        org.apache.openjpa.util.Proxy proxy48 = proxyManagerImpl0.newDateProxy((Class) wildcardClass43);
        org.apache.openjpa.util.CacheMap cacheMap49 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap52 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean53 = cacheMap52.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap54 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set55 = cacheMap54.entrySet();
        java.util.Collection collection56 = cacheMap54.values();
        cacheMap52.putAll((java.util.Map) cacheMap54, true);
        cacheMap49.putAll((java.util.Map) cacheMap54, false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl61 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean62 = proxyManagerImpl61.getTrackChanges();
        boolean boolean63 = proxyManagerImpl61.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl64 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean65 = proxyManagerImpl64.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl66 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean67 = proxyManagerImpl66.getTrackChanges();
        boolean boolean68 = proxyManagerImpl66.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap71 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap71.setCacheSize(0);
        Class<?> wildcardClass74 = cacheMap71.getClass();
        java.util.TimeZone timeZone75 = null;
        org.apache.openjpa.util.Proxy proxy76 = proxyManagerImpl66.newCalendarProxy((Class) wildcardClass74, timeZone75);
        org.apache.openjpa.util.CacheMap cacheMap79 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass80 = cacheMap79.getClass();
        java.util.Comparator comparator81 = null;
        org.apache.openjpa.util.Proxy proxy83 = proxyManagerImpl64.newCollectionProxy((Class) wildcardClass74, (Class) wildcardClass80, comparator81, true);
        org.apache.openjpa.util.Proxy proxy84 = proxyManagerImpl61.newDateProxy((Class) wildcardClass80);
        boolean boolean85 = cacheMap49.containsValue((Object) proxyManagerImpl61);
        org.apache.openjpa.util.CacheMap cacheMap86 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set87 = cacheMap86.entrySet();
        java.util.Collection collection88 = cacheMap86.values();
        java.util.Set set89 = cacheMap86.entrySet();
        int int90 = cacheMap86.getSoftReferenceSize();
        Object obj92 = cacheMap86.remove((Object) (short) 1);
        boolean boolean93 = cacheMap49.pin((Object) cacheMap86);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map94 = proxyManagerImpl0.copyMap((java.util.Map) cacheMap86);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$533$proxy cannot be cast to class org.apache.openjpa.util.proxy.ProxyMap (org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$533$proxy is in unnamed module of loader org.apache.openjpa.util.ClassLoaderProxyService$ProxiesClassLoader @5ca866c2; org.apache.openjpa.util.proxy.ProxyMap is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(proxy15);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(proxy22);
        org.junit.Assert.assertNotNull(proxy23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(proxy39);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(proxy46);
        org.junit.Assert.assertNotNull(proxy47);
        org.junit.Assert.assertNotNull(proxy48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(proxy76);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(proxy83);
        org.junit.Assert.assertNotNull(proxy84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertNotNull(collection88);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str5 = cacheMap4.toString();
        cacheMap4.setSoftReferenceSize(1);
        java.util.Collection collection8 = cacheMap4.values();
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCustomProxy((Object) cacheMap4, false);
        java.util.Collection collection11 = proxyManagerImpl0.getUnproxyable();
        java.util.Date date12 = null;
        java.util.Date date13 = proxyManagerImpl0.copyDate(date12);
        Class<?> wildcardClass14 = proxyManagerImpl0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        boolean boolean2 = cacheMap0.isEmpty();
        cacheMap0.readLock();
        int int4 = cacheMap0.size();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, 10);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl4 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.getPinnedKeys();
        Class<?> wildcardClass7 = cacheMap5.getClass();
        org.apache.openjpa.util.Proxy proxy8 = proxyManagerImpl4.newDateProxy((Class) wildcardClass7);
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCustomProxy((Object) proxyManagerImpl4, true);
        boolean boolean11 = proxyManagerImpl4.getAssertAllowedType();
        boolean boolean12 = proxyManagerImpl4.getAssertAllowedType();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl13 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean14 = proxyManagerImpl13.getDelayCollectionLoading();
        java.util.Calendar calendar15 = null;
        java.util.Calendar calendar16 = proxyManagerImpl13.copyCalendar(calendar15);
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass20 = cacheMap19.getClass();
        org.apache.openjpa.util.Proxy proxy21 = proxyManagerImpl13.newDateProxy((Class) wildcardClass20);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl22 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean23 = proxyManagerImpl22.getTrackChanges();
        boolean boolean24 = proxyManagerImpl22.getDelayCollectionLoading();
        boolean boolean25 = proxyManagerImpl22.getTrackChanges();
        Class<?> wildcardClass26 = proxyManagerImpl22.getClass();
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap29.setCacheSize(0);
        Class<?> wildcardClass32 = cacheMap29.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl33 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean34 = proxyManagerImpl33.getDelayCollectionLoading();
        java.util.Calendar calendar35 = null;
        java.util.Calendar calendar36 = proxyManagerImpl33.copyCalendar(calendar35);
        org.apache.openjpa.util.CacheMap cacheMap39 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass40 = cacheMap39.getClass();
        org.apache.openjpa.util.Proxy proxy41 = proxyManagerImpl33.newDateProxy((Class) wildcardClass40);
        java.util.Comparator comparator42 = null;
        org.apache.openjpa.util.Proxy proxy44 = proxyManagerImpl13.newMapProxy((Class) wildcardClass26, (Class) wildcardClass32, (Class) wildcardClass40, comparator42, false);
        org.apache.openjpa.util.Proxy proxy45 = proxyManagerImpl4.newDateProxy((Class) wildcardClass32);
        Object obj46 = new Object();
        Object obj47 = proxyManagerImpl4.copyCustom(obj46);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(calendar16);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(proxy21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(calendar36);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(proxy41);
        org.junit.Assert.assertNotNull(proxy44);
        org.junit.Assert.assertNotNull(proxy45);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        boolean boolean2 = cacheMap0.isEmpty();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl3 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean4 = proxyManagerImpl3.getTrackChanges();
        boolean boolean5 = proxyManagerImpl3.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap8.setCacheSize(0);
        Class<?> wildcardClass11 = cacheMap8.getClass();
        java.util.TimeZone timeZone12 = null;
        org.apache.openjpa.util.Proxy proxy13 = proxyManagerImpl3.newCalendarProxy((Class) wildcardClass11, timeZone12);
        proxyManagerImpl3.setDelayCollectionLoading(false);
        boolean boolean16 = cacheMap0.unpin((Object) false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl17 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean18 = proxyManagerImpl17.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl19 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean20 = proxyManagerImpl19.getTrackChanges();
        boolean boolean21 = proxyManagerImpl19.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap24.setCacheSize(0);
        Class<?> wildcardClass27 = cacheMap24.getClass();
        java.util.TimeZone timeZone28 = null;
        org.apache.openjpa.util.Proxy proxy29 = proxyManagerImpl19.newCalendarProxy((Class) wildcardClass27, timeZone28);
        org.apache.openjpa.util.CacheMap cacheMap32 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass33 = cacheMap32.getClass();
        java.util.Comparator comparator34 = null;
        org.apache.openjpa.util.Proxy proxy36 = proxyManagerImpl17.newCollectionProxy((Class) wildcardClass27, (Class) wildcardClass33, comparator34, true);
        boolean boolean37 = proxyManagerImpl17.getTrackChanges();
        Object obj38 = cacheMap0.get((Object) proxyManagerImpl17);
        boolean boolean39 = proxyManagerImpl17.getAssertAllowedType();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(proxy13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(proxy29);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(proxy36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(false);
        int int2 = cacheMap1.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean6 = cacheMap5.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set8 = cacheMap7.entrySet();
        java.util.Collection collection9 = cacheMap7.values();
        cacheMap5.putAll((java.util.Map) cacheMap7, true);
        cacheMap7.setCacheSize((int) 'a');
        java.util.Set set14 = cacheMap7.entrySet();
        Object obj15 = cacheMap1.get((Object) cacheMap7);
        int int16 = cacheMap7.getCacheSize();
        String str17 = cacheMap7.toString();
        cacheMap7.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CacheMap:{}::{}" + "'", str17, "CacheMap:{}::{}");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap3.containsKey((Object) 10.0f);
        java.util.Map map6 = proxyManagerImpl0.copyMap((java.util.Map) cacheMap3);
        cacheMap3.clear();
        int int8 = cacheMap3.size();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.getSoftReferenceSize();
        Object obj6 = cacheMap0.remove((Object) (short) 1);
        java.util.Set set7 = cacheMap0.entrySet();
        java.util.Set set8 = cacheMap0.getPinnedKeys();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        proxyManagerImpl0.setUnproxyable("CacheMap:{}::{}");
        proxyManagerImpl0.setUnproxyable("");
        java.util.Collection collection7 = proxyManagerImpl0.getUnproxyable();
        proxyManagerImpl0.setDelayCollectionLoading(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.entrySet();
        java.util.Collection collection6 = cacheMap4.values();
        cacheMap2.putAll((java.util.Map) cacheMap4, true);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap2.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean4 = cacheMap3.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.entrySet();
        java.util.Collection collection7 = cacheMap5.values();
        cacheMap3.putAll((java.util.Map) cacheMap5, true);
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        cacheMap5.setCacheSize(1000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        boolean boolean3 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl4 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean5 = proxyManagerImpl4.getTrackChanges();
        boolean boolean6 = proxyManagerImpl4.getDelayCollectionLoading();
        boolean boolean7 = proxyManagerImpl4.getTrackChanges();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl8 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean9 = proxyManagerImpl8.getTrackChanges();
        boolean boolean10 = proxyManagerImpl8.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl11 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean12 = proxyManagerImpl11.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl13 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean14 = proxyManagerImpl13.getTrackChanges();
        boolean boolean15 = proxyManagerImpl13.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap18.setCacheSize(0);
        Class<?> wildcardClass21 = cacheMap18.getClass();
        java.util.TimeZone timeZone22 = null;
        org.apache.openjpa.util.Proxy proxy23 = proxyManagerImpl13.newCalendarProxy((Class) wildcardClass21, timeZone22);
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass27 = cacheMap26.getClass();
        java.util.Comparator comparator28 = null;
        org.apache.openjpa.util.Proxy proxy30 = proxyManagerImpl11.newCollectionProxy((Class) wildcardClass21, (Class) wildcardClass27, comparator28, true);
        org.apache.openjpa.util.Proxy proxy31 = proxyManagerImpl8.newDateProxy((Class) wildcardClass27);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl32 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean33 = proxyManagerImpl32.getTrackChanges();
        boolean boolean34 = proxyManagerImpl32.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl35 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean36 = proxyManagerImpl35.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl37 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean38 = proxyManagerImpl37.getTrackChanges();
        boolean boolean39 = proxyManagerImpl37.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap42.setCacheSize(0);
        Class<?> wildcardClass45 = cacheMap42.getClass();
        java.util.TimeZone timeZone46 = null;
        org.apache.openjpa.util.Proxy proxy47 = proxyManagerImpl37.newCalendarProxy((Class) wildcardClass45, timeZone46);
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass51 = cacheMap50.getClass();
        java.util.Comparator comparator52 = null;
        org.apache.openjpa.util.Proxy proxy54 = proxyManagerImpl35.newCollectionProxy((Class) wildcardClass45, (Class) wildcardClass51, comparator52, true);
        org.apache.openjpa.util.Proxy proxy55 = proxyManagerImpl32.newDateProxy((Class) wildcardClass51);
        org.apache.openjpa.util.Proxy proxy56 = proxyManagerImpl8.newDateProxy((Class) wildcardClass51);
        java.util.TimeZone timeZone57 = null;
        org.apache.openjpa.util.Proxy proxy58 = proxyManagerImpl4.newCalendarProxy((Class) wildcardClass51, timeZone57);
        // The following exception was thrown during execution in test generation
        try {
            Object obj59 = proxyManagerImpl0.copyArray((Object) wildcardClass51);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UnsupportedException; message: Unable to copy array: Argument is not an array.");
        } catch (org.apache.openjpa.util.UnsupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(proxy23);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(proxy30);
        org.junit.Assert.assertNotNull(proxy31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(proxy47);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(proxy54);
        org.junit.Assert.assertNotNull(proxy55);
        org.junit.Assert.assertNotNull(proxy56);
        org.junit.Assert.assertNotNull(proxy58);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        boolean boolean3 = proxyManagerImpl0.getTrackChanges();
        boolean boolean4 = proxyManagerImpl0.getAssertAllowedType();
        boolean boolean5 = proxyManagerImpl0.getDelayCollectionLoading();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        cacheMap2.readLock();
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean10 = cacheMap9.isLRU();
        boolean boolean11 = cacheMap9.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str15 = cacheMap14.toString();
        cacheMap14.setSoftReferenceSize(1);
        boolean boolean19 = cacheMap14.containsValue((Object) 100.0f);
        boolean boolean20 = cacheMap9.unpin((Object) cacheMap14);
        boolean boolean21 = cacheMap9.isLRU();
        cacheMap2.putAll((java.util.Map) cacheMap9, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CacheMap:{}::{}" + "'", str15, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean4 = cacheMap3.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.entrySet();
        java.util.Collection collection7 = cacheMap5.values();
        cacheMap3.putAll((java.util.Map) cacheMap5, true);
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl12 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean13 = cacheMap0.unpin((Object) proxyManagerImpl12);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl14 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl14.setTrackChanges(false);
        java.util.Collection collection17 = proxyManagerImpl14.getUnproxyable();
        java.util.Collection collection18 = proxyManagerImpl12.copyCollection(collection17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        boolean boolean3 = proxyManagerImpl0.getTrackChanges();
        boolean boolean4 = proxyManagerImpl0.getAssertAllowedType();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.getPinnedKeys();
        Class<?> wildcardClass7 = cacheMap5.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl8 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean9 = proxyManagerImpl8.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl10 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean11 = proxyManagerImpl10.getTrackChanges();
        boolean boolean12 = proxyManagerImpl10.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap15.setCacheSize(0);
        Class<?> wildcardClass18 = cacheMap15.getClass();
        java.util.TimeZone timeZone19 = null;
        org.apache.openjpa.util.Proxy proxy20 = proxyManagerImpl10.newCalendarProxy((Class) wildcardClass18, timeZone19);
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass24 = cacheMap23.getClass();
        java.util.Comparator comparator25 = null;
        org.apache.openjpa.util.Proxy proxy27 = proxyManagerImpl8.newCollectionProxy((Class) wildcardClass18, (Class) wildcardClass24, comparator25, true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl28 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean29 = proxyManagerImpl28.getTrackChanges();
        boolean boolean30 = proxyManagerImpl28.getDelayCollectionLoading();
        boolean boolean31 = proxyManagerImpl28.getTrackChanges();
        Class<?> wildcardClass32 = proxyManagerImpl28.getClass();
        java.util.Comparator comparator33 = null;
        org.apache.openjpa.util.Proxy proxy35 = proxyManagerImpl0.newMapProxy((Class) wildcardClass7, (Class) wildcardClass24, (Class) wildcardClass32, comparator33, false);
        proxyManagerImpl0.setTrackChanges(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(proxy20);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(proxy27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(proxy35);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        boolean boolean7 = cacheMap2.containsValue((Object) 100.0f);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean11 = cacheMap10.isLRU();
        boolean boolean12 = cacheMap10.isLRU();
        cacheMap2.putAll((java.util.Map) cacheMap10);
        java.util.Set set14 = cacheMap2.entrySet();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setAssertAllowedType(true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl4 = new org.apache.openjpa.util.ProxyManagerImpl();
        java.util.Date date5 = null;
        java.util.Date date6 = proxyManagerImpl4.copyDate(date5);
        // The following exception was thrown during execution in test generation
        try {
            Object obj7 = proxyManagerImpl0.copyArray((Object) proxyManagerImpl4);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UnsupportedException; message: Unable to copy array: Argument is not an array.");
        } catch (org.apache.openjpa.util.UnsupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean9 = cacheMap8.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set11 = cacheMap10.entrySet();
        java.util.Collection collection12 = cacheMap10.values();
        cacheMap8.putAll((java.util.Map) cacheMap10, true);
        boolean boolean15 = cacheMap2.unpin((Object) cacheMap8);
        java.util.Set set16 = cacheMap2.keySet();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl2 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl2.setTrackChanges(false);
        java.util.Collection collection5 = proxyManagerImpl2.getUnproxyable();
        boolean boolean6 = cacheMap0.containsKey((Object) collection5);
        cacheMap0.clear();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getDelayCollectionLoading();
        java.util.Calendar calendar2 = null;
        java.util.Calendar calendar3 = proxyManagerImpl0.copyCalendar(calendar2);
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass7 = cacheMap6.getClass();
        org.apache.openjpa.util.Proxy proxy8 = proxyManagerImpl0.newDateProxy((Class) wildcardClass7);
        proxyManagerImpl0.setUnproxyable("CacheMap:{CacheMap:{}::{}=-1}::{}");
        java.util.Collection collection11 = proxyManagerImpl0.getUnproxyable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(calendar3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        boolean boolean2 = cacheMap0.isEmpty();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl3 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean4 = proxyManagerImpl3.getTrackChanges();
        boolean boolean5 = proxyManagerImpl3.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap8.setCacheSize(0);
        Class<?> wildcardClass11 = cacheMap8.getClass();
        java.util.TimeZone timeZone12 = null;
        org.apache.openjpa.util.Proxy proxy13 = proxyManagerImpl3.newCalendarProxy((Class) wildcardClass11, timeZone12);
        proxyManagerImpl3.setDelayCollectionLoading(false);
        boolean boolean16 = cacheMap0.unpin((Object) false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl17 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean18 = proxyManagerImpl17.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl19 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean20 = proxyManagerImpl19.getTrackChanges();
        boolean boolean21 = proxyManagerImpl19.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap24.setCacheSize(0);
        Class<?> wildcardClass27 = cacheMap24.getClass();
        java.util.TimeZone timeZone28 = null;
        org.apache.openjpa.util.Proxy proxy29 = proxyManagerImpl19.newCalendarProxy((Class) wildcardClass27, timeZone28);
        org.apache.openjpa.util.CacheMap cacheMap32 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass33 = cacheMap32.getClass();
        java.util.Comparator comparator34 = null;
        org.apache.openjpa.util.Proxy proxy36 = proxyManagerImpl17.newCollectionProxy((Class) wildcardClass27, (Class) wildcardClass33, comparator34, true);
        boolean boolean37 = proxyManagerImpl17.getTrackChanges();
        Object obj38 = cacheMap0.get((Object) proxyManagerImpl17);
        int int39 = cacheMap0.getCacheSize();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(proxy13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(proxy29);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(proxy36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1000 + "'", int39 == 1000);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.getSoftReferenceSize();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl5 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean6 = proxyManagerImpl5.getTrackChanges();
        java.util.Calendar calendar7 = null;
        java.util.Calendar calendar8 = proxyManagerImpl5.copyCalendar(calendar7);
        Object obj9 = cacheMap0.remove((Object) proxyManagerImpl5);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl10 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set12 = cacheMap11.getPinnedKeys();
        Class<?> wildcardClass13 = cacheMap11.getClass();
        org.apache.openjpa.util.Proxy proxy14 = proxyManagerImpl10.newDateProxy((Class) wildcardClass13);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl15 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean16 = proxyManagerImpl15.getTrackChanges();
        boolean boolean17 = proxyManagerImpl15.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap20.setCacheSize(0);
        Class<?> wildcardClass23 = cacheMap20.getClass();
        java.util.TimeZone timeZone24 = null;
        org.apache.openjpa.util.Proxy proxy25 = proxyManagerImpl15.newCalendarProxy((Class) wildcardClass23, timeZone24);
        org.apache.openjpa.util.Proxy proxy26 = proxyManagerImpl10.newDateProxy((Class) wildcardClass23);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl27 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean28 = proxyManagerImpl27.getTrackChanges();
        boolean boolean29 = proxyManagerImpl27.getDelayCollectionLoading();
        boolean boolean30 = proxyManagerImpl27.getTrackChanges();
        Class<?> wildcardClass31 = proxyManagerImpl27.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl32 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean33 = proxyManagerImpl32.getTrackChanges();
        boolean boolean34 = proxyManagerImpl32.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl35 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean36 = proxyManagerImpl35.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl37 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean38 = proxyManagerImpl37.getTrackChanges();
        boolean boolean39 = proxyManagerImpl37.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap42.setCacheSize(0);
        Class<?> wildcardClass45 = cacheMap42.getClass();
        java.util.TimeZone timeZone46 = null;
        org.apache.openjpa.util.Proxy proxy47 = proxyManagerImpl37.newCalendarProxy((Class) wildcardClass45, timeZone46);
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass51 = cacheMap50.getClass();
        java.util.Comparator comparator52 = null;
        org.apache.openjpa.util.Proxy proxy54 = proxyManagerImpl35.newCollectionProxy((Class) wildcardClass45, (Class) wildcardClass51, comparator52, true);
        org.apache.openjpa.util.Proxy proxy55 = proxyManagerImpl32.newDateProxy((Class) wildcardClass51);
        java.util.Comparator comparator56 = null;
        org.apache.openjpa.util.Proxy proxy58 = proxyManagerImpl10.newCollectionProxy((Class) wildcardClass31, (Class) wildcardClass51, comparator56, true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl59 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap60 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set61 = cacheMap60.getPinnedKeys();
        Class<?> wildcardClass62 = cacheMap60.getClass();
        org.apache.openjpa.util.Proxy proxy63 = proxyManagerImpl59.newDateProxy((Class) wildcardClass62);
        Object obj65 = proxyManagerImpl59.copyCustom((Object) true);
        java.util.Collection collection66 = proxyManagerImpl59.getUnproxyable();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl67 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean68 = proxyManagerImpl67.getTrackChanges();
        boolean boolean69 = proxyManagerImpl67.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl70 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean71 = proxyManagerImpl70.getTrackChanges();
        boolean boolean72 = proxyManagerImpl70.getDelayCollectionLoading();
        boolean boolean73 = proxyManagerImpl70.getTrackChanges();
        Class<?> wildcardClass74 = proxyManagerImpl70.getClass();
        org.apache.openjpa.util.Proxy proxy75 = proxyManagerImpl67.newDateProxy((Class) wildcardClass74);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl76 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean77 = proxyManagerImpl76.getDelayCollectionLoading();
        java.util.Calendar calendar78 = null;
        java.util.Calendar calendar79 = proxyManagerImpl76.copyCalendar(calendar78);
        org.apache.openjpa.util.CacheMap cacheMap82 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass83 = cacheMap82.getClass();
        org.apache.openjpa.util.Proxy proxy84 = proxyManagerImpl76.newDateProxy((Class) wildcardClass83);
        Object obj85 = new Object();
        Class<?> wildcardClass86 = obj85.getClass();
        java.util.Comparator comparator87 = null;
        org.apache.openjpa.util.Proxy proxy89 = proxyManagerImpl59.newMapProxy((Class) wildcardClass74, (Class) wildcardClass83, (Class) wildcardClass86, comparator87, true);
        java.util.TimeZone timeZone90 = null;
        org.apache.openjpa.util.Proxy proxy91 = proxyManagerImpl10.newCalendarProxy((Class) wildcardClass86, timeZone90);
        org.apache.openjpa.util.Proxy proxy92 = proxyManagerImpl5.newDateProxy((Class) wildcardClass86);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(calendar8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(proxy14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(proxy25);
        org.junit.Assert.assertNotNull(proxy26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(proxy47);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(proxy54);
        org.junit.Assert.assertNotNull(proxy55);
        org.junit.Assert.assertNotNull(proxy58);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(proxy63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(proxy75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(calendar79);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(proxy84);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(proxy89);
        org.junit.Assert.assertNotNull(proxy91);
        org.junit.Assert.assertNotNull(proxy92);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean5 = cacheMap3.pin((Object) "CacheMap:{}::{}");
        boolean boolean6 = cacheMap0.pin((Object) "CacheMap:{}::{}");
        String str7 = cacheMap0.toString();
        String str8 = cacheMap0.toString();
        java.util.Set set9 = cacheMap0.entrySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CacheMap:{}::{}" + "'", str7, "CacheMap:{}::{}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, 97);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.getSoftReferenceSize();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl5 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean6 = proxyManagerImpl5.getTrackChanges();
        java.util.Calendar calendar7 = null;
        java.util.Calendar calendar8 = proxyManagerImpl5.copyCalendar(calendar7);
        Object obj9 = cacheMap0.remove((Object) proxyManagerImpl5);
        proxyManagerImpl5.setAssertAllowedType(false);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(calendar8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getTrackChanges();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        java.util.Calendar calendar2 = null;
        java.util.Calendar calendar3 = proxyManagerImpl0.copyCalendar(calendar2);
        java.util.Date date4 = null;
        java.util.Date date5 = proxyManagerImpl0.copyDate(date4);
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set7 = cacheMap6.entrySet();
        java.util.Collection collection8 = cacheMap6.values();
        java.util.Set set9 = cacheMap6.entrySet();
        int int10 = cacheMap6.getSoftReferenceSize();
        Object obj12 = cacheMap6.remove((Object) (short) 1);
        java.util.Set set13 = cacheMap6.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            Object obj14 = proxyManagerImpl0.copyArray((Object) cacheMap6);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UnsupportedException; message: Unable to copy array: Argument is not an array.");
        } catch (org.apache.openjpa.util.UnsupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(calendar3);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        boolean boolean7 = cacheMap2.containsValue((Object) 100.0f);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean11 = cacheMap10.isLRU();
        boolean boolean12 = cacheMap10.isLRU();
        cacheMap2.putAll((java.util.Map) cacheMap10);
        cacheMap2.writeLock();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            cacheMap2.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.entrySet();
        java.util.Collection collection6 = cacheMap4.values();
        cacheMap2.putAll((java.util.Map) cacheMap4, true);
        cacheMap4.setCacheSize((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str5 = cacheMap4.toString();
        boolean boolean6 = cacheMap4.isEmpty();
        boolean boolean7 = cacheMap0.containsValue((Object) boolean6);
        String str8 = cacheMap0.toString();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        String str4 = cacheMap2.toString();
        java.util.Set set5 = cacheMap2.entrySet();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CacheMap:{}::{}" + "'", str4, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean3 = cacheMap1.pin((Object) "CacheMap:{}::{}");
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean7 = cacheMap6.isLRU();
        boolean boolean8 = cacheMap6.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str12 = cacheMap11.toString();
        cacheMap11.setSoftReferenceSize(1);
        boolean boolean16 = cacheMap11.containsValue((Object) 100.0f);
        boolean boolean17 = cacheMap6.unpin((Object) cacheMap11);
        boolean boolean18 = cacheMap6.isLRU();
        java.util.Set set19 = cacheMap6.getPinnedKeys();
        boolean boolean20 = cacheMap1.containsKey((Object) cacheMap6);
        java.util.Set set21 = cacheMap6.keySet();
        int int22 = cacheMap6.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CacheMap:{}::{}" + "'", str12, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean4 = cacheMap3.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.entrySet();
        java.util.Collection collection7 = cacheMap5.values();
        cacheMap3.putAll((java.util.Map) cacheMap5, true);
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl12 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean13 = proxyManagerImpl12.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl14 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean15 = proxyManagerImpl14.getTrackChanges();
        boolean boolean16 = proxyManagerImpl14.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap19.setCacheSize(0);
        Class<?> wildcardClass22 = cacheMap19.getClass();
        java.util.TimeZone timeZone23 = null;
        org.apache.openjpa.util.Proxy proxy24 = proxyManagerImpl14.newCalendarProxy((Class) wildcardClass22, timeZone23);
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass28 = cacheMap27.getClass();
        java.util.Comparator comparator29 = null;
        org.apache.openjpa.util.Proxy proxy31 = proxyManagerImpl12.newCollectionProxy((Class) wildcardClass22, (Class) wildcardClass28, comparator29, true);
        boolean boolean32 = cacheMap0.containsValue((Object) proxyManagerImpl12);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl33 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean34 = proxyManagerImpl33.getTrackChanges();
        boolean boolean35 = proxyManagerImpl33.getDelayCollectionLoading();
        boolean boolean36 = proxyManagerImpl33.getTrackChanges();
        Class<?> wildcardClass37 = proxyManagerImpl33.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl38 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean39 = proxyManagerImpl38.getTrackChanges();
        boolean boolean40 = proxyManagerImpl38.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl41 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean42 = proxyManagerImpl41.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl43 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean44 = proxyManagerImpl43.getTrackChanges();
        boolean boolean45 = proxyManagerImpl43.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap48 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap48.setCacheSize(0);
        Class<?> wildcardClass51 = cacheMap48.getClass();
        java.util.TimeZone timeZone52 = null;
        org.apache.openjpa.util.Proxy proxy53 = proxyManagerImpl43.newCalendarProxy((Class) wildcardClass51, timeZone52);
        org.apache.openjpa.util.CacheMap cacheMap56 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass57 = cacheMap56.getClass();
        java.util.Comparator comparator58 = null;
        org.apache.openjpa.util.Proxy proxy60 = proxyManagerImpl41.newCollectionProxy((Class) wildcardClass51, (Class) wildcardClass57, comparator58, true);
        org.apache.openjpa.util.Proxy proxy61 = proxyManagerImpl38.newDateProxy((Class) wildcardClass57);
        java.util.Comparator comparator62 = null;
        org.apache.openjpa.util.Proxy proxy64 = proxyManagerImpl12.newCollectionProxy((Class) wildcardClass37, (Class) wildcardClass57, comparator62, false);
        java.util.Collection collection65 = proxyManagerImpl12.getUnproxyable();
        org.apache.openjpa.util.CacheMap cacheMap66 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap69 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean70 = cacheMap69.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap71 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set72 = cacheMap71.entrySet();
        java.util.Collection collection73 = cacheMap71.values();
        cacheMap69.putAll((java.util.Map) cacheMap71, true);
        cacheMap66.putAll((java.util.Map) cacheMap71, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.Proxy proxy79 = proxyManagerImpl12.newCustomProxy((Object) cacheMap71, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$581$proxy cannot be cast to class org.apache.openjpa.util.proxy.ProxyMap (org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$581$proxy is in unnamed module of loader org.apache.openjpa.util.ClassLoaderProxyService$ProxiesClassLoader @755d6b8a; org.apache.openjpa.util.proxy.ProxyMap is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(proxy24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(proxy31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(proxy53);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(proxy60);
        org.junit.Assert.assertNotNull(proxy61);
        org.junit.Assert.assertNotNull(proxy64);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNotNull(collection73);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        boolean boolean2 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str6 = cacheMap5.toString();
        boolean boolean7 = cacheMap5.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set9 = cacheMap8.entrySet();
        java.util.Collection collection10 = cacheMap8.values();
        java.util.Set set11 = cacheMap8.entrySet();
        cacheMap5.putAll((java.util.Map) cacheMap8, true);
        boolean boolean14 = cacheMap0.unpin((Object) true);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set16 = cacheMap15.entrySet();
        boolean boolean17 = cacheMap0.containsValue((Object) cacheMap15);
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set19 = cacheMap18.entrySet();
        java.util.Set set20 = cacheMap18.keySet();
        boolean boolean21 = cacheMap0.pin((Object) set20);
        int int22 = cacheMap0.size();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        boolean boolean6 = cacheMap4.isEmpty();
        boolean boolean8 = cacheMap4.unpin((Object) 10);
        cacheMap0.putAll((java.util.Map) cacheMap4);
        cacheMap4.setCacheSize((int) (byte) -1);
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set13 = cacheMap12.getPinnedKeys();
        boolean boolean14 = cacheMap12.isEmpty();
        boolean boolean16 = cacheMap12.unpin((Object) 10);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set18 = cacheMap17.entrySet();
        java.util.Collection collection19 = cacheMap17.values();
        java.util.Set set20 = cacheMap17.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set22 = cacheMap21.getPinnedKeys();
        boolean boolean23 = cacheMap21.isEmpty();
        boolean boolean25 = cacheMap21.unpin((Object) 10);
        cacheMap17.putAll((java.util.Map) cacheMap21);
        java.util.Set set27 = cacheMap17.keySet();
        boolean boolean28 = cacheMap12.pin((Object) set27);
        boolean boolean29 = cacheMap4.unpin((Object) cacheMap12);
        cacheMap4.setSoftReferenceSize(100);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        Class<?> wildcardClass3 = cacheMap1.getClass();
        org.apache.openjpa.util.Proxy proxy4 = proxyManagerImpl0.newDateProxy((Class) wildcardClass3);
        Object obj6 = proxyManagerImpl0.copyCustom((Object) true);
        java.util.Date date7 = null;
        java.util.Date date8 = proxyManagerImpl0.copyDate(date7);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set10 = cacheMap9.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection11 = proxyManagerImpl0.copyCollection((java.util.Collection) set10);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.GeneralException; message: org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$EntrySet$588$proxy");
        } catch (org.apache.openjpa.util.GeneralException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        boolean boolean6 = cacheMap4.isEmpty();
        boolean boolean8 = cacheMap4.unpin((Object) 10);
        cacheMap0.putAll((java.util.Map) cacheMap4);
        cacheMap4.clear();
        cacheMap4.setCacheSize((int) (short) 10);
        java.util.Set set13 = cacheMap4.entrySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean9 = cacheMap8.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set11 = cacheMap10.entrySet();
        java.util.Collection collection12 = cacheMap10.values();
        cacheMap8.putAll((java.util.Map) cacheMap10, true);
        boolean boolean15 = cacheMap2.unpin((Object) cacheMap8);
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set17 = cacheMap16.getPinnedKeys();
        boolean boolean18 = cacheMap16.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str22 = cacheMap21.toString();
        boolean boolean23 = cacheMap21.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set25 = cacheMap24.entrySet();
        java.util.Collection collection26 = cacheMap24.values();
        java.util.Set set27 = cacheMap24.entrySet();
        cacheMap21.putAll((java.util.Map) cacheMap24, true);
        boolean boolean30 = cacheMap16.unpin((Object) true);
        boolean boolean31 = cacheMap2.unpin((Object) cacheMap16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CacheMap:{}::{}" + "'", str22, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.entrySet();
        java.util.Collection collection6 = cacheMap4.values();
        java.util.Set set7 = cacheMap4.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set9 = cacheMap8.getPinnedKeys();
        boolean boolean10 = cacheMap8.isEmpty();
        boolean boolean12 = cacheMap8.unpin((Object) 10);
        cacheMap4.putAll((java.util.Map) cacheMap8);
        java.util.Set set14 = cacheMap4.keySet();
        java.util.Set set15 = cacheMap4.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection16 = proxyManagerImpl0.copyCollection((java.util.Collection) set15);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.GeneralException; message: org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$KeySet$591$proxy");
        } catch (org.apache.openjpa.util.GeneralException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl4 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.getPinnedKeys();
        Class<?> wildcardClass7 = cacheMap5.getClass();
        org.apache.openjpa.util.Proxy proxy8 = proxyManagerImpl4.newDateProxy((Class) wildcardClass7);
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCustomProxy((Object) proxyManagerImpl4, true);
        boolean boolean11 = proxyManagerImpl4.getAssertAllowedType();
        boolean boolean12 = proxyManagerImpl4.getAssertAllowedType();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl13 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set15 = cacheMap14.getPinnedKeys();
        Class<?> wildcardClass16 = cacheMap14.getClass();
        org.apache.openjpa.util.Proxy proxy17 = proxyManagerImpl13.newDateProxy((Class) wildcardClass16);
        Object obj19 = proxyManagerImpl13.copyCustom((Object) true);
        java.util.Date date20 = null;
        java.util.Date date21 = proxyManagerImpl13.copyDate(date20);
        Object obj22 = proxyManagerImpl4.copyArray((Object) date21);
        boolean boolean23 = proxyManagerImpl4.getDelayCollectionLoading();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(proxy17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str5 = cacheMap4.toString();
        cacheMap4.setSoftReferenceSize(1);
        java.util.Collection collection8 = cacheMap4.values();
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCustomProxy((Object) cacheMap4, false);
        java.util.Collection collection11 = proxyManagerImpl0.getUnproxyable();
        java.util.Date date12 = null;
        java.util.Date date13 = proxyManagerImpl0.copyDate(date12);
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean17 = cacheMap16.isLRU();
        boolean boolean18 = cacheMap16.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str22 = cacheMap21.toString();
        cacheMap21.setSoftReferenceSize(1);
        boolean boolean26 = cacheMap21.containsValue((Object) 100.0f);
        boolean boolean27 = cacheMap16.unpin((Object) cacheMap21);
        java.util.Map map28 = proxyManagerImpl0.copyMap((java.util.Map) cacheMap16);
        cacheMap16.setCacheSize(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CacheMap:{}::{}" + "'", str22, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        boolean boolean2 = cacheMap0.isEmpty();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl3 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean4 = proxyManagerImpl3.getTrackChanges();
        boolean boolean5 = proxyManagerImpl3.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap8.setCacheSize(0);
        Class<?> wildcardClass11 = cacheMap8.getClass();
        java.util.TimeZone timeZone12 = null;
        org.apache.openjpa.util.Proxy proxy13 = proxyManagerImpl3.newCalendarProxy((Class) wildcardClass11, timeZone12);
        proxyManagerImpl3.setDelayCollectionLoading(false);
        boolean boolean16 = cacheMap0.unpin((Object) false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl17 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean18 = proxyManagerImpl17.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl19 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean20 = proxyManagerImpl19.getTrackChanges();
        boolean boolean21 = proxyManagerImpl19.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap24.setCacheSize(0);
        Class<?> wildcardClass27 = cacheMap24.getClass();
        java.util.TimeZone timeZone28 = null;
        org.apache.openjpa.util.Proxy proxy29 = proxyManagerImpl19.newCalendarProxy((Class) wildcardClass27, timeZone28);
        org.apache.openjpa.util.CacheMap cacheMap32 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass33 = cacheMap32.getClass();
        java.util.Comparator comparator34 = null;
        org.apache.openjpa.util.Proxy proxy36 = proxyManagerImpl17.newCollectionProxy((Class) wildcardClass27, (Class) wildcardClass33, comparator34, true);
        boolean boolean37 = proxyManagerImpl17.getTrackChanges();
        Object obj38 = cacheMap0.get((Object) proxyManagerImpl17);
        proxyManagerImpl17.setTrackChanges(false);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(proxy13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(proxy29);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(proxy36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.entrySet();
        java.util.Collection collection6 = cacheMap4.values();
        cacheMap2.putAll((java.util.Map) cacheMap4, true);
        cacheMap4.setCacheSize((int) 'a');
        int int11 = cacheMap4.getSoftReferenceSize();
        boolean boolean12 = cacheMap4.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str16 = cacheMap15.toString();
        cacheMap15.setSoftReferenceSize(1);
        cacheMap4.putAll((java.util.Map) cacheMap15, false);
        java.util.Set set21 = cacheMap4.entrySet();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{}::{}" + "'", str16, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.getSoftReferenceSize();
        Object obj6 = cacheMap0.remove((Object) (short) 1);
        java.util.Set set7 = cacheMap0.entrySet();
        boolean boolean8 = cacheMap0.isLRU();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str5 = cacheMap4.toString();
        cacheMap4.setSoftReferenceSize(1);
        java.util.Collection collection8 = cacheMap4.values();
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCustomProxy((Object) cacheMap4, false);
        proxyManagerImpl0.setTrackChanges(true);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean16 = cacheMap15.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set18 = cacheMap17.entrySet();
        java.util.Collection collection19 = cacheMap17.values();
        cacheMap15.putAll((java.util.Map) cacheMap17, true);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set23 = cacheMap22.entrySet();
        java.util.Collection collection24 = cacheMap22.values();
        java.util.Set set25 = cacheMap22.entrySet();
        boolean boolean26 = cacheMap17.pin((Object) cacheMap22);
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean30 = cacheMap29.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set32 = cacheMap31.entrySet();
        java.util.Collection collection33 = cacheMap31.values();
        cacheMap29.putAll((java.util.Map) cacheMap31, true);
        cacheMap31.setCacheSize((int) 'a');
        java.util.Set set38 = cacheMap31.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap41 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean42 = cacheMap41.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap43 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set44 = cacheMap43.entrySet();
        java.util.Collection collection45 = cacheMap43.values();
        cacheMap41.putAll((java.util.Map) cacheMap43, true);
        Object obj48 = cacheMap17.put((Object) set38, (Object) cacheMap43);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection49 = proxyManagerImpl0.copyCollection((java.util.Collection) set38);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.GeneralException; message: org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$EntrySet$607$proxy");
        } catch (org.apache.openjpa.util.GeneralException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        proxyManagerImpl0.setUnproxyable("");
        proxyManagerImpl0.setUnproxyable("");
        proxyManagerImpl0.setDelayCollectionLoading(true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl9 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean10 = proxyManagerImpl9.getTrackChanges();
        boolean boolean11 = proxyManagerImpl9.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl12 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set14 = cacheMap13.getPinnedKeys();
        Class<?> wildcardClass15 = cacheMap13.getClass();
        org.apache.openjpa.util.Proxy proxy16 = proxyManagerImpl12.newDateProxy((Class) wildcardClass15);
        java.util.TimeZone timeZone17 = null;
        org.apache.openjpa.util.Proxy proxy18 = proxyManagerImpl9.newCalendarProxy((Class) wildcardClass15, timeZone17);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl19 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean20 = proxyManagerImpl19.getTrackChanges();
        boolean boolean21 = proxyManagerImpl19.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap24.setCacheSize(0);
        Class<?> wildcardClass27 = cacheMap24.getClass();
        java.util.TimeZone timeZone28 = null;
        org.apache.openjpa.util.Proxy proxy29 = proxyManagerImpl19.newCalendarProxy((Class) wildcardClass27, timeZone28);
        java.util.Comparator comparator30 = null;
        org.apache.openjpa.util.Proxy proxy32 = proxyManagerImpl0.newCollectionProxy((Class) wildcardClass15, (Class) wildcardClass27, comparator30, true);
        proxyManagerImpl0.setTrackChanges(false);
        java.util.Collection collection35 = proxyManagerImpl0.getUnproxyable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(proxy16);
        org.junit.Assert.assertNotNull(proxy18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(proxy29);
        org.junit.Assert.assertNotNull(proxy32);
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap3.containsKey((Object) 10.0f);
        java.util.Map map6 = proxyManagerImpl0.copyMap((java.util.Map) cacheMap3);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean10 = cacheMap8.pin((Object) "CacheMap:{}::{}");
        int int11 = cacheMap8.getSoftReferenceSize();
        java.util.Collection collection12 = cacheMap8.values();
        cacheMap3.putAll((java.util.Map) cacheMap8, true);
        boolean boolean15 = cacheMap8.isLRU();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap8.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        cacheMap2.clear();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl5 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean6 = proxyManagerImpl5.getDelayCollectionLoading();
        java.util.Calendar calendar7 = null;
        java.util.Calendar calendar8 = proxyManagerImpl5.copyCalendar(calendar7);
        boolean boolean9 = cacheMap2.unpin((Object) proxyManagerImpl5);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean13 = cacheMap11.pin((Object) "CacheMap:{}::{}");
        int int14 = cacheMap11.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean18 = cacheMap17.isLRU();
        boolean boolean19 = cacheMap17.isLRU();
        java.util.Set set20 = cacheMap17.getPinnedKeys();
        cacheMap11.putAll((java.util.Map) cacheMap17);
        java.util.Set set22 = cacheMap11.getPinnedKeys();
        boolean boolean23 = cacheMap2.containsValue((Object) cacheMap11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(calendar8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        proxyManagerImpl0.setUnproxyable("CacheMap:{}::{}");
        proxyManagerImpl0.setDelayCollectionLoading(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl3 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        Class<?> wildcardClass6 = cacheMap4.getClass();
        org.apache.openjpa.util.Proxy proxy7 = proxyManagerImpl3.newDateProxy((Class) wildcardClass6);
        java.util.TimeZone timeZone8 = null;
        org.apache.openjpa.util.Proxy proxy9 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass6, timeZone8);
        proxyManagerImpl0.setAssertAllowedType(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(proxy9);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        Class<?> wildcardClass3 = cacheMap1.getClass();
        org.apache.openjpa.util.Proxy proxy4 = proxyManagerImpl0.newDateProxy((Class) wildcardClass3);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl5 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean6 = proxyManagerImpl5.getTrackChanges();
        boolean boolean7 = proxyManagerImpl5.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap10.setCacheSize(0);
        Class<?> wildcardClass13 = cacheMap10.getClass();
        java.util.TimeZone timeZone14 = null;
        org.apache.openjpa.util.Proxy proxy15 = proxyManagerImpl5.newCalendarProxy((Class) wildcardClass13, timeZone14);
        org.apache.openjpa.util.Proxy proxy16 = proxyManagerImpl0.newDateProxy((Class) wildcardClass13);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl17 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean18 = proxyManagerImpl17.getTrackChanges();
        boolean boolean19 = proxyManagerImpl17.getDelayCollectionLoading();
        boolean boolean20 = proxyManagerImpl17.getTrackChanges();
        Class<?> wildcardClass21 = proxyManagerImpl17.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl22 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean23 = proxyManagerImpl22.getTrackChanges();
        boolean boolean24 = proxyManagerImpl22.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl25 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean26 = proxyManagerImpl25.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl27 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean28 = proxyManagerImpl27.getTrackChanges();
        boolean boolean29 = proxyManagerImpl27.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap32 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap32.setCacheSize(0);
        Class<?> wildcardClass35 = cacheMap32.getClass();
        java.util.TimeZone timeZone36 = null;
        org.apache.openjpa.util.Proxy proxy37 = proxyManagerImpl27.newCalendarProxy((Class) wildcardClass35, timeZone36);
        org.apache.openjpa.util.CacheMap cacheMap40 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass41 = cacheMap40.getClass();
        java.util.Comparator comparator42 = null;
        org.apache.openjpa.util.Proxy proxy44 = proxyManagerImpl25.newCollectionProxy((Class) wildcardClass35, (Class) wildcardClass41, comparator42, true);
        org.apache.openjpa.util.Proxy proxy45 = proxyManagerImpl22.newDateProxy((Class) wildcardClass41);
        java.util.Comparator comparator46 = null;
        org.apache.openjpa.util.Proxy proxy48 = proxyManagerImpl0.newCollectionProxy((Class) wildcardClass21, (Class) wildcardClass41, comparator46, true);
        java.util.Collection collection49 = proxyManagerImpl0.getUnproxyable();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(proxy15);
        org.junit.Assert.assertNotNull(proxy16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(proxy37);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(proxy44);
        org.junit.Assert.assertNotNull(proxy45);
        org.junit.Assert.assertNotNull(proxy48);
        org.junit.Assert.assertNotNull(collection49);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        Class<?> wildcardClass3 = cacheMap1.getClass();
        org.apache.openjpa.util.Proxy proxy4 = proxyManagerImpl0.newDateProxy((Class) wildcardClass3);
        Object obj6 = proxyManagerImpl0.copyCustom((Object) true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl7 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl7.setTrackChanges(false);
        Object obj10 = proxyManagerImpl0.copyCustom((Object) false);
        proxyManagerImpl0.setDelayCollectionLoading(true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        java.util.Calendar calendar2 = null;
        java.util.Calendar calendar3 = proxyManagerImpl0.copyCalendar(calendar2);
        boolean boolean4 = proxyManagerImpl0.getAssertAllowedType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(calendar3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        cacheMap2.clear();
        String str5 = cacheMap2.toString();
        int int6 = cacheMap2.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean3 = cacheMap1.pin((Object) "CacheMap:{}::{}");
        int int4 = cacheMap1.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean8 = cacheMap7.isLRU();
        boolean boolean9 = cacheMap7.isLRU();
        java.util.Set set10 = cacheMap7.getPinnedKeys();
        cacheMap1.putAll((java.util.Map) cacheMap7);
        cacheMap1.setCacheSize((-1));
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Set set16 = cacheMap15.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str20 = cacheMap19.toString();
        cacheMap19.setSoftReferenceSize(1);
        cacheMap19.readLock();
        cacheMap15.putAll((java.util.Map) cacheMap19);
        boolean boolean25 = cacheMap1.containsKey((Object) cacheMap15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CacheMap:{}::{}" + "'", str20, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        boolean boolean4 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str8 = cacheMap7.toString();
        cacheMap7.setSoftReferenceSize(1);
        boolean boolean12 = cacheMap7.containsValue((Object) 100.0f);
        boolean boolean13 = cacheMap2.unpin((Object) cacheMap7);
        boolean boolean14 = cacheMap2.isLRU();
        java.util.Set set15 = cacheMap2.getPinnedKeys();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl16 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean17 = proxyManagerImpl16.getTrackChanges();
        boolean boolean18 = proxyManagerImpl16.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap21.setCacheSize(0);
        Class<?> wildcardClass24 = cacheMap21.getClass();
        java.util.TimeZone timeZone25 = null;
        org.apache.openjpa.util.Proxy proxy26 = proxyManagerImpl16.newCalendarProxy((Class) wildcardClass24, timeZone25);
        boolean boolean27 = cacheMap2.containsValue((Object) proxyManagerImpl16);
        proxyManagerImpl16.setAssertAllowedType(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(proxy26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str5 = cacheMap4.toString();
        cacheMap4.setSoftReferenceSize(1);
        java.util.Collection collection8 = cacheMap4.values();
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCustomProxy((Object) cacheMap4, false);
        java.util.Map map11 = null;
        java.util.Map map12 = proxyManagerImpl0.copyMap(map11);
        boolean boolean13 = proxyManagerImpl0.getAssertAllowedType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str6 = cacheMap5.toString();
        java.util.Set set7 = cacheMap5.entrySet();
        boolean boolean8 = cacheMap0.containsKey((Object) set7);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean13 = cacheMap12.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set15 = cacheMap14.entrySet();
        java.util.Collection collection16 = cacheMap14.values();
        cacheMap12.putAll((java.util.Map) cacheMap14, true);
        cacheMap9.putAll((java.util.Map) cacheMap14, false);
        cacheMap0.putAll((java.util.Map) cacheMap14);
        int int22 = cacheMap14.getCacheSize();
        java.util.Set set23 = cacheMap14.getPinnedKeys();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap14.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1000 + "'", int22 == 1000);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        Class<?> wildcardClass3 = cacheMap1.getClass();
        org.apache.openjpa.util.Proxy proxy4 = proxyManagerImpl0.newDateProxy((Class) wildcardClass3);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl5 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean6 = proxyManagerImpl5.getTrackChanges();
        boolean boolean7 = proxyManagerImpl5.getDelayCollectionLoading();
        boolean boolean8 = proxyManagerImpl5.getTrackChanges();
        boolean boolean9 = proxyManagerImpl5.getAssertAllowedType();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set11 = cacheMap10.getPinnedKeys();
        Class<?> wildcardClass12 = cacheMap10.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl13 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean14 = proxyManagerImpl13.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl15 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean16 = proxyManagerImpl15.getTrackChanges();
        boolean boolean17 = proxyManagerImpl15.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap20.setCacheSize(0);
        Class<?> wildcardClass23 = cacheMap20.getClass();
        java.util.TimeZone timeZone24 = null;
        org.apache.openjpa.util.Proxy proxy25 = proxyManagerImpl15.newCalendarProxy((Class) wildcardClass23, timeZone24);
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass29 = cacheMap28.getClass();
        java.util.Comparator comparator30 = null;
        org.apache.openjpa.util.Proxy proxy32 = proxyManagerImpl13.newCollectionProxy((Class) wildcardClass23, (Class) wildcardClass29, comparator30, true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl33 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean34 = proxyManagerImpl33.getTrackChanges();
        boolean boolean35 = proxyManagerImpl33.getDelayCollectionLoading();
        boolean boolean36 = proxyManagerImpl33.getTrackChanges();
        Class<?> wildcardClass37 = proxyManagerImpl33.getClass();
        java.util.Comparator comparator38 = null;
        org.apache.openjpa.util.Proxy proxy40 = proxyManagerImpl5.newMapProxy((Class) wildcardClass12, (Class) wildcardClass29, (Class) wildcardClass37, comparator38, false);
        org.apache.openjpa.util.Proxy proxy41 = proxyManagerImpl0.newDateProxy((Class) wildcardClass29);
        org.apache.openjpa.util.CacheMap cacheMap44 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap44.readLock();
        java.util.Set set46 = cacheMap44.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection47 = proxyManagerImpl0.copyCollection((java.util.Collection) set46);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.GeneralException; message: org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$KeySet$629$proxy");
        } catch (org.apache.openjpa.util.GeneralException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(proxy25);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(proxy32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(proxy40);
        org.junit.Assert.assertNotNull(proxy41);
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        boolean boolean4 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap7.setCacheSize(0);
        boolean boolean10 = cacheMap2.containsValue((Object) cacheMap7);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set12 = cacheMap11.entrySet();
        java.util.Collection collection13 = cacheMap11.values();
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str17 = cacheMap16.toString();
        java.util.Set set18 = cacheMap16.entrySet();
        boolean boolean19 = cacheMap11.containsKey((Object) set18);
        boolean boolean20 = cacheMap2.containsValue((Object) boolean19);
        java.util.Set set21 = cacheMap2.getPinnedKeys();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl22 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean23 = proxyManagerImpl22.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str27 = cacheMap26.toString();
        cacheMap26.setSoftReferenceSize(1);
        java.util.Collection collection30 = cacheMap26.values();
        org.apache.openjpa.util.Proxy proxy32 = proxyManagerImpl22.newCustomProxy((Object) cacheMap26, false);
        int int33 = cacheMap26.getSoftReferenceSize();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = cacheMap2.containsKey((Object) cacheMap26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CacheMap:{}::{}" + "'", str17, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "CacheMap:{}::{}" + "'", str27, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(proxy32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        Object obj4 = null;
        boolean boolean5 = cacheMap0.pin(obj4);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Set set2 = cacheMap0.keySet();
        java.util.Set set3 = cacheMap0.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean7 = cacheMap6.isLRU();
        boolean boolean8 = cacheMap6.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str12 = cacheMap11.toString();
        cacheMap11.setSoftReferenceSize(1);
        boolean boolean16 = cacheMap11.containsValue((Object) 100.0f);
        boolean boolean17 = cacheMap6.unpin((Object) cacheMap11);
        boolean boolean18 = cacheMap6.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean23 = cacheMap22.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set25 = cacheMap24.entrySet();
        java.util.Collection collection26 = cacheMap24.values();
        cacheMap22.putAll((java.util.Map) cacheMap24, true);
        cacheMap19.putAll((java.util.Map) cacheMap24, false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl31 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean32 = proxyManagerImpl31.getTrackChanges();
        boolean boolean33 = proxyManagerImpl31.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl34 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean35 = proxyManagerImpl34.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl36 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean37 = proxyManagerImpl36.getTrackChanges();
        boolean boolean38 = proxyManagerImpl36.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap41 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap41.setCacheSize(0);
        Class<?> wildcardClass44 = cacheMap41.getClass();
        java.util.TimeZone timeZone45 = null;
        org.apache.openjpa.util.Proxy proxy46 = proxyManagerImpl36.newCalendarProxy((Class) wildcardClass44, timeZone45);
        org.apache.openjpa.util.CacheMap cacheMap49 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass50 = cacheMap49.getClass();
        java.util.Comparator comparator51 = null;
        org.apache.openjpa.util.Proxy proxy53 = proxyManagerImpl34.newCollectionProxy((Class) wildcardClass44, (Class) wildcardClass50, comparator51, true);
        org.apache.openjpa.util.Proxy proxy54 = proxyManagerImpl31.newDateProxy((Class) wildcardClass50);
        boolean boolean55 = cacheMap19.containsValue((Object) proxyManagerImpl31);
        org.apache.openjpa.util.CacheMap cacheMap56 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set57 = cacheMap56.entrySet();
        java.util.Collection collection58 = cacheMap56.values();
        java.util.Set set59 = cacheMap56.entrySet();
        int int60 = cacheMap56.getSoftReferenceSize();
        Object obj62 = cacheMap56.remove((Object) (short) 1);
        boolean boolean63 = cacheMap19.pin((Object) cacheMap56);
        Object obj64 = cacheMap0.put((Object) cacheMap6, (Object) boolean63);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CacheMap:{}::{}" + "'", str12, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(proxy46);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(proxy53);
        org.junit.Assert.assertNotNull(proxy54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean2 = cacheMap0.containsKey((Object) 10.0f);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set4 = cacheMap3.entrySet();
        Object obj5 = cacheMap0.remove((Object) set4);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean9 = cacheMap8.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set11 = cacheMap10.entrySet();
        java.util.Collection collection12 = cacheMap10.values();
        cacheMap8.putAll((java.util.Map) cacheMap10, true);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set16 = cacheMap15.entrySet();
        java.util.Collection collection17 = cacheMap15.values();
        java.util.Set set18 = cacheMap15.entrySet();
        boolean boolean19 = cacheMap10.pin((Object) cacheMap15);
        cacheMap0.putAll((java.util.Map) cacheMap15, true);
        boolean boolean23 = cacheMap15.pin((Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str5 = cacheMap4.toString();
        cacheMap4.setSoftReferenceSize(1);
        java.util.Collection collection8 = cacheMap4.values();
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCustomProxy((Object) cacheMap4, false);
        java.util.Collection collection11 = proxyManagerImpl0.getUnproxyable();
        java.util.Date date12 = null;
        java.util.Date date13 = proxyManagerImpl0.copyDate(date12);
        java.util.Collection collection14 = null;
        java.util.Collection collection15 = proxyManagerImpl0.copyCollection(collection14);
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str19 = cacheMap18.toString();
        boolean boolean20 = cacheMap18.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set22 = cacheMap21.entrySet();
        java.util.Collection collection23 = cacheMap21.values();
        java.util.Set set24 = cacheMap21.entrySet();
        cacheMap18.putAll((java.util.Map) cacheMap21, true);
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set28 = cacheMap27.entrySet();
        java.util.Collection collection29 = cacheMap27.values();
        java.util.Set set30 = cacheMap27.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set32 = cacheMap31.getPinnedKeys();
        boolean boolean33 = cacheMap31.isEmpty();
        boolean boolean35 = cacheMap31.unpin((Object) 10);
        cacheMap27.putAll((java.util.Map) cacheMap31);
        cacheMap18.putAll((java.util.Map) cacheMap31, true);
        Object obj39 = proxyManagerImpl0.copyCustom((Object) cacheMap31);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(collection15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CacheMap:{}::{}" + "'", str19, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "CacheMap:{}::{}");
        org.junit.Assert.assertEquals(String.valueOf(obj39), "CacheMap:{}::{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "CacheMap:{}::{}");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getDelayCollectionLoading();
        java.util.Calendar calendar2 = null;
        java.util.Calendar calendar3 = proxyManagerImpl0.copyCalendar(calendar2);
        java.util.Collection collection4 = proxyManagerImpl0.getUnproxyable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(calendar3);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        boolean boolean7 = cacheMap2.containsValue((Object) 100.0f);
        int int8 = cacheMap2.size();
        int int9 = cacheMap2.size();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set11 = cacheMap10.entrySet();
        java.util.Collection collection12 = cacheMap10.values();
        java.util.Set set13 = cacheMap10.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set15 = cacheMap14.getPinnedKeys();
        boolean boolean16 = cacheMap14.isEmpty();
        boolean boolean18 = cacheMap14.unpin((Object) 10);
        cacheMap10.putAll((java.util.Map) cacheMap14);
        boolean boolean20 = cacheMap2.unpin((Object) cacheMap14);
        boolean boolean21 = cacheMap2.isLRU();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        boolean boolean4 = cacheMap2.isEmpty();
        boolean boolean5 = cacheMap2.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false);
        int int8 = cacheMap7.getSoftReferenceSize();
        // The following exception was thrown during execution in test generation
        try {
            Object obj9 = cacheMap2.get((Object) int8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean3 = cacheMap1.pin((Object) "CacheMap:{}::{}");
        int int4 = cacheMap1.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean8 = cacheMap7.isLRU();
        boolean boolean9 = cacheMap7.isLRU();
        java.util.Set set10 = cacheMap7.getPinnedKeys();
        cacheMap1.putAll((java.util.Map) cacheMap7);
        java.util.Set set12 = cacheMap1.getPinnedKeys();
        cacheMap1.readLock();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        Class<?> wildcardClass3 = cacheMap1.getClass();
        org.apache.openjpa.util.Proxy proxy4 = proxyManagerImpl0.newDateProxy((Class) wildcardClass3);
        Object obj6 = proxyManagerImpl0.copyCustom((Object) true);
        java.util.Collection collection7 = proxyManagerImpl0.getUnproxyable();
        java.util.Collection collection8 = proxyManagerImpl0.getUnproxyable();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap5.setCacheSize(0);
        Class<?> wildcardClass8 = cacheMap5.getClass();
        java.util.TimeZone timeZone9 = null;
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass8, timeZone9);
        proxyManagerImpl0.setAssertAllowedType(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(proxy10);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Set set2 = cacheMap0.keySet();
        cacheMap0.clear();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.entrySet();
        java.util.Collection collection6 = cacheMap4.values();
        cacheMap2.putAll((java.util.Map) cacheMap4, true);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set10 = cacheMap9.entrySet();
        java.util.Collection collection11 = cacheMap9.values();
        java.util.Set set12 = cacheMap9.entrySet();
        boolean boolean13 = cacheMap4.pin((Object) cacheMap9);
        boolean boolean15 = cacheMap9.containsKey((Object) (-1L));
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl16 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set18 = cacheMap17.getPinnedKeys();
        Class<?> wildcardClass19 = cacheMap17.getClass();
        org.apache.openjpa.util.Proxy proxy20 = proxyManagerImpl16.newDateProxy((Class) wildcardClass19);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl21 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean22 = proxyManagerImpl21.getTrackChanges();
        boolean boolean23 = proxyManagerImpl21.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap26.setCacheSize(0);
        Class<?> wildcardClass29 = cacheMap26.getClass();
        java.util.TimeZone timeZone30 = null;
        org.apache.openjpa.util.Proxy proxy31 = proxyManagerImpl21.newCalendarProxy((Class) wildcardClass29, timeZone30);
        org.apache.openjpa.util.Proxy proxy32 = proxyManagerImpl16.newDateProxy((Class) wildcardClass29);
        Object obj33 = cacheMap9.remove((Object) proxyManagerImpl16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(proxy20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(proxy31);
        org.junit.Assert.assertNotNull(proxy32);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        Class<?> wildcardClass3 = cacheMap1.getClass();
        org.apache.openjpa.util.Proxy proxy4 = proxyManagerImpl0.newDateProxy((Class) wildcardClass3);
        Object obj6 = proxyManagerImpl0.copyCustom((Object) true);
        java.util.Collection collection7 = proxyManagerImpl0.getUnproxyable();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl8 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean9 = proxyManagerImpl8.getTrackChanges();
        boolean boolean10 = proxyManagerImpl8.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl11 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean12 = proxyManagerImpl11.getTrackChanges();
        boolean boolean13 = proxyManagerImpl11.getDelayCollectionLoading();
        boolean boolean14 = proxyManagerImpl11.getTrackChanges();
        Class<?> wildcardClass15 = proxyManagerImpl11.getClass();
        org.apache.openjpa.util.Proxy proxy16 = proxyManagerImpl8.newDateProxy((Class) wildcardClass15);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl17 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean18 = proxyManagerImpl17.getDelayCollectionLoading();
        java.util.Calendar calendar19 = null;
        java.util.Calendar calendar20 = proxyManagerImpl17.copyCalendar(calendar19);
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass24 = cacheMap23.getClass();
        org.apache.openjpa.util.Proxy proxy25 = proxyManagerImpl17.newDateProxy((Class) wildcardClass24);
        Object obj26 = new Object();
        Class<?> wildcardClass27 = obj26.getClass();
        java.util.Comparator comparator28 = null;
        org.apache.openjpa.util.Proxy proxy30 = proxyManagerImpl0.newMapProxy((Class) wildcardClass15, (Class) wildcardClass24, (Class) wildcardClass27, comparator28, true);
        proxyManagerImpl0.setTrackChanges(true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(proxy16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(calendar20);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(proxy25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(proxy30);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str6 = cacheMap5.toString();
        cacheMap5.setSoftReferenceSize(1);
        cacheMap5.readLock();
        cacheMap1.putAll((java.util.Map) cacheMap5);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str14 = cacheMap13.toString();
        cacheMap13.setSoftReferenceSize(1);
        java.util.Collection collection17 = cacheMap13.values();
        boolean boolean18 = cacheMap1.containsKey((Object) cacheMap13);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CacheMap:{}::{}" + "'", str14, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean6 = cacheMap5.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set8 = cacheMap7.entrySet();
        java.util.Collection collection9 = cacheMap7.values();
        cacheMap5.putAll((java.util.Map) cacheMap7, true);
        cacheMap2.putAll((java.util.Map) cacheMap7, false);
        boolean boolean14 = cacheMap0.unpin((Object) false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl15 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean16 = proxyManagerImpl15.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str20 = cacheMap19.toString();
        cacheMap19.setSoftReferenceSize(1);
        java.util.Collection collection23 = cacheMap19.values();
        org.apache.openjpa.util.Proxy proxy25 = proxyManagerImpl15.newCustomProxy((Object) cacheMap19, false);
        java.util.Collection collection26 = proxyManagerImpl15.getUnproxyable();
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set28 = cacheMap27.entrySet();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl29 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl29.setTrackChanges(false);
        java.util.Collection collection32 = proxyManagerImpl29.getUnproxyable();
        boolean boolean33 = cacheMap27.containsKey((Object) collection32);
        java.util.Collection collection34 = proxyManagerImpl15.copyCollection(collection32);
        boolean boolean35 = cacheMap0.unpin((Object) collection34);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CacheMap:{}::{}" + "'", str20, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(proxy25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap3.containsKey((Object) 10.0f);
        java.util.Map map6 = proxyManagerImpl0.copyMap((java.util.Map) cacheMap3);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean10 = cacheMap8.pin((Object) "CacheMap:{}::{}");
        int int11 = cacheMap8.getSoftReferenceSize();
        java.util.Collection collection12 = cacheMap8.values();
        cacheMap3.putAll((java.util.Map) cacheMap8, true);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean18 = cacheMap17.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set20 = cacheMap19.entrySet();
        java.util.Collection collection21 = cacheMap19.values();
        cacheMap17.putAll((java.util.Map) cacheMap19, true);
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set25 = cacheMap24.entrySet();
        java.util.Collection collection26 = cacheMap24.values();
        java.util.Set set27 = cacheMap24.entrySet();
        boolean boolean28 = cacheMap19.pin((Object) cacheMap24);
        boolean boolean29 = cacheMap8.unpin((Object) boolean28);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) '4');
        boolean boolean3 = cacheMap2.isEmpty();
        int int4 = cacheMap2.getCacheSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        boolean boolean6 = cacheMap2.isEmpty();
        cacheMap2.clear();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap2.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, 52, (int) (short) -1, (float) '#', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 35.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(false);
        int int2 = cacheMap1.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean6 = cacheMap5.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set8 = cacheMap7.entrySet();
        java.util.Collection collection9 = cacheMap7.values();
        cacheMap5.putAll((java.util.Map) cacheMap7, true);
        cacheMap7.setCacheSize((int) 'a');
        java.util.Set set14 = cacheMap7.entrySet();
        Object obj15 = cacheMap1.get((Object) cacheMap7);
        int int16 = cacheMap7.getCacheSize();
        java.util.Set set17 = cacheMap7.keySet();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        boolean boolean4 = cacheMap2.isEmpty();
        boolean boolean5 = cacheMap2.isEmpty();
        cacheMap2.clear();
        String str7 = cacheMap2.toString();
        boolean boolean8 = cacheMap2.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CacheMap:{}::{}" + "'", str7, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setAssertAllowedType(true);
        boolean boolean4 = proxyManagerImpl0.getAssertAllowedType();
        boolean boolean5 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setAssertAllowedType(true);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean11 = cacheMap10.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set13 = cacheMap12.entrySet();
        java.util.Collection collection14 = cacheMap12.values();
        cacheMap10.putAll((java.util.Map) cacheMap12, true);
        cacheMap12.setCacheSize((int) 'a');
        int int19 = cacheMap12.getSoftReferenceSize();
        boolean boolean20 = cacheMap12.isEmpty();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl21 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set23 = cacheMap22.getPinnedKeys();
        Class<?> wildcardClass24 = cacheMap22.getClass();
        org.apache.openjpa.util.Proxy proxy25 = proxyManagerImpl21.newDateProxy((Class) wildcardClass24);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl26 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean27 = proxyManagerImpl26.getTrackChanges();
        boolean boolean28 = proxyManagerImpl26.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap31.setCacheSize(0);
        Class<?> wildcardClass34 = cacheMap31.getClass();
        java.util.TimeZone timeZone35 = null;
        org.apache.openjpa.util.Proxy proxy36 = proxyManagerImpl26.newCalendarProxy((Class) wildcardClass34, timeZone35);
        org.apache.openjpa.util.Proxy proxy37 = proxyManagerImpl21.newDateProxy((Class) wildcardClass34);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl38 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean39 = proxyManagerImpl38.getTrackChanges();
        boolean boolean40 = proxyManagerImpl38.getDelayCollectionLoading();
        boolean boolean41 = proxyManagerImpl38.getTrackChanges();
        Class<?> wildcardClass42 = proxyManagerImpl38.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl43 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean44 = proxyManagerImpl43.getTrackChanges();
        boolean boolean45 = proxyManagerImpl43.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl46 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean47 = proxyManagerImpl46.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl48 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean49 = proxyManagerImpl48.getTrackChanges();
        boolean boolean50 = proxyManagerImpl48.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap53 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap53.setCacheSize(0);
        Class<?> wildcardClass56 = cacheMap53.getClass();
        java.util.TimeZone timeZone57 = null;
        org.apache.openjpa.util.Proxy proxy58 = proxyManagerImpl48.newCalendarProxy((Class) wildcardClass56, timeZone57);
        org.apache.openjpa.util.CacheMap cacheMap61 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass62 = cacheMap61.getClass();
        java.util.Comparator comparator63 = null;
        org.apache.openjpa.util.Proxy proxy65 = proxyManagerImpl46.newCollectionProxy((Class) wildcardClass56, (Class) wildcardClass62, comparator63, true);
        org.apache.openjpa.util.Proxy proxy66 = proxyManagerImpl43.newDateProxy((Class) wildcardClass62);
        java.util.Comparator comparator67 = null;
        org.apache.openjpa.util.Proxy proxy69 = proxyManagerImpl21.newCollectionProxy((Class) wildcardClass42, (Class) wildcardClass62, comparator67, true);
        Object obj70 = cacheMap12.remove((Object) comparator67);
        Object obj71 = proxyManagerImpl0.copyCustom((Object) comparator67);
        proxyManagerImpl0.setDelayCollectionLoading(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(proxy25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(proxy36);
        org.junit.Assert.assertNotNull(proxy37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(proxy58);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(proxy65);
        org.junit.Assert.assertNotNull(proxy66);
        org.junit.Assert.assertNotNull(proxy69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj71);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean6 = cacheMap5.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set8 = cacheMap7.entrySet();
        java.util.Collection collection9 = cacheMap7.values();
        cacheMap5.putAll((java.util.Map) cacheMap7, true);
        cacheMap2.putAll((java.util.Map) cacheMap7, false);
        boolean boolean14 = cacheMap0.unpin((Object) false);
        java.util.Collection collection15 = cacheMap0.values();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        Class<?> wildcardClass3 = cacheMap1.getClass();
        org.apache.openjpa.util.Proxy proxy4 = proxyManagerImpl0.newDateProxy((Class) wildcardClass3);
        Object obj6 = proxyManagerImpl0.copyCustom((Object) true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl7 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl7.setTrackChanges(false);
        Object obj10 = proxyManagerImpl0.copyCustom((Object) false);
        boolean boolean11 = proxyManagerImpl0.getDelayCollectionLoading();
        Object obj12 = null;
        Object obj13 = proxyManagerImpl0.copyArray(obj12);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean3 = cacheMap2.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.entrySet();
        java.util.Collection collection6 = cacheMap4.values();
        cacheMap2.putAll((java.util.Map) cacheMap4, true);
        cacheMap4.setCacheSize((int) 'a');
        int int11 = cacheMap4.getSoftReferenceSize();
        int int12 = cacheMap4.getCacheSize();
        java.util.Set set13 = cacheMap4.keySet();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean2 = cacheMap0.containsKey((Object) false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl3 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean4 = proxyManagerImpl3.getTrackChanges();
        boolean boolean5 = proxyManagerImpl3.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl6 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set8 = cacheMap7.getPinnedKeys();
        Class<?> wildcardClass9 = cacheMap7.getClass();
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl6.newDateProxy((Class) wildcardClass9);
        java.util.TimeZone timeZone11 = null;
        org.apache.openjpa.util.Proxy proxy12 = proxyManagerImpl3.newCalendarProxy((Class) wildcardClass9, timeZone11);
        boolean boolean13 = proxyManagerImpl3.getTrackChanges();
        proxyManagerImpl3.setTrackChanges(true);
        java.util.Collection collection16 = proxyManagerImpl3.getUnproxyable();
        boolean boolean17 = cacheMap0.unpin((Object) collection16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(proxy12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        Class<?> wildcardClass3 = cacheMap1.getClass();
        org.apache.openjpa.util.Proxy proxy4 = proxyManagerImpl0.newDateProxy((Class) wildcardClass3);
        Object obj6 = proxyManagerImpl0.copyCustom((Object) true);
        proxyManagerImpl0.setUnproxyable("hi!");
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap5.setCacheSize(0);
        Class<?> wildcardClass8 = cacheMap5.getClass();
        java.util.TimeZone timeZone9 = null;
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass8, timeZone9);
        proxyManagerImpl0.setDelayCollectionLoading(true);
        boolean boolean13 = proxyManagerImpl0.getAssertAllowedType();
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str17 = cacheMap16.toString();
        java.util.Set set18 = cacheMap16.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.Proxy proxy20 = proxyManagerImpl0.newCustomProxy((Object) set18, false);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.GeneralException; message: org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$EntrySet$667$proxy");
        } catch (org.apache.openjpa.util.GeneralException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CacheMap:{}::{}" + "'", str17, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        boolean boolean7 = cacheMap2.containsValue((Object) 100.0f);
        int int8 = cacheMap2.size();
        boolean boolean9 = cacheMap2.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) 1, (int) '4', (float) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 10.0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str5 = cacheMap4.toString();
        cacheMap4.setSoftReferenceSize(1);
        java.util.Collection collection8 = cacheMap4.values();
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCustomProxy((Object) cacheMap4, false);
        java.util.Collection collection11 = proxyManagerImpl0.getUnproxyable();
        java.util.Date date12 = null;
        java.util.Date date13 = proxyManagerImpl0.copyDate(date12);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean17 = cacheMap15.pin((Object) "CacheMap:{}::{}");
        int int18 = cacheMap15.getSoftReferenceSize();
        java.util.Collection collection19 = cacheMap15.values();
        java.util.Collection collection20 = cacheMap15.values();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection21 = proxyManagerImpl0.copyCollection(collection20);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.GeneralException; message: org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$ValueCollection$669$proxy");
        } catch (org.apache.openjpa.util.GeneralException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        boolean boolean3 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl4 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean5 = proxyManagerImpl4.getTrackChanges();
        boolean boolean6 = proxyManagerImpl4.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl7 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean8 = proxyManagerImpl7.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl9 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean10 = proxyManagerImpl9.getTrackChanges();
        boolean boolean11 = proxyManagerImpl9.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap14.setCacheSize(0);
        Class<?> wildcardClass17 = cacheMap14.getClass();
        java.util.TimeZone timeZone18 = null;
        org.apache.openjpa.util.Proxy proxy19 = proxyManagerImpl9.newCalendarProxy((Class) wildcardClass17, timeZone18);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass23 = cacheMap22.getClass();
        java.util.Comparator comparator24 = null;
        org.apache.openjpa.util.Proxy proxy26 = proxyManagerImpl7.newCollectionProxy((Class) wildcardClass17, (Class) wildcardClass23, comparator24, true);
        org.apache.openjpa.util.Proxy proxy27 = proxyManagerImpl4.newDateProxy((Class) wildcardClass23);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl28 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean29 = proxyManagerImpl28.getTrackChanges();
        boolean boolean30 = proxyManagerImpl28.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl31 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean32 = proxyManagerImpl31.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl33 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean34 = proxyManagerImpl33.getTrackChanges();
        boolean boolean35 = proxyManagerImpl33.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap38 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap38.setCacheSize(0);
        Class<?> wildcardClass41 = cacheMap38.getClass();
        java.util.TimeZone timeZone42 = null;
        org.apache.openjpa.util.Proxy proxy43 = proxyManagerImpl33.newCalendarProxy((Class) wildcardClass41, timeZone42);
        org.apache.openjpa.util.CacheMap cacheMap46 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass47 = cacheMap46.getClass();
        java.util.Comparator comparator48 = null;
        org.apache.openjpa.util.Proxy proxy50 = proxyManagerImpl31.newCollectionProxy((Class) wildcardClass41, (Class) wildcardClass47, comparator48, true);
        org.apache.openjpa.util.Proxy proxy51 = proxyManagerImpl28.newDateProxy((Class) wildcardClass47);
        org.apache.openjpa.util.Proxy proxy52 = proxyManagerImpl4.newDateProxy((Class) wildcardClass47);
        java.util.TimeZone timeZone53 = null;
        org.apache.openjpa.util.Proxy proxy54 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass47, timeZone53);
        org.apache.openjpa.util.CacheMap cacheMap55 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set56 = cacheMap55.entrySet();
        java.util.Collection collection57 = cacheMap55.values();
        java.util.Set set58 = cacheMap55.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap59 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set60 = cacheMap59.getPinnedKeys();
        boolean boolean61 = cacheMap59.isEmpty();
        boolean boolean63 = cacheMap59.unpin((Object) 10);
        cacheMap55.putAll((java.util.Map) cacheMap59);
        java.util.Set set65 = cacheMap55.keySet();
        java.util.Set set66 = cacheMap55.keySet();
        // The following exception was thrown during execution in test generation
        try {
            Object obj67 = proxyManagerImpl0.copyCustom((Object) cacheMap55);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$676$proxy cannot be cast to class org.apache.openjpa.util.proxy.ProxyMap (org.apache.openjpa.util.org$apache$openjpa$util$CacheMap$676$proxy is in unnamed module of loader org.apache.openjpa.util.ClassLoaderProxyService$ProxiesClassLoader @19bdffdb; org.apache.openjpa.util.proxy.ProxyMap is in unnamed module of loader 'app')");
        } catch (ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(proxy19);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(proxy26);
        org.junit.Assert.assertNotNull(proxy27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(proxy43);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(proxy50);
        org.junit.Assert.assertNotNull(proxy51);
        org.junit.Assert.assertNotNull(proxy52);
        org.junit.Assert.assertNotNull(proxy54);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(set66);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.getSoftReferenceSize();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl5 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean6 = proxyManagerImpl5.getTrackChanges();
        java.util.Calendar calendar7 = null;
        java.util.Calendar calendar8 = proxyManagerImpl5.copyCalendar(calendar7);
        Object obj9 = cacheMap0.remove((Object) proxyManagerImpl5);
        java.util.Set set10 = cacheMap0.entrySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(calendar8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        boolean boolean6 = cacheMap4.isEmpty();
        boolean boolean8 = cacheMap4.unpin((Object) 10);
        cacheMap0.putAll((java.util.Map) cacheMap4);
        cacheMap4.clear();
        boolean boolean11 = cacheMap4.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str15 = cacheMap14.toString();
        cacheMap14.setSoftReferenceSize(1);
        boolean boolean19 = cacheMap14.containsValue((Object) 100.0f);
        int int20 = cacheMap14.size();
        int int21 = cacheMap14.size();
        cacheMap4.putAll((java.util.Map) cacheMap14);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CacheMap:{}::{}" + "'", str15, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setAssertAllowedType(true);
        boolean boolean4 = proxyManagerImpl0.getAssertAllowedType();
        boolean boolean5 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setAssertAllowedType(true);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean11 = cacheMap10.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set13 = cacheMap12.entrySet();
        java.util.Collection collection14 = cacheMap12.values();
        cacheMap10.putAll((java.util.Map) cacheMap12, true);
        cacheMap12.setCacheSize((int) 'a');
        int int19 = cacheMap12.getSoftReferenceSize();
        boolean boolean20 = cacheMap12.isEmpty();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl21 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set23 = cacheMap22.getPinnedKeys();
        Class<?> wildcardClass24 = cacheMap22.getClass();
        org.apache.openjpa.util.Proxy proxy25 = proxyManagerImpl21.newDateProxy((Class) wildcardClass24);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl26 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean27 = proxyManagerImpl26.getTrackChanges();
        boolean boolean28 = proxyManagerImpl26.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap31.setCacheSize(0);
        Class<?> wildcardClass34 = cacheMap31.getClass();
        java.util.TimeZone timeZone35 = null;
        org.apache.openjpa.util.Proxy proxy36 = proxyManagerImpl26.newCalendarProxy((Class) wildcardClass34, timeZone35);
        org.apache.openjpa.util.Proxy proxy37 = proxyManagerImpl21.newDateProxy((Class) wildcardClass34);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl38 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean39 = proxyManagerImpl38.getTrackChanges();
        boolean boolean40 = proxyManagerImpl38.getDelayCollectionLoading();
        boolean boolean41 = proxyManagerImpl38.getTrackChanges();
        Class<?> wildcardClass42 = proxyManagerImpl38.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl43 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean44 = proxyManagerImpl43.getTrackChanges();
        boolean boolean45 = proxyManagerImpl43.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl46 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean47 = proxyManagerImpl46.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl48 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean49 = proxyManagerImpl48.getTrackChanges();
        boolean boolean50 = proxyManagerImpl48.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap53 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap53.setCacheSize(0);
        Class<?> wildcardClass56 = cacheMap53.getClass();
        java.util.TimeZone timeZone57 = null;
        org.apache.openjpa.util.Proxy proxy58 = proxyManagerImpl48.newCalendarProxy((Class) wildcardClass56, timeZone57);
        org.apache.openjpa.util.CacheMap cacheMap61 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass62 = cacheMap61.getClass();
        java.util.Comparator comparator63 = null;
        org.apache.openjpa.util.Proxy proxy65 = proxyManagerImpl46.newCollectionProxy((Class) wildcardClass56, (Class) wildcardClass62, comparator63, true);
        org.apache.openjpa.util.Proxy proxy66 = proxyManagerImpl43.newDateProxy((Class) wildcardClass62);
        java.util.Comparator comparator67 = null;
        org.apache.openjpa.util.Proxy proxy69 = proxyManagerImpl21.newCollectionProxy((Class) wildcardClass42, (Class) wildcardClass62, comparator67, true);
        Object obj70 = cacheMap12.remove((Object) comparator67);
        Object obj71 = proxyManagerImpl0.copyCustom((Object) comparator67);
        org.apache.openjpa.util.CacheMap cacheMap72 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set73 = cacheMap72.entrySet();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl74 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl74.setTrackChanges(false);
        java.util.Collection collection77 = proxyManagerImpl74.getUnproxyable();
        boolean boolean78 = cacheMap72.containsKey((Object) collection77);
        cacheMap72.readLock();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl80 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl80.setTrackChanges(false);
        org.apache.openjpa.util.CacheMap cacheMap83 = new org.apache.openjpa.util.CacheMap();
        boolean boolean85 = cacheMap83.containsKey((Object) 10.0f);
        java.util.Map map86 = proxyManagerImpl80.copyMap((java.util.Map) cacheMap83);
        org.apache.openjpa.util.CacheMap cacheMap88 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean90 = cacheMap88.pin((Object) "CacheMap:{}::{}");
        int int91 = cacheMap88.getSoftReferenceSize();
        java.util.Collection collection92 = cacheMap88.values();
        cacheMap83.putAll((java.util.Map) cacheMap88, true);
        boolean boolean95 = cacheMap88.isLRU();
        boolean boolean96 = cacheMap72.containsKey((Object) cacheMap88);
        java.util.Map map97 = proxyManagerImpl0.copyMap((java.util.Map) cacheMap88);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(proxy25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(proxy36);
        org.junit.Assert.assertNotNull(proxy37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(proxy58);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(proxy65);
        org.junit.Assert.assertNotNull(proxy66);
        org.junit.Assert.assertNotNull(proxy69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertNotNull(collection92);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(map97);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        boolean boolean2 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str6 = cacheMap5.toString();
        boolean boolean7 = cacheMap5.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set9 = cacheMap8.entrySet();
        java.util.Collection collection10 = cacheMap8.values();
        java.util.Set set11 = cacheMap8.entrySet();
        cacheMap5.putAll((java.util.Map) cacheMap8, true);
        boolean boolean14 = cacheMap0.unpin((Object) true);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set16 = cacheMap15.entrySet();
        boolean boolean17 = cacheMap0.containsValue((Object) cacheMap15);
        java.util.Set set18 = cacheMap0.keySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        boolean boolean7 = cacheMap2.containsValue((Object) 100.0f);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean11 = cacheMap10.isLRU();
        boolean boolean12 = cacheMap10.isLRU();
        cacheMap2.putAll((java.util.Map) cacheMap10);
        java.util.Set set14 = cacheMap2.keySet();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl3 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean4 = proxyManagerImpl3.getTrackChanges();
        boolean boolean5 = proxyManagerImpl3.getDelayCollectionLoading();
        boolean boolean6 = proxyManagerImpl3.getTrackChanges();
        Class<?> wildcardClass7 = proxyManagerImpl3.getClass();
        org.apache.openjpa.util.Proxy proxy8 = proxyManagerImpl0.newDateProxy((Class) wildcardClass7);
        boolean boolean9 = proxyManagerImpl0.getAssertAllowedType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl4 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.getPinnedKeys();
        Class<?> wildcardClass7 = cacheMap5.getClass();
        org.apache.openjpa.util.Proxy proxy8 = proxyManagerImpl4.newDateProxy((Class) wildcardClass7);
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCustomProxy((Object) proxyManagerImpl4, true);
        boolean boolean11 = proxyManagerImpl4.getAssertAllowedType();
        boolean boolean12 = proxyManagerImpl4.getDelayCollectionLoading();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean4 = cacheMap3.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.entrySet();
        java.util.Collection collection7 = cacheMap5.values();
        cacheMap3.putAll((java.util.Map) cacheMap5, true);
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl12 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean13 = cacheMap0.unpin((Object) proxyManagerImpl12);
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set15 = cacheMap14.entrySet();
        java.util.Collection collection16 = cacheMap14.values();
        java.util.Set set17 = cacheMap14.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set19 = cacheMap18.getPinnedKeys();
        boolean boolean20 = cacheMap18.isEmpty();
        boolean boolean22 = cacheMap18.unpin((Object) 10);
        cacheMap14.putAll((java.util.Map) cacheMap18);
        cacheMap18.writeLock();
        boolean boolean25 = cacheMap18.isLRU();
        org.apache.openjpa.util.Proxy proxy27 = proxyManagerImpl12.newCustomProxy((Object) cacheMap18, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(proxy27);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap5.setCacheSize(0);
        Class<?> wildcardClass8 = cacheMap5.getClass();
        java.util.TimeZone timeZone9 = null;
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass8, timeZone9);
        proxyManagerImpl0.setAssertAllowedType(true);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean16 = cacheMap15.isLRU();
        boolean boolean17 = cacheMap15.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str21 = cacheMap20.toString();
        cacheMap20.setSoftReferenceSize(1);
        boolean boolean25 = cacheMap20.containsValue((Object) 100.0f);
        boolean boolean26 = cacheMap15.unpin((Object) cacheMap20);
        int int27 = cacheMap20.getCacheSize();
        Class<?> wildcardClass28 = cacheMap20.getClass();
        java.util.TimeZone timeZone29 = null;
        org.apache.openjpa.util.Proxy proxy30 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass28, timeZone29);
        proxyManagerImpl0.setTrackChanges(true);
        boolean boolean33 = proxyManagerImpl0.getDelayCollectionLoading();
        proxyManagerImpl0.setAssertAllowedType(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CacheMap:{}::{}" + "'", str21, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(proxy30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        Class<?> wildcardClass6 = cacheMap4.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl7 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean8 = proxyManagerImpl7.getTrackChanges();
        proxyManagerImpl7.setAssertAllowedType(true);
        boolean boolean11 = proxyManagerImpl7.getAssertAllowedType();
        boolean boolean12 = proxyManagerImpl7.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set14 = cacheMap13.entrySet();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl15 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl15.setTrackChanges(false);
        java.util.Collection collection18 = proxyManagerImpl15.getUnproxyable();
        boolean boolean19 = cacheMap13.containsKey((Object) collection18);
        Class<?> wildcardClass20 = cacheMap13.getClass();
        java.util.TimeZone timeZone21 = null;
        org.apache.openjpa.util.Proxy proxy22 = proxyManagerImpl7.newCalendarProxy((Class) wildcardClass20, timeZone21);
        java.util.Comparator comparator23 = null;
        org.apache.openjpa.util.Proxy proxy25 = proxyManagerImpl0.newCollectionProxy((Class) wildcardClass6, (Class) wildcardClass20, comparator23, true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(proxy22);
        org.junit.Assert.assertNotNull(proxy25);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl0.setTrackChanges(false);
        java.util.Collection collection3 = proxyManagerImpl0.getUnproxyable();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl4 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.getPinnedKeys();
        Class<?> wildcardClass7 = cacheMap5.getClass();
        org.apache.openjpa.util.Proxy proxy8 = proxyManagerImpl4.newDateProxy((Class) wildcardClass7);
        Object obj10 = proxyManagerImpl4.copyCustom((Object) true);
        java.util.Collection collection11 = proxyManagerImpl4.getUnproxyable();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl12 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean13 = proxyManagerImpl12.getTrackChanges();
        boolean boolean14 = proxyManagerImpl12.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl15 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean16 = proxyManagerImpl15.getTrackChanges();
        boolean boolean17 = proxyManagerImpl15.getDelayCollectionLoading();
        boolean boolean18 = proxyManagerImpl15.getTrackChanges();
        Class<?> wildcardClass19 = proxyManagerImpl15.getClass();
        org.apache.openjpa.util.Proxy proxy20 = proxyManagerImpl12.newDateProxy((Class) wildcardClass19);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl21 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean22 = proxyManagerImpl21.getDelayCollectionLoading();
        java.util.Calendar calendar23 = null;
        java.util.Calendar calendar24 = proxyManagerImpl21.copyCalendar(calendar23);
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass28 = cacheMap27.getClass();
        org.apache.openjpa.util.Proxy proxy29 = proxyManagerImpl21.newDateProxy((Class) wildcardClass28);
        Object obj30 = new Object();
        Class<?> wildcardClass31 = obj30.getClass();
        java.util.Comparator comparator32 = null;
        org.apache.openjpa.util.Proxy proxy34 = proxyManagerImpl4.newMapProxy((Class) wildcardClass19, (Class) wildcardClass28, (Class) wildcardClass31, comparator32, true);
        java.util.TimeZone timeZone35 = null;
        org.apache.openjpa.util.Proxy proxy36 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass31, timeZone35);
        java.util.Collection collection37 = proxyManagerImpl0.getUnproxyable();
        proxyManagerImpl0.setAssertAllowedType(false);
        boolean boolean40 = proxyManagerImpl0.getDelayCollectionLoading();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(proxy20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(calendar24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(proxy29);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(proxy34);
        org.junit.Assert.assertNotNull(proxy36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl2 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean3 = proxyManagerImpl2.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl4 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean5 = proxyManagerImpl4.getTrackChanges();
        boolean boolean6 = proxyManagerImpl4.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap9.setCacheSize(0);
        Class<?> wildcardClass12 = cacheMap9.getClass();
        java.util.TimeZone timeZone13 = null;
        org.apache.openjpa.util.Proxy proxy14 = proxyManagerImpl4.newCalendarProxy((Class) wildcardClass12, timeZone13);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass18 = cacheMap17.getClass();
        java.util.Comparator comparator19 = null;
        org.apache.openjpa.util.Proxy proxy21 = proxyManagerImpl2.newCollectionProxy((Class) wildcardClass12, (Class) wildcardClass18, comparator19, true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl22 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean23 = proxyManagerImpl22.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl24 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean25 = proxyManagerImpl24.getTrackChanges();
        boolean boolean26 = proxyManagerImpl24.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap29.setCacheSize(0);
        Class<?> wildcardClass32 = cacheMap29.getClass();
        java.util.TimeZone timeZone33 = null;
        org.apache.openjpa.util.Proxy proxy34 = proxyManagerImpl24.newCalendarProxy((Class) wildcardClass32, timeZone33);
        org.apache.openjpa.util.CacheMap cacheMap37 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass38 = cacheMap37.getClass();
        java.util.Comparator comparator39 = null;
        org.apache.openjpa.util.Proxy proxy41 = proxyManagerImpl22.newCollectionProxy((Class) wildcardClass32, (Class) wildcardClass38, comparator39, true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl42 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap43 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set44 = cacheMap43.getPinnedKeys();
        Class<?> wildcardClass45 = cacheMap43.getClass();
        org.apache.openjpa.util.Proxy proxy46 = proxyManagerImpl42.newDateProxy((Class) wildcardClass45);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl47 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean48 = proxyManagerImpl47.getTrackChanges();
        boolean boolean49 = proxyManagerImpl47.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap52 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap52.setCacheSize(0);
        Class<?> wildcardClass55 = cacheMap52.getClass();
        java.util.TimeZone timeZone56 = null;
        org.apache.openjpa.util.Proxy proxy57 = proxyManagerImpl47.newCalendarProxy((Class) wildcardClass55, timeZone56);
        org.apache.openjpa.util.Proxy proxy58 = proxyManagerImpl42.newDateProxy((Class) wildcardClass55);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl59 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean60 = proxyManagerImpl59.getTrackChanges();
        boolean boolean61 = proxyManagerImpl59.getDelayCollectionLoading();
        boolean boolean62 = proxyManagerImpl59.getTrackChanges();
        Class<?> wildcardClass63 = proxyManagerImpl59.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl64 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean65 = proxyManagerImpl64.getTrackChanges();
        boolean boolean66 = proxyManagerImpl64.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl67 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean68 = proxyManagerImpl67.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl69 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean70 = proxyManagerImpl69.getTrackChanges();
        boolean boolean71 = proxyManagerImpl69.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap74 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap74.setCacheSize(0);
        Class<?> wildcardClass77 = cacheMap74.getClass();
        java.util.TimeZone timeZone78 = null;
        org.apache.openjpa.util.Proxy proxy79 = proxyManagerImpl69.newCalendarProxy((Class) wildcardClass77, timeZone78);
        org.apache.openjpa.util.CacheMap cacheMap82 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass83 = cacheMap82.getClass();
        java.util.Comparator comparator84 = null;
        org.apache.openjpa.util.Proxy proxy86 = proxyManagerImpl67.newCollectionProxy((Class) wildcardClass77, (Class) wildcardClass83, comparator84, true);
        org.apache.openjpa.util.Proxy proxy87 = proxyManagerImpl64.newDateProxy((Class) wildcardClass83);
        java.util.Comparator comparator88 = null;
        org.apache.openjpa.util.Proxy proxy90 = proxyManagerImpl42.newCollectionProxy((Class) wildcardClass63, (Class) wildcardClass83, comparator88, true);
        java.util.Comparator comparator91 = null;
        org.apache.openjpa.util.Proxy proxy93 = proxyManagerImpl2.newCollectionProxy((Class) wildcardClass32, (Class) wildcardClass63, comparator91, true);
        java.util.TimeZone timeZone94 = null;
        org.apache.openjpa.util.Proxy proxy95 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass32, timeZone94);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(proxy14);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(proxy21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(proxy34);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(proxy41);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(proxy46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(proxy57);
        org.junit.Assert.assertNotNull(proxy58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(proxy79);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(proxy86);
        org.junit.Assert.assertNotNull(proxy87);
        org.junit.Assert.assertNotNull(proxy90);
        org.junit.Assert.assertNotNull(proxy93);
        org.junit.Assert.assertNotNull(proxy95);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Set set2 = cacheMap1.getPinnedKeys();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap1.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setTrackChanges(false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl4 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set6 = cacheMap5.getPinnedKeys();
        Class<?> wildcardClass7 = cacheMap5.getClass();
        org.apache.openjpa.util.Proxy proxy8 = proxyManagerImpl4.newDateProxy((Class) wildcardClass7);
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCustomProxy((Object) proxyManagerImpl4, true);
        proxyManagerImpl0.setTrackChanges(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(proxy10);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        boolean boolean7 = cacheMap2.containsValue((Object) 100.0f);
        int int8 = cacheMap2.size();
        int int9 = cacheMap2.size();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set11 = cacheMap10.entrySet();
        java.util.Collection collection12 = cacheMap10.values();
        java.util.Set set13 = cacheMap10.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set15 = cacheMap14.getPinnedKeys();
        boolean boolean16 = cacheMap14.isEmpty();
        boolean boolean18 = cacheMap14.unpin((Object) 10);
        cacheMap10.putAll((java.util.Map) cacheMap14);
        boolean boolean20 = cacheMap2.unpin((Object) cacheMap14);
        cacheMap14.setSoftReferenceSize((int) (short) 1);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl23 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean24 = proxyManagerImpl23.getTrackChanges();
        boolean boolean25 = proxyManagerImpl23.getDelayCollectionLoading();
        proxyManagerImpl23.setUnproxyable("");
        proxyManagerImpl23.setUnproxyable("");
        proxyManagerImpl23.setDelayCollectionLoading(true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl32 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean33 = proxyManagerImpl32.getTrackChanges();
        boolean boolean34 = proxyManagerImpl32.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl35 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap36 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set37 = cacheMap36.getPinnedKeys();
        Class<?> wildcardClass38 = cacheMap36.getClass();
        org.apache.openjpa.util.Proxy proxy39 = proxyManagerImpl35.newDateProxy((Class) wildcardClass38);
        java.util.TimeZone timeZone40 = null;
        org.apache.openjpa.util.Proxy proxy41 = proxyManagerImpl32.newCalendarProxy((Class) wildcardClass38, timeZone40);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl42 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean43 = proxyManagerImpl42.getTrackChanges();
        boolean boolean44 = proxyManagerImpl42.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap47 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap47.setCacheSize(0);
        Class<?> wildcardClass50 = cacheMap47.getClass();
        java.util.TimeZone timeZone51 = null;
        org.apache.openjpa.util.Proxy proxy52 = proxyManagerImpl42.newCalendarProxy((Class) wildcardClass50, timeZone51);
        java.util.Comparator comparator53 = null;
        org.apache.openjpa.util.Proxy proxy55 = proxyManagerImpl23.newCollectionProxy((Class) wildcardClass38, (Class) wildcardClass50, comparator53, true);
        boolean boolean56 = cacheMap14.containsValue((Object) wildcardClass38);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap14.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(proxy39);
        org.junit.Assert.assertNotNull(proxy41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(proxy52);
        org.junit.Assert.assertNotNull(proxy55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str6 = cacheMap5.toString();
        java.util.Set set7 = cacheMap5.entrySet();
        boolean boolean8 = cacheMap0.containsKey((Object) set7);
        boolean boolean9 = cacheMap0.isLRU();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl10 = new org.apache.openjpa.util.ProxyManagerImpl();
        proxyManagerImpl10.setTrackChanges(false);
        java.util.Collection collection13 = proxyManagerImpl10.getUnproxyable();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl14 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean15 = proxyManagerImpl14.getTrackChanges();
        boolean boolean16 = proxyManagerImpl14.getDelayCollectionLoading();
        boolean boolean17 = proxyManagerImpl14.getTrackChanges();
        boolean boolean18 = proxyManagerImpl14.getAssertAllowedType();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set20 = cacheMap19.getPinnedKeys();
        Class<?> wildcardClass21 = cacheMap19.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl22 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean23 = proxyManagerImpl22.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl24 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean25 = proxyManagerImpl24.getTrackChanges();
        boolean boolean26 = proxyManagerImpl24.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap29.setCacheSize(0);
        Class<?> wildcardClass32 = cacheMap29.getClass();
        java.util.TimeZone timeZone33 = null;
        org.apache.openjpa.util.Proxy proxy34 = proxyManagerImpl24.newCalendarProxy((Class) wildcardClass32, timeZone33);
        org.apache.openjpa.util.CacheMap cacheMap37 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass38 = cacheMap37.getClass();
        java.util.Comparator comparator39 = null;
        org.apache.openjpa.util.Proxy proxy41 = proxyManagerImpl22.newCollectionProxy((Class) wildcardClass32, (Class) wildcardClass38, comparator39, true);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl42 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean43 = proxyManagerImpl42.getTrackChanges();
        boolean boolean44 = proxyManagerImpl42.getDelayCollectionLoading();
        boolean boolean45 = proxyManagerImpl42.getTrackChanges();
        Class<?> wildcardClass46 = proxyManagerImpl42.getClass();
        java.util.Comparator comparator47 = null;
        org.apache.openjpa.util.Proxy proxy49 = proxyManagerImpl14.newMapProxy((Class) wildcardClass21, (Class) wildcardClass38, (Class) wildcardClass46, comparator47, false);
        org.apache.openjpa.util.Proxy proxy50 = proxyManagerImpl10.newDateProxy((Class) wildcardClass21);
        boolean boolean51 = cacheMap0.pin((Object) proxy50);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(proxy34);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(proxy41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(proxy49);
        org.junit.Assert.assertNotNull(proxy50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        boolean boolean6 = cacheMap2.isEmpty();
        cacheMap2.setCacheSize(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap4.setCacheSize(0);
        java.util.Set set7 = cacheMap4.entrySet();
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        java.util.Date date1 = null;
        java.util.Date date2 = proxyManagerImpl0.copyDate(date1);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl3 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean4 = proxyManagerImpl3.getDelayCollectionLoading();
        java.util.Calendar calendar5 = null;
        java.util.Calendar calendar6 = proxyManagerImpl3.copyCalendar(calendar5);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass10 = cacheMap9.getClass();
        org.apache.openjpa.util.Proxy proxy11 = proxyManagerImpl3.newDateProxy((Class) wildcardClass10);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl12 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean13 = proxyManagerImpl12.getTrackChanges();
        boolean boolean14 = proxyManagerImpl12.getDelayCollectionLoading();
        boolean boolean15 = proxyManagerImpl12.getTrackChanges();
        Class<?> wildcardClass16 = proxyManagerImpl12.getClass();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap19.setCacheSize(0);
        Class<?> wildcardClass22 = cacheMap19.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl23 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean24 = proxyManagerImpl23.getDelayCollectionLoading();
        java.util.Calendar calendar25 = null;
        java.util.Calendar calendar26 = proxyManagerImpl23.copyCalendar(calendar25);
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass30 = cacheMap29.getClass();
        org.apache.openjpa.util.Proxy proxy31 = proxyManagerImpl23.newDateProxy((Class) wildcardClass30);
        java.util.Comparator comparator32 = null;
        org.apache.openjpa.util.Proxy proxy34 = proxyManagerImpl3.newMapProxy((Class) wildcardClass16, (Class) wildcardClass22, (Class) wildcardClass30, comparator32, false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl35 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean36 = proxyManagerImpl35.getTrackChanges();
        proxyManagerImpl35.setTrackChanges(false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl39 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap40 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set41 = cacheMap40.getPinnedKeys();
        Class<?> wildcardClass42 = cacheMap40.getClass();
        org.apache.openjpa.util.Proxy proxy43 = proxyManagerImpl39.newDateProxy((Class) wildcardClass42);
        org.apache.openjpa.util.Proxy proxy45 = proxyManagerImpl35.newCustomProxy((Object) proxyManagerImpl39, true);
        boolean boolean46 = proxyManagerImpl39.getAssertAllowedType();
        boolean boolean47 = proxyManagerImpl39.getAssertAllowedType();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl48 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean49 = proxyManagerImpl48.getDelayCollectionLoading();
        java.util.Calendar calendar50 = null;
        java.util.Calendar calendar51 = proxyManagerImpl48.copyCalendar(calendar50);
        org.apache.openjpa.util.CacheMap cacheMap54 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass55 = cacheMap54.getClass();
        org.apache.openjpa.util.Proxy proxy56 = proxyManagerImpl48.newDateProxy((Class) wildcardClass55);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl57 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean58 = proxyManagerImpl57.getTrackChanges();
        boolean boolean59 = proxyManagerImpl57.getDelayCollectionLoading();
        boolean boolean60 = proxyManagerImpl57.getTrackChanges();
        Class<?> wildcardClass61 = proxyManagerImpl57.getClass();
        org.apache.openjpa.util.CacheMap cacheMap64 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap64.setCacheSize(0);
        Class<?> wildcardClass67 = cacheMap64.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl68 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean69 = proxyManagerImpl68.getDelayCollectionLoading();
        java.util.Calendar calendar70 = null;
        java.util.Calendar calendar71 = proxyManagerImpl68.copyCalendar(calendar70);
        org.apache.openjpa.util.CacheMap cacheMap74 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass75 = cacheMap74.getClass();
        org.apache.openjpa.util.Proxy proxy76 = proxyManagerImpl68.newDateProxy((Class) wildcardClass75);
        java.util.Comparator comparator77 = null;
        org.apache.openjpa.util.Proxy proxy79 = proxyManagerImpl48.newMapProxy((Class) wildcardClass61, (Class) wildcardClass67, (Class) wildcardClass75, comparator77, false);
        java.util.TimeZone timeZone80 = null;
        org.apache.openjpa.util.Proxy proxy81 = proxyManagerImpl39.newCalendarProxy((Class) wildcardClass61, timeZone80);
        java.util.Comparator comparator82 = null;
        org.apache.openjpa.util.Proxy proxy84 = proxyManagerImpl0.newCollectionProxy((Class) wildcardClass30, (Class) wildcardClass61, comparator82, false);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(calendar6);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(proxy11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(calendar26);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(proxy31);
        org.junit.Assert.assertNotNull(proxy34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(proxy43);
        org.junit.Assert.assertNotNull(proxy45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(calendar51);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(proxy56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(calendar71);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(proxy76);
        org.junit.Assert.assertNotNull(proxy79);
        org.junit.Assert.assertNotNull(proxy81);
        org.junit.Assert.assertNotNull(proxy84);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        boolean boolean4 = cacheMap2.isEmpty();
        boolean boolean5 = cacheMap2.isEmpty();
        cacheMap2.clear();
        String str7 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1000);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CacheMap:{}::{}" + "'", str7, "CacheMap:{}::{}");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl3 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean4 = proxyManagerImpl3.getTrackChanges();
        boolean boolean5 = proxyManagerImpl3.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap8.setCacheSize(0);
        Class<?> wildcardClass11 = cacheMap8.getClass();
        java.util.TimeZone timeZone12 = null;
        org.apache.openjpa.util.Proxy proxy13 = proxyManagerImpl3.newCalendarProxy((Class) wildcardClass11, timeZone12);
        proxyManagerImpl3.setDelayCollectionLoading(true);
        boolean boolean16 = proxyManagerImpl3.getTrackChanges();
        proxyManagerImpl3.setAssertAllowedType(true);
        proxyManagerImpl3.setUnproxyable("CacheMap:{}::{}");
        boolean boolean21 = cacheMap2.containsValue((Object) "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(proxy13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        boolean boolean6 = cacheMap4.isEmpty();
        boolean boolean8 = cacheMap4.unpin((Object) 10);
        cacheMap0.putAll((java.util.Map) cacheMap4);
        boolean boolean10 = cacheMap4.isLRU();
        cacheMap4.setSoftReferenceSize(0);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str16 = cacheMap15.toString();
        cacheMap15.setSoftReferenceSize(1);
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean22 = cacheMap21.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set24 = cacheMap23.entrySet();
        java.util.Collection collection25 = cacheMap23.values();
        cacheMap21.putAll((java.util.Map) cacheMap23, true);
        boolean boolean28 = cacheMap15.unpin((Object) cacheMap21);
        java.util.Set set29 = cacheMap15.entrySet();
        boolean boolean30 = cacheMap15.isLRU();
        cacheMap4.putAll((java.util.Map) cacheMap15, false);
        int int33 = cacheMap4.getCacheSize();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{}::{}" + "'", str16, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1000 + "'", int33 == 1000);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str6 = cacheMap5.toString();
        java.util.Set set7 = cacheMap5.entrySet();
        boolean boolean8 = cacheMap0.containsKey((Object) set7);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        boolean boolean7 = cacheMap2.containsValue((Object) 100.0f);
        int int8 = cacheMap2.size();
        int int9 = cacheMap2.size();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str13 = cacheMap12.toString();
        cacheMap12.setSoftReferenceSize(1);
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean19 = cacheMap18.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set21 = cacheMap20.entrySet();
        java.util.Collection collection22 = cacheMap20.values();
        cacheMap18.putAll((java.util.Map) cacheMap20, true);
        boolean boolean25 = cacheMap12.unpin((Object) cacheMap18);
        java.util.Set set26 = cacheMap12.entrySet();
        boolean boolean27 = cacheMap2.containsValue((Object) cacheMap12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CacheMap:{}::{}" + "'", str13, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        proxyManagerImpl0.setAssertAllowedType(true);
        boolean boolean4 = proxyManagerImpl0.getAssertAllowedType();
        boolean boolean5 = proxyManagerImpl0.getTrackChanges();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl6 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean7 = proxyManagerImpl6.getTrackChanges();
        proxyManagerImpl6.setTrackChanges(false);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl10 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set12 = cacheMap11.getPinnedKeys();
        Class<?> wildcardClass13 = cacheMap11.getClass();
        org.apache.openjpa.util.Proxy proxy14 = proxyManagerImpl10.newDateProxy((Class) wildcardClass13);
        org.apache.openjpa.util.Proxy proxy16 = proxyManagerImpl6.newCustomProxy((Object) proxyManagerImpl10, true);
        boolean boolean17 = proxyManagerImpl10.getAssertAllowedType();
        boolean boolean18 = proxyManagerImpl10.getAssertAllowedType();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl19 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean20 = proxyManagerImpl19.getDelayCollectionLoading();
        java.util.Calendar calendar21 = null;
        java.util.Calendar calendar22 = proxyManagerImpl19.copyCalendar(calendar21);
        org.apache.openjpa.util.CacheMap cacheMap25 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass26 = cacheMap25.getClass();
        org.apache.openjpa.util.Proxy proxy27 = proxyManagerImpl19.newDateProxy((Class) wildcardClass26);
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl28 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean29 = proxyManagerImpl28.getTrackChanges();
        boolean boolean30 = proxyManagerImpl28.getDelayCollectionLoading();
        boolean boolean31 = proxyManagerImpl28.getTrackChanges();
        Class<?> wildcardClass32 = proxyManagerImpl28.getClass();
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap35.setCacheSize(0);
        Class<?> wildcardClass38 = cacheMap35.getClass();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl39 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean40 = proxyManagerImpl39.getDelayCollectionLoading();
        java.util.Calendar calendar41 = null;
        java.util.Calendar calendar42 = proxyManagerImpl39.copyCalendar(calendar41);
        org.apache.openjpa.util.CacheMap cacheMap45 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        Class<?> wildcardClass46 = cacheMap45.getClass();
        org.apache.openjpa.util.Proxy proxy47 = proxyManagerImpl39.newDateProxy((Class) wildcardClass46);
        java.util.Comparator comparator48 = null;
        org.apache.openjpa.util.Proxy proxy50 = proxyManagerImpl19.newMapProxy((Class) wildcardClass32, (Class) wildcardClass38, (Class) wildcardClass46, comparator48, false);
        org.apache.openjpa.util.Proxy proxy51 = proxyManagerImpl10.newDateProxy((Class) wildcardClass38);
        org.apache.openjpa.util.Proxy proxy53 = proxyManagerImpl0.newCustomProxy((Object) wildcardClass38, true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(proxy14);
        org.junit.Assert.assertNotNull(proxy16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(calendar22);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(proxy27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(calendar42);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(proxy47);
        org.junit.Assert.assertNotNull(proxy50);
        org.junit.Assert.assertNotNull(proxy51);
        org.junit.Assert.assertNull(proxy53);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        boolean boolean2 = proxyManagerImpl0.getDelayCollectionLoading();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap5.setCacheSize(0);
        Class<?> wildcardClass8 = cacheMap5.getClass();
        java.util.TimeZone timeZone9 = null;
        org.apache.openjpa.util.Proxy proxy10 = proxyManagerImpl0.newCalendarProxy((Class) wildcardClass8, timeZone9);
        proxyManagerImpl0.setDelayCollectionLoading(true);
        boolean boolean13 = proxyManagerImpl0.getAssertAllowedType();
        proxyManagerImpl0.setTrackChanges(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (short) 1);
        java.util.Set set3 = cacheMap2.getPinnedKeys();
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        boolean boolean2 = cacheMap0.isEmpty();
        cacheMap0.readLock();
        boolean boolean4 = cacheMap0.isEmpty();
        String str5 = cacheMap0.toString();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        cacheMap2.setCacheSize(0);
        java.util.Set set5 = cacheMap2.entrySet();
        boolean boolean6 = cacheMap2.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str10 = cacheMap9.toString();
        boolean boolean11 = cacheMap9.isEmpty();
        java.util.Set set12 = cacheMap9.entrySet();
        int int13 = cacheMap9.size();
        boolean boolean14 = cacheMap2.unpin((Object) cacheMap9);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CacheMap:{}::{}" + "'", str10, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.entrySet();
        java.util.Collection collection2 = cacheMap0.values();
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        boolean boolean6 = cacheMap4.isEmpty();
        boolean boolean8 = cacheMap4.unpin((Object) 10);
        cacheMap0.putAll((java.util.Map) cacheMap4);
        cacheMap4.setCacheSize((int) (byte) -1);
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set13 = cacheMap12.getPinnedKeys();
        boolean boolean14 = cacheMap12.isEmpty();
        boolean boolean16 = cacheMap12.unpin((Object) 10);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set18 = cacheMap17.entrySet();
        java.util.Collection collection19 = cacheMap17.values();
        java.util.Set set20 = cacheMap17.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set22 = cacheMap21.getPinnedKeys();
        boolean boolean23 = cacheMap21.isEmpty();
        boolean boolean25 = cacheMap21.unpin((Object) 10);
        cacheMap17.putAll((java.util.Map) cacheMap21);
        java.util.Set set27 = cacheMap17.keySet();
        boolean boolean28 = cacheMap12.pin((Object) set27);
        boolean boolean29 = cacheMap4.unpin((Object) cacheMap12);
        java.util.Collection collection30 = cacheMap4.values();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl31 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean32 = proxyManagerImpl31.getTrackChanges();
        boolean boolean33 = proxyManagerImpl31.getDelayCollectionLoading();
        proxyManagerImpl31.setUnproxyable("");
        org.apache.openjpa.util.CacheMap cacheMap38 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str39 = cacheMap38.toString();
        String str40 = cacheMap38.toString();
        java.util.Map map41 = proxyManagerImpl31.copyMap((java.util.Map) cacheMap38);
        boolean boolean42 = cacheMap4.containsKey((Object) map41);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "CacheMap:{}::{}" + "'", str39, "CacheMap:{}::{}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "CacheMap:{}::{}" + "'", str40, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(false);
        int int2 = cacheMap1.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap3.containsKey((Object) 10.0f);
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set7 = cacheMap6.entrySet();
        Object obj8 = cacheMap3.remove((Object) set7);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        boolean boolean12 = cacheMap11.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set14 = cacheMap13.entrySet();
        java.util.Collection collection15 = cacheMap13.values();
        cacheMap11.putAll((java.util.Map) cacheMap13, true);
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set19 = cacheMap18.entrySet();
        java.util.Collection collection20 = cacheMap18.values();
        java.util.Set set21 = cacheMap18.entrySet();
        boolean boolean22 = cacheMap13.pin((Object) cacheMap18);
        cacheMap3.putAll((java.util.Map) cacheMap18, true);
        cacheMap1.putAll((java.util.Map) cacheMap18, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean5 = cacheMap3.pin((Object) "CacheMap:{}::{}");
        boolean boolean6 = cacheMap0.pin((Object) "CacheMap:{}::{}");
        String str7 = cacheMap0.toString();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl8 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean9 = proxyManagerImpl8.getTrackChanges();
        boolean boolean10 = proxyManagerImpl8.getDelayCollectionLoading();
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl11 = new org.apache.openjpa.util.ProxyManagerImpl();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set13 = cacheMap12.getPinnedKeys();
        Class<?> wildcardClass14 = cacheMap12.getClass();
        org.apache.openjpa.util.Proxy proxy15 = proxyManagerImpl11.newDateProxy((Class) wildcardClass14);
        java.util.TimeZone timeZone16 = null;
        org.apache.openjpa.util.Proxy proxy17 = proxyManagerImpl8.newCalendarProxy((Class) wildcardClass14, timeZone16);
        boolean boolean18 = proxyManagerImpl8.getTrackChanges();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set20 = cacheMap19.entrySet();
        java.util.Collection collection21 = cacheMap19.values();
        java.util.Set set22 = cacheMap19.entrySet();
        Object obj23 = cacheMap0.put((Object) proxyManagerImpl8, (Object) set22);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CacheMap:{}::{}" + "'", str7, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(proxy15);
        org.junit.Assert.assertNotNull(proxy17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        boolean boolean3 = cacheMap1.pin((Object) "CacheMap:{}::{}");
        int int4 = cacheMap1.getSoftReferenceSize();
        java.util.Collection collection5 = cacheMap1.values();
        String str6 = cacheMap1.toString();
        cacheMap1.writeLock();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1);
        String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize(1);
        cacheMap2.clear();
        String str7 = cacheMap2.toString();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap2.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CacheMap:{}::{}" + "'", str7, "CacheMap:{}::{}");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, 100);
        cacheMap2.readLock();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.openjpa.util.ProxyManagerImpl proxyManagerImpl0 = new org.apache.openjpa.util.ProxyManagerImpl();
        boolean boolean1 = proxyManagerImpl0.getTrackChanges();
        java.util.Calendar calendar2 = null;
        java.util.Calendar calendar3 = proxyManagerImpl0.copyCalendar(calendar2);
        proxyManagerImpl0.setAssertAllowedType(false);
        java.util.Collection collection6 = proxyManagerImpl0.getUnproxyable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(calendar3);
        org.junit.Assert.assertNotNull(collection6);
    }
}

