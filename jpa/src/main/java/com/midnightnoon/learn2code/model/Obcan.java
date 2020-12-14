package com.midnightnoon.learn2code.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Obcan {

    @Column(name = "cislo_op")
    private String cisloOp;

    public String getCisloOp() {
        return cisloOp;
    }

    public void setCisloOp(String cisloOp) {
        this.cisloOp = cisloOp;
    }

    @Override
    public String toString() {
        return "Obcan{" +
                "cisloOp='" + cisloOp + '\'' +
                '}';
    }
}
