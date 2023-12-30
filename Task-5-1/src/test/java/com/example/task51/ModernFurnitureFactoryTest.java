package com.example.task51;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModernFurnitureFactoryTest {

    @Test
    void createChair() {
        ModernFurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        assertEquals("Sitting on a modern chair", modernFurnitureFactory.createChair().sitOn());
    }

    @Test
    void createTable() {
        ModernFurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        assertEquals("Placing on a modern table", modernFurnitureFactory.createTable().placeOn());
    }
}