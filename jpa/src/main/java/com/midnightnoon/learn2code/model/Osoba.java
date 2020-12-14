package com.midnightnoon.learn2code.model;

import com.midnightnoon.learn2code.converters.*;
import com.midnightnoon.learn2code.model.enmus.*;
import com.midnightnoon.learn2code.model.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// musim pridat aj do persistence.xml pod class

@Entity
public class Osoba extends Obcan{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Convert(converter = PohlavieConverter.class)
    private Pohlavie pohlavie;

    @Embedded
    private Meno meno;

    //obojsmerne prepojenie s Telefon
    @OneToMany(mappedBy = "osoba", cascade = CascadeType.ALL, orphanRemoval = true,
                fetch = FetchType.LAZY)
    private List<Telefon> telefony = new ArrayList<>();

    //teraz mozem zistit v ktorych skupinach osoba je
    @ManyToMany(mappedBy = "osobyVSkupine",
                fetch = FetchType.LAZY) //bez mappedBy by som musel mať 2 pomocne tabulky v db
                                            //takto mozem pouzit uz existujucu Skupina_Osoba
    private List<SkupinaKontaktov> skupinyOsoby = new ArrayList<>();

    @OneToOne(mappedBy = "osoba", cascade = CascadeType.ALL, orphanRemoval = true,
                fetch = FetchType.LAZY)
    private Adresa adresa;



    public void addTelefon(Telefon telefon){
        telefony.add(telefon);
        telefon.setOsoba(this);
    }

    public void removeTelefon(Telefon telefon){
        telefony.remove(telefon);
        telefon.setOsoba(null);
    }

    public Osoba() {
    }

    public Osoba(Pohlavie pohlavie) {
        this.pohlavie = pohlavie;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pohlavie getPohlavie() {
        return pohlavie;
    }

    public void setPohlavie(Pohlavie pohlavie) {
        this.pohlavie = pohlavie;
    }

    public Meno getMeno() {
        return meno;
    }

    public void setMeno(Meno meno) {
        this.meno = meno;
    }

    public List<Telefon> getTelefony() {
        return telefony;
    }

    public void setTelefony(List<Telefon> telefony) {
        this.telefony = telefony;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "id=" + id +
                ", pohlavie=" + pohlavie +
                ", meno=" + meno +
                ", telefony=" + telefony +
                super.toString() +
                '}';
    }
}
