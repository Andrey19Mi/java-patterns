package org.example.strategy;

public class Bartender {

    private Ingredient ingredient;

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public void execute() {
        ingredient.add();
    }

}
