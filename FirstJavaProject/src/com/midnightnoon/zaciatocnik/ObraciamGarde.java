package com.midnightnoon.zaciatocnik;

public class ObraciamGarde {

    public static void main(String[] args) {

        String inputString = "Malý medveď";

        System.out.println(reverseInput(inputString));
    }

    private static char[] reverseInput(String inputString) {
        String firstString = new String();
        String secondString = new String();
        int i = 0;

        while (inputString.charAt(i) != ' ') {
            firstString = inputString.charAt(i) + firstString;
            i++;
        }

        while (i < inputString.length()) {
            secondString = inputString.charAt(i) + secondString;
            i++;
        }

        char [] outputArray = (firstString + " " + secondString).toCharArray();

        return outputArray;
    }
}
