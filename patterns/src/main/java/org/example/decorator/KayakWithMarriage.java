package org.example.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * Класс расширяющий декоратор. Представляет каяк с браком.
 * @author Andrey Udalov
 */
@Slf4j
public class KayakWithMarriage extends  KayakDecorator {

    /**
     * Вызывает конструктор каяка.
     * @param kayak
     */
    public KayakWithMarriage(Kayak kayak) {
        super(kayak);
    }

    /**
     * Метод переопределяющий метод go() каяка.
     * @see Kayak#go()
     */
    @Override
    public void go() {
        super.go();
        log.info("Каяк сломался в неподходящий момент...");
    }

}
