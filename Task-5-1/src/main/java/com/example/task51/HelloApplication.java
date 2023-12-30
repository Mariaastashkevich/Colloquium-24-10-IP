package com.example.task51;

interface Chair {
    String sitOn();
}

interface Table {
    String placeOn();
}

interface FurnitureFactory {
    Chair createChair();
    Table createTable();
}

class ModernChair implements Chair {
    @Override
    public String sitOn() {
        return "Sitting on a modern chair";
    }
}

class ModernTable implements Table {
    @Override
    public String placeOn() {
        return "Placing on a modern table";
    }
}

class VictorianChair implements Chair {
    @Override
    public String sitOn() {
        return "Sitting on a Victorian chair";
    }
}

class VictorianTable implements Table {
    @Override
    public String placeOn() {
        return "Placing on a Victorian table";
    }
}

class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}

class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}

public class HelloApplication {

    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();

        System.out.println("Modern Furniture:");
        System.out.println(modernChair.sitOn());
        System.out.println(modernTable.placeOn());

        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Table victorianTable = victorianFactory.createTable();

        System.out.println("\nVictorian Furniture:");
        System.out.println(victorianChair.sitOn());
        System.out.println(victorianTable.placeOn());

    }
}