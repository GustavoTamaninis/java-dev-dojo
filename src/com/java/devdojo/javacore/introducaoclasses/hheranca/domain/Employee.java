package com.java.devdojo.javacore.introducaoclasses.hheranca.domain;

public class Employee {
    private String name;
    private String socialSecurityNumber;
    private Address address;
    private double salary;

    public void print(){
        System.out.println(this.name);
        System.out.println(this.socialSecurityNumber);
        System.out.println(this.address.getStreet() + " " + this.address.getZipcode());
        System.out.println("U$" + this.salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
