package ru.gb.Calculator.Model.Operation.Interface;

/**
 * Interface which contract all implementing classes to behave as stated in Interface
 * All parental classes realizing logic to work with digits and each of them realize simple operation stated and described in exact Operational class
 */
public interface IOperation {
    String Calculate(String valueA, String valueB);
}
