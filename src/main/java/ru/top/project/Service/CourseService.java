package ru.top.project.Service;
import ru.top.project.dao.CourseDao;

import java.util.concurrent.atomic.AtomicReference;

public class CourseService {
    CourseDao dao;


    public CourseService(CourseDao dao) {
        this.dao = dao;
    }

    public void enterCourse(){}
    public void watchCourses(){
        dao.getAllcourses();
    }
    public void watchLectures(){
        dao.get().getLectures();
    }
    public void watchRegCourses(){}
    public void createReviews(){}
    public void createCourse(){}
    public void createLecture(){}
    public void createHomework(){}
    public void watchDoHomework(){}


}
