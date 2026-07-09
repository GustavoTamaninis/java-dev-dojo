package com.java.devdojo.javacore.javacore.hheranca.domain;

public class Address {
    private String street;
    private String zipcode;

    public void print(){
        Employee e = new Employee("Djovanne");
        e.name = "Diego"; // exemplo de um atributo protected acessado por outra classe do mesmo pacote.
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
