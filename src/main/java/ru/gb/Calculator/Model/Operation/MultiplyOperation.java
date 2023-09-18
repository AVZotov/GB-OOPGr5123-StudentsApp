package ru.gb.Calculator.Model.Operation;

public class MultiplyOperation implements IOperation {

    @Override
    public double Calculate(double valueA, double valueB) {
        return valueA * valueB;
    }
}
