package com.bushra.assignment;  // Assuming AssignmentMain.java is directly in the com.bushra.assignment package

import employees.Developer;
import employees.Manager;
import utilities.EmployeeUtilities;

public class AssignmentMain {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("Alice");
        manager.setEmployeeId(1001);
        manager.setSalary(90000);
        manager.setDepartment("HR");

        Developer developer = new Developer();
        developer.setName("Bob");
        developer.setEmployeeId(1002);
        developer.setSalary(80000);
        developer.setProgrammingLanguage("Java");

        EmployeeUtilities.printEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartment());

        EmployeeUtilities.printEmployeeDetails(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }
}
