package ru.gb.Calculator.View;

/**
 * Interface to realize simple interaction with user
 */
public interface IVewIO {
    /**
     * Method to print message to the user
     * @param message String
     */
    void Print(String message);

    /**
     * Interaction with user to define if user going to continue his work or not
     * @return
     */
    boolean IsExit();

    /**
     * Method to get value from user
     * @return double
     */
    double GetValue();

    /**
     * Method to get operator from user
     * @return char
     */
    char GetOperator();
}
