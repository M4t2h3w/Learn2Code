package com.midnightnoon.zaciatocnik.enums;

public class EnumsAssignments {

    private static String language = "SK";

    public static void main(String[] args) {
        
        whichPartOfWeek(Day.FRIDAY);
        whichPartOfWeek(Day.SUNDAY);
        System.out.println(Cardinals.SEVER.getAbbrevEng());
        getDirections(new Cardinals[]{Cardinals.JUH, Cardinals.SEVER, Cardinals.ZAPAD, Cardinals.SEVER, Cardinals.JUH});
    }

    /*
    Napíš enum, ktorý bude reprezentovať dni v týždni.
    Potom napíš metódu, ktorá na vstup zoberie ako parameter
    jeden element z daného enum a na konzolu pomocou switchu
    napíšeš, či je daný deň deň v týždni alebo je to víkend.
     */
    private static void whichPartOfWeek(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("It is weekday.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It is weekend.");
                break;
        }
    }

    /*
    Napíš program, ktorý využije predchádzajúci enum.
    Budeš mať pole rôznych súradníc. Ak bude v poli enum Sever,
    tak sa zavolá metóda goDirection kde vstup bude práve daný enum,
    ktorá vypíše text Choď na sever. V programe maj globálnu premennú,
    ktorá bude vravieť, či chceš mať anglický text alebo slovenský
    a na základe toho sa napíše buď Choď na sever alebo Go north.
    Kde sever alebo north sa bude vyberať z enumu.
     */
    private static void getDirections(Cardinals[] directions) {
        for (Cardinals direction : directions) {
            showDirection(direction);
        }
    }

    private static void showDirection(Cardinals direction) {
        if(language.equals("SK")) {
            System.out.println("Chod na " + direction.getLowerSk());
        }
        else {
            System.out.println("Go " + direction.getLowerEng());
        }

    }
}
