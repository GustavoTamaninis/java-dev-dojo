package com.java.devdojo.javacore.introducaoclasses.hheranca.domain;

// Note that I am highly coupling the code, because one change here broke all the subclasses.

public class Employee { // technically, all classes in Java will extend somehow Object
    // Subclasses e classes no mesmo pacote herdam atributos "protected". Confira a classe Adress neste pacote.
    protected String name;
    protected String socialSecurityNumber;
    protected Address address;
    protected double salary;
    static{
        System.out.println("Inside Employee static init block");
    }
    {
        System.out.println("Inside Employee init block 1");
    }
    {
        System.out.println("Inside Employee init block 2");
    }

    public Employee(String name){
        System.out.println("Inside Employee constructor");
        this.name = name;
    }

    public Employee(String name, String socialSecurityNumber) {
        this(name); // remember that this calls the constructor above.
        this.socialSecurityNumber = socialSecurityNumber;
    }

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
