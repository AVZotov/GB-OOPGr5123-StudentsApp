package ru.gb.MVCStudentApp.Model;

import ru.gb.MVCStudentApp.Controller.Interface.IGetModel;
import ru.gb.MVCStudentApp.Model.Core.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryFileModel implements IGetModel {
    private final String fileName;

    public StudentRepositoryFileModel(String fileName) {
        this.fileName = fileName;

        try(FileWriter fw = new FileWriter(fileName, true))
        {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public List<Student> GetStudents() {
        List<Student> students  = new ArrayList<>();
        try
        {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line!=null)
            {
                String[] param = line.split(" ");
                Student student = new Student(param[0], Integer.parseInt(param[1]));
                students.add(student);
                line = reader.readLine();
            }

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        return students;
    }

    public void saveAllStudentToFile(List<Student> students)
    {
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            for(Student student : students)
            {
                fw.write(student.getName()+" "+student.getAge()+" "+student.getStudentId());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
