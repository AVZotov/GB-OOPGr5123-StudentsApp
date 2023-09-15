package ru.gb.MVCStudentApp.Model;

import ru.gb.MVCStudentApp.Controller.Interface.IGetModel;
import ru.gb.MVCStudentApp.Model.Core.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Class of Student repository based on HashMap array to store students implements IGetModel interface
 */
public class StudentRepositoryHashModel implements IGetModel {
    HashMap<Long, Student> students = new HashMap<>();

    public StudentRepositoryHashModel(List<Student> students) {
        FillStudents(students);
    }

    @Override
    public List<Student> GetStudents() {
        return new ArrayList<>(students.values());
    }

    @Override
    public boolean Delete(int studentId) {
        return new ArrayList<>(students.values()).removeIf
                (student -> (student.getStudentId() == studentId));
    }

    /**
     * Helper method to add students passed as parameter to hashmap, hashmap key is student ID
     * @param students List
     */
    private void FillStudents(List<Student> students){
        for (Student student : students) {
            this.students.put((long) student.getStudentId(), student);
        }
    }
}
