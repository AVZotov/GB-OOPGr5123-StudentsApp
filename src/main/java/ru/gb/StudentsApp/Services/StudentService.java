package ru.gb.StudentsApp.Services;

import ru.gb.StudentsApp.Domen.PersonComparator;
import ru.gb.StudentsApp.Domen.Student;

import java.util.List;

/**
 * Class to realize base functionality to work with Students
 */
public class StudentService implements IPersonService<Student>{
    private final List<Student> students;

    public StudentService(List<Student> students) {
        this.students = students;
    }

    @Override
    public List<Student> GetAll() {
        return students;
    }

    @Override
    public void Create(String name, int age) {
        students.add(new Student(name, age));
    }

    @Override
    public void Create(String name, int age, String description) {
        Create(name, age);
    }

    /**
     * Comparator based on PersonComparator Class to compare Students by their names
     */
    public void SortByName(){
        PersonComparator<Student> personComparator = new PersonComparator<>();
        students.sort(personComparator);
    }
}
