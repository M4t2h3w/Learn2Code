package com.midnightnoon.learn2code.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nazov;

    private String zaner;

    @OneToOne(mappedBy = "film", cascade = CascadeType.ALL, orphanRemoval = true)
    //TODO cascada nie je dobre nastavena
    // pri pokuse o remove detailFilmu sa nič nestane
    private DetailFilmu detailFilmu;

    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "film_id",
            foreignKey = @ForeignKey(name = "fk_film_reziser_id")),
            inverseJoinColumns = @JoinColumn(name = "reziser_id",
                    foreignKey = @ForeignKey(name = "fk_2_film_reziser_id")))
    private List<Reziser> reziseri = new ArrayList<>();

    public Film() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getZaner() {
        return zaner;
    }

    public void setZaner(String zaner) {
        this.zaner = zaner;
    }

    public DetailFilmu getDetailFilmu() {
        return detailFilmu;
    }

    public void setDetailFilmu(DetailFilmu detailFilmu) {
        this.detailFilmu = detailFilmu;
        detailFilmu.setFilm(this);
    }

    public List<Reziser> getReziseri() {
        return reziseri;
    }

    public void setReziseri(List<Reziser> reziseri) {
        this.reziseri = reziseri;
    }

    public void addReziser(Reziser reziser) {
        reziseri.add(reziser);
        reziser.addFilm(this);
    }
}
