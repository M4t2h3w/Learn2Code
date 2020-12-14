package com.midnightnoon.pokrocily.consoledate.methods;

import com.midnightnoon.pokrocily.consoledate.Person;

import java.util.Scanner;

public class PersonCreator {

    /**
     * 2. úloha: Napíš si triedu Osoba, ktorá bude mať meno a priezvisko.
     * Potom napíš metódu, ktorá si bude z konzoly pýtať zadanie mena a
     * priezviska a na základe údajov z konzoly vytvorí inštanciu Osoby.
     * Teda niečo ako new Osoba(menoZKonzoly, priezviskoZKonzoly)
     */
    public static void createNewPerson() {

        Scanner scanner = new Scanner(System.in);
        String name;
        String surname;

        System.out.println("Person creator 1.0");
        System.out.print("Enter person name: ");
        name = scanner.nextLine();
        System.out.print("Enter person surname: ");
        surname = scanner.nextLine();
        Person anotherOne = new Person(name, surname);
        System.out.println("----------------------------");
        System.out.println("Person created:");
        System.out.println(anotherOne.getName() + " " + anotherOne.getSurname());
        System.out.println("Press enter to exit.");
        scanner.nextLine();
    }
}
