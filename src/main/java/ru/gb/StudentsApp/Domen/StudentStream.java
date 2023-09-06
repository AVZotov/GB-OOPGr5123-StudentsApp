package ru.gb.StudentsApp.Domen;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup>{
    private final List<StudentGroup> studentGroups;
    private final int streamId;
    private int index;

    public StudentStream(List<StudentGroup> studentGroups, int streamId) {
        this.studentGroups = studentGroups;
        this.streamId = streamId;
        index = 0;
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public int getStreamId() {
        return streamId;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
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
