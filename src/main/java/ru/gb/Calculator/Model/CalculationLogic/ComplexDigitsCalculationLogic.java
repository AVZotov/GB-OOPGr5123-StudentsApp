package ru.gb.Calculator.Model.CalculationLogic;

import ru.gb.Calculator.Model.Operation.ComplexDigitsOperations.AddComplexOperation;
import ru.gb.Calculator.Model.Operation.ComplexDigitsOperations.DivideComplexOperation;
import ru.gb.Calculator.Model.Operation.ComplexDigitsOperations.MultiplyComplexOperation;
import ru.gb.Calculator.Model.Operation.ComplexDigitsOperations.SubstrateComplexOperation;
import ru.gb.Calculator.Model.Operation.Interface.IOperation;

import java.util.Arrays;
import java.util.List;

/**
 * Class factory to provide operational classes to work with complex digits
 */
public class ComplexDigitsCalculationLogic extends CalculationsLogicBase {

    private final List<Character> operators = Arrays.asList('+', '-', '*', '/');

    @Override
    public IOperation GetInstance(char operator) {
        if (operators.contains(operator)){
            switch (operator) {
                case '+' -> {
                    return new AddComplexOperation();
                }
                case '-' -> {
                    return new SubstrateComplexOperation();
                }
                case '*' -> {
                    return new MultiplyComplexOperation();
                }
                case '/' -> {
                    return new DivideComplexOperation();
                }
            }
        }
        return null;
    }

    @Override
    public String GetLogicDescription() {
        return "complex";
    }
}
