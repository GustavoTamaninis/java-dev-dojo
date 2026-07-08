package com.java.devdojo.javacore.introducaoclasses.labstractclasses.domain;

public abstract class Employee {
    // There are another term for classes that are not abstract. It's called concrete classes.
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
