package com.example.task51;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VictorianTableTest {

    @Test
    void placeOn() {
        VictorianTable victorianTable = new VictorianTable();
        assertEquals("Placing on a Victorian table", victorianTable.placeOn());
    }
}