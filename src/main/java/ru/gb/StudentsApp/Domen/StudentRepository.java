package ru.gb.StudentsApp.Domen;

import java.util.List;

public class StudentRepository {
    private final List<Student> students;
    private final int groupId;

    public StudentRepository(List<Student> students, int groupId) {
        this.students = students;
        this.groupId = groupId;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getGroupId() {
        return groupId;
    }

    @Override
    public String toString() {
        return "Student group = " + groupId;
    }
}
