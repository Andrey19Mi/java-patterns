package org.example.decorator;

/**
 * Класс декоратор для каяка
 * @author Andrey Udalov
 */
public class KayakDecorator implements Kayak {

    /**
     * Поле хранящее каяк.
     */
    private Kayak kayak;

    /**
     * Конструктор получающий каяк.
     * @param kayak
     */
    public KayakDecorator(Kayak kayak) {
        this.kayak = kayak;
    }

    /**
     * Метод вызывающий метод объекта класса Kayak.
     * @see Kayak
     */
    @Override
    public void go() {
        kayak.go();
    }

}
