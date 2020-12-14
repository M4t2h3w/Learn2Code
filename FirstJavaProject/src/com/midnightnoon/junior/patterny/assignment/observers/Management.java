package com.midnightnoon.junior.patterny.assignment.observers;

import java.util.Observable;
import java.util.Observer;

public class Management implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Management replied: " + arg);
    }
}
