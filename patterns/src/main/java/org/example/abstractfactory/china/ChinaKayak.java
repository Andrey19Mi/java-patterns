package org.example.abstractfactory.china;

import lombok.extern.slf4j.Slf4j;
import org.example.abstractfactory.Kayak;

/**
 * Китайская байдарка
 * @author Andrey Udalov
 */
@Slf4j
public class ChinaKayak implements Kayak {

    /**
     * Метод приводящий байдарку в движение
     */
    @Override
    public void go() {
        log.info("байдарка плывет...");
    }

}
