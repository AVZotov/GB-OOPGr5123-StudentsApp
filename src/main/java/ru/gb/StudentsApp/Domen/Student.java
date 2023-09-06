package ru.gb.StudentsApp.Domen;

public class Student extends Person{
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
}
