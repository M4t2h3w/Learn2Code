package com.midnightnoon.junior.patterny;

import com.midnightnoon.junior.patterny.factory.Factory;
import com.midnightnoon.junior.patterny.factory.Kladivo;
import com.midnightnoon.junior.patterny.observers.Blog;
import com.midnightnoon.junior.patterny.observers.MojaOsoba;
import com.midnightnoon.junior.patterny.observers.Noviny;

public class Main {
    public static void main(String[] args) {
        singleton();
        factory();
        builder();
        observer();
    }

    private static void observer() {

        Blog blog = new Blog();
        Noviny noviny = new Noviny();

        MojaOsoba osoba = new MojaOsoba();
        osoba.addObserver(blog);
        osoba.addObserver(noviny);

        osoba.setSprava("Píšem novú správu všetkým.");
    }

    private static void builder(){
        Kladivo kladivo = Kladivo.noveKladivo()
                .farba("Biele")
                .vyrobca("OBI")
                .dlzka(40.50f)
                .build();
        System.out.println(kladivo.getFarba());
        System.out.println(kladivo.getVyrobca());
        System.out.println(kladivo.getDlzka());
    }

    private static void factory() {
        Kladivo kladivo = Factory.createKladivo();
    }

    private static void singleton() {
        SingletonExample singletonExample = SingletonExample.getInstance();
        SingletonExample singletonExample2 = SingletonExample.getInstance();

        if(singletonExample.equals(singletonExample2)) System.out.println("Equals");
        else System.out.println("Not equals");
    }
}
