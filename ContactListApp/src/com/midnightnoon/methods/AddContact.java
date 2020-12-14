package com.midnightnoon.methods;

import com.midnightnoon.objects.Contact;
import com.midnightnoon.objects.ContactsList;

import java.util.ArrayList;

public class AddContact {

    public static void addContactToList(ContactsList allContacts){
        ArrayList<Contact> listOfContacts = new ArrayList<>();
        listOfContacts = allContacts.getContacts();
        listOfContacts.add(CreateContact.createNewContact());
        allContacts.setNumberOfContacts(listOfContacts.size());
        System.out.println("Contact successfully added to " + allContacts.getName());
    }
}
