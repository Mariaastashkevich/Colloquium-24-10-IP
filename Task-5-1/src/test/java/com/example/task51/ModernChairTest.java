package com.example.task51;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModernChairTest {

    @Test
    void sitOn() {
        ModernChair chair = new ModernChair();
        assertEquals("Sitting on a modern chair", chair.sitOn());
    }
}