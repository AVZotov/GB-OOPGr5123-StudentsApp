package ru.gb.Calculator;

import ru.gb.Calculator.Controller.Calculator;
import ru.gb.Calculator.Model.CalculationLogic.CalculationsLogicBase;
import ru.gb.Calculator.Model.CalculationLogic.ComplexDigitsCalculationLogic;
import ru.gb.Calculator.Model.CalculationLogic.NaturalDigitsCalculationLogic;
import ru.gb.Calculator.Services.FileLogger;
import ru.gb.Calculator.Services.LogicProvider;
import ru.gb.Calculator.View.ConsoleIO;

import java.util.ArrayList;
import java.util.List;

/**
 * Seminar 006. MVC structure of complex digits calculator application with SOLID principles (Decorator & Factory)
 * This Calculator App using calculation logic which could be expanded by adding additional factories to work with natural
 * or complex digits
 * Work logic switched itself using based on first digit entered by user. LogicProvider service responsible to provide base logic to calculator
 * @author Alexey Zotov
 */
public class Program {
    public static void main(String[] args) {
        List<CalculationsLogicBase> calculationGenerators = new ArrayList<>();
        calculationGenerators.add(new NaturalDigitsCalculationLogic());
        calculationGenerators.add(new ComplexDigitsCalculationLogic());

        Calculator calculator = new Calculator(new ConsoleIO(), new FileLogger(), new LogicProvider(calculationGenerators));
        calculator.Run();
    }
}
