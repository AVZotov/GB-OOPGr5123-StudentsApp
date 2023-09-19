package ru.gb.Calculator.Model.Operation.ComplexDigitsOperations;

import ru.gb.Calculator.Model.Operation.Interface.IOperation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DivideComplexOperation implements IOperation {
    @Override
    public String Calculate(String valueA, String valueB) {
        int[] arrayA = GetValues(valueA);
        int[] arrayB = GetValues(valueB);

        double divider = Math.pow(arrayB[0], 2) + Math.pow(arrayB[1], 2);
        double resultX = (arrayA[0] * arrayB[0] + arrayA[1] * arrayB[1]) / divider;
        double resultY = (arrayB[0] * arrayA[1] - arrayA[0] * arrayB[1]) / divider;

        String operator = resultY < 0 ? "-" : "+";
        return String.format("%f %s %fi", resultX, operator, Math.abs(resultY));
    }

    private int[] GetValues(String value) {
        int[] array = new int[2];
        int index = 0;
        Matcher matcher = GetMatcher(value);
        while (matcher.find()) {
            array[index] = Integer.parseInt(matcher.group(1));
            index++;
        }
        return array;
    }

    private Matcher GetMatcher(String value) {
        String regex = "([+-]?\\d+)";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(value);
    }
}
