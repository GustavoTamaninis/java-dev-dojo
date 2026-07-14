package com.java.devdojo.exercises.ex02.domain;


public class PayrollCalculator {
    private Employee[] employees;

    public PayrollCalculator(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void calculateSalary(){
        double totalExpenditure = 0;
        for(Employee employee : employees){
            totalExpenditure += employee.calculateSalary();
            System.out.println(employee.getName() + " receives a total salary of $" + employee.calculateSalary());
        }
        System.out.println("The total expenditure was $" + totalExpenditure);
    }
}
