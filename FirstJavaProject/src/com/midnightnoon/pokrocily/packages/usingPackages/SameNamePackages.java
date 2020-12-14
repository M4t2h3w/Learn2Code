package com.midnightnoon.pokrocily.packages.usingPackages;

import com.midnightnoon.pokrocily.packages.vehicles.Car;

public class SameNamePackages {
    public static void main(String[] args) {
        Car Opel = new Car("Opel", "Astra", 5);
        com.midnightnoon.pokrocily.packages.vehicles2.Car Skoda = new com.midnightnoon.pokrocily.packages.vehicles2.Car("Skoda", "Octavia", 5);

        System.out.println(Opel.message());
        System.out.println(Opel.getManufacturer() + " / " + Opel.getType());
        System.out.println(Skoda.message());
        System.out.println(Skoda.getManufacturer() + " / " + Skoda.getType());
    }
}
