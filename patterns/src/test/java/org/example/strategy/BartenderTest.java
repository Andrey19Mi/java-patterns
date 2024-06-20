package org.example.strategy;

import org.junit.jupiter.api.Test;

class BartenderTest {

    @Test
    void execute() {

        Bartender bartender = new Bartender();
        bartender.setIngredient(new Alcohol());
        bartender.execute();
        bartender.setIngredient(new MineralWater());
        bartender.execute();
        bartender.setIngredient(new Syrup());
        bartender.execute();
    }

}