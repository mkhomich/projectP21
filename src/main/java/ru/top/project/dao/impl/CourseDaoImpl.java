package ru.top.project.dao.impl;

import ru.top.project.dao.CourseDao;
import ru.top.project.model.Course;
import ru.top.project.model.HomeWork;
import ru.top.project.model.Lecture;

import java.util.ArrayList;
import java.util.List;

public abstract class CourseDaoImpl implements CourseDao {
    private List<Course> courses;

    public CourseDaoImpl() {
        courses = new ArrayList<>();
    }

    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courses.remove(course);
    }

    @Override
    public List<Course> getAllcourses() {
        return new ArrayList<>(courses);
    }

    @Override
    public List<Lecture> getLecturesByCourse() {
        return null;
    }

    @Override
    public List<HomeWork> getHomeWorkByLection() {
        return null;
    }

    @Override
    public Course getCourseById(Course course) {
        return course;
    }
}
