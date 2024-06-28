package org.example.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * Минералка
 * @author Andrey Udalov
 */
@Slf4j
public class MineralWater implements Ingredient {

    /**
     * Добавить минералку.
     */
    @Override
    public void add() {
        log.info("Добавлена минералка");
    }

}
