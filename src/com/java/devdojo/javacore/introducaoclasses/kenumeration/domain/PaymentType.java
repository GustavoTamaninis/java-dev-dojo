package com.java.devdojo.javacore.introducaoclasses.kenumeration.domain;

public enum PaymentType{
    // it's kinda of polymorphism:
    DEBIT{
        @Override
        public double calculateDiscount(double value) {
            return value * 0.1;
        }
    }, CREDIT{
        @Override
        public double calculateDiscount(double value) {
            return value * 0.05;
        }
    };

    public abstract double calculateDiscount(double value); // this abstract method must be overridden
}