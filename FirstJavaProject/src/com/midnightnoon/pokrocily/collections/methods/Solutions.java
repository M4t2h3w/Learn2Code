package com.midnightnoon.pokrocily.collections.methods;

import java.util.List;

//1. úloha: napíš program, kde si vytvoríš zoznam mien, ktorý vypíšeš na konzolu.
public class Solutions {
    public static void firstTask(List<String> names, String nameToAdd){
        System.out.println("***First Task***");
        printCollectionToTerminal(names);

        names.add(0, nameToAdd);

        //2. úloha: napíš program, ktorá ti vloží element (napríklad String meno) na
        // prvé miesto v zozname mien.
        System.out.println();
        System.out.println("***Second Task***");
        printCollectionToTerminal(names);
    }

    //3. úloha: napíš program, ktorí má niekoľko elementov, napríklad mien a nahradíš meno na
    //druhej pozícii iným menom.
    public static void replaceOnSecondPosition(List<String> names, String newName){
        System.out.println("***Third Task***");
        printCollectionToTerminal(names);
        names.set(1, newName);

        System.out.println("Change on second position to " + newName + ":");
        printCollectionToTerminal(names);
    }

    //4. úloha: napíš metódu, ktorá na vstupe bude mať zoznam mien a meno, ktoré sa pokúsiš
    //vyhľadať v zozname. Metóda zistí, či sa daný element (napr. meno) nachádza v zozname alebo nie.
    //Ak áno vráti jeho pozíciu ako návratovú hodnotu.
    public static int lookForName(List<String> names, String searchName){
        System.out.println("***Fourth Task***");
        return names.contains(searchName) ? names.indexOf(searchName) : -1;
    }

    //5. úloha: použi metódu z úlohy 4. Vrátenú pozíciu použi na to aby si načítal daný element zo
    //zoznamu a vypísal ho na konzolu. Potom vyskúšaj do metódy v úlohe 4 zadať také meno,
    //ktoré sa tam nenachádza a postupuj tak ako v úlohe 5. Vyskúšaš si ako si poradiť s neznámym indexom.
    //Ako to vyriešiš?
    public static void showLookedUpName(List<String> names, String lookForName){
        System.out.println("***Fifth task***");
        int result = lookForName(names, lookForName);
        if(result >= 0) System.out.println(names.get(result));
        else System.out.println("Name not found!");
    }

    //6. úloha: napíš program, ktorý ti zotriedi prvky v kolekcii.
    public static void sortElementsInCollection(List<String> names){
        System.out.println("***Sixth Task***");
        names.sort(String::compareTo);
        printCollectionToTerminal(names);
    }

    //7. úloha: napíš program, ktorý pridá elementy z jednej kolekcie na koniec druhej kolekcie.
    public static void addElementsFromSecondCollection(List<String> mainCollection, List<String> toAddCollection){
        System.out.println("***Seventh task***");

        mainCollection.addAll(toAddCollection);
        printCollectionToTerminal(mainCollection);
    }

    //8. úloha: napíš program, ktorý ti vymení dva elementy v kolekcii medzi sebou.
    public static void replace2positions(List<String> names, String firstElement, String secondElement) {
        System.out.println("***Eight Task***");
        int firstPosition = names.contains(firstElement) ? names.indexOf(firstElement) : -1;
        int secondPosition = names.contains(secondElement) ? names.indexOf(secondElement) : -1;

        if(firstPosition >=0 && secondPosition >=0) {
            String helperString = names.get(firstPosition);
            names.set(firstPosition, secondElement);
            names.set(secondPosition, helperString);
        }
        else System.out.println("Element not found!");
        printCollectionToTerminal(names);
    }

    //9. úloha: napíš program, ktorý ti zistí, či daná kolekcia je prázdna alebo nie.
    public static boolean isCollectionEmpty(List<String> names){
        System.out.println("***Ninth Task***");
        return names.isEmpty();
    }

    //10. úloha: napíš program, ktorý ti vypíše elementy z kolekcie na konzolu.
    // Elementy získaj pomocou indexu.
    public static void printToConsoleWithIndex(List<String> names){
        System.out.println("***Tenth Task***");
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
    }

    private static void printCollectionToTerminal(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
