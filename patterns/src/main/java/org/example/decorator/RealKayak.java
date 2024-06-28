package org.example.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * Класс реализующий интерфейс Kayak.
 * @author Andrey Udalov
 */
@Slf4j
public class RealKayak implements Kayak {

    /**
     * Метод приводящий в движение каяк.
     */
    @Override
    public void go() {
        log.info("Каяк плывет...");
    }

}
