package org.example.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * Алкоголь.
 * @author Andrey Udalov
 */
@Slf4j
public class Alcohol implements Ingredient {

    /**
     * Добавить алкоголь.
     */
    @Override
    public void add() {
        log.info("Добавлен алкоголь");
    }

}
