package org.example.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Класс реализующий интерфейс Car.
 * @see Car
 * @author Andrey Udalov
 */
public class BlackCar implements Car {

    /**
     * Логер с фасадом slf4j
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(BlackCar.class);
    /**
     * Скорость машины.
     */
    private int speed;

    /**
     * Метод позволяющий машине ехать. Выводит в консоль speed.
     * @see #speed
     */
    @Override
    public void drive() {
        LOGGER.info("Черная машина едет со скоростью {}", speed);
    }

    /**
     * Метод изменяющий скорость машины speed.
     * @param speed
     */
    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Метод возвращающий скорость.
     * @return speed
     */
    @Override
    public int getSpeed() {
        return speed;
    }

    /**
     * Метод останавливающей машину.
     */
    @Override
    public void stop() {
        LOGGER.info("Черная машина остановилась");
    }

}
