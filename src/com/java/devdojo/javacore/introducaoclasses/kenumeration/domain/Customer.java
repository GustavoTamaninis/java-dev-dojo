package com.java.devdojo.javacore.introducaoclasses.kenumeration.domain;

public class Customer {
    private String name;
    private CustomerType customerType; //a customer has a customer type

    public Customer(String name, CustomerType customerType) {
        this.name = name;
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerType=" + customerType +
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
