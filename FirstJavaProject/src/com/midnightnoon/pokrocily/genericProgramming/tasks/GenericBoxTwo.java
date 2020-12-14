package com.midnightnoon.pokrocily.genericProgramming.tasks;

//2. úloha: modifikuj úlohu 1 tak, že krabička bude teraz držať až dva objekty hocijakého typu.
public class GenericBoxTwo<P, T> {
    private P object;
    private T objectTwo;

    public P getObject() {
        return object;
    }

    public void setObject(P object) {
        this.object = object;
    }

    public T getObjectTwo() {
        return objectTwo;
    }

    public void setObjectTwo(T objectTwo) {
        this.objectTwo = objectTwo;
    }
}
