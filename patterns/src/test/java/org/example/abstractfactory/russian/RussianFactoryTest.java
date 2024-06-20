package org.example.abstractfactory.russian;

import org.example.abstractfactory.Factory;
import org.example.abstractfactory.Kayak;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RussianFactoryTest {

    private Factory factory;

    @BeforeEach
    void setUp() {
        factory = new RussianFactory();
    }

    @Test
    void getKayak() {
        Assertions.assertEquals(RussianKayak.class, factory.getKayak().getClass());
    }

    @Test
    void getMotorbike() {
        Assertions.assertEquals(RussianMotorbike.class, factory.getMotorbike().getClass());
    }

}
