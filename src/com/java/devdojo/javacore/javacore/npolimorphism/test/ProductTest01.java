package com.java.devdojo.javacore.javacore.npolimorphism.test;

import com.java.devdojo.javacore.javacore.npolimorphism.domain.Computer;
import com.java.devdojo.javacore.javacore.npolimorphism.domain.Product;
import com.java.devdojo.javacore.javacore.npolimorphism.domain.Television;
import com.java.devdojo.javacore.javacore.npolimorphism.domain.Tomato;
import com.java.devdojo.javacore.javacore.npolimorphism.service.ProductTaxReportService;

public class ProductTest01 {
    static void main(String[] args) {
        Computer computer = new Computer("NUC10i7", 2400);
        Tomato tomato = new Tomato("Italian", 5);
        Television television = new Television("Samsung 50\"", 3000);

        System.out.println("------------------------");
        ProductTaxReportService.generateTaxReport(computer);
        System.out.println("------------------------");
        ProductTaxReportService.generateTaxReport(tomato);
        System.out.println("------------------------");
        ProductTaxReportService.generateTaxReport(television);
    }
}
