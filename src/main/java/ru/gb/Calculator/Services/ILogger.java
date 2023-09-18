package ru.gb.Calculator.Services;

/**
 * Interface for all loggers instances used in calculator
 */
public interface ILogger {

    /**
     * Method to add log message to the storage
     * @param message String
     */
    void AddLog(String message);
}
