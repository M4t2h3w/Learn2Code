package com.midnightnoon.learn2code.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Meno {
    @Column(name = "titul_pred")
    private String titulPred;

    @Column(name = "titul_za")
    private String titulZa;

    @Column(name = "prve_meno")
    private String prvemeno;

    @Column(name = "stredne_meno")
    private String stredneMeno;

    private String priezvisko;

    public Meno() {}

    public Meno(String titulPred, String titulZa, String prvemeno, String stredneMeno, String priezvisko) {
        this.titulPred = titulPred;
        this.titulZa = titulZa;
        this.prvemeno = prvemeno;
        this.stredneMeno = stredneMeno;
        this.priezvisko = priezvisko;
    }

    public String getTitulPred() {
        return titulPred;
    }

    public void setTitulPred(String titulPred) {
        this.titulPred = titulPred;
    }

    public String getTitulZa() {
        return titulZa;
    }

    public void setTitulZa(String titulZa) {
        this.titulZa = titulZa;
    }

    public String getPrvemeno() {
        return prvemeno;
    }

    public void setPrvemeno(String prvemeno) {
        this.prvemeno = prvemeno;
    }

    public String getStredneMeno() {
        return stredneMeno;
    }

    public void setStredneMeno(String stredneMeno) {
        this.stredneMeno = stredneMeno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    @Override
    public String toString() {
        return "Meno{" +
                "titulPred='" + titulPred + '\'' +
                ", titulZa='" + titulZa + '\'' +
                ", prvemeno='" + prvemeno + '\'' +
                ", stredneMeno='" + stredneMeno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                '}';
    }
}
