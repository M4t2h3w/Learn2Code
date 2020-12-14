package com.midnightnoon.junior.patterny.observers;

import java.util.Observable;

public class MojaOsoba extends Observable {
    private String sprava;

    public MojaOsoba() {
    }

    public String getSprava() {
        return sprava;
    }

    public void setSprava(String sprava) {
        this.sprava = sprava;
        setChanged();
        notifyObservers(sprava);
    }
}
