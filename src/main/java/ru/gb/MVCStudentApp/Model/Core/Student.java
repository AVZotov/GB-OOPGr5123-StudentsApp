package ru.gb.MVCStudentApp.Model.Core;

public class Student extends Person{
    private static int entitiesCount;
    private final int studentId;
    public Student(String name, int age) {
        super(name, age);
        entitiesCount++;
        studentId = entitiesCount;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return String.format("Student: [name = %s, age = %d, ID = %d]", getName(), getAge(), getStudentId());
    }
}
