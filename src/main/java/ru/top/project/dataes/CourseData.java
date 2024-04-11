package ru.top.project.dataes;
import ru.top.project.model.Course;
import java.util.ArrayList;
import java.util.List;

public class CourseData {
    static List<Course> courseList;
    private CourseData() {
        courseList = new ArrayList<>();
    }
    private static volatile CourseData instance;
    public void addCourse(Course courses) {
        courseList.add(courses);
        System.out.println("Курс '" + courseList.getClass() + "' добавлен.");
    }
    public void removeCourse(Course course) {
        if (courseList.contains(course)) {
            courseList.remove(course);
            System.out.println("Курс '" + course.getInfoCourse() + "' удален.");
        } else {
            System.out.println("Курс '" + course.getInfoCourse() + "' не найден.");
        }
    }

    public void displayCourses() {
        if (!courseList.isEmpty()) {
            System.out.println("Список курсов:");
            for (Course course : courseList) {
                System.out.println(course);
            }
        } else {
            System.out.println("Нет доступных курсов.");
        }
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
