package ru.gb.Calculator.Model.Operation;

/**
 * Interface which need to be implemented to all operations by default
 */
public interface IOperation {

    /**
     * Method to calculate mathematical result of two values with defined by user operator
     * @param valueA double
     * @param valueB double
     * @return double
     */
    double Calculate(double valueA, double valueB);
}
