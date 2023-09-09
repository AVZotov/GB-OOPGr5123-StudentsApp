package ru.gb.StudentsApp.Domen;

import java.util.Comparator;

/**
 * Generic comparator to compare two Persons by their names
 * @param <T> object to be compared base on parent class Person
 */
public class PersonComparator<T extends Person> implements Comparator<T> {

    /**
     * Base method to compare two objects
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return Integer based value (1, 0, -1) means more, equals or less
     */
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
