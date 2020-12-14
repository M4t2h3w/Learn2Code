package com.midnightnoon.pokrocily.collections;

import com.midnightnoon.pokrocily.collections.methods.AdditionalSolutions;
import com.midnightnoon.pokrocily.collections.methods.Solutions;

import java.util.LinkedList;
import java.util.List;

public class CollectionsAssignment {
    public static void main(String[] args) {

        List<String> names = new LinkedList<>();
        names.add("Peter");
        names.add("Jozef");
        names.add("Frantisek");
        names.add("Jan");
        names.add("Martin");

        String nameToAdd = "Vratislav";
        String newName = "Rastislav";
        String lookForName = "Jan";

        Solutions.firstTask(names, nameToAdd);
        System.out.println();
        Solutions.replaceOnSecondPosition(names, newName);
        System.out.println();


        System.out.println(Solutions.lookForName(names, lookForName));
        System.out.println();


        Solutions.showLookedUpName(names, lookForName);
        System.out.println();
        Solutions.sortElementsInCollection(names);
        System.out.println();
        Solutions.addElementsFromSecondCollection(names, names);
        System.out.println();
        Solutions.replace2positions(names, "Frantisek", "Jan");
        System.out.println();
        System.out.println(Solutions.isCollectionEmpty(names));
        System.out.println();
        Solutions.printToConsoleWithIndex(names);
        System.out.println();
        AdditionalSolutions.personsInMap();
        System.out.println();
        AdditionalSolutions.textToCollection();
    }
}
