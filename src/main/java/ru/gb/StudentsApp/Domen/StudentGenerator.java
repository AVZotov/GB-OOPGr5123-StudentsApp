package ru.gb.StudentsApp.Domen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentGenerator {
    private final Random random;

    public StudentGenerator() {
        this.random = new Random();
    }

    private Student GetStudent() {
        return new Student(GetName(), random.nextInt(18, 31));
    }

    public StudentGroup GetStudentGroup(){
        return new StudentGroup(GetStudentList(), random.nextInt(1, 101));
    }

    public StudentStream GetStudentStream(){
        return new StudentStream(GetStudentGroupList(), random.nextInt(1, 50));
    }

    private List<StudentGroup> GetStudentGroupList(){
        List<StudentGroup> studentGroups = new ArrayList<>();
        int groupsAmount = random.nextInt(2, 5);

        for (int i = 0; i < groupsAmount; i++) {
            studentGroups.add(GetStudentGroup());
        }

        return studentGroups;
    }

    private List<Student> GetStudentList(){
        List<Student> students = new ArrayList<>();
        int groupLength = random.nextInt(5,16);

        for (int i = 0; i <= groupLength; i++) {
            students.add(GetStudent());
        }

        return students;
    }

    private String GetName() {
        Names[] names = Names.values();
        return names[random.nextInt(names.length)].toString();
    }

    private enum Names {
        Darya, Anna, Arseniy, Nazar, Zlata, Sofiya, Daniil, Nika, Marat, Viktoriya, Semen, Matvei, Eva, Elena,
        Mikhail, Dmitry, Uliana, Mark, Roman, Veronika, Maxim, Zakhar, Nikolay, Timofei, Alexey, Kseniya, Artem,
        Alexander, Olga, Mariya, Yuliya, Alisa
    }
}
