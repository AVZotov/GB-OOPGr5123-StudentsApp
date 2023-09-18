package ru.gb.SOLID.SRP;

/**
 * Class to calculate employee's salary
 */
public class SalaryCalculator {

    /**
     * Static method to calculate NetSalary
     * @param baseSalary Gross salary of employee
     * @param vat vat to be applied to gross salary
     * @return double
     */
    public static double calculateNetSalary(double baseSalary, double vat) {
        return baseSalary * vat;
    }
}
