package ru.gb.MVCStudentApp.View;

import ru.gb.MVCStudentApp.Controller.Interface.IGetView;
import ru.gb.MVCStudentApp.Model.Core.Student;

import java.util.List;
import java.util.Scanner;

public class ConsoleIO implements IGetView {
    public void PrintAll(List<Student> students){
        System.out.println("*".repeat(20) + " Students List " + "*".repeat(20));
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("*".repeat(50));
    }
    public String GetUserSelection(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
