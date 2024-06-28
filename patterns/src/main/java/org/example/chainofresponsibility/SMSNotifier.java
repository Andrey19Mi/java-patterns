package org.example.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * Отправляет уведомление по sms.
 * @author Andrey Udalov
 */
@Slf4j
public class SMSNotifier extends Notifier {

    /**
     * Задает приоритетность уведомления.
     * @param priority
     */
    public SMSNotifier(int priority) {
        super(priority);
    }

    /**
     * Отправляет сообщение по sms.
     * @param message
     */
    @Override
    public void write(String message) {
        log.info("Отправлено sms сообщение: {}", message);
    }

}
