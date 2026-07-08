package com.java.devdojo.javacore.introducaoclasses.labstractclasses.domain;

public abstract class Employee extends Person {
    // There are another term for classes that are not abstract. It's called concrete classes.
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.calculateBonusSalary();
    }

    public abstract void calculateBonusSalary();

    @Override
    public void print() {
        System.out.println("employee...");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
