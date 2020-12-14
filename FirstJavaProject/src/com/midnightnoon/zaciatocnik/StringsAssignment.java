package com.midnightnoon.zaciatocnik;

public class StringsAssignment {
    public static void main(String[] args) {

        stringToUpperCase("Change me");
        compareStrings("First", "second");
        System.out.println(compareStringsReturn("First", "First"));
    }

    private static boolean compareStringsReturn(String first, String second) {
        if(first.equals(second)) return true;
        else return false;
    }

    private static void compareStrings(String first, String second) {
        if(first.equals(second)) {
            System.out.println("Strings are equal.");
        }
        else {
            System.out.println("Strings are NOT equal.");
        }
    }

    private static void stringToUpperCase(String inputString) {
        System.out.println(inputString.toUpperCase());
    }
}
