package com.midnightnoon.junior.patterny.factory;

public class Kladivo {
    private String farba;
    private String vyrobca;
    private float dlzka;

    public Kladivo(){};

    public Kladivo(Builder builder) {
        setFarba(builder.farba);
        setVyrobca(builder.vyrobca);
        setDlzka(builder.dlzka);
    }
    //....

    //tato metoda sluzi na vytvorenie Kladiva cez bodkovu anotaciu ale vracia Builder!!!
    public static Builder noveKladivo(){
        return new Builder();
    }

    //Builder musí byť priamo v triede, ktoru builduje a musi obsahovat tie iste fieldy
    //musi obsahovat metody, ktorych nazvy su identicke s fieldmi a vracat naspat instanciu Builder, teda "this"
    public static class Builder{
        private String farba;
        private String vyrobca;
        private float dlzka;

        private Builder(){};

        //nasetujem fieldy
        public Builder farba(String farba){
            this.farba = farba;
            return this;
        }
        public Builder vyrobca(String vyrobca){
            this.vyrobca = vyrobca;
            return this;
        }

        public Builder dlzka(float dlzka){
            this.dlzka = dlzka;
            return this;
        }

        //vytvorim, nasetujem a vratim Kladivo
        public Kladivo build(){
            return new Kladivo(this);
        }
    }

    public String getFarba() {
        return farba;
    }

    public void setFarba(String farba) {
        this.farba = farba;
    }

    public String getVyrobca() {
        return vyrobca;
    }

    public void setVyrobca(String vyrobca) {
        this.vyrobca = vyrobca;
    }

    public float getDlzka() {
        return dlzka;
    }

    public void setDlzka(float dlzka) {
        this.dlzka = dlzka;
    }
}
