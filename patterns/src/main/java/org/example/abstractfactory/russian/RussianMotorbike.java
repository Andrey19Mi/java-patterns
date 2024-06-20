package org.example.abstractfactory.russian;

import lombok.extern.slf4j.Slf4j;
import org.example.abstractfactory.Motorbike;

/**
 * Русский мотоцикл
 * @author Andrey Udalov
 */
@Slf4j
public class RussianMotorbike implements Motorbike {

    /**
     * Метод приводящий машину в движение
     */
    @Override
    public void drive() {
        log.info("Машина едет...");
    }

}
