package com.midnightnoon.pokrocily.usingExceptions.ownExceptions;

public class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String message) {
        super(message);
    }
}
