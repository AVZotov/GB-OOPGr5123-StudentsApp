package ru.gb.StudentsApp.Domen;

/**
 * Base abstract class describes base behaviour of entities in program
 * Is a parent class for all entities in program
 */
public abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Method to get entity name
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Method to get entity age
     * @return Integer
     */
    public int getAge() {
        return age;
    }

    /**
     * Override of base implementation ToString method to get detailed info about student
     * @return String
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
