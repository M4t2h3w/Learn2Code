package com.midnightnoon.zaciatocnik;

public class TernaryOperatorAssignments {

    public static void main(String[] args) {
        divisibleByTwo(2);
        compareToTen(10);
    }

    /*
    Napíš program, ktorý na konzolu vypíše či je číslo > ako 10, < ako 10
    alebo = 10 za pomoci ternárneho operátoru v ternárnom operátore. Nemôžeš použiť if.
    */
    private static void compareToTen(int input) {
        System.out.println("Number " + input + (input > 10 ? " is > than 10." : (input == 10 ? " is == 10." : " is < than 10.")));
    }


    /*
    Napíš program, ktorý na konzolu vypíš či je číslo deliteľné dvomi alebo nie
    za pomoci ternárneho operátoru. Nemôžeš použiť if.
     */
    private static void divisibleByTwo(int input) {
        System.out.println("Number " + input + (input % 2 == 0 ? " is divisible by 2." : " is not divisible by 2."));
    }
}
