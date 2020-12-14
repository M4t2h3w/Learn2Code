package com.midnightnoon.methods;

import com.midnightnoon.objects.Contact;
import com.midnightnoon.objects.ContactsList;
import com.midnightnoon.utils.Utils;

import java.util.ArrayList;

public class SearchContact {
    public static void searchContact(ContactsList allContacts, String toFind) {
        int indexOfContact = IndexOfContact.getIndexOfContact(allContacts, toFind);

        ArrayList<Contact> listOfContacts = allContacts.getContacts();

        if(indexOfContact >= 0) {
            Utils.printContact(listOfContacts.get(indexOfContact));
        }
    }
}
