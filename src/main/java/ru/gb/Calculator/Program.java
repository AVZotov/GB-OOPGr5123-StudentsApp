package ru.gb.Calculator;

import ru.gb.Calculator.Controller.Calculator;
import ru.gb.Calculator.Model.Generator.CalculationsGeneratorBase;
import ru.gb.Calculator.Model.Generator.SimpleCalculations;
import ru.gb.Calculator.Services.FileLogger;
import ru.gb.Calculator.View.ConsoleIO;

import java.util.ArrayList;
import java.util.List;

/**
 * Seminar 006. MVC structure of calculator application with SOLID principles
 * @author Alexey Zotov
 */
public class Program {
    public static void main(String[] args) {
        List<CalculationsGeneratorBase> calculationGenerators = new ArrayList<>();
        calculationGenerators.add(new SimpleCalculations());

        Calculator calculator = new Calculator(new ConsoleIO(), new FileLogger(), calculationGenerators);
        calculator.Run();
    }
}
