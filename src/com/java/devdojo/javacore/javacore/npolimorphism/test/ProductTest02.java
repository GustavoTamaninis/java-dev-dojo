package com.java.devdojo.javacore.javacore.npolimorphism.test;

import com.java.devdojo.javacore.javacore.npolimorphism.domain.Product;
import com.java.devdojo.javacore.javacore.npolimorphism.domain.Computer;
import com.java.devdojo.javacore.javacore.npolimorphism.domain.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {
        //widening cast is always that cast you are doing without having to do anything
        Product product = new Computer("Ryzen 9", 1000);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.calculateTaxPrice());

        System.out.println("------------------");
        Product product2 = new Tomato("Dutch", 6);
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product2.calculateTaxPrice());
        // Inside this object there is a new functionality.
        // But, since the reference variable is a product, we'll never able to actually get back the new attribute
        //product2.getBestConsumedBefore
    }
}
