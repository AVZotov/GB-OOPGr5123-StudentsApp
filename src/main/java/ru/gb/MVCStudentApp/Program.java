package ru.gb.MVCStudentApp;

import ru.gb.MVCStudentApp.Controller.Controller;
import ru.gb.MVCStudentApp.Model.Core.Student;
import ru.gb.MVCStudentApp.Model.StudentRepositoryFileModel;
import ru.gb.MVCStudentApp.Utilities.StudentGenerator;
import ru.gb.MVCStudentApp.View.ConsoleIO;
import ru.gb.MVCStudentApp.View.ConsoleIORus;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        StudentGenerator studentGenerator = new StudentGenerator();
        List<Student> students = studentGenerator.GetStudentList();

        Controller controller = new Controller(new StudentRepositoryFileModel("StudentsDB.txt"), new ConsoleIO(), new ConsoleIORus());
        controller.Run();
    }
}
