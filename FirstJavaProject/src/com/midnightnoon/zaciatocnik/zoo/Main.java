package com.midnightnoon.zaciatocnik.zoo;

import com.midnightnoon.zaciatocnik.zoo.animals.Lion;
import com.midnightnoon.zaciatocnik.zoo.animals.Mammals;
import com.midnightnoon.zaciatocnik.zoo.animals.Tiger;

public class Main {
    public static void main(String[] args) {

        Mammals[] mamals = new Mammals[]{new Tiger(), new Lion()};

        System.out.println("Welcome to ZOO.");
        for (Mammals mammal: mamals) {
            mammal.makeNoise();
        }
    }
}
