package com.midnightnoon.pokrocily.vnoreneTriedy.objects;

public class Person {

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    private Address address;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void nastavAdresu(String street, String city){
        this.address = new Address(street, city);
    }

    class Address{
        private String street;
        private String city;

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }

        Address(String street, String city){
            this.city = city;
            this.street = street;
        }
    }
}
