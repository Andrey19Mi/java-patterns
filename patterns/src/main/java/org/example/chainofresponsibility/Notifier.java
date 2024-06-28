package org.example.chainofresponsibility;

/**
 * Логика работы с сообщениями.
 * @author Andrey Udalov
 */
public abstract class Notifier {

    /**
     * Приоритетность.
     */
    private int priority;
    /**
     * Следующее в цепочке уведомление.
     */
    private Notifier next;

    /**
     * Задает приоритетность уведомления.
     * @param priority
     */
    public Notifier(int priority) {
        this.priority = priority;
    }

    /**
     * Сеттер следующего уведомления.
     * @param next
     */
    public void setNext(Notifier next) {
        this.next = next;
    }

    /**
     * Передаёт по цепочке сообщение.
     * @param message
     * @param level
     */
    public void notifierManager(String message, int level) {
        if (level >= priority) {
            write(message);
        }
        if (next != null) {
            next.notifierManager(message, level);
        }
    }

    /**
     * Оправление сообщение.
     * @param message
     */
    public abstract void write(String message);

}
