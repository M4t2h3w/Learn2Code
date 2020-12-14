package com.midnightnoon.methods;

import com.midnightnoon.objects.Contact;
import com.midnightnoon.objects.ContactsList;

import java.util.ArrayList;

public class DeleteContact {
    public static void deleteContact(ContactsList allContacts, String toDelete){
        int indexOfContact = IndexOfContact.getIndexOfContact(allContacts, toDelete);
        ArrayList<Contact> listOfContacts = allContacts.getContacts();

        if(indexOfContact >= 0) {
            listOfContacts.remove(indexOfContact);
            allContacts.setNumberOfContacts(listOfContacts.size());
            System.out.println("Contact " + toDelete + " deleted!");
        }
    }
}
