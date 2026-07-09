package com.java.devdojo.javacore.javacore.kenumeration.test;

import com.java.devdojo.javacore.javacore.kenumeration.domain.Customer;
import com.java.devdojo.javacore.javacore.kenumeration.domain.CustomerType;
import com.java.devdojo.javacore.javacore.kenumeration.domain.PaymentType; //ctrl + .

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Gustavo", CustomerType.INDIVIDUAL, PaymentType.DEBIT);
        Customer customer2 = new Customer("Gus & Gas S.A", CustomerType.COMPANY, PaymentType.DEBIT);
        Customer customer3 = new Customer("Gu Technology", CustomerType.STARTUP, PaymentType.CREDIT);
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);

        System.out.println(PaymentType.DEBIT.calculateDiscount(100));
        System.out.println(PaymentType.CREDIT.calculateDiscount(100));

        CustomerType customerType = CustomerType.getByReportValue("InDivIDuaL");
        System.out.println(customerType.getReportValue());
    }
}
