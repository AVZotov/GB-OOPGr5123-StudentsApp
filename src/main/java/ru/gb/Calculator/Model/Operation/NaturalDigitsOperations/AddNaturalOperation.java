package ru.gb.Calculator.Model.Operation.NaturalDigitsOperations;

import ru.gb.Calculator.Model.Operation.Interface.IOperation;

public class AddNaturalOperation implements IOperation {
    @Override
    public String Calculate(String valueA, String valueB) {
        double a = Double.parseDouble(valueA) + Double.parseDouble(valueA);
        return String.valueOf(a);
    }
}
