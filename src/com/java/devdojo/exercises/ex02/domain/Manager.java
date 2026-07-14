package com.java.devdojo.exercises.ex02.domain;

public class Manager extends Employee{
    private final double bonus = 2000;

    public Manager(String name) {
        super(name);
    }

    public Manager(String name, double baseSalary) throws InvalidValueException {
        if(baseSalary <= 0) throw new InvalidValueException("Error! Base salary must be greater than 0");
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return this.getBaseSalary() + this.bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
