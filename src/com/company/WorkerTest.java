package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WorkerTest {
    Worker w = new Worker(100, true);
    @Test
    void isAlive() {
        assertEquals(true, w.isAlive());
    }

    @Test
    void getHealth() {
        assertEquals(100, w.getHealth());
    }

    @Test
    void damage() {
        w.Damage(40);
        assertEquals(60, w.getHealth());
        w.Damage(20);
        assertEquals(60, w.getHealth());
    }
    @Test
    void getHealthAfterDamage() {
        w.Damage(40);
        assertEquals(60, w.getHealth());
    }
    @Test
    void beeStateAfterThreshold() {
        w.Damage(90);
        assertEquals(false, w.isAlive());
    }
    @Test
    @DisplayName("Test assert IllegalArgumentException")
    void testGeneralException(TestInfo testInfo) {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            w.Damage(120);
        });
        assertEquals("Please enter a value between 0 - 100", exception.getMessage());
    }
}