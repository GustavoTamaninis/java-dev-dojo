package com.java.devdojo.javacore.introducaoclasses.kenumeration.domain;

public class Customer {
    public enum PaymentType{
        DEBIT, CREDIT
    }
    private String name;
    private CustomerType customerType; //a customer has a customer type
    private PaymentType paymentType;

    public Customer(String name, CustomerType customerType, PaymentType paymentType) {
        this.name = name;
        this.customerType = customerType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerTypeDatabaseValue=" + customerType.getDbValue() +
                ", customerTypeReportValue=" + customerType.getReportValue() +
                ", paymentType=" + paymentType +
                '}';
    }

    //    public static final String INDIVIDUAL = "INDIVIDUAL";
//    public static final String COMPANY = "COMPANY";

//    public Customer(String name, String type) {
//        if(!type.equals(INDIVIDUAL) && !type.equals(COMPANY)){ // in the String type, we don't use "==" for comparing.
//            // It's possible to use "equalsIgnoreCase()"
//            return ;// to avoid creating the object
//        }
//        this.name = name;
//        this.type = type;
//    }

}
