package com.java.devdojo.javacore.javacore.npolimorphism.test;

import com.java.devdojo.javacore.javacore.npolimorphism.domain.Computer;
import com.java.devdojo.javacore.javacore.npolimorphism.domain.Tomato;
import com.java.devdojo.javacore.javacore.npolimorphism.service.ProductTaxReportService;

public class ProductTest01 {
    static void main(String[] args) {
        Computer computer = new Computer("NUC10i7", 2400);
        Tomato tomato = new Tomato("Italian", 5);

        System.out.println("------------------------");
        ProductTaxReportService.generateComputerTaxReport(computer);
        System.out.println("------------------------");
        ProductTaxReportService.generateTomatoTaxReport(tomato);

    }
}
