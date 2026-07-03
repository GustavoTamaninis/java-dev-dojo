package com.java.devdojo.javacore.introducaoclasses.hheranca.domain;

public class Manager extends Employee{
    private String department;

    public String getDepartmentNumber() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
