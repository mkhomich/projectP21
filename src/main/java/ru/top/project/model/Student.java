package ru.top.project.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Student extends User {
    List<Student> studentList = new ArrayList<>();

    public Student(String userName, String userLogin, String userPassword, String userId) {
        super(userName, userLogin, userPassword, userId);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getStudentList(), student.getStudentList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getStudentList());
    }
}
