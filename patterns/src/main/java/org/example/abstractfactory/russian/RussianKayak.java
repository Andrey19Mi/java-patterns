package org.example.abstractfactory.russian;

import lombok.extern.slf4j.Slf4j;
import org.example.abstractfactory.Kayak;

/**
 * Русская байдарка
 * @author Andrey Udalov
 */
@Slf4j
public class RussianKayak implements Kayak {

    /**
     * Метод приводящий в движение байдарку
     */
    @Override
    public void go() {
        log.info("Байдарка плывет");
    }

}
