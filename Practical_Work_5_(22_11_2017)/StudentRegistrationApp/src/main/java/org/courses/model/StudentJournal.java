package org.courses.model;

import java.util.ArrayList;
import java.util.List;

public class StudentJournal {

    private List<StudentNote> studentJournal = new ArrayList<>();

    public void add(StudentNote studentNote){
        studentJournal.add(studentNote);
    }

    public List<StudentNote> getStudentJournal() {
        return studentJournal;
    }

    @Override
    public String toString() {
        return studentJournal.toString();
    }
}
