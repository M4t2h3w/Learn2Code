package com.midnightnoon.zaciatocnik.livingroom;

public class LivingRoom {
    public static void main(String[] args) {
        Computer asus = new Computer("Laptop", "ASUS",
                14, "Intel", 4000,
                "HDD", 1000000);
        Computer apple = new Computer("Laptop", "Apple",
                13, "Intel", 8000,
                "SSD", 250000);

        Furniture sofa = new Furniture("sofa", "cloth", "blue");
        Furniture table = new Furniture("table", "wood", "dark brown");
        Furniture chair = new Furniture("chair", "plastic", "black");

        System.out.println(asus.brand + " - " + asus.screenSize + "\" - "+ asus.cpuProducer);
        System.out.println(apple.brand + " - " + apple.screenSize + "\" - "+ apple.cpuProducer);
        System.out.println("Computers count: " + Computer.computersCount);

        System.out.println(sofa.type + " - " + sofa.material + " - " + sofa.color);
        System.out.println(table.type + " - " + table.material + " - " + table.color);
        System.out.println(chair.type + " - " + chair.material + " - " + chair.color);
        System.out.println("Furniture count: " + Furniture.furnitureCount);

    }
}
