package ru.gb.MVCStudentApp.Controller;

import ru.gb.MVCStudentApp.Controller.Interface.IGetModel;
import ru.gb.MVCStudentApp.Controller.Interface.IGetView;
import ru.gb.MVCStudentApp.Model.Core.Student;
import ru.gb.MVCStudentApp.Model.StudentRepositoryListModel;
import ru.gb.MVCStudentApp.View.ConsoleIO;
import ru.gb.MVCStudentApp.View.ConsoleIORus;

import java.util.*;

/**
 * Main class to interact with user and storing all the repositories and viewModel
 */
public class Controller {
    private final IGetModel studentRepository1;
    private final IGetModel studentRepository2;
    private IGetView consoleIO;

    public Controller(IGetModel studentRepository1, IGetModel studentRepository2) {
        this.studentRepository1 = studentRepository1;
        this.studentRepository2 = studentRepository2;
        GetLanguageSelection();
    }

    /**
     * Main method to run the program and console based interface to interact with user
     */
    public void Run(){
        boolean isRun = true;

        while (isRun){
            consoleIO.PrintCommands();
            Command userInput = Command.valueOf(consoleIO.GetUserSelection().toUpperCase());

            switch (userInput) {
                case EXIT -> {
                    isRun = false;
                    System.out.println("Exiting");
                }
                case LIST -> consoleIO.PrintAll(studentRepository1.GetStudents());
                case DELETE -> consoleIO.PrintDeleteResult(DeleteStudent());
                default -> System.out.println("Wrong command! pls try again");
            }
        }
    }

    /**
     * Method to get user preferred language and instantiate needed language based class
     */
    private void GetLanguageSelection(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 for Russian or other key for English language: ");
        String userSelection = scanner.nextLine();
        consoleIO = (Objects.equals(userSelection, "1")) ? new ConsoleIORus() : new ConsoleIO();
    }

    /**
     * Method to search and delete student from main repository. If operation was unsuccessful
     * searching will be passed to second repository
     * returning true if student removed from main or second repository.
     * @return boolean
     */
    private boolean DeleteStudent(){
        int userDefinedId = consoleIO.GetStudentIdFromUser();
        boolean deleteResult1 = studentRepository1.Delete(userDefinedId);
        boolean deleteResult2 = false;
        if (!deleteResult1){
            deleteResult2 = studentRepository2.Delete(userDefinedId);
        }
        return (deleteResult1 || deleteResult2);
    }
}

