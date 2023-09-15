package ru.gb.MVCStudentApp.Controller.Interface;

import ru.gb.MVCStudentApp.Model.Core.Student;

import java.util.List;

/**
 * Interface for models which print information on console
 */
public interface IGetView {

    /**
     * Method to print student list
     * @param students getting list of students which will be printed on console
     */
    void PrintAll(List<Student> students);

    /**
     * Requesting user to input the Command to proceed
     * @return user entered command
     */
    String GetUserSelection();

    /**
     * Requesting user to enter student ID
     * @return Integer
     */
    Integer GetStudentIdFromUser();

    /**
     * Printing delete operation status
     * @param deleteResult passed parameter to define if student been deleted or not
     */
    void PrintDeleteResult(boolean deleteResult);

    /**
     * helper method to print available to user commands
     */
    void PrintCommands();
}
