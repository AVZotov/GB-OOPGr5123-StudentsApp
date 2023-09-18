package ru.gb.Calculator.View;

import java.util.Scanner;

public class ConsoleIO implements IVewIO{

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void Print(String message) {
        System.out.print(message);
    }

    @Override
    public boolean IsExit() {
        return scanner.nextLine().equals("Y".toLowerCase());
    }

    @Override
    public double GetValue() {
        return Double.parseDouble(scanner.nextLine());
    }

    @Override
    public char GetOperator() {
        return scanner.nextLine().charAt(0);
    }
}
