package ru.gb.MVCStudentApp.Controller;

import ru.gb.MVCStudentApp.Controller.Interface.IGetModel;
import ru.gb.MVCStudentApp.Controller.Interface.IGetView;
import ru.gb.MVCStudentApp.Model.Core.Student;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final IGetModel studentRepository;
    private final IGetView consoleIO;
    private final IGetView consoleIORus;
    private List<Student> students;

    public Controller(IGetModel studentRepository, IGetView consoleIO, IGetView consoleIORus) {
        this.studentRepository = studentRepository;
        this.consoleIO = consoleIO;
        this.consoleIORus = consoleIORus;
        students = new ArrayList<>();
    }

    public void Run(){
        boolean isRun = true;

        while (isRun){
            Command userInput = Command.valueOf(consoleIO.GetUserSelection("Please, enter your selection").toUpperCase());

            switch (userInput){
                case EXIT:
                    isRun = false;
                    System.out.println("Exiting");
                    break;
                case LIST:
                    consoleIO.PrintAll(studentRepository.GetStudents());
                    break;

            }
        }
    }

    public void Update(){
        //MVP
        students = studentRepository.GetStudents();

        if (TestData()){
            consoleIO.PrintAll(students);
        }
        else {
            System.out.println("Error! Student list is empty");
        }
        //MVC
        //consoleIO.PrintAll(studentRepository.getStudents());
    }

    private boolean TestData(){
        return !this.students.isEmpty();
    }
}
