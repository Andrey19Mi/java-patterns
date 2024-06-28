package org.example.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HikerTest {

    @Test
    void testLiveDays() {
        Hiker hiker = new Hiker();
        hiker.liveDays(3);
    }
}