package com.java.devdojo.javacore.introducaoclasses.hheranca.domain;

public class Manager extends Employee{
    private String department;

    @Override //it's explicites a override
    public void print(){
        super.print(); // it calls the method print from the superclass.
        System.out.println(department + " department");
        paymentReport();
    }

    public void paymentReport(){
        System.out.println("The employee " + this.name + " from the " + this.department + " department "+
                " receive a salary of U$" + this.salary);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

// Herança Múltipla NÃO existe no Java: uma classe não pode extender mais de uma classe.