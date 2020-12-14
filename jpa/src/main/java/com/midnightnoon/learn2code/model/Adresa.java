package com.midnightnoon.learn2code.model;

import javax.persistence.*;

@Entity
public class Adresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ulica;
    private String mesto;
    private String psc;

    @OneToOne
    private Osoba osoba;

    public Adresa() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        this.psc = psc;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    @Override
    public String toString() {
        return "Adresa{" +
                "id=" + id +
                ", ulica='" + ulica + '\'' +
                ", mesto='" + mesto + '\'' +
                ", psc='" + psc + '\'' +
                ", osoba=" + osoba +
                '}';
    }
}
