package com.java.devdojo.exercises.ex01.domain;

public class Person {
    private String name;
    private BankAccount bankAccount;
    protected double cashInHand = 0;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double getCashInHand() {
        return cashInHand;
    }
}
