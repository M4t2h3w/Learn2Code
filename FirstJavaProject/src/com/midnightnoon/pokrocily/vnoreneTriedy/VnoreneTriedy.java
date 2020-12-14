package com.midnightnoon.pokrocily.vnoreneTriedy;

import com.midnightnoon.pokrocily.vnoreneTriedy.objects.Hero;
import com.midnightnoon.pokrocily.vnoreneTriedy.objects.IHero;
import com.midnightnoon.pokrocily.vnoreneTriedy.objects.Person;

public class VnoreneTriedy {
    public static void main(String[] args) {

        //1. úloha: Napíš triedu, ktorý bude reprezentovať človeka.
        //Človek okrem iného bude mať aj adresu. Adresa bude ako nový typ - teda
        //vytvoríš pre ňu novú triedu. Napíš dve verzie tohto programu - prvá kde
        //Adresa bude klasická trieda mimo triedy pre človeka. A druhá verzia, kde
        //Adresa bude vnorená trieda v triede človek.
        Person osoba = new Person("Peter", 14);
        osoba.nastavAdresu("Zilinska", "Ruzomberok");
        System.out.println(osoba);

        //2. úloha: Napíš si triedu, ktorá bude reprezentovať hrdinu.
        //Každý hrdina má špeciálne schopnosti. Na schopnosť použi rozhranie,
        //ktoré bude mať metódy (napr. pre použi schopnosť, zastav schopnosť).
        //Potom napíš program, ktorý ti vytvorí dvoch hrdinov. Každý bude mať inú schopnosť.
        //Danú schopnosť im priraď pomocou vnútornej anonymnej triedy. Potom zavolaj/spusti nad
        //danými hrdinami ich schopnosti.

        Hero hero1 = new Hero("Warrior", 500);
        Hero hero2 = new Hero("Healer", 100);

        hero1.Attack(new IHero() {
            @Override
            public void Attack() {
                System.out.println("Attacking!");
            }

            @Override
            public void StopAttack() {
                System.out.println("Attack stopped!");
            }
        });
        hero2.Attack(new IHero() {
            @Override
            public void Attack() {
                System.out.println("Healing!");
            }

            @Override
            public void StopAttack() {
                System.out.println("Healing stopped!");
            }
        });
    }
}
