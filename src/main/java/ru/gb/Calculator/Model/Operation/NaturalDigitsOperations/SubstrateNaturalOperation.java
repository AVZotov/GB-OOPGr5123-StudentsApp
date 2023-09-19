package ru.gb.Calculator.Model.Operation.NaturalDigitsOperations;

import ru.gb.Calculator.Model.Operation.Interface.IOperation;

public class SubstrateNaturalOperation implements IOperation {

    @Override
    public String Calculate(String valueA, String valueB) {
        double a = Double.parseDouble(valueA) - Double.parseDouble(valueB);
        return String.valueOf(a);
    }
}
