package ru.gb.MVCStudentApp.Model.Core;

/**
 * Class describes student entity which extends abstract class Person
 */
public class Student extends Person{
    private static int entitiesCount;
    private final int studentId;
    public Student(String name, int age) {
        super(name, age);
        entitiesCount++;
        studentId = entitiesCount;
    }

    /**
     * Method to return student ID
     * @return Integer
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * Overwritten method to return full details of student
     * @return `String
     */
    @Override
    public String toString() {
        return String.format("Student: [name = %s, age = %d, ID = %d]", getName(), getAge(), getStudentId());
    }
}
