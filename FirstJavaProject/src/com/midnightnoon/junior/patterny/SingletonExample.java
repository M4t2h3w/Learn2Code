package com.midnightnoon.junior.patterny;

public class SingletonExample {

    static SingletonExample instance = null;

    private SingletonExample(){};

    public static SingletonExample getInstance(){
        if(instance == null){
            instance = new SingletonExample();
        }

        return instance;
    }
}
