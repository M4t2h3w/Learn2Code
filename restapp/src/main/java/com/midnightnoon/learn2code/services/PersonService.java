package com.midnightnoon.learn2code.services;

import com.midnightnoon.learn2code.model.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonService {

    private static PersonService instance = null;
    private Map<Long, Person> persons = new HashMap<>();

    private PersonService(){
        Person person = new Person(1L, "Jaro", "Beno", 29);
        Person person2 = new Person(2L, "Jaro", "Hruska", 31);
        Person person3 = new Person(3L, "Jaro", "Skuska", 18);
        Person person4 = new Person(4L, "Peter", "Beno", 45);
        Person person5 = new Person(5L, "Fedor", "Beno", 39);
        persons.put(person.getId(), person);
        persons.put(person2.getId(), person2);
        persons.put(person3.getId(), person3);
        persons.put(person4.getId(), person4);
        persons.put(person5.getId(), person5);
    };

    //musí byť static aby som z nej nemusel vytvoriť inštanciu ale zavolal ju cez
    // PersonService.getPersonService.getAllPersons()
    public static PersonService getPersonService(){
        if(instance == null) {
            return instance = new PersonService();
        }
        return instance;
    }


    public List<Person> getAllPersons(){
        return new ArrayList<>(persons.values());
    }

    public Person getPersonById(Long id){
        return persons.get(id);
    }

    public Person addPerson(Person person){
        person.setId(persons.size() + 1L);
        persons.put(person.getId(), person);
        return getPersonById(person.getId());
    }

    public Person updatePerson(Person person) {
        persons.put(person.getId(), person);
        return getPersonById(person.getId());
    }

    public void deletePerson(long personId) {
        Person person = getPersonById(personId);
        persons.remove(person.getId());
    }

    public List<Person> getAllPersonsWithName(final String name) {
        return persons.values().stream()
                .filter(person -> person.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }
}
