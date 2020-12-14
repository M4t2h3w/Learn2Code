package com.midnightnoon.zaciatocnik;

public class IfElseStatements {

    public static void main(String[] args) {

        // 1. napis program ktory vypise na konzolu, ci je cislo pozitivne alebo negativne
        System.out.println(":FIRST ASSIGNMENT:");

        int number = -2;

        if (number < 0) {
            System.out.println("negative");
        }
        else if (number > 0) {
            System.out.println("positive");
        }
        else {
            System.out.println("equals zero");
        }

        // 2. varenie omelety
        System.out.println("\n:SECOND ASSIGNMENT:");

        boolean eggs = true;
        boolean pan = true;
        boolean oil = true;
        boolean salt = true;

        if (eggs && pan && oil && salt) {
            System.out.println("Great, you seem to have all the needed stuff.");
            System.out.println("First, heat some oil on the pan.");
            System.out.println("Now crack the eggs and add some salt.");
            System.out.println("Give them a little stir.");
            System.out.println("When fluffy and not raw anymore you can enjoy them :)");
        }
        else {
            System.out.println("You don't have all the ingredients.");
        }

        // 3. den v tyzdni
        System.out.println("\n:THIRD ASSIGNMENT:");

        int weekDayNumber = 2;

        if (weekDayNumber == 1) {
            System.out.println("Monday");
        }
        else if (weekDayNumber == 2) {
            System.out.println("Tuesday");
        }
        else if (weekDayNumber == 3) {
            System.out.println("Wednesday");
        }
        else if (weekDayNumber == 4) {
            System.out.println("Thursday");
        }
        else if (weekDayNumber == 5) {
            System.out.println("Friday");
        }
        else if (weekDayNumber == 6) {
            System.out.println("Saturday");
        }
        else if (weekDayNumber == 7) {
            System.out.println("Sunday");
        }
        else System.out.println("Invalid input.");

        // 4. Ktore z trojice je najvacsie
        System.out.println("\n:FOURTH ASSIGNMENT:");

        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("First number is greatest.");
        }
        else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Second number is greatest.");
        }
        else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("Third number is greatest.");
        }
        else System.out.println("There is not only one greatest number.");

        // 5. Vypis tri cisla na konzolu od najmensieho po najvacsie
        System.out.println("\n:FIFTH ASSIGNMENT:");

        if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println(firstNumber);
            System.out.println(secondNumber);
            System.out.println(thirdNumber);
        }
        else if (firstNumber < thirdNumber && thirdNumber < secondNumber) {
            System.out.println(firstNumber);
            System.out.println(thirdNumber);
            System.out.println(secondNumber);
        }
        else if (secondNumber < firstNumber && firstNumber < thirdNumber) {
            System.out.println(secondNumber);
            System.out.println(firstNumber);
            System.out.println(thirdNumber);
        }
        else if (thirdNumber < firstNumber && firstNumber < secondNumber) {
            System.out.println(thirdNumber);
            System.out.println(firstNumber);
            System.out.println(secondNumber);
        }
        else if (secondNumber < thirdNumber && thirdNumber < firstNumber) {
            System.out.println(secondNumber);
            System.out.println(thirdNumber);
            System.out.println(firstNumber);
        }
        else if (thirdNumber < secondNumber && secondNumber < firstNumber) {
            System.out.println(thirdNumber);
            System.out.println(secondNumber);
            System.out.println(firstNumber);
        }
    }
}
