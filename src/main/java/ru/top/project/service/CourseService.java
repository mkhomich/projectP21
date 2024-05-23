package ru.top.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.top.project.dao.CourseDao;
import ru.top.project.model.Course;
import ru.top.project.model.HomeWork;
import ru.top.project.model.Lecture;
import ru.top.project.model.Review;

@Service
class CourseService {
    private final CourseDao dao;

    @Autowired
    public CourseService(CourseDao dao) {
        this.dao = dao;
    }
    public void enterCourse(){}
    public void watchCourses(){
        dao.getAllcourses();
    }
    public void watchLectures(){
        dao.getLecturesByCourse();
    }
    public void createReviews(Review newReview) {}
    public void createCourse(Course newCourse){}
    public void createLecture(Lecture newLecture){}
    public void createHomework(HomeWork newHomeWork){}


}
