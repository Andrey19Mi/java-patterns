package org.example.observer;

/**
 * Интерфейс наблюдаемого.
 * @author Andrey Udalov
 */
public interface Observed {

    /**
     * Добавляет наблюдателя.
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * Убирает наблюдателя.
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * Уведомляет наблюдателя.
     */
    void notifyObserver();

}
