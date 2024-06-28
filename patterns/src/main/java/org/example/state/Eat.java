package org.example.state;

/**
 * Класс приема пищи.
 * @author Andrey Udalov
 */
public class Eat implements Activity {

    /**
     * Активность приема пищи.
     * @return "Ест"
     */
    @Override
    public String doIt() {
        return "Ест";
    }

}
