package org.example.chainofresponsibility;

/**
 * Приоритетность сообщений.
 * @author Andrey UDalov
 */
public enum Priority {

    /**
     * Низкая приоритетность.
     */
    LOW(1),

    /**
     * Средняя приоритетность.
     */
    MEDIUM(2),

    /**
     * Высокая приоритетность.
     */
    HIGH(3);

    private final int level;

    Priority(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

}
