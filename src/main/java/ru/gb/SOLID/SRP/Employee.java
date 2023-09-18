package ru.gb.SOLID.SRP;

import java.util.Date;

/**
 * Entity class designed with Single responsibility principle
 */
public class Employee {
    private final String name;
    private final Date dob;
    private final double baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    /**
     * Method to get short information about employee
     * @return String
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}
