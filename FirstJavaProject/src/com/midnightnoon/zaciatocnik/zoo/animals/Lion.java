package com.midnightnoon.zaciatocnik.zoo.animals;

public class Lion extends Mammals{

    String name = "Lion";

    public String getName() {
        return name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Roaaaaar!");
    }

    @Override
    public void eat(String food) {
        System.out.println("Lion eats "+ food);
    }
}
