package com.midnightnoon.methods;

import com.midnightnoon.objects.Contact;
import com.midnightnoon.objects.ContactsList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class LoadContactList {

    /**
     * loads contact list located on the path provided
     * @param pathToFile
     * @return
     */
    public static ContactsList loadContacts(Path pathToFile){
        ContactsList allContacts = new ContactsList();

        try(Scanner scanner = new Scanner(Files.newBufferedReader(pathToFile))){
            allContacts.setName(scanner.nextLine());
            allContacts.setNumberOfContacts(Integer.parseInt(scanner.nextLine()));
            allContacts.setDataFormat(scanner.nextLine());

            ArrayList<Contact> loadedContacts = new ArrayList<>();

            while(scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                String[] tokens = nextLine.split(";");
                Contact toAddContact;
                if(tokens.length == 4) {
                    toAddContact = new Contact(tokens[0], tokens[1], tokens[2], tokens[3]);
                }
                else {
                    toAddContact = new Contact(tokens[0], tokens[1], tokens[2], "");
                }
                loadedContacts.add(toAddContact);
            }

            allContacts.setContacts(loadedContacts);
            System.out.println("Contacts from " + allContacts.getName() + " successfully loaded!");

        } catch (IOException e) {
            System.out.println("File not existing!");
        }


        return allContacts;
    }
}
