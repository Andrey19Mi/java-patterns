package org.example.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * Класс расширяющий декоратор. Представляет надувной каяк.
 * @author Andrey Udalov
 */
@Slf4j
public class InflatableKayak extends KayakDecorator {

    /**
     * Вызывает конструктор каяка.
     * @param kayak
     */
    public InflatableKayak(Kayak kayak) {
        super(kayak);
    }

    /**
     * Метод переопределяющий метод go() каяка.
     * @see Kayak#go()
     */
    @Override
    public void go() {
        super.go();
        log.info("Каякер устал...");
    }

}
