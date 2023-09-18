package ru.gb.Calculator.Model.Generator;

import ru.gb.Calculator.Model.Operation.IOperation;

import java.util.List;

/**
 * abstract class for all further generators which will be created to expand calculator App functionality
 */
public abstract class CalculationsGeneratorBase {

    /**
     * Method to return instance of mathematical operation
     * @param operator passed parameter
     * @return instance of operation
     */
    public abstract IOperation GetInstance(char operator);

    /**
     * support method to check if passed from user operator is valid for provided generators
     * @param operator user defined operator
     * @return true if provided operator is valid for generator
     */
    protected abstract boolean ContainsOperator(char operator);
}
