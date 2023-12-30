package com.example.task51;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VictorianChairTest {

    @Test
    void sitOn() {
        VictorianChair victorianChair = new VictorianChair();
        assertEquals("Sitting on a Victorian chair", victorianChair.sitOn());
    }
}