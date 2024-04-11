package ru.top.project.dao.Impl;
import ru.top.project.dao.CourseDao;
import ru.top.project.model.Course;
import ru.top.project.model.HomeWork;
import ru.top.project.model.Lecture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseDaoImpl implements CourseDao {
    private Map<Integer, Course> courses;

    public CourseDaoImpl() {
        courses = new HashMap<>();
    }

    @Override
    public void addCourse(Course course) {
        courses.put(course.getId(), course);
        System.out.println("Курс добавлен: " + course);
    }

    @Override
    public void removeCourse(Course course) {
        courses.remove(course.getId());
        System.out.println("Курс удален: " + course);
    }

    @Override
    public List<Course> getAllcourses() {
        return new ArrayList<>(courses.values());
    }

    @Override
    public List<Lecture> getLecturesByCourse() {
        // Реализация получения лекций по курсу
        return null;
    }

    @Override
    public List<HomeWork> getHomeWorkByLection() {
        // Реализация получения домашних заданий по лекции
        return null;
    }

    @Override
    public Map<Integer, Course> getCourseById() {
        return courses;
    }
}
