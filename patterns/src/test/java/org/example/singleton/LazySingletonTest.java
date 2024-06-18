package org.example.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LazySingletonTest {

    private LazySingleton singleton;

    @BeforeEach
    void setUp() {
        singleton = LazySingleton.getInstance();
        singleton.setSomeValue(0);
    }

    @Test
    void testSingletonInstance() {
        Assertions.assertEquals(singleton, LazySingleton.getInstance());
    }

    @Test
    void testGetSomeValue() {
        Assertions.assertEquals(0, singleton.getSomeValue());
    }

    @Test
    void testSetSomeValue() {
        singleton.setSomeValue(1);
        Assertions.assertEquals(1, singleton.getSomeValue());
    }

}
