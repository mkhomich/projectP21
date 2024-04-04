package ru.top.project.model;

import java.util.Arrays;

public class Student {
    private String [] active_course_list;

    public String[] getCourses_list() {
        return active_course_list;
    }
    public void setCourses_list(String[] courses_list) {
        this.active_course_list = courses_list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Arrays.equals(getCourses_list(), student.getCourses_list());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getCourses_list());
    }
}
