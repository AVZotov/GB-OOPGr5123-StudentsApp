package ru.gb.StudentsApp;

import ru.gb.StudentsApp.Domen.Student;
import ru.gb.StudentsApp.Domen.StudentGenerator;
import ru.gb.StudentsApp.Domen.StudentGroup;
import ru.gb.StudentsApp.Domen.StudentStream;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        StudentGenerator studentGenerator = new StudentGenerator();

        StudentStream studentStream1 = studentGenerator.GetStudentStream();
        StudentStream studentStream2 = studentGenerator.GetStudentStream();

        System.out.println("Task#1");
        for (StudentGroup students : studentStream1) {
            System.out.println("*".repeat(50));
            for (Student student : students) {
                System.out.println(student);
            }
        }

        System.out.println("Task#2 - unsorted");
        for (StudentGroup students : studentStream2) {
            System.out.println("*".repeat(50));
            for (Student student : students) {
                System.out.println(student);
            }

        }
    }
}
