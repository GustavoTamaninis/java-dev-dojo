package com.java.devdojo.javacore.javacore.npolimorphism.service;

import com.java.devdojo.javacore.javacore.npolimorphism.domain.Product;
import com.java.devdojo.javacore.javacore.npolimorphism.domain.Tomato;

public class ProductTaxReportService {

    public static void generateTaxReport(Product product){ //an implicit upcasting (children to parent), because the super class receives an object from the subclass
        System.out.println("Starting the tax report");
        double taxValue = product.calculateTaxValue();
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Tax Value: " + taxValue);
        if(product instanceof Tomato){
            System.out.println(((Tomato) product).getBestConsumedBefore());
            // it's occurring a downcasting (parent to children)
            // 'cause I'm explicitly telling the compiler to treat 'product' as a 'tomato'
            // to access subclass-specific methods.
        }
    }
}
