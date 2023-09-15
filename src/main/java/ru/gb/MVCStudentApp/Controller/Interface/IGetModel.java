package ru.gb.MVCStudentApp.Controller.Interface;

import ru.gb.MVCStudentApp.Model.Core.Student;

import java.util.List;

/**
 * interface for model to store Students
 */
public interface IGetModel {

    /**
     * Method to get List of students
     * @return List < Student >
     */
    List<Student> GetStudents();

    /**
     * Method to delete student
     * @param studentId searching student by his unique ID and delete it
     * @return true or false depends on if student been find and delete
     */
    boolean Delete(int studentId);
}
