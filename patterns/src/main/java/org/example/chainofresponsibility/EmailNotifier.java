package org.example.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * Отправляет сообщение на почту.
 * @author Andrey Udalov
 */
@Slf4j
public class EmailNotifier extends Notifier {

    /**
     * Задает приоритетность уведомления.
     * @param priority
     */
    public EmailNotifier(int priority) {
        super(priority);
    }

    /**
     * Отправляет сообщение на почту.
     * @param message
     */
    @Override
    public void write(String message) {
        log.info("Оправлено email сообщение: {}", message);
    }

}
