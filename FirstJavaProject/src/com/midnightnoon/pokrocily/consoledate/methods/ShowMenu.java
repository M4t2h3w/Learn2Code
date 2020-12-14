package com.midnightnoon.pokrocily.consoledate.methods;

import java.util.Scanner;

import static com.midnightnoon.pokrocily.consoledate.methods.BirthdayChecker.birthdayWeekday;
import static com.midnightnoon.pokrocily.consoledate.methods.Calculator.basicCalculator;
import static com.midnightnoon.pokrocily.consoledate.methods.HolidayChecker.isPublicHoliday;
import static com.midnightnoon.pokrocily.consoledate.methods.NumbersReader.onlyNumbers;
import static com.midnightnoon.pokrocily.consoledate.methods.PersonCreator.createNewPerson;
import static com.midnightnoon.pokrocily.consoledate.methods.ReadAndWrite.writeWhatYouRead;
import static com.midnightnoon.pokrocily.consoledate.methods.WhenTo.whenToLeave;
import static com.midnightnoon.pokrocily.consoledate.methods.WhenTo.whenToLeave2;

public class ShowMenu {

    public static void MainMenu(){
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Welcome to the program Console and Date." +
                    "\nYou are provided with the menu below." +
                    "\nPlease pick one entry (number) from the menu and press enter.");

            System.out.println("1. Write to console the user input");
            System.out.println("2. Create new Person");
            System.out.println("3. Enter only numbers");
            System.out.println("4. Basic calculator");
            System.out.println("5. When to leave work (start time)");
            System.out.println("6. When can I leave work (start + working time)");
            System.out.println("7. What weekday will I have birthday?");
            System.out.println("8. Is it public holiday today?");
            System.out.println("Press \'q\' to quit.");

            System.out.print("\nYour entry: ");
            String input = scanner.nextLine();

            if ("q".equals(input)) {
                System.out.println("Exit!");
                break;
            }
            switch (input) {
                case "1":
                    writeWhatYouRead();
                    break;
                case "2":
                    createNewPerson();
                    break;
                case "3":
                    onlyNumbers();
                    break;
                case "4":
                    basicCalculator();
                    break;
                case "5":
                    whenToLeave();
                    break;
                case "6":
                    whenToLeave2();
                    break;
                case "7":
                    birthdayWeekday();
                    break;
                case "8":
                    isPublicHoliday();
                    break;
                default:
                    System.out.println("Wrong input.");
            }
        }
        scanner.close();
    }
}
