package org.example.singleton;

/**
 * Lazy Initialization реализация паттерна Singleton.
 * @author Andrey Udalov
 */
public final class LazySingleton {

    /**
     * Поле хранящее экземпляр класса.
     */
    private static LazySingleton instance;
    /**
     * Поле хранящее некоторое значение int.
     */
    private int someValue;

    private LazySingleton() {}

    /**
     * Метод возвращающий экземпляр класса или создающий экземпляр, если он не инициализирован.
     * @return экземпляр класса
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * Метод возвращающий значение поля someValue.
     * @return someValue
     */
    public int getSomeValue() {
        return someValue;
    }

    /**
     * Метод изменяющий поле @see sameValue на value.
     * @param value int значение
     */
    public void setSomeValue(int value) {
        this.someValue = value;
    }

}
