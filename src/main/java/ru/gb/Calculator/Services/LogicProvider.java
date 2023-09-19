package ru.gb.Calculator.Services;

import ru.gb.Calculator.Model.CalculationLogic.CalculationsLogicBase;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Service class which supply core with logic functionality based on user Input
 */
public class LogicProvider {
    private final List<CalculationsLogicBase> mathLogics;

    public LogicProvider(List<CalculationsLogicBase> mathLogics) {
        this.mathLogics = mathLogics;
    }

    public List<CalculationsLogicBase> GetLogic(String userInput){
        List<CalculationsLogicBase> selectedLogics = new ArrayList<>();

        if (IsNaturalDigit(userInput)) {
            for (CalculationsLogicBase mathLogic : mathLogics) {
                if (mathLogic.GetLogicDescription().equals("natural")){
                    selectedLogics.add(mathLogic);
                }
            }
            return selectedLogics;
        }
        if (IsComplexDigit(userInput)){
            for (CalculationsLogicBase mathLogic : mathLogics) {
                if (mathLogic.GetLogicDescription().equals("complex")){
                    selectedLogics.add(mathLogic);
                }
            }
            return selectedLogics;
        }
        return null;
    }

    public boolean IsNaturalDigit(String userInput){
        String naturalDigits = "^-?\\d+\\.?\\d*$";
        return Pattern.matches(naturalDigits, userInput);
    }

    public boolean IsComplexDigit(String userInput){
        String complexDigits = "^-?\\d+[+-]\\d*i$";
        return Pattern.matches(complexDigits, userInput);
    }
}
