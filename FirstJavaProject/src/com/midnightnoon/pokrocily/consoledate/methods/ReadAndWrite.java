package com.midnightnoon.pokrocily.consoledate.methods;

import java.util.Scanner;

public class ReadAndWrite {

    /**
     * 1. úloha: Napíš metódu, ktorá bude čítať dáta z konzoly.
     * Teda to čo napíšeš na konzolu a stlačíš enter, to sa vypíše.
     * Čítať dáta bude dovtedy kým nenapíšeš q a nestlačíš enter.
     */
    public static void writeWhatYouRead() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter text: ");
            String input = scanner.nextLine();

            if("q".equals(input)) {
                System.out.println("Exit!");
                break;
            }
            System.out.println("Input: " + input);
        }
    }
}
