package ru.gb.StudentsApp.Domen;

/**
 * Class Teacher which extends abstract class Person
 */
public class Teacher extends Person{

    private final String academicDegree;
    public Teacher(String name, int age, String academicDegree) {
        super(name, age);
        this.academicDegree = academicDegree;
    }

    /**
     * Method to get academic degree of exact teacher
     * @return String
     */
    public String getAcademicDegree() {
        return academicDegree;
    }
}
