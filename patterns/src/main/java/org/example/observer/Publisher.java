package org.example.observer;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Отправитель постов.
 * @author Andrey Udalov
 */
@Slf4j
@NoArgsConstructor
public class Publisher implements Observed {

    /**
     * Посты.
     */
    private List<String> posts;
    /**
     * Подписчики.
     */
    private List<Observer> subscribers;

    /**
     * Конструктор по постам и подписчикам.
     * @param posts
     * @param subscribers
     */
    public Publisher(List<String> posts, List<Observer> subscribers) {
        this.posts = posts;
        this.subscribers = subscribers;
    }

    /**
     * Добавляет пост в список.
     * @param post
     */
    public void addPost(String post) {
        posts.add(post);
    }

    /**
     * Удаляет пост из списка.
     * @param post
     */
    public void removePost(String post) {
        posts.remove(post);
    }

    /**
     * Отправляет все посты.
     */
    public void sendPosts() {
        notifyObserver();
    }

    /**
     * Добавляет подписчика
     * @param observer
     */
    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    /**
     * Удаляет подписчика.
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    /**
     * Уведомляет подписчиков.
     */
    @Override
    public void notifyObserver() {
        for (Observer observer: subscribers) {
            observer.handleEvent(posts);
        }
    }

}
