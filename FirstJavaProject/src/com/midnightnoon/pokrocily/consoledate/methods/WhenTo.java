package com.midnightnoon.pokrocily.consoledate.methods;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class WhenTo {

    /**
     * 6. úloha: napíš metódu s tým istým názvom ako v úlohe 5. T
     * áto metóda bude mať ale na vstupe dva údaje, jeden bude údaj typu
     * LocalTime o čase nástupu do práce a druhý údaj bude typu int,
     * ktorý reprezentuje dĺžku pracovnej doby. Na výstupe sa vypíše kedy môžeš ísť domov.
     */
    public static void whenToLeave2() {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter work starting time (e.g. 8:30), enter 'q' to quit: ");
            String input = scanner.nextLine();

            if("q".equals(input)) break;

            System.out.print("Enter the shift length: ");
            int shiftLength = Integer.parseInt(scanner.nextLine());

            LocalTime time = LocalTime.parse(input, DateTimeFormatter.ofPattern("H:mm"));

            System.out.println("You can leave work at: " + time.plus(shiftLength, ChronoUnit.HOURS));
        }
    }

    /**
     * 5. úloha: napíš metódu, ktorá na vstupe bude akceptovať dáta typu LocalTime,
     * ktorý bude reprezentovať čas nástupu do práce. Na výstupe bude výpis,
     * kedy môžeš odísť z práce. Uvažuje nad 8hodinovou pracovnou dobou.
     */
    public static void whenToLeave() {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter work starting time (e.g. 8:30), enter 'q' to quit: ");
            String input = scanner.nextLine();

            if("q".equals(input)) break;

            LocalTime time = LocalTime.parse(input, DateTimeFormatter.ofPattern("H:mm"));

            System.out.println("You can leave work at: " + time.plus(8, ChronoUnit.HOURS));
        }
    }
}
