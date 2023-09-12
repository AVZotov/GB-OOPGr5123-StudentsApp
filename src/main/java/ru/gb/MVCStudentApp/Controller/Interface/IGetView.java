package ru.gb.MVCStudentApp.Controller.Interface;

import ru.gb.MVCStudentApp.Model.Core.Student;

import java.util.List;

public interface IGetView {
    void PrintAll(List<Student> students);
    String GetUserSelection(String message);
}
