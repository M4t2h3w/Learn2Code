package com.midnightnoon.methods;

import com.midnightnoon.objects.Contact;
import com.midnightnoon.objects.ContactsList;

import java.util.ArrayList;

public class IndexOfContact {
    public static int getIndexOfContact(ContactsList allContacts, String contactToFind) {

        ArrayList<Contact> listOfContacts;
        listOfContacts = allContacts.getContacts();
        int result = -1;

        for (Contact contact : listOfContacts) {
            if(contactToFind.equals(contact.getName())) {
                result = listOfContacts.indexOf(contact);
            }
        }

        if (result < 0) {
            System.out.println("Contact not existing!");
        }
        return result;

    }
}
