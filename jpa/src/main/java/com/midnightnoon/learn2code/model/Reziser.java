package com.midnightnoon.learn2code.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Reziser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PRVE_MENO")
    private String prveMeno;

    @Column(name = "DRUHE_MENO")
    private String druheMeno;

    private String priezvisko;

    @ManyToMany(mappedBy = "reziseri")
    private List<Film> filmy = new ArrayList<>();

    public Reziser() {
    }

    public Reziser(String prveMeno, String druheMeno, String priezvisko) {
        this.prveMeno = prveMeno;
        this.druheMeno = druheMeno;
        this.priezvisko = priezvisko;
    }

    public List<Film> getFilmy() {
        return filmy;
    }

    public void setFilmy(List<Film> filmy) {
        this.filmy = filmy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrveMeno() {
        return prveMeno;
    }

    public void setPrveMeno(String prveMeno) {
        this.prveMeno = prveMeno;
    }

    public String getDruheMeno() {
        return druheMeno;
    }

    public void setDruheMeno(String druheMeno) {
        this.druheMeno = druheMeno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public void addFilm(Film film) {
        filmy.add(film);
    }
}
