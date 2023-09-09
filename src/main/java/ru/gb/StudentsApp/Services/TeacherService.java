package ru.gb.StudentsApp.Services;

import ru.gb.StudentsApp.Domen.PersonComparator;
import ru.gb.StudentsApp.Domen.Teacher;

import java.util.List;

/**
 * Service class to realize base work functionality for Teacher
 */
public class TeacherService implements IPersonService<Teacher>{

    private List<Teacher> teachers;

    @Override
    public List<Teacher> GetAll() {
        return teachers;
    }

    @Override
    public void Create(String name, int age) {
        teachers.add(new Teacher(name, age, "not specified"));
    }

    @Override
    public void Create(String name, int age, String description) {
        teachers.add(new Teacher(name, age, description));
    }

    /**
     * Comparator based on PersonComparator Class to compare Teachers by their names
     */
    public void SortByName(){
        PersonComparator<Teacher> personComparator = new PersonComparator<>();
        teachers.sort(personComparator);
    }
}
