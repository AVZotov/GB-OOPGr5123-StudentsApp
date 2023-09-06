package ru.gb.StudentsApp.Domen;

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

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}
