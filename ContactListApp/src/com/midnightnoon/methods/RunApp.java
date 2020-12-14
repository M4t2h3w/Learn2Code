package com.midnightnoon.methods;

import com.midnightnoon.objects.ContactsList;
import com.midnightnoon.utils.Utils;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunApp {

    public static void runApplication(){
        System.out.println("***Welcome to Contact List app.***");

        // path to database file
        Path p = Paths.get(new File("src/com/midnightnoon/database/contactList.txt").getAbsolutePath());

        // load contacts from file
        Scanner scanner = new Scanner(System.in);
        ContactsList allContacts = LoadContactList.loadContacts(p);

        while(true) {

            System.out.println("\nCommands: add | delete | save | load | listAll | dataInfo | search xyz | help");
            System.out.println("Enter 'q' to exit the app.");

            System.out.print("\nUser input: ");
            String userInput = scanner.nextLine();
            if ("q".equalsIgnoreCase(userInput)) break;

            Pattern pattern = Pattern.compile("(add|delete|save|load|listAll|dataInfo|search|help)\\s?([\\w\\s]*)");
            Matcher match = pattern.matcher(userInput);

            if (match.find()) {

                switch (match.group(1)) {
                    case "add":
                        AddContact.addContactToList(allContacts);
                        break;
                    case "delete":
                        DeleteContact.deleteContact(allContacts, match.group(2));
                        break;
                    case "save":
                        SaveContacts.saveContactList(allContacts, p);
                        break;
                    case "load":
                        LoadContactList.loadContacts(p);
                        break;
                    case "listAll":
                        Utils.printAllContacts(allContacts);
                        break;
                    case "dataInfo":
                        Utils.printContactsListInfo(allContacts);
                        break;
                    case "search":
                        SearchContact.searchContact(allContacts, match.group(2));
                        break;
                    case "help":
                        Utils.showCommandHelp();
                        break;
                    default:
                        System.out.println("Invalid input!");
                        break;
                }
            }
            else System.out.println("Invalid input!");


        }

        SaveContacts.saveContactList(allContacts, p);
        scanner.close();
    }
}
