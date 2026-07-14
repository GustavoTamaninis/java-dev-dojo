package com.java.devdojo.exercises.ex02.test;

import com.java.devdojo.exercises.ex02.domain.*;

public class EmployeeRegistrationAndBonusAllocationTest {
    public static void main(String[] args){
        try{
            Manager manager = new Manager("Marco Aurélio", 5300);
            Developer dev01 = new Developer("Ronaldo Mendes", 2100, 3);
            Developer dev02 = new Developer("Luís Tavares", 2100, 0);

            System.out.println("Manager receives $" + manager.getBaseSalary() + " + $" + manager.getBonus());
            System.out.println("dev01 receives $" + dev01.getBaseSalary() + " and completed " + dev01.getCompletedProjects() + " projects.");
            System.out.println("dev02 receives $" + dev02.getBaseSalary() + " and completed " + dev02.getCompletedProjects() + " projects.");

            Employee[] employees = { manager, dev01, dev02 };

            PayrollCalculator payrollCalculator = new PayrollCalculator(employees);
            payrollCalculator.calculateSalary();
        } catch (InvalidValueException e) {
            e.printStackTrace();
        }


    }
}
