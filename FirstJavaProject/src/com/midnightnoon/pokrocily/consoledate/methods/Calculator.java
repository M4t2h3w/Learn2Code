package com.midnightnoon.pokrocily.consoledate.methods;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    /**
     * 4.úloha: napíš metódu, ktorá načíta z konzoly jednoduché matematické operácie
     * a vykoná ich. Napríklad ak napíšem do konzoly 4+5. Tak sa vykoná sčítanie a
     * na výstup sa napíše výsledok 9.
     */
    public static void basicCalculator() {

        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        String denominator = "";
        while(true) {
            System.out.print("Enter equation (e.g. 4+5), quit by entering 'q': ");
            String input = scanner.nextLine();

            if("q".equals(input)) break;

            Pattern p = Pattern.compile("(\\d+)\\s?([\\+\\-\\*/])\\s?(\\d+)");
            Matcher m = p.matcher(input);

            boolean found = false;
            while (m.find()) {
                number1 = Integer.parseInt(m.group(1));
                number2 = Integer.parseInt(m.group(3));
                denominator = m.group(2);
                found = true;

                switch (denominator) {
                    case "+":
                        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                        break;
                    case "-":
                        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                        break;
                    case "*":
                        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                        break;
                    case "/":
                        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                        break;
                    default:
                        break;
                }
            }
            if(!found) System.out.println("Nothing here.");
        }
    }
}
