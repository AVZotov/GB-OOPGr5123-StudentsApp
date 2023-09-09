package ru.gb.StudentsApp;

import ru.gb.StudentsApp.Controllers.AccountController;
import ru.gb.StudentsApp.Domen.Student;
import ru.gb.StudentsApp.Domen.StudentGenerator;
import ru.gb.StudentsApp.Domen.StudentGroup;
import ru.gb.StudentsApp.Domen.StudentStream;

import java.util.Arrays;
import java.util.Collections;

/**
 * Seminar 004 - Generics. Base principles and realization
 * #1. Task to add Teacher Services
 * #2. Add average age counting as static method into the Account controller
 * @author Alexey Zotov
 * @author  Group 5123
 */
public class App {
    public static void main(String[] args) {
        StudentGenerator studentGenerator = new StudentGenerator();

        StudentGroup students = studentGenerator.GetStudentGroup();

        System.out.printf("Average age of students: %d", AccountController.GetAverageAge(students.GetStudents()));
    }
}
