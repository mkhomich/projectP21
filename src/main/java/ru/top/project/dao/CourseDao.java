package ru.top.project.dao;
import ru.top.project.model.Course;
import ru.top.project.model.HomeWork;
import ru.top.project.model.Lecture;
import java.util.List;
import java.util.Map;

public interface CourseDao {
    public void addCourse(Course courses);
    public void removeCourse(Course course);
    public List<Course> getAllcourses();
    public List<Lecture> getLecturesByCourse();
    public List<HomeWork> getHomeWorkByLection();
    public Map<Integer, Course> getCourseById();

}
