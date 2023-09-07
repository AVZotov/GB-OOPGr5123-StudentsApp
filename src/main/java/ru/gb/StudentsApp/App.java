package ru.gb.StudentsApp;

import ru.gb.StudentsApp.Domen.Student;
import ru.gb.StudentsApp.Domen.StudentGenerator;
import ru.gb.StudentsApp.Domen.StudentGroup;
import ru.gb.StudentsApp.Domen.StudentStream;

import java.util.Arrays;
import java.util.Collections;

/**
 * Seminar 003 - Base interfaces realization on the basis of IIterable & IComparable
 * Proposed solution for Homework tasks 1 - 5
 *
 * @author Alexey Zotov
 * @author  Group 5123
 */
public class App {
    public static void main(String[] args) {

        StudentGenerator studentGenerator = new StudentGenerator();

        StudentStream studentStream1 = studentGenerator.GetStudentStream();
        StudentStream studentStream2 = studentGenerator.GetStudentStream();
        StudentStream studentStream3 = studentGenerator.GetStudentStream();

        System.out.println("Task#1");
        for (StudentGroup students : studentStream1) {
            System.out.println("*".repeat(50));
            for (Student student : students) {
                System.out.println(student);
            }
        }

        System.out.println("\n\nTask#2 - unsorted");

        for (StudentGroup students : studentStream2) {
            System.out.println("*".repeat(50));
            for (Student student : students) {
                System.out.println(student);
            }
        }
        System.out.println("\n\nTask#2 - sorted");
        Collections.sort(studentStream2.getStudentGroups());
        for (StudentGroup students : studentStream2) {
            System.out.println("*".repeat(50));
            for (Student student : students) {
                System.out.println(student);
            }
        }
        //Task #3 comparator re-written in student group class

        System.out.println("\n\nTask#4 - ToString method re-written in class StudentGroup");
        StudentGroup sg = studentGenerator.GetStudentGroup();
        System.out.println(sg.toString());

        System.out.println("\n\nTask#5 - ToString method re-written in class StudentStream");
        System.out.println(studentStream3.toString());
    }
}
