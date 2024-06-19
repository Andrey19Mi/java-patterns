package org.example.adapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

class CardReaderTest {

    private MemoryCard memoryCard;
    private USB cardReader;

    @BeforeEach
    public void setUp() {
        memoryCard = Mockito.mock(MemoryCard.class);
        cardReader = new CardReader(memoryCard);
    }

    @Test
    void testConnectWithUsbCable() {
        cardReader.connectWithUsbCable();
        verify(memoryCard, times(1)).connectWithDevice();
    }
}