package ru.gb.StudentsApp.Domen;

/**
 * Class Employee which extends abstract class Person
 *
 */
public class Employee extends Person{

    private final String speciality;
    public Employee(String name, int age, String speciality) {
        super(name, age);
        this.speciality = speciality;
    }

    /**
     * Method to Get Employee speciality
     * @return String
     */
    public String getSpeciality() {
        return speciality;
    }
}
