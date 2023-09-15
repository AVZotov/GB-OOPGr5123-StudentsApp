package ru.gb.MVCStudentApp.Model.Core;

/**
 * Abstract class which is parent class for all entities in program
 */
public abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Method to get entity name field
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Method to set entity name
     * @param name String based name of person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to get entity age
     * @return Integer
     */
    public int getAge() {
        return age;
    }

    /**
     * Method to set entity age
     * @param age int based value of age field
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Method to return full details of person
     * @return String
     */
    @Override
    public String toString() {
        return String.format("Person: [name = %s, age = %d]", name, age);
    }
}
