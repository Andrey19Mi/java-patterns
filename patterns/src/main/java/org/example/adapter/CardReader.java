package org.example.adapter;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Класс картридера
 * @author Andrey Udalov
 */
@Slf4j
@NoArgsConstructor
public class CardReader implements USB{

    /**
     * Поле хранящее экземпляр карты памяти
     */
    private MemoryCard memoryCard;

    /**
     * Конструктор получающий карту памяти
     * @param memoryCard
     */
    public CardReader(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    /**
     * Метод адаптирующий карту памяти к usb порту
     */
    @Override
    public void connectWithUsbCable() {
        log.info("Подключение картридера");
        memoryCard.connectWithDevice();
    }

}
