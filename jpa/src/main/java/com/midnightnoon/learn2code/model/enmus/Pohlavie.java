package com.midnightnoon.learn2code.model.enmus;

public enum  Pohlavie {
    MUZ('M'),
    ZENA('Z');

    private Character kod;

    Pohlavie(Character kod){
        this.kod = kod;
    }

    public static Pohlavie getEnumFromKod(Character kod) {
        if(kod.equals('M') || kod.equals('m')) return MUZ;
        if(kod.equals('Z') || kod.equals('z')) return ZENA;
        throw new UnsupportedOperationException("Pre dany kod " + kod + " neexistuje enum typu Pohlavie");
    }

    public char getKod() {
        return kod;
    }

    public void setKod(Character kod) {
        this.kod = kod;
    }
}
