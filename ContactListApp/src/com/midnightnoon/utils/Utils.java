package com.midnightnoon.utils;

import com.midnightnoon.objects.Contact;
import com.midnightnoon.objects.ContactsList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Utils {

    /**
     * prints whole content of contactList.txt file
     * @param filePath
     */
    public static void printWholeFile(Path filePath){
        try(Scanner scanner = new Scanner(Files.newBufferedReader(filePath))){
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Contacts File not existing!");
        }
    }

    /**
     * This util will print out the content of object Contact
     * @param contact
     */
    public static void printContact(Contact contact) {
        System.out.println("Name:\t" + contact.getName());
        System.out.println("Phone:\t" + contact.getPhone());
        System.out.println("Mobile:\t" + contact.getMobile());
        System.out.println("E-mail:\t" + contact.getEmail());
    }

    /**
     * prints all contacts to the console as Strings
     * for testing purposes only
     * @param allContacts
     */
    public static void printAllContacts(ContactsList allContacts) {
        System.out.println();
        for (Contact contact : allContacts.getContacts()) {
            printContact(contact);
            System.out.println();
        }
    }

    /**
     * prints contact list info loaded from the file
     * @param allContacts
     */
    public static void printContactsListInfo(ContactsList allContacts) {
        System.out.println("\nDatabase name:\t\t" + allContacts.getName());
        System.out.println("No. of contacts:\t" + allContacts.getNumberOfContacts());
        System.out.println("Data format:\t\t" + allContacts.getDataFormat());
    }

    public static void showCommandHelp() {
        System.out.println("\n***Command help page***");
        System.out.println("add - add new contact to database");
        System.out.println();
        System.out.println("save - save all changes to database");
        System.out.println();
        System.out.println("load - load contact list from database");
        System.out.println();
        System.out.println("listAll - list all contacts in database");
        System.out.println();
        System.out.println("dataInfo - show database info");
        System.out.println();
        System.out.println("search - search for specific contact");
        System.out.println("\tUsage:");
        System.out.println("\t\tsearch John Doe - search for contact John Doe within the database");
        System.out.println();
        System.out.println("help - show help page for all commands");
        System.out.println();
    }
}
