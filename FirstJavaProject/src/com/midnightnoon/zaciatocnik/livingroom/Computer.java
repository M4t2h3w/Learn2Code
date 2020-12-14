package com.midnightnoon.zaciatocnik.livingroom;

public class Computer {

    static int computersCount = 0;

    String type;
    String brand;
    int screenSize;
    String cpuProducer;
    int ramSizeInMB;
    String memoryType;
    int memorySizeMB;

    public Computer(){
        computersCount++;
    }

    public Computer(String type, String brand, int screenSize, String cpuProducer, int ramSizeInMB, String memoryType, int memorySizeMB) {
        this();
        this.type = type;
        this.brand = brand;
        this.screenSize = screenSize;
        this.cpuProducer = cpuProducer;
        this.ramSizeInMB = ramSizeInMB;
        this.memoryType = memoryType;
        this.memorySizeMB = memorySizeMB;
    }
}
