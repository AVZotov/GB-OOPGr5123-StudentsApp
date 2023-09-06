package ru.gb.StudentsApp;

import ru.gb.StudentsApp.Domen.StudentGenerator;
import ru.gb.StudentsApp.Domen.StudentStream;

public class App {
    public static void main(String[] args) {

        StudentGenerator studentGenerator = new StudentGenerator();

        StudentStream studentStream1 = studentGenerator.GetStudentStream();
        StudentStream studentStream2 = studentGenerator.GetStudentStream();
        StudentStream studentStream3 = studentGenerator.GetStudentStream();
        StudentStream studentStream4 = studentGenerator.GetStudentStream();

    }
}
