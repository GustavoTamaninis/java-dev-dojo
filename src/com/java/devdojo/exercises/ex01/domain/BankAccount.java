package com.java.devdojo.exercises.ex01.domain;

public class BankAccount {
    private double balance;
    private Person holder;
    private double withdrawLimit;

    public BankAccount(Person holder, double withdrawLimit) {
        this.balance = 0;
        this.holder = holder;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double value){
        if(value <= 0) throw new IllegalArgumentException("Error! The value must be greater than 0");
        this.balance += value;
        System.out.printf("$%.2f was deposited\n", value);
    }

    public void withdraw(double value){
        if(value > this.balance) throw new InsufficientFunds("Error! Insufficient funds");
        if(value > this.withdrawLimit) throw new WithdrawalLimitReached("Error! Withdrawal limit reached");

        this.balance -= value;
        holder.cashInHand += value;
        System.out.printf("The holder withdrew $%.2f\n", value);
    }

    public double getBalance() {
        return balance;
    }

    public Person getHolder() {
        return holder;
    }

    public void setHolder(Person holder) {
        this.holder = holder;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}
