package com.midnightnoon.objects;

import java.util.ArrayList;

public class ContactsList {
    private String name = "Generic List";
    private int numberOfContacts = 0;
    private String dataFormat = "Name;Phone;Mobile;Email";
    private ArrayList<Contact> contacts = new ArrayList<Contact>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfContacts() {
        return numberOfContacts;
    }

    public void setNumberOfContacts(int numberOfContacts) {
        this.numberOfContacts = numberOfContacts;
    }

    public String getDataFormat() {
        return dataFormat;
    }

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }
}
