package org.example.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * Отправляет уведомление в лог.
 * @author Andrey Udalov
 */
@Slf4j
public class LogNotifier extends Notifier {

    /**
     * Задает приоритетность уведомления.
     * @param priority
     */
    public LogNotifier(int priority) {
        super(priority);
    }

    /**
     * Отправляет сообщение в лог.
     * @param message
     */
    @Override
    public void write(String message) {
        log.info("В лог записано сообщение: {}", message);
    }

}
