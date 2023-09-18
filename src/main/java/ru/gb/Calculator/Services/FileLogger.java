package ru.gb.Calculator.Services;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Class to store log messages in file log.txt
 */
public class FileLogger implements ILogger{
    @Override
    public void AddLog(String message) {
        try{
            FileWriter writer = new FileWriter("log.txt", true);
            writer.write(message);
            writer.close();
        }
        catch (IOException ioException){
            System.err.println(ioException.getMessage());
        }

    }
}
