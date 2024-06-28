package org.example.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * Сироп.
 * @author Andrey Udalov
 */
@Slf4j
public class Syrup implements Ingredient {

    /**
     * Добавить сироп.
     */
    @Override
    public void add() {
        log.info("Добавлен сиропа");
    }

}
