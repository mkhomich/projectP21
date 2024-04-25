package ru.top.project.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Teacher extends User {
    List<Student> studentList = new ArrayList<>();
    List<Teacher> teacherList = new ArrayList<>();

    public Teacher(String userName, String userLogin, String userPassword, String userId) {
        super(userName, userLogin, userPassword, userId);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(studentList, teacher.studentList) && Objects.equals(teacherList, teacher.teacherList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentList, teacherList);
    }
}