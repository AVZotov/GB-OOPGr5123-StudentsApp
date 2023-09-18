package ru.gb.Calculator.Controller;

import ru.gb.Calculator.Model.Generator.CalculationsGeneratorBase;
import ru.gb.Calculator.Model.Operation.IOperation;
import ru.gb.Calculator.Services.ILogger;
import ru.gb.Calculator.View.IVewIO;

import java.util.List;

/**
 * Controller class based on Design pattern which include all the needed classes for joint work
 */
public class Calculator {
    private IOperation operation;
    private final IVewIO userInterface;
    private final ILogger logger;

    /**
     * This list of calculationGenerators allow to add different generators which will be searched during work to determine which operation instance to select
     */
    private final List<CalculationsGeneratorBase> calculationsGenerators;

    public Calculator(IVewIO userInterface, ILogger logger, List<CalculationsGeneratorBase> calculationsGenerators) {
        this.userInterface = userInterface;
        this.logger = logger;
        this.calculationsGenerators = calculationsGenerators;
    }

    /**
     * Main public method to be used outside.
     */
    public void Run() {
        boolean isRunning = true;

        while (isRunning) {
            userInterface.Print("Start working\n");
            userInterface.Print("Enter first value: ");
            double valueA = userInterface.GetValue();
            userInterface.Print("Enter operator: ");
            char operator = userInterface.GetOperator();

            if (GetOperationInstance(operator)) {
                userInterface.Print("Enter second value: ");
                double valueB = userInterface.GetValue();
                double result = operation.Calculate(valueA, valueB);
                String message = String.format("%f %s %f = %f\n", valueA, operator, valueB, result);
                logger.AddLog(message);
                userInterface.Print(message);
            }
            else {
                String message = "Error! No such operator found!\n";
                logger.AddLog(message);
                userInterface.Print(message);
            }

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
        for (CalculationsGeneratorBase generator : calculationsGenerators) {
            if (generator.GetInstance(operator) != null) {
                operation = generator.GetInstance(operator);
                return true;
            }
        }
        return false;
    }
}
