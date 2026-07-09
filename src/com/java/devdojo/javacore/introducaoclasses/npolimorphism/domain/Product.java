package com.java.devdojo.javacore.introducaoclasses.npolimorphism.domain;

public abstract class Product implements Taxable {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Inside this object there is a new functionality. But, since the reference variable is a product,
    // we'll never able to actually get back the new attribute
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
