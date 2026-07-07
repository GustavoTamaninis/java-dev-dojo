package com.java.devdojo.javacore.introducaoclasses.kenumeration.test;

import com.java.devdojo.javacore.introducaoclasses.kenumeration.domain.Customer;
import com.java.devdojo.javacore.introducaoclasses.kenumeration.domain.CustomerType;

public class CustomerTest01 {
    public static void main(String[] args) {
//        Customer customer1 = new Customer("Gustavo", "individual");
//        Customer customer2 = new Customer("G e S", "company");
//        Customer customer3 = new Customer("Henrique", "INDIVIDUAL");
//        Customer customer4 = new Customer("Henrique", "COMPANY");
//        System.out.println(customer1); // it creates a null object
//        System.out.println(customer2);
//        System.out.println(customer3); // it creates a normal object
//        System.out.println(customer4);

        Customer customer1 = new Customer("Gustavo", CustomerType.INDIVIDUAL);
        Customer customer2 = new Customer("Gustavo", CustomerType.COMPANY);
        Customer customer3 = new Customer("Gustavo", CustomerType.INDIVIDUAL);
        Customer customer4 = new Customer("Gustavo", CustomerType.COMPANY);
        Customer customer5 = new Customer("Gustavo", CustomerType.STARTUP);

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
        System.out.println(customer4);
        System.out.println(customer5);
    }
}
