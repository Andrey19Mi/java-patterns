package org.example.singleton;

/**
 * Simple Solution реализация паттерна Singleton.
 */
public final class SimpleSingleton {

    /**
     * Поле хранящее экземпляр класса.
     */
    private static final SimpleSingleton INSTANCE = new SimpleSingleton();

    /**
     * Поле хранящее некоторое значение int.
     */
    private int someValue;

    private SimpleSingleton() {
    }

    /**
     * Метод возвращающий экземпляр класса.
     * @return экземпляр класса
     */
    public static SimpleSingleton getInstance() {
        return INSTANCE;
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
        someValue = value;
    }

}
