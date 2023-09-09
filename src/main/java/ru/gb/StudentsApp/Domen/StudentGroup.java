package ru.gb.StudentsApp.Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Class to store students in separate group with unique ID
 * students stored via List<> collection
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{
    private final List<Student> students;
    private final int groupId;

    public StudentGroup(List<Student> students, int groupId) {
        this.students = students;
        this.groupId = groupId;
    }

    /**
     * Method to get List of students
     * @return List< Student >
     */
    public List<Student> GetStudents(){
        return this.students;
    }

    /**
     * Method to simplify collection converting to string with predefined logic
     * Use StringBuilder as base for string creation
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("-".repeat(50)).append("\n");
        stringBuilder.append(String.format("Student Group %d", this.groupId)).append("\n");
        stringBuilder.append(String.format("%d students in group", this.students.size())).append("\n");
        for (Student student : students) {
            stringBuilder.append(student.toString()).append("\n");
        }
        stringBuilder.append("-".repeat(50));

        return stringBuilder.toString();
    }

    /**
     * Base realization of Iterator which iterate internal collection based on List<>
     * @return Iterator< Student >
     */
    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            private int index = 0;
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

    /**
     * Method to sort Collection by group size.
     * If groups size are equals then sort by group ID
     * @param o the object to be compared.
     * @return Integer (-1, 0 or 1) based on equality of 2 values
     */
    @Override
    public int compareTo(StudentGroup o) {
        int result = Integer.compare(this.students.size(), o.students.size());
        if (result != 0)
            return result;

        return Integer.compare(this.groupId, o.groupId);
    }
/**
 * Method to sort Collection by group size only
 * return value (-1, 0 or 1) based on equality of 2 values
 */
//    @Override
//    public int compareTo(StudentGroup o) {
//        return Integer.compare(this.students.size(), o.students.size());
//    }


}
