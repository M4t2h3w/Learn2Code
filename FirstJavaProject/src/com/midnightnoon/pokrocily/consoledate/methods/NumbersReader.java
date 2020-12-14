package com.midnightnoon.pokrocily.consoledate.methods;

import java.util.Scanner;

/**
 * 3. úloha: Napíš metódu, ktorá požiada používateľa o zadanie čísla.
 * Ak zadá číslo vypíš ho na konzolu, ak zadá niečo iné, tak vypíš chybovú hlášku.
 */
public class NumbersReader {

    public static void onlyNumbers() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(true) {
            System.out.print("Enter number: ");
            if(scanner.hasNextInt()) {
                input = scanner.nextLine();
                System.out.println("Integer: " + input);
            }
            else if (!scanner.hasNextInt()) {
                input = scanner.nextLine();
                if("q".equals(input)) {
                    System.out.println("Exit!");
                    break;
                }
                System.out.println("Input: \"" + input + "\" is not an integer.");
            }
        }
    }
}
