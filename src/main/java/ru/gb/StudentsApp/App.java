package ru.gb.StudentsApp;

import ru.gb.StudentsApp.Domen.Student;
import ru.gb.StudentsApp.Domen.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", 22));
        students.add(new Student("Alex", 24));
        students.add(new Student("Alex", 18));
        students.add(new Student("Olga", 20));
        students.add(new Student("Elena", 26));
        students.add(new Student("Sergey", 21));

        StudentRepository repository1 = new StudentRepository(students, 5123);
    }
}
