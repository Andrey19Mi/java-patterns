package org.example.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MineralWater implements Ingredient {

    @Override
    public void add() {
        log.info("Добавлена минералка");
    }

}
