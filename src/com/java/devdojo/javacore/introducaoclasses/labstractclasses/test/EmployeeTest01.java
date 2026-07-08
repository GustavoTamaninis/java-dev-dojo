package com.java.devdojo.javacore.introducaoclasses.labstractclasses.test;

import com.java.devdojo.javacore.introducaoclasses.labstractclasses.domain.Developer;
import com.java.devdojo.javacore.introducaoclasses.labstractclasses.domain.Employee;
import com.java.devdojo.javacore.introducaoclasses.labstractclasses.domain.Manager;

// An abstract class was created to be inherited, extended. It cannot have the "final" modifier.
public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("João", 4900);
        System.out.println(manager);

        Developer developer = new Developer("Gustavo", 2700);
        System.out.println(developer);
    }
}
