package com.midnightnoon.pokrocily.vnoreneTriedy.objects;

public class Hero{

    private String name;
    private int health;

    public Hero(String name, int health){
        this.name = name;
        this.health = health;
    }

    public void Attack(IHero iHero) {
        iHero.Attack();
    }
    public void StopAttack(IHero iHero) {
        iHero.StopAttack();
    }
}
