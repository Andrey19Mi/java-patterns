package org.example.observer;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Подписчик
 * @author Andrey Udalov.
 */
@Slf4j
public class Subscriber implements Observer {

    /**
     * Имя подписчика.
     */
    private String name;

    /**
     * Конструктор по имени.
     * @param name
     */
    public Subscriber(String name) {
        this.name = name;
    }

    /**
     * Обработчик событий. Отправляет посты подписчику.
     * @param posts
     */
    @Override
    public void handleEvent(List<String> posts) {
        log.info("{}, получены посты\n {}", name, posts);
    }

}
