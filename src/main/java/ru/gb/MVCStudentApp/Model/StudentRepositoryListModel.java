package ru.gb.MVCStudentApp.Model;

import ru.gb.MVCStudentApp.Controller.Interface.IGetModel;
import ru.gb.MVCStudentApp.Model.Core.Student;

import java.util.List;

public class StudentRepositoryListModel implements IGetModel {
    private final List<Student> students;

    public StudentRepositoryListModel(List<Student> students) {
        this.students = students;
    }

    public List<Student> GetStudents() {
        return students;
    }
}
