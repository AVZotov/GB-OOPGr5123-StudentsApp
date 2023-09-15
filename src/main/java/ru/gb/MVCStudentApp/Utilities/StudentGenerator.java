package ru.gb.MVCStudentApp.Utilities;

import ru.gb.MVCStudentApp.Model.Core.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Simple support class to generate Students, Student Groups and Student Streams
 */
public class StudentGenerator {
    private final Random random;

    public StudentGenerator() {
        this.random = new Random();
    }

    /**
     * Method to get randomly created Student
     * @return Student
     */
    public Student GetStudent() {
        return new Student(GetName(), random.nextInt(18, 31));
    }


    /**
     * Support method to create List of students
     * @return List of Students
     */
    public List<Student> GetStudentList(){
        List<Student> students = new ArrayList<>();
        int groupLength = random.nextInt(5,16);

        for (int i = 0; i <= groupLength; i++) {
            students.add(GetStudent());
        }

        return students;
    }

    /**
     * Method to get randomly selected name from the Enum
     * @return string Name
     */
    private String GetName() {
        Names[] names = Names.values();
        return names[random.nextInt(names.length)].toString();
    }

    /**
     * List of names
     */
    private enum Names {
        Darya, Anna, Arseniy, Nazar, Zlata, Sofiya, Daniil, Nika, Marat, Viktoriya, Semen, Matvei, Eva, Elena,
        Mikhail, Dmitry, Uliana, Mark, Roman, Veronika, Maxim, Zakhar, Nikolay, Timofei, Alexey, Kseniya, Artem,
        Alexander, Olga, Mariya, Yuliya, Alisa
    }
}
