package com.midnightnoon.pokrocily;

public class BoxingUnboxing {
    public static void main(String[] args) {
        int number = 10;
        double number2 = 2.5;
        long number3 = 23564L;
        Integer number4 = 20;
        Double number5 = 23.7;
        Long number6 = 12378L;

        System.out.println(intToInteger(number));
        System.out.println(doubleToDouble(number2));
        System.out.println(longToLong(number3));
        System.out.println(intToInteger2(number4));
        System.out.println(doubleToDouble2(number5));
        System.out.println(longToLong2(number6));
    }

    private static long longToLong2(Long number6) {
        return (long)number6;
    }

    private static double doubleToDouble2(Double number5) {
        return (double)number5;
    }

    private static int intToInteger2(Integer number4) {
        return (int)number4;
    }

    private static Long longToLong(long number3) {
        return (Long)number3;
    }

    private static Double doubleToDouble(double number2) {
        return (Double) number2;
    }

    private static Integer intToInteger(int number) {
        return (Integer)number;
    }
}
