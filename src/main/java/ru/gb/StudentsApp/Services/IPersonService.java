package ru.gb.StudentsApp.Services;

import java.util.List;

/**
 * Base generic interface with contract methods
 * @param <T> - parameter to be passed during interface realization
 */
public interface IPersonService<T> {

    /**
     * Method to Get List of T
     * @return T based entities as List
     */
    public List<T> GetAll();

    /**
     * Method to create and add new instance of T to List
     * @param name entity name
     * @param age entity age
     */
    public void Create(String name, int age);

    /**
     * Method overload to create and add new instance of T to List
     * @param name entity name
     * @param age entity age
     * @param description additional info which need to be added
     */
    public void Create(String name, int age, String description);
}
