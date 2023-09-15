package ru.gb.MVCStudentApp.Model;

import ru.gb.MVCStudentApp.Controller.Interface.IGetModel;
import ru.gb.MVCStudentApp.Model.Core.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Class to write and read student repository from file which implements IGetModel interface
 */
public class StudentRepositoryFileModel implements IGetModel {
    private final String fileName;
    private List<Student> students;

    public StudentRepositoryFileModel(String fileName) {
        this.fileName = fileName;
        students = new ArrayList<>();

        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Method return students as List which are read from file
     * @return List
     */
    @Override
    public List<Student> GetStudents() {
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] param = line.split(" ");
                Student student = new Student(param[0], Integer.parseInt(param[1]));
                students.add(student);
                line = reader.readLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return students;
    }


    @Override
    public boolean Delete(int studentId) {
        return students.removeIf(student -> (student.getStudentId() == studentId));
    }

    /**
     * method to save student repository to file
     * @param students List
     */
    public void saveAllStudentToFile(List<Student> students) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            for (Student student : students) {
                fw.write(student.getName() + " " + student.getAge() + " " + student.getStudentId());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
