package com.midnightnoon.zaciatocnik;

public class MethodsAssignments {

    static int number = 10;

    public static void main(String[] args) {

        sumOfNumbers(2, 2);
        sumOfNumbers(2, 2, 2);
        System.out.println(returnSumOfNumbers(2, 2));
        System.out.println(returnSumOfNumbers(2, 2, 2));
        System.out.println(suma(10));
        System.out.println(method(9));
    }

    private static int suma(int input) {
        if (input == 0) {
            return input;
        }
        else return input + suma(--input);
    }

    static void sumOfNumbers(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    static void sumOfNumbers(int number1, int numbers2, int number3) {
        System.out.println(number1 + number3 + number3);
    }

    static int returnSumOfNumbers(int number1, int number2) {
        return number1 + number2;
    }

    static int returnSumOfNumbers(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    static int method(int number) {
        return number + MethodsAssignments.number;
    }
}
