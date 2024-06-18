package org.example.abstractfactory.china;

import org.example.abstractfactory.Factory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChinaFactoryTest {

    private Factory factory;

    @BeforeEach
    void setUp() {
        factory = new ChinaFactory();
    }

    @Test
    void getKayak() {
        Assertions.assertEquals(ChinaKayak.class, factory.getKayak().getClass());
    }

    @Test
    void getMotorbike() {
        Assertions.assertEquals(ChinaMotorbike.class, factory.getMotorbike().getClass());
    }

}
