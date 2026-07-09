package com.java.devdojo.javacore.javacore.npolimorphism.domain;

public class Television extends  Product{
    public static final double TAX_PERCENTAGE = 0.21;

    public Television(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating tax for Television...");
        return this.price * TAX_PERCENTAGE;
    }
}
