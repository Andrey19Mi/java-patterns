package org.example.state;

/**
 * Класс ходьбы.
 * @author Andrey Udalov
 */
public class Hike implements Activity {

    /**
     * Активность ходьбы.
     * @return "Идет"
     */
    @Override
    public String doIt() {
        return "Идет";
    }

}
