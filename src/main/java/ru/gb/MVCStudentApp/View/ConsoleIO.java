package ru.gb.MVCStudentApp.View;

import ru.gb.MVCStudentApp.Controller.Command;
import ru.gb.MVCStudentApp.Controller.Interface.IGetView;
import ru.gb.MVCStudentApp.Model.Core.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Class to deliver user with interaction through console which implements IGetView interface
 * This ConsoleIO is english based
 */
public class ConsoleIO implements IGetView {
    public void PrintAll(List<Student> students){
        System.out.println("*".repeat(20) + " Students List " + "*".repeat(20));
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("*".repeat(50));
    }

    public String GetUserSelection(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter your selection: ");
        return scanner.nextLine();
    }

    @Override
    public Integer GetStudentIdFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        return Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void PrintDeleteResult(boolean deleteResult) {
        String deleteStatus = deleteResult ? "Student deleted" : "No such students found";
        System.out.println(deleteStatus);
    }

    public void PrintCommands(){
        System.out.println("Available commands:");
        System.out.println(Arrays.toString(Command.values()));
    }
}
