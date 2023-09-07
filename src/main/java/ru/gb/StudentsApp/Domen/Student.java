package ru.gb.StudentsApp.Domen;

/**
 * Class student which extends abstract class Person and implements IComparable interface
 * Includes static field <code>entitiesCount</code> to count the amount of this class entities
 * this field used as unique iD for each instance of this class
 */
public class Student extends Person implements Comparable<Student>{
    private static int entitiesCount;

    static {
        entitiesCount = 0;
    }

    private final int id;

    public Student(String name, int age) {
        super(name, age);
        entitiesCount++;
        id = entitiesCount;
    }

    /**
     * Method to return student details in proper order
     * @return String
     */
    @Override
    public String toString() {
        return "Student: [" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ']';
    }

    /**
     * Simple comparator to compare to Students by name
     * @param o the object to be compared.
     * @return Integer based value to determine if objects are equal
     */
    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}
