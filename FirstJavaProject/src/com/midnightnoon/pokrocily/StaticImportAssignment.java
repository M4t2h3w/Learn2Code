package com.midnightnoon.pokrocily;

import static java.lang.Math.ceil;

public class StaticImportAssignment {
    public static void main(String[] args) {
        double number = 123.78;

        System.out.println(roundNumberUp(number));
    }

    private static double roundNumberUp(double number) {
        return ceil(number);
    }
}
