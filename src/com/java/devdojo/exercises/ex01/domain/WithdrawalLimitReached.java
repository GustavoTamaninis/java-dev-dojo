package com.java.devdojo.exercises.ex01.domain;

public class WithdrawalLimitReached extends RuntimeException {
  public WithdrawalLimitReached() { super("Withdrawal limit reached"); }
  public WithdrawalLimitReached(String message) {
        super(message);
    }
}
