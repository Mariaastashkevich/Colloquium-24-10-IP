package com.example.task51;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModernTableTest {

    @Test
    void placeOn() {
        ModernTable table = new ModernTable();
        assertEquals("Placing on a modern table", table.placeOn());
    }
}