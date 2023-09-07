package ru.gb.StudentsApp.Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Class to store Student Groups in streams with unique ID
 */
public class StudentStream implements Iterable<StudentGroup>{
    private final List<StudentGroup> studentGroups;
    private final int streamId;

    public StudentStream(List<StudentGroup> studentGroups, int streamId) {
        this.studentGroups = studentGroups;
        this.streamId = streamId;
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    /**
     * Overwritten ToString method to return stream details with list of groups, ID's and students
     * @return
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("-".repeat(50)).append("\n");
        stringBuilder.append(String.format("Student Stream %d", this.streamId)).append("\n");
        stringBuilder.append(String.format("%d student groups in stream", this.studentGroups.size())).append("\n");
        for (StudentGroup studentGroup : studentGroups) {
            stringBuilder.append(studentGroup.toString()).append("\n");
        }
        stringBuilder.append("-".repeat(50));

        return stringBuilder.toString();
    }

    /**
     * Method to implements Iterable Interface and iterate student groups in standard for based cycles
     * @return Iterator
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index++ < studentGroups.size();
            }

            @Override
            public StudentGroup next() {
                return studentGroups.get(index - 1);
            }
        };
    }
}
