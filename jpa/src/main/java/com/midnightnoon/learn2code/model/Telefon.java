package com.midnightnoon.learn2code.model;

import javax.persistence.*;

@Entity
public class Telefon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cislo;

    //obojsmerne prepojenie s Osoba
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_telefon_osoba_id"))
    private Osoba osoba;

    public Telefon() {
    }

    public Long getId() {
        return id;
    }

    public String getCislo() {
        return cislo;
    }

    public void setCislo(String cislo) {
        this.cislo = cislo;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "id=" + id +
                ", cislo='" + cislo + '\'' +
                ", osoba=" + osoba +
                '}';
    }
}
