package ru.top.project.dataes;

import ru.top.project.dao.CourseDao;
import ru.top.project.model.Course;
import ru.top.project.model.HomeWork;
import ru.top.project.model.Lecture;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CourseData implements CourseDao {
    static List<Course> courseList;
    private CourseData() {
        courseList = new ArrayList<>();
    }
    private static volatile CourseData instance;
    public void addCourse(Course courses) {
        courseList.add(courses);
    }
    public void removeCourse(Course course) {
        if (courseList.contains(course)) {
            courseList.remove(course);
        }
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
    public Map<Integer, Course> getCourseById() {
        return null;
    }

    public List<Course> getAllCourses(){
        return courseList;
    }

    public static CourseData getInstance() {
        CourseData localInstance = instance;
        if (localInstance == null) {
            synchronized (CourseData.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new CourseData();
                }
            }
        }
        return localInstance;
    }
}
