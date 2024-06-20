package org.example.state;

/**
 * Класс сна.
 * @author Andrey Udalov
 */
public class Sleep implements Activity {

    /**
     * Активность сна.
     * @return "Спит"
     */
    @Override
    public String doIt() {
        return "Спит";
    }

}
