package org.example.state;

import lombok.extern.slf4j.Slf4j;

/**
 * Класс пешего туриста.
 * @author Andrey Udalov
 */
@Slf4j
public class Hiker {

    /**
     * Активность которой занят турист.
     */
    private Activity activity;
    /**
     * Предыдущая активность туриста.
     */
    private Activity previousActivity;
    /**
     * Количество активностей туриста за день.
     */
    private final static int LIFE_CYCLE = 4;

    /**
     * Конструктор начинающий активность туриста со сна.
     * @see Sleep
     */
    public Hiker() {
        activity = new Sleep();
    }

    /**
     * Дает туристу прожить countDays.
     * @param countDays
     */
    public void liveDays(int countDays) {
        int countChanged = LIFE_CYCLE * countDays;
        for (int i = 1; i <= countChanged; ++i) {
            doIt();
            changeActivity();
            if (i % LIFE_CYCLE == 0) {
                log.info("Прошел день {} \n" + "=".repeat(40), i / LIFE_CYCLE);
            }
        }
    }

    /**
     * Турист выполняет деятельность.
     */
    private void doIt() {
        log.info("Походник " + activity.doIt());
    }

    /**
     * Турист меняет деятельность.
     */
    private void changeActivity() {
        if (activity instanceof Sleep) {
            previousActivity = activity;
            activity = new Eat();
        } else if (activity instanceof Eat) {
            if (previousActivity instanceof Sleep) {
                previousActivity = activity;
                activity = new Hike();
            } else if (previousActivity instanceof Hike) {
                previousActivity = activity;
                activity = new Sleep();
            }
        } else if (activity instanceof Hike) {
            previousActivity = activity;
            activity = new Eat();
        }
    }
}
