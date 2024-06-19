package org.example.factorymethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarSelectorTest {

    private final CarSelector carSelector = new CarSelector();

    @Test
    void testCreateRedCar() {
        Assertions.assertEquals(RedCar.class,
                carSelector.createCar(CarType.RED).getClass());
    }

    @Test
    void testCreateBlackCar() {
        Assertions.assertEquals(BlackCar.class,
                carSelector.createCar(CarType.BLACK).getClass());
    }
}