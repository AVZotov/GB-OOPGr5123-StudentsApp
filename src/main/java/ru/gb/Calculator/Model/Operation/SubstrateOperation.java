package ru.gb.Calculator.Model.Operation;

public class SubstrateOperation implements IOperation {

    @Override
    public double Calculate(double valueA, double valueB) {
        return valueA - valueB;
    }
}
