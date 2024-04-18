package ru.top.project;
import ru.top.project.dataes.CourseData;
import ru.top.project.model.Course;
public class Main {
    public static void main(String[] args) {

        CourseData courseData = CourseData.getInstance();
        Course course1 = new Course(1, "John Doe", "Математика", "опрос", "математика, учеба");
        Course course2 = new Course(2, "Jane Doe", "Физика", "опрос", "физика, учеба");
        Course course3 = new Course(3, "Alice Smith", "Химия", "опрос", "химия, учеба");

        courseData.addCourse(course1);
        courseData.addCourse(course2);
        courseData.addCourse(course3);
        courseData.removeCourse(course2);


    }
}


