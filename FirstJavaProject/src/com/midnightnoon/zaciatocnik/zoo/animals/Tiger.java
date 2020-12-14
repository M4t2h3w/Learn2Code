package com.midnightnoon.zaciatocnik.zoo.animals;

public class Tiger extends Mammals {

    String name = "Tiger";

    public String getName() {
        return name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Grrrr!");
    }

    @Override
    public void eat(String food) {
        System.out.println("Tiger eats: " + food);
    }
}
