package com.midnightnoon.methods;

import com.midnightnoon.objects.Contact;
import com.midnightnoon.objects.ContactsList;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;

public class SaveContacts {

    /**
     * aoverwrites the whole contactList.txt with new data added
     * number of contacts is increased
     * new contact is added to the end of file
     * @param pathToFile
     */
    public static void saveContactList(ContactsList allContacts, Path pathToFile) {

        String outputToWrite = "";

        outputToWrite += allContacts.getName() + "\n";
        outputToWrite += allContacts.getNumberOfContacts() + "\n";
        outputToWrite += allContacts.getDataFormat() + "\n";

        for (Contact contact : allContacts.getContacts()) {
            outputToWrite += contact.getName() + ";" +
                            contact.getPhone() + ";" +
                            contact.getMobile() + ";" +
                            contact.getEmail() + "\n";
        }

        try(PrintWriter outputStream = new PrintWriter(new FileWriter(pathToFile.toString(), false))){
            outputStream.append(outputToWrite);
            System.out.println("Contact list successfully saved to " + allContacts.getName() + "!");
        } catch (IOException e) {
            System.out.println("File not existing!");
            e.printStackTrace();
        }

        //System.out.println(outputToWrite);
    }
}
