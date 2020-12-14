package sk.midnightnoon.fiktivnyprogram.entity;

import sk.midnightnoon.simpleormframework.anotacie.Id;
import sk.midnightnoon.simpleormframework.anotacie.Stlpec;
import sk.midnightnoon.simpleormframework.anotacie.Tabulka;

@Tabulka("OSOBA")
public class Osoba {
    @Id
    @Stlpec("ID")
    private long id;

    @Stlpec("NAME")
    private String meno;

    @Stlpec("SURNAME")
    private String priezvisko;

    @Stlpec("AGE")
    private Integer vek;

    @Stlpec("ADDRESS")
    private String adresa;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public Integer getVek() {
        return vek;
    }

    public void setVek(Integer vek) {
        this.vek = vek;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
