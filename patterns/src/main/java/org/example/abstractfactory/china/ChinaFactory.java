package org.example.abstractfactory.china;

import org.example.abstractfactory.Factory;
import org.example.abstractfactory.Kayak;
import org.example.abstractfactory.Motorbike;

/**
 * Абстрактная фабрика китайской техники
 * @author Andrey Udalov
 */
public class ChinaFactory implements Factory {

    /**
     * Метод возвращающий китайский каяк
     * @return ChinaKayak
     * @see ChinaKayak
     */
    @Override
    public Kayak getKayak() {
        return new ChinaKayak();
    }

    /**
     * Метод возвращающий китайский мотоцикл
     * @return ChinaMotorbike
     * @see ChinaMotorbike
     */
    @Override
    public Motorbike getMotorbike() {
        return new ChinaMotorbike();
    }

}
