package org.example.abstractfactory;

/**
 * Фабрика.
 * @author Andrey Udalov
 */
public interface Factory {

    /**
     * Получение каяка.
     * @return Kayak
     */
    Kayak getKayak();

    /**
     * Получение мотоцикла.
     * @return Motorbike
     */
    Motorbike getMotorbike();

}
