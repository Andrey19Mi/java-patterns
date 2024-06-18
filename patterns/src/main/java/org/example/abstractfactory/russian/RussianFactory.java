package org.example.abstractfactory.russian;

import org.example.abstractfactory.Factory;
import org.example.abstractfactory.Kayak;
import org.example.abstractfactory.Motorbike;

/**
 * Абстрактная фабрика русской техники
 */
public class RussianFactory implements Factory {

    /**
     * Метод возвращающий русскую байдарку
     * @return RussianKayak
     * @see RussianKayak
     */
    @Override
    public Kayak getKayak() {
        return new RussianKayak();
    }

    /**
     * Метод возвращающий русскую машину
     * @return Motorbike
     * @see Motorbike
     */
    @Override
    public Motorbike getMotorbike() {
        return new RussianMotorbike();
    }

}
