package ru.gb.MVCStudentApp;

import ru.gb.MVCStudentApp.Controller.Controller;
import ru.gb.MVCStudentApp.Model.Core.Student;
import ru.gb.MVCStudentApp.Model.StudentRepositoryHashModel;
import ru.gb.MVCStudentApp.Model.StudentRepositoryListModel;
import ru.gb.MVCStudentApp.Utilities.StudentGenerator;

import java.util.List;

/**
 * Theme 05. MVC & MVP
 */
public class Program {
    public static void main(String[] args) {
        StudentGenerator studentGenerator = new StudentGenerator();
        List<Student> students1 = studentGenerator.GetStudentList();
        List<Student> students2 = studentGenerator.GetStudentList();


        Controller controller = new Controller(new StudentRepositoryListModel(students1),
                new StudentRepositoryHashModel(students2));
        controller.Run();
    }
}
