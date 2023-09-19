package ru.gb.Calculator.Model.CalculationLogic;

import ru.gb.Calculator.Model.Operation.Interface.IOperation;
import ru.gb.Calculator.Model.Operation.NaturalDigitsOperations.AddNaturalOperation;
import ru.gb.Calculator.Model.Operation.NaturalDigitsOperations.DivideNaturalOperation;
import ru.gb.Calculator.Model.Operation.NaturalDigitsOperations.MultiplyNaturalOperation;
import ru.gb.Calculator.Model.Operation.NaturalDigitsOperations.SubstrateNaturalOperation;

import java.util.Arrays;
import java.util.List;

/**
 * Class generator with basic mathematical operations
 */
public class NaturalDigitsCalculationLogic extends CalculationsLogicBase {

    private final List<Character> operators = Arrays.asList('+', '-', '*', '/');

    @Override
    public String GetLogicDescription() {
        return "natural";
    }

    @Override
    public IOperation GetInstance(char operator) {
        if (operators.contains(operator)){
            switch (operator) {
                case '+' -> {
                    return new AddNaturalOperation();
                }
                case '-' -> {
                    return new SubstrateNaturalOperation();
                }
                case '*' -> {
                    return new MultiplyNaturalOperation();
                }
                case '/' -> {
                    return new DivideNaturalOperation();
                }
            }
        }
        return null;
    }
}
