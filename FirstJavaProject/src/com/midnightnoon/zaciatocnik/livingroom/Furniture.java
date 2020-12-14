package com.midnightnoon.zaciatocnik.livingroom;

public class Furniture {
    static int furnitureCount = 0;

    String type;
    String material;
    String color;

    public Furniture() {
        furnitureCount++;
    }

    public Furniture(String type, String material, String color) {
        this();
        this.type = type;
        this.material = material;
        this.color = color;
    }
}
