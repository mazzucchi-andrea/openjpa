package org.apache.openjpa.util;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.apache.openjpa.TestMacros.FAIL;
import static org.apache.openjpa.TestMacros.PASS;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CopyArray2Test {
    private static Object array;
    private static boolean expectedBehavior;
    private ProxyManagerImpl proxyManager;

    public CopyArray2Test(ProxyManagerCopyArrayTestParams params) {
        configure(params);
    }

    @Parameterized.Parameters
    public static Collection<ProxyManagerCopyArrayTestParams[]> getTestParameters() {
        return Arrays.asList(new ProxyManagerCopyArrayTestParams[][]{
                {new ProxyManagerCopyArrayTestParams(new int[]{1, 2, 3}, PASS)},
                {new ProxyManagerCopyArrayTestParams("", FAIL)},
                {new ProxyManagerCopyArrayTestParams("Test", FAIL)},
                {new ProxyManagerCopyArrayTestParams(null, PASS)},
        });
    }

    public void configure(ProxyManagerCopyArrayTestParams params) {
        array = params.array;
        expectedBehavior = params.expectedBehavior;
    }

    @Before
    public void setUp() {
        proxyManager = new ProxyManagerImpl();
    }

    @Test
    public void copyArrayTest() {
        try {
            Object copy = proxyManager.copyArray(array);
            assertArrayEquals((int[]) array, (int[]) copy);
        } catch (Exception e) {
            assertFalse(expectedBehavior);
            return;
        }
        assertTrue("Fail expected", expectedBehavior);
    }

    public static class ProxyManagerCopyArrayTestParams {
        private final Object array;
        private final boolean expectedBehavior;

        public ProxyManagerCopyArrayTestParams(Object array, boolean expectedBehavior) {
            this.array = array;
            this.expectedBehavior = expectedBehavior;
        }
    }
}
