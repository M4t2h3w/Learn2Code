package sk.midnightnoon.fiktivnyprogram;

import sk.midnightnoon.fiktivnyprogram.entity.Film;
import sk.midnightnoon.fiktivnyprogram.entity.Osoba;
import sk.midnightnoon.simpleormframework.dbaccess.SormManager;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws Exception {
        SormManager manager = new SormManager();
        Osoba osoba = manager.getEntityById(0L, Osoba.class);
        System.out.println(osoba.getId());
        System.out.println(osoba.getMeno());
        System.out.println(osoba.getPriezvisko());
        System.out.println(osoba.getVek());
        System.out.println(osoba.getAdresa());

        Film film = new Film();
        film.setNazov("Fireprooof");
        film.setReziser("Alex Kendrick");
        film.setvHlavnejUlohe("Kirk Cameron, Erin Bethea");
        manager.insertEntity(film);

        Osoba osoba2 = new Osoba();
        osoba2.setId(1L);
        osoba2.setMeno("Matej");
        osoba2.setPriezvisko("Novotný");
        osoba2.setVek(31);
        osoba2.setAdresa("Wolkerova 32, SNV");
        manager.insertEntity(osoba2);
    }
}
