package ru.top.project.model;

import java.math.BigInteger;
import java.util.Arrays;

public class Teacher extends User {
    private String[] StudentsList;
    private String[] CreateCourseList;

    public Teacher(String userName, String userLogin, String userPassword, BigInteger userId, String urlPhoto) {
        super(userName, userLogin, userPassword, userId, urlPhoto);
    }

    public String[] getStudentsList() {
        return StudentsList;
    }

    public void setStudentsList(String[] studentsList) {
        StudentsList = studentsList;
    }

    public String[] getCreateCourseList() {
        return CreateCourseList;
    }

    public void setCreateCourseList(String[] createCourseList) {
        CreateCourseList = createCourseList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher teacher)) return false;
        return Arrays.equals(getStudentsList(), teacher.getStudentsList()) && Arrays.equals(getCreateCourseList(), teacher.getCreateCourseList());
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(getStudentsList());
        result = 31 * result + Arrays.hashCode(getCreateCourseList());
        return result;
    }
}