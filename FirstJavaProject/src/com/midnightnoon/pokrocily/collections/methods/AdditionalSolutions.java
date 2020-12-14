package com.midnightnoon.pokrocily.collections.methods;

import com.midnightnoon.pokrocily.collections.objects.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class AdditionalSolutions {
    //11. úloha: napíš program, ktorý použije HasMap<Integer, Osoba>. Pridaj pár záznamov do
    //danej kolekcii a vypíš prvky danej kolekcie. Integer ber, že je to identifikátor Osoby a
    //Osoba je inštancia nejakej osoby.
    public static void personsInMap(){
        HashMap<Integer, Person> personsMap= new HashMap<>();
        personsMap.put(1, new Person("Peter", 21));
        personsMap.put(2, new Person("Jozef", 18));
        personsMap.put(3, new Person("Otakar", 24));
        personsMap.put(4, new Person("Martin", 32));
        personsMap.put(5, new Person("Jan", 40));

        for(Map.Entry entry : personsMap.entrySet()) {
            System.out.println("Integer: " + entry.getKey() + " Person: " + entry.getValue());
        }
        System.out.println(isPersonPresent(personsMap, 2));

        ArrayList<Person> personsArray = convertToArrayList(personsMap);
        System.out.println(personsArray);
    }

    //12. úloha: použi kolekciu z úlohy 11. Napíš program, ktorý zistí, či v danej kolekcii je
    //Osoba priradená k identifikátoru.
    public static boolean isPersonPresent(HashMap<Integer, Person> personsMap, Integer key){
        return personsMap.containsKey(key);
    }

    //13. úloha: napíš program, ktorý vloží Osoby z kolekcie osôb z úlohy 11 do ArrayListu.
    public static ArrayList convertToArrayList(HashMap<Integer, Person> personsMap){
        ArrayList<Person> personsArray = new ArrayList<>();
        for(Map.Entry entry : personsMap.entrySet()){
            personsArray.add((Person) entry.getValue());
        }
        return personsArray;
    }

    //14. úloha: Napíš program, ktorý načíta riadky z textového súboru. Riadky ulož do kolekcie.
    //Jeden riadok = jeden záznam v kolekcii.
    public static void textToCollection(){
        Path p = Paths.get("/Users/matej/Documents/IntelliJ Idea projects/FirstJavaProject/src/com/midnightnoon/pokrocily/collections/methods/text.txt");
        List<String> textFile = new LinkedList<>();

        try(Scanner scanner = new Scanner(Files.newBufferedReader(p))){
            while(scanner.hasNextLine()) {
                textFile.addAll(Collections.singleton(scanner.nextLine()));
            }
        } catch (IOException e) {
            System.out.println("File not existing!");
        }
        System.out.println(textFile);

        System.out.println("Testing print any collection:");
        printAnyCollection(textFile);
    }

    //15. úloha: napíš metódu, ktorá na vstupe bude akceptovať kolekciu typu Collection.
    //Vo vnútri metódy sa všetky elementy z kolekcie vypíšu na konzolu.
    //Pre predstavu použi napríklad dve kolekcie takto:
    //Collection<String> collection = new ArrayList<>();
    //Collection<String> collection2 = new HashSet<>();
    public static void printAnyCollection(Collection<String> anyCollection){
        for(String element : anyCollection) {
            System.out.println(element);
        }
    }
}
