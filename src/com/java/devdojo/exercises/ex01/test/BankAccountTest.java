package com.java.devdojo.exercises.ex01.test;

import com.java.devdojo.exercises.ex01.domain.BankAccount;
import com.java.devdojo.exercises.ex01.domain.InsufficientFunds;
import com.java.devdojo.exercises.ex01.domain.Person;
import com.java.devdojo.exercises.ex01.domain.WithdrawalLimitReached;

public class BankAccountTest {
    public static void main(String[] args) {
        Person person = new Person("Erick");
        BankAccount bankAccount = new BankAccount(person, 11);
        person.setBankAccount(bankAccount);

        try{
            person.getBankAccount().deposit(16.19);
            person.getBankAccount().deposit(0);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        try{
            person.getBankAccount().withdraw(5);
        }catch (InsufficientFunds e){
            e.printStackTrace();
        }catch (WithdrawalLimitReached e){
            e.printStackTrace();
        }

        try{
            person.getBankAccount().withdraw(15);

        }catch (InsufficientFunds e){
            e.printStackTrace();
        }catch (WithdrawalLimitReached e){
            e.printStackTrace();
        }

        try{
            person.getBankAccount().withdraw(11.1);
        }catch (InsufficientFunds e){
            e.printStackTrace();
        }catch (WithdrawalLimitReached e){
            e.printStackTrace();
        }

        System.out.printf("%s has $%.2f in his bank account\n", person.getName(), person.getBankAccount().getBalance());
        System.out.printf("And %s has $%.2f in his hand\n", person.getName(), person.getCashInHand());
    }
}
