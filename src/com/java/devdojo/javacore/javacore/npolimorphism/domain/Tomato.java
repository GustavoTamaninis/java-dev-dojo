package com.java.devdojo.javacore.javacore.npolimorphism.domain;

public class Tomato extends Product{
    public static final double TAX_PERCENTAGE = 0.06;
    private String bestConsumedBefore;

    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating tax for Tomato...");
        return this.price * TAX_PERCENTAGE;
    }

    public String getBestConsumedBefore() {
        return bestConsumedBefore;
    }

    public void setBestConsumedBefore(String bestConsumedBefore) {
        this.bestConsumedBefore = bestConsumedBefore;
    }
}
