package com.midnightnoon.pokrocily.workWithFiles;

import com.midnightnoon.pokrocily.workWithFiles.methods.MainMenu;

import java.io.IOException;
import java.util.Scanner;

public class IOAssignments {
    public static void main(String[] args) throws IOException {
        MainMenu menu = new MainMenu();

        while(true) {
            menu.showMainMenu();
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if("q".equals(input)) {
                System.out.println("Exiting application!");
                break;
            }

            menu.runMethod(input);
            System.out.println("Press Enter to continue.");
            scanner.nextLine();
        }
    }
}
