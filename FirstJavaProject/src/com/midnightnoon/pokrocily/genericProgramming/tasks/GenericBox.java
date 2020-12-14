package com.midnightnoon.pokrocily.genericProgramming.tasks;

//1. úloha: napíš generickú triedu, ktorá bude slúžiť ako "krabička/úložisko" pre
//objekt hocijakého typu. Trieda musí obsahovať aspoň dve metódy.
//Prvá metóda bude slúžiť na nasetovanie/uloženie objektu do "krabičky".
//Druhou metódou získať daný objekt z "krabičky".

public class GenericBox<P> {
    private P object;

    public P getObject() {
        return object;
    }

    public void setObject(P object) {
        this.object = object;
    }
}
