package com.midnightnoon.pokrocily;

public class NumbersAssignment {
    public static void main(String[] args) {
        int number1 = 5;
        double number2 = 6;

        System.out.println(MultiplyByTen(number1));
        System.out.println(MultiplyByTen(number2));
    }

    private static Number MultiplyByTen(Number number) {
        if (number instanceof Integer) {
            number = number.intValue() * 10;
        }
        if (number instanceof Double) {
            number = number.doubleValue() * 10;
        }
        return number;
    }
}
