package com.midnightnoon.pokrocily.consoledate.methods;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * 7. úloha: napíš metódu, ktorej zadáš tvoj dátum narodenia.
 * Na výstupe sa ti vypíše v aké dni budeš mať v budúcnosti mať
 * narodeniny (2019 pondelok, 2020 štvrtok, atď.)
 */

public class BirthdayChecker {
    public static void birthdayWeekday() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter your birthday (e.g. 1988-10-24), enter 'q' to quit: ");
            String input = scanner.nextLine();

            if("q".equals(input)) break;

            LocalDate birthday = LocalDate.parse(input);

            for (int i = 0; i < 10; i++) {
                System.out.println(LocalDate.now().getYear() + i + " " +
                        birthday.withYear(LocalDate.now().getYear() + i).getDayOfWeek());
            }
        }
    }
}
