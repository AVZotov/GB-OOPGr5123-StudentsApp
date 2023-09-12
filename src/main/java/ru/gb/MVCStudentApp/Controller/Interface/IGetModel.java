package ru.gb.MVCStudentApp.Controller.Interface;

import ru.gb.MVCStudentApp.Model.Core.Student;

import java.util.List;

public interface IGetModel {
    List<Student> GetStudents();
}
