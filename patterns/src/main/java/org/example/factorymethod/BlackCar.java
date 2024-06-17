package org.example.factorymethod;

/**
 * Класс реализующий интерфейс Car.
 * @see Car
 */
public class BlackCar implements Car {

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
        System.out.printf("Красная машина едет со скоростью %d \n", speed);
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
        System.out.println("Красная машина остановилась");
    }

}
