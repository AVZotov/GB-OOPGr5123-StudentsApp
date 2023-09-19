package ru.gb.Calculator.Model.CalculationLogic;

import ru.gb.Calculator.Model.Operation.Interface.IOperation;

/**
 * abstract class for all further generators which will be created to expand calculator App functionality
 * this class mainly a factory to provide all the requested operation to requesting entity
 */
public abstract class CalculationsLogicBase {

    /**
     * Supporting method to get logic label. Means if it is logic to work with natural digits & complex digits
     * LogicProvider Class generate list of logics with identical labels
     * @return String
     */
    public abstract String GetLogicDescription();
    /**
     * Method to return instance of mathematical operation
     * @param operator passed parameter
     * @return instance of operation
     */
    public abstract IOperation GetInstance(char operator);
}