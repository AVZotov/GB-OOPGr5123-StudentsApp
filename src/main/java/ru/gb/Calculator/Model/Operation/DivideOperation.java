package ru.gb.Calculator.Model.Operation;

public class DivideOperation implements IOperation {

    @Override
    public double Calculate(double valueA, double valueB) {
        if (valueB != 0){
            return valueA / valueB;
        }
        return 0;
    }
}
