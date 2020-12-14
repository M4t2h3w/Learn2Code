package com.midnightnoon.zaciatocnik.zoo.animals;

public class Blackbird extends Birds{
    @Override
    public void makeNoise() {
        System.out.println("Tweet");
    }

    @Override
    public void eat(String food) {
        System.out.println("Blackbird eats "+ food);
    }
}
