package org.example.factorymethod;

/**
 * Класс реализующий фабричный метод.
 */
public class CarSelector {

    /**
     * Поле хранящее машину
     */
    private Car car;

    /**
     * Метод возвращающий объект класса реализующего интерфейс Car, в зависимости от
     * CarType
     * @param carType
     * @return Car
     * @see Car
     * @see CarType
     */
    public Car createCar(CarType carType) {
        switch (carType) {
            case RED -> car = new RedCar();
            case BLACK -> car = new BlackCar();
            default -> throw new RuntimeException("Тип машины не реализован");
        }
        return car;
    }

}
