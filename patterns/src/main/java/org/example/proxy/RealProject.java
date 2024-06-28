package org.example.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * Класс реализующий интерфейс Project
 * @author Andrey Udalov
 */
@Slf4j
public class RealProject implements Project {

    /**
     * Ссылка на проект
     */
    private String url;

    /**
     * Конструктор получающий ссылку. Загружает проект по ссылке
     * @param url
     */
    public RealProject(String url) {
        this.url = url;
        load();
    }

    /**
     * Метод загружающий проект по ссылке
     */
    private void load() {
        log.info("Загрузка проекта со ссылкой: {}", url);
    }

    /**
     * Метод запускающий проект
     */
    @Override
    public void run() {
        log.info("Запуск проекта со ссылкой: {}", url);
    }

}
