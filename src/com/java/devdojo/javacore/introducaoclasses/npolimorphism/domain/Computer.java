package com.java.devdojo.javacore.introducaoclasses.npolimorphism.domain;

public class Computer extends Product {
    public static final double TAX_PERCENTAGE = 0.21;

    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTaxPrice() {
        System.out.println("Calculating tax for Computer...");
        return this.price * TAX_PERCENTAGE;
    }
}
