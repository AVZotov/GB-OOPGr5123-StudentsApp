package ru.gb.StudentsApp.Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{
    private final List<Student> students;
    private final int groupId;
    private int index;

    public StudentGroup(List<Student> students, int groupId) {
        this.students = students;
        this.groupId = groupId;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getGroupId() {
        return groupId;
    }

    @Override
    public String toString() {
        return "Student group = " + groupId;
    }

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            @Override
            public boolean hasNext() {
                return index++ < students.size();
            }

            @Override
            public Student next() {
                return students.get(index - 1);
            }
        };
    }

    @Override
    public int compareTo(StudentGroup o) {
        return Integer.compare(this.students.size(), o.students.size());
    }
}
