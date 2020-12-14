package com.midnightnoon;

public class Main {

    public static void main(String[] args) {

        System.out.println(returnString());
        System.out.println(returnInteger());
        printMessage();
    }

    private static void printMessage() {
        System.out.println("Thank you for calling printMessage() method.");
    }

    private static int returnInteger() {
        return 3;
    }

    private static String returnString() {
        return "Here is your string value.";
    }
}
