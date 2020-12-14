package com.midnightnoon.junior.patterny.observers;

import java.util.Observable;
import java.util.Observer;

public class Noviny implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Noviny píšu: " + arg);
    }
}
