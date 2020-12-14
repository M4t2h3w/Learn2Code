package com.midnightnoon.learn2code.model;

import javax.persistence.*;
import com.midnightnoon.learn2code.model.Film;

@Entity
@Table(name = "Detail_Filmu")
public class DetailFilmu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "POPIS_FILMU")
    private String popisFilmu;

    @OneToOne
    private Film film;

    public DetailFilmu() {
    }

    public Film getFilm() {
        return film;
    }

    @Override
    public String toString() {
        return "DetailFilmu{" +
                "id=" + id +
                ", popisFilmu='" + popisFilmu + '\'' +
                ", film=" + film +
                '}';
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPopisFilmu() {
        return popisFilmu;
    }

    public void setPopisFilmu(String popisFilmu) {
        this.popisFilmu = popisFilmu;
    }

}
