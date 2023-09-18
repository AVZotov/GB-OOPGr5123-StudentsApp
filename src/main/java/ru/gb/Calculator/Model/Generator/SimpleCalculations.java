package ru.gb.Calculator.Model.Generator;

import ru.gb.Calculator.Model.Operation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Class generator with basic mathematical operations
 */
public class SimpleCalculations extends CalculationsGeneratorBase {

    private final List<Character> operators = Arrays.asList('+', '-', '*', '/');

    @Override
    public IOperation GetInstance(char operator) {
        if (ContainsOperator(operator)){
            switch (operator) {
                case '+' -> {
                    return new AddOperation();
                }
                case '-' -> {
                    return new SubstrateOperation();
                }
                case '*' -> {
                    return new MultiplyOperation();
                }
                case '/' -> {
                    return new DivideOperation();
                }
            }
        }
        return null;
    }

    @Override
    protected boolean ContainsOperator(char operator) {
        return operators.contains(operator);
    }
}
