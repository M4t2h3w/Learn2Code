package com.midnightnoon.pokrocily.usingExceptions;

import com.midnightnoon.pokrocily.usingExceptions.ownExceptions.*;

public class UsingExceptions {

    public static void main(String[] args) throws DivisionByZeroException {
        double number1 = 2;
        double number2 = 3;

        //System.out.println(division(number1, number2));
        //System.out.println(multiply(number1, number2));
        runBothMethods(number1, number2);
    }

    private static void runBothMethods(double number1, double number2) throws DivisionByZeroException {
        System.out.println(division(number1, number2));
        System.out.println(multiply(number1, number2));
    }

    private static double multiply(double number1, double number2) {
        if (number2 == 2) {
            throw new MultiplyingByTwoException("Multiplying by two is not allowed!");
        }
        return number1 * number2;
    }

    private static double division(double number1, double number2) throws DivisionByZeroException {
        if (number2 == 0) {
            throw new DivisionByZeroException("Division by zero!");
        }
        return number1 / number2;
    }
}
