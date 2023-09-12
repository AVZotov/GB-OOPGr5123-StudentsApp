package ru.gb.MVCStudentApp.View;

import ru.gb.MVCStudentApp.Controller.Interface.IGetView;
import ru.gb.MVCStudentApp.Model.Core.Student;

import java.util.List;
import java.util.Scanner;

public class ConsoleIORus implements IGetView {

    @Override
    public void PrintAll(List<Student> students) {
        for (Student student : students) {
            System.out.println(String.format("Студент: [%s, возраст: %d, номер: %d]", student.getName(), student.getAge(), student.getStudentId()));
        }
    }

    @Override
    public String GetUserSelection(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
