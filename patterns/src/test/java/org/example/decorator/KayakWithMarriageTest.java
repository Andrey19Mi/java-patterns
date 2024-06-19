package org.example.decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class KayakWithMarriageTest {

    private Kayak kayak;

    @BeforeEach
    void setUp() {
        kayak = Mockito.mock(InflatableKayak.class);
    }

    @Test
    void go() {
        Kayak kayakWithMarriage = new KayakWithMarriage(kayak);
        kayakWithMarriage.go();
        verify(kayak, times(1)).go();
    }
}