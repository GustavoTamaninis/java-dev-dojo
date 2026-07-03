package com.java.devdojo.javacore.introducaoclasses.hheranca.test;

import com.java.devdojo.javacore.introducaoclasses.hheranca.domain.Address;
import com.java.devdojo.javacore.introducaoclasses.hheranca.domain.Employee;
import com.java.devdojo.javacore.introducaoclasses.hheranca.domain.Manager;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Tenente Ervino Miller");
        address.setZipcode("89.221.214");

        Employee employee = new Employee();
        employee.setName("John Theodore");
        employee.setSocialSecurityNumber("120-12-6770");
        employee.setSalary(5232.55);
        employee.setAddress(address);

        employee.print();
        System.out.println("=====================");

        Manager manager = new Manager();
        manager.setName("Mark Smith");
        manager.setSocialSecurityNumber("070-53-9590");
        manager.setSalary(12206.73);
        manager.setAddress(address);
        manager.setDepartment("Marketing");
        manager.print();
    }
}
