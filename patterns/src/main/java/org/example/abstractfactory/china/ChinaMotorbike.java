package org.example.abstractfactory.china;

import lombok.extern.slf4j.Slf4j;
import org.example.abstractfactory.Motorbike;

/**
 * Русский мотоцикл
 * @author Andrey Udalov
 */
@Slf4j
public class ChinaMotorbike implements Motorbike {

    /**
     * Метод приводящий в движение мотоцикл
     */
    @Override
    public void drive() {
        log.info("машина едет...");
    }

}
