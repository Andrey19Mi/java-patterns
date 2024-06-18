package org.example.singleton;

/**
 * Simple Solution реализация паттерна Singleton.
 * @author Andrey Udalov
 */
public final class SynchronizedSingleton {

    /**
     * Поле хранящее экземпляр класса.
     */
    private static SynchronizedSingleton instance;

    /**
     * Поле хранящее некоторое значение int.
     */
    private int someValue;

    private SynchronizedSingleton() {
    }

    /**
     * Метод возвращающий экземпляр класса.
     * @return экземпляр класса
     */
    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
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
     * @param someValue int значение
     */
    public void setSomeValue(int someValue) {
        this.someValue = someValue;
    }

}
