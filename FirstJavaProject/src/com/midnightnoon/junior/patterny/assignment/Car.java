package com.midnightnoon.junior.patterny.assignment;

import java.util.Observable;

public class Car extends Observable {
    private String model;
    private String color;
    private String serialNumber;

    public Car(CarBuilder carBuilder) {
        setModel(carBuilder.model);
        setColor(carBuilder.color);
        setSerialNumber(carBuilder.serialNumber);
    }

    public static CarBuilder newCar(){
        return new CarBuilder();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
        setChanged();
        notifyObservers(model);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public static class CarBuilder{
        private String model;
        private String color;
        private String serialNumber;

        private CarBuilder(){};

        public CarBuilder model(String model){
            this.model = model;
            return this;
        }

        public CarBuilder color(String color){
            this.color = color;
            return this;
        }

        public CarBuilder serialNumber(String serialNumber){
            this.serialNumber = serialNumber;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
