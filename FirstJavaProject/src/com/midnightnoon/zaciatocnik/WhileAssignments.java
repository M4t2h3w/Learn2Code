package com.midnightnoon.zaciatocnik;

public class WhileAssignments {

    public static void main(String[] args) {

        oneToTen();
        even1to100();
        divisibleBy5();
        sumOfOddAndEven();
        cookOmelet(2, true, true, true, true);
    }

    // Napíš program, ktorý by simuloval varenie omelety. Použi príklad z if else príkladov a rozšír ho o cykly.
    private static void cookOmelet(int eggs, boolean oil, boolean pan, boolean salt, boolean shopOpen) {

        if (eggs == 0 && shopOpen) {
            System.out.println("You need to go to the shop to buy some eggs.");
        }
        else if (eggs == 0 && !shopOpen) {
            System.out.println("It's pitty that you don't have eggs and shop is closed, next time be better prepared.");
        }

        if ( !oil && shopOpen) {
            System.out.println("You need to go to the shop to buy some oil.");
        }
        else if (!oil && !shopOpen) {
            System.out.println("It's pitty that you don't have oil and shop is closed, next time be better prepared.");
        }

        if ( !salt && shopOpen) {
            System.out.println("You need to go to the shop to buy some salt.");
        }
        else if(!salt && !shopOpen) {
            System.out.println("It's pitty that you don't have salt and shop is closed.\nYou can try to ask some neighbour to let you some.");
        }

        if ( !pan && shopOpen) {
            System.out.println("You need to go to the shop to buy some pan.");
        }
        else if(!pan && !shopOpen) {
            System.out.println("It's pitty that you don't have pan and shop is closed.\nYou can try to ask some neighbour to let you some.");
        }

        while (eggs > 0 && oil && pan && salt) {
            System.out.println("Great, it seems you have all of the ingredients.\nLet's start cooking.");
            System.out.println("First turn on the stove and  heat the pan with some oil in it.");
            while (eggs > 0) {
                System.out.println("Break egg into the pan.");
                --eggs;
            }
            System.out.println("Add a little bit of salt.");
            System.out.println("Stir until the omelet is fluffy and not raw anymore.");
            System.out.println("Enjoy your wonderful creation.");
        }
    }

    // Maj niekoľko čísel. Na konzolu vypíš súčet párnych a súčet nepárnych čísel.
    private static void sumOfOddAndEven() {
        int odd = 0;
        int even = 0;
        int i = 1;

        while (i <= 100) {
            if (i % 2 == 0) even = even + i;
            else odd = odd + i;
            i++;
        }

        System.out.println("Sum of odd numbers: " + odd);
        System.out.println("Sum of even numbers: " + even);
    }

    // Na konzolu vypíš všetky čísla deliteľné 5 od 1 do 100.
    private static void divisibleBy5() {
        int number = 1;

        while (number <= 100) {
            if (number % 5 == 0) System.out.print(number + " ");
            number++;
        }
        System.out.println();
    }

    // Na konzolu vypíš všetky párne čísla od 1 do 100.
    private static void even1to100() {
        int number = 2;
        while (number <= 100) {
            System.out.print(number + " ");
            number += 2;
        }
        System.out.println();
    }

    // Použitím cyklu while vypíš na konzolu čísla od 1 do 10.
    private static void oneToTen() {
        int number = 1;

        while (number < 11) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
    }
}
