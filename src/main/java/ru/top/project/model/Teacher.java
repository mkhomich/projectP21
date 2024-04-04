package ru.top.project.model;

import java.util.Arrays;

public class Teacher {
    private String [] StudentsList;
    private String [] CreateCourseList;

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