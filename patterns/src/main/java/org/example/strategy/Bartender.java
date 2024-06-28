package org.example.strategy;

/**
 * Бармен.
 * @author Andrey Udalov
 */
public class Bartender {

    /**
     * Ингридиент у бармена.
     */
    private Ingredient ingredient;

    /**
     * Установка ингридиента бармену.
     * @param ingredient
     */
    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    /**
     * Добавление ингридиента в коктель.
     */
    public void execute() {
        ingredient.add();
    }

}
