package com.midnightnoon.learn2code.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Skupina")
public class SkupinaKontaktov {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nazov")
    private String nazovSkupiny;

    //jednosmerne OneToMany
    //@OneToMany
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "skupina_id",
            foreignKey = @ForeignKey(name = "fk_skupina_id")),
            inverseJoinColumns = @JoinColumn(name = "osoba_id",
                    foreignKey = @ForeignKey(name = "fk_2_skupina_id")))
    private List<Osoba> osobyVSkupine = new ArrayList<>();

    public SkupinaKontaktov() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazovSkupiny() {
        return nazovSkupiny;
    }

    public void setNazovSkupiny(String nazovSkupiny) {
        this.nazovSkupiny = nazovSkupiny;
    }

    public List<Osoba> getOsobyVSkupine() {
        return osobyVSkupine;
    }

    public void setOsobyVSkupine(List<Osoba> osobyVSkupine) {
        this.osobyVSkupine = osobyVSkupine;
    }
}
