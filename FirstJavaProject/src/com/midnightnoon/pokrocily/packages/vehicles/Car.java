package com.midnightnoon.pokrocily.packages.vehicles;

public class Car {
    private String manufacturer;
    private String type;
    private int passengerSeatsCount;

    public Car(String manufacturer, String type, int passengerSeatsCount) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.passengerSeatsCount = passengerSeatsCount;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getType() {
        return type;
    }

    public int getPassengerSeatsCount() {
        return passengerSeatsCount;
    }

    public String message() {
        return "This is car from vehicles package.";
    }
}
