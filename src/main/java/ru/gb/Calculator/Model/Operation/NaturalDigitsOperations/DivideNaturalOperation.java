package ru.gb.Calculator.Model.Operation.NaturalDigitsOperations;

import ru.gb.Calculator.Model.Operation.Interface.IOperation;

public class DivideNaturalOperation implements IOperation {

    @Override
    public String Calculate(String valueA, String valueB) {
        if (Double.parseDouble(valueB) != 0) {
            double a = Double.parseDouble(valueA) / Double.parseDouble(valueB);
            return String.valueOf(a);
        }
        return "Error! Dividing on zero";
    }
}
