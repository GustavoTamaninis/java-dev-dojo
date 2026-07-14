package com.java.devdojo.exercises.ex01.domain;

public class InsufficientFunds extends RuntimeException {
    public InsufficientFunds() { super("Insufficient funds"); }
    public InsufficientFunds(String message) {
        super(message);
    }
}
