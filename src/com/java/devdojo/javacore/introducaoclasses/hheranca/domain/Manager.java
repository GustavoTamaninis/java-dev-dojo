package com.java.devdojo.javacore.introducaoclasses.hheranca.domain;

public class Manager extends Employee{
    private String department;

    @Override //it's explicites a override
    public void print(){
        super.print(); // it calls the method print from the superclass.
        System.out.println(department + " department");
    }

    public String getDepartmentNumber() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
