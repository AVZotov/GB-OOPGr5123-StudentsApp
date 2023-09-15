package ru.gb.MVCStudentApp.Model;

import ru.gb.MVCStudentApp.Controller.Interface.IGetModel;
import ru.gb.MVCStudentApp.Model.Core.Student;

import java.util.List;

/**
 * Class of Student repository based on List array to store students implements IGetModel interface
 */
public class StudentRepositoryListModel implements IGetModel {
    private final List<Student> students;

    public StudentRepositoryListModel(List<Student> students) {
        this.students = students;
    }

    public List<Student> GetStudents() {
        return students;
    }

    @Override
    public boolean Delete(int studentId) {
        return students.removeIf(student -> (student.getStudentId() == studentId));
    }
}
