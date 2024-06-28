package org.example.observer;

import java.util.List;

/**
 * Интерфейс наблюдателя.
 * @author Andrey Udalov
 */
public interface Observer {

    /**
     * Обработчик событий.
     * @param posts
     */
    void handleEvent(List<String> posts);

}
