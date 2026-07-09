package com.java.devdojo.javacore.javacore.npolimorphism.test;

import com.java.devdojo.javacore.javacore.npolimorphism.domain.Product;
import com.java.devdojo.javacore.javacore.npolimorphism.domain.Computer;
import com.java.devdojo.javacore.javacore.npolimorphism.domain.Tomato;
import com.java.devdojo.javacore.javacore.npolimorphism.service.ProductTaxReportService;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 1000);

        Tomato tomato = new Tomato("Dutch", 6);
        tomato.setBestConsumedBefore("09/07/2026");

        ProductTaxReportService.generateTaxReport(tomato);
        System.out.println("------------------------");

        ProductTaxReportService.generateTaxReport(product);
    }
}
