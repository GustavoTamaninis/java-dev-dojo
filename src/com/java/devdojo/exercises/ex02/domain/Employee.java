package com.java.devdojo.exercises.ex02.domain;

public abstract class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, double baseSalary) throws InvalidValueException {
        if(baseSalary <= 0) throw new InvalidValueException("Error! Base salary must be greater than 0");
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary <= 0) throw new InvalidValueException("Error! Base salary must be greater than 0");
        this.baseSalary = baseSalary;
    }
}
