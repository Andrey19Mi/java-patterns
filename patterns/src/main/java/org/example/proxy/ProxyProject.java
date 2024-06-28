package org.example.proxy;

/**
 * Прокси класс RealProject
 * @author Andrey Udalov
 */
public class ProxyProject implements Project {

    /**
     * Ссылка на проект
     */
    private final String url;
    /**
     * Проект
     */
    private RealProject realProject;

    /**
     * Конструктор получающий ссылку на проект
     * @param url
     */
    public ProxyProject(String url) {
        this.url = url;
    }

    /**
     * Метод запускающий проект. Если проекта не был загружен, загружает его.
     */
    @Override
    public void run() {
        if (realProject == null) {
            realProject = new RealProject(url);
        }
        realProject.run();
    }

}
