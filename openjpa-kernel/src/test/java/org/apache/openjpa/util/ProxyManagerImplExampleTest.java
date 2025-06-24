package org.apache.openjpa.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ProxyManagerImplExampleTest {
    private static final int NUM_ELEM = 10;
    private ProxyManager proxyManager;

    private static Stream<Arguments> provideDataCopyCollectionTest() {
        return Stream.of(
                Arguments.of(fillCollectionWithInteger(new HashSet<>())),
                Arguments.of(fillCollectionWithString(new LinkedList<>()))
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

    @BeforeEach
    void setup() {
        proxyManager = new ProxyManagerImpl();
    }

    @ParameterizedTest
    @MethodSource("provideDataCopyCollectionTest")
    void copyCollectionTest(Collection<?> collection) {
        Collection<?> copy = proxyManager.copyCollection(collection);
        assertIterableEquals(collection, copy);
    }

    @Test
    void copyCollectionNull() {
        Object copy = proxyManager.copyCollection(null);
        assertNull(copy);
    }
}
