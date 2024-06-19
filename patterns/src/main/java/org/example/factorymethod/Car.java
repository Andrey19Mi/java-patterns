package org.example.factorymethod;

/**
 * Интерфейс представляющий машину.
 */
public interface Car {

    /**
     * Метод позволяющий машине ехать.
     */
    void drive();

    /**
     * Метод изменяющий скорость машины.
     * @param speed
     */
    void setSpeed(int speed);

    /**
     * Метод возвращающий скорость.
     * @return speed
     */
    int getSpeed();

    /**
     * Метод останавливающей машину.
     */
    void stop();

}
