package com.java.devdojo.exercises.ex02.domain;

public class Developer extends Employee{
    private int completedProjects = 0;

    public Developer(String name){ super(name); }

    public Developer(String name, double baseSalary) throws InvalidValueException {
        if(baseSalary <= 0) throw new InvalidValueException("Error! Base salary must be greater than 0");
        super(name, baseSalary);
    }

    public Developer(String name, double baseSalary, int completedProjects) {
        if(baseSalary <= 0) throw new InvalidValueException("Error! Base salary must be greater than 0");
        if(completedProjects < 0) throw new InvalidValueException("Error! Completed projects must be equal or greater than 0");
        super(name, baseSalary);
        this.completedProjects = completedProjects;
    }

    @Override
    public double calculateSalary() {
        return this.getBaseSalary() + completedProjects * 500;
    }

    public int getCompletedProjects() {
        return completedProjects;
    }

    public void setCompletedProjects(int completedProjects) {
        if(completedProjects < 0) throw new InvalidValueException("Error! Completed projects must be equal or greater than 0");
        this.completedProjects = completedProjects;
    }
}
