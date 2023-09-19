package ru.gb.Calculator.Controller;

import ru.gb.Calculator.Model.CalculationLogic.CalculationsLogicBase;
import ru.gb.Calculator.Model.Operation.Interface.IOperation;
import ru.gb.Calculator.Services.ILogger;
import ru.gb.Calculator.Services.LogicProvider;
import ru.gb.Calculator.View.IVewIO;

import java.util.List;

/**
 * Controller class based on Design pattern which include all the needed classes for joint work
 * Base class for main program functionality. Based on Decorator pattern principles
 */
public class Calculator {
    private IOperation operation;
    private String valueA;
    private String valueB;
    private char operator;
    private final IVewIO userInterface;
    private List<CalculationsLogicBase> calculationLogics;
    private final ILogger logger;
    private final LogicProvider logicProvider;

    public Calculator(IVewIO userInterface, ILogger logger, LogicProvider logicProvider) {
        this.userInterface = userInterface;
        this.logger = logger;
        this.logicProvider = logicProvider;
    }

    /**
     * Main public method to run calculator
     */
    public void Run() {
        boolean isRunning = true;

        while (isRunning) {
            userInterface.Print("Start working\n");
            GetFirstValue();
            if (GetLogic(valueA)){
                GetOperator();
                if (GetOperationInstance(operator)){
                    GetSecondValue();
                    String result = operation.Calculate(valueA, valueB);
                    String message = String.format("Calculation result: (%s) %s (%s) = (%s)\n",valueA, operator, valueB, result);
                    userInterface.Print(message);
                    logger.AddLog(message);
                }
                else System.out.println("Error! Operator not allowed with inputted digits");
            }
            else System.out.println("Error! Your input not a natural or complex digit");





            userInterface.Print("Press 'Y' to exit or other key to continue: ");
            isRunning = !userInterface.IsExit();
        }
    }

    /**
     * Support method to determine if passed operator is a part of provided Generators of mathematical calculations
     * @param operator passed operator
     * @return true if generators can create an instance of operation
     */
    private boolean GetOperationInstance(char operator) {
        for (CalculationsLogicBase logic : calculationLogics) {
            if (logic.GetInstance(operator) != null) {
                operation = logic.GetInstance(operator);
                return true;
            }
        }
        return false;
    }

    /**
     * Method to get userInput string
     */
    private void GetFirstValue(){
        userInterface.Print("Enter first value: ");
        valueA = userInterface.GetGetUserInput();
    }

    /**
     * Method to provide base mathematical logic factory. Logic provided basing on first input of user
     * @param userInput - String with value (natural digit or complex digit)
     * @return boolean - true if logic found
     */
    private boolean GetLogic(String userInput){
        calculationLogics = logicProvider.GetLogic(userInput);
        return calculationLogics != null;
    }

    /**
     * Method to get operator from user
     */
    private void GetOperator(){
        userInterface.Print("Enter operator: ");
        operator =  userInterface.GetOperator();
    }

    private void GetSecondValue(){
        userInterface.Print("Enter second value: ");
        valueB = userInterface.GetGetUserInput();
    }


}
