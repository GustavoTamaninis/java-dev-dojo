package com.java.devdojo.javacore.javacore.npolimorphism.service;

import com.java.devdojo.javacore.javacore.npolimorphism.domain.Computer;
import com.java.devdojo.javacore.javacore.npolimorphism.domain.Tomato;

public class ProductTaxReportService {

    public static void generateComputerTaxReport(Computer computer){
        System.out.println("Starting report for Computer");
        double taxValue = computer.calculateTaxPrice();
        System.out.println("Computer " + computer.getName());
        System.out.println("Price U$" + computer.getPrice());
        System.out.println("Tax Value U$" + taxValue);
    }

    public static void generateTomatoTaxReport(Tomato tomato){
        System.out.println("Starting report for Tomato");
        double taxValue = tomato.calculateTaxPrice();
        System.out.println("Tomato " + tomato.getName());
        System.out.println("Price U$" + tomato.getPrice());
        System.out.println("Tax Value U$" + taxValue);
    }
}
