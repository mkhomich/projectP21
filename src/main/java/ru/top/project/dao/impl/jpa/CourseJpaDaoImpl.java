package ru.top.project.dao.impl.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.top.project.dao.CourseDao;
import ru.top.project.model.Course;
import ru.top.project.model.HomeWork;
import ru.top.project.model.Lecture;

import java.math.BigInteger;
import java.util.List;

@Repository
public class CourseJpaDaoImpl implements CourseDao {

    @Override
    public void addCourse(Course courses) {

    }

    @Override
    public void removeCourse(Course course) {

    }

    @Override
    public List<Course> getAllcourses() {
        return null;
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
    public List<Course> getCourseById() {
        return null;
    }

    @Override
    public Course getCourseById(Course course) {
        return null;
    }
}
