package com.midnightnoon.junior.patterny.assignment;

import com.midnightnoon.junior.patterny.assignment.observers.Management;
import com.midnightnoon.junior.patterny.assignment.observers.QualityControl;

public class Main {
    public static void main(String[] args) {

        createCar();
    }

    private static void createCar() {
        QualityControl qualityControl = new QualityControl();
        Management management = new Management();
        Car car = Car.newCar().model("Passat").color("black").serialNumber("VW0928B7625SC").build();
        car.addObserver(qualityControl);
        car.addObserver(management);
        System.out.printf("Model: %s\nColor: %s\nSerial number: %s\n",
                car.getModel(), car.getColor(), car.getSerialNumber());

    }
}
