package com.midnightnoon.methods;

import com.midnightnoon.objects.Contact;

import java.util.Scanner;

public class CreateContact {

    /**
     * creates new contact and return it back to the caller of the method
     * @return
     */
    public static Contact createNewContact(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("***CREATING NEW CONTACT***");

        System.out.print("Name:\t");
        String name = scanner.nextLine();

        System.out.print("Phone:\t");
        String phone = scanner.nextLine();

        System.out.print("Mobile:\t");
        String mobile = scanner.nextLine();

        System.out.print("E-mail:\t");
        String email = scanner.nextLine();

        Contact newContact = new Contact(name, phone, mobile, email);

        //scanner.close();

        return newContact;
    }
}
