package com.midnightnoon.pokrocily.consoledate.methods;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 8. úloha: napíš metódu, ktorá vypíše na konzolu či je dnes práve sviatok.
 * Dátumy sviatkov si môžeš pozrieť napríklad tu: http://kalendar.azet.sk/sviatky/.
 * Veľkú noc nemusíš riešiť.
 */

public class HolidayChecker {

    public static void isPublicHoliday() {
        Scanner scanner = new Scanner(System.in);
        String[] publicHolidays = {"1.1.", "6.1.", "1.5.", "8.5.", "5.7.",
                "29.8.", "1.9.", "15.9.", "1.11.", "17.11.",
                "24.12.", "25.12.", "26.12."};
        List<String> holidayChecker = Arrays.asList(publicHolidays);
        LocalDate today = LocalDate.now();
        String extractDayAndMonth = Integer.toString(today.getDayOfMonth())
                + '.'
                + Integer.toString(today.getMonthValue()) + '.';
        if (holidayChecker.contains(extractDayAndMonth)) {
            System.out.println("Today ("+ today + ") is public holiday.\n");
        }
        else System.out.println("Today (" + today + ") is not a public holiday :(\n");
        System.out.println("Press enter to exit.");
        scanner.nextLine();
    }
}
