package org.example.decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

class InflatableKayakTest {

    private Kayak kayak;

    @BeforeEach
    void setUp() {
        kayak = Mockito.mock(RealKayak.class);
    }

    @Test
    void go() {
        Kayak inflatableKayak = new InflatableKayak(kayak);
        inflatableKayak.go();
        verify(kayak, times(1)).go();
    }
}