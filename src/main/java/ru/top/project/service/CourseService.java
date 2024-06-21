package ru.top.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.top.project.dao.impl.jpa.CourseJpaDaoImpl;
import ru.top.project.model.Course;
import ru.top.project.model.HomeWork;
import ru.top.project.model.Lecture;
import ru.top.project.model.Review;

@Service
class CourseService {
    @Autowired
    private CourseJpaDaoImpl dao;

    public CourseService() {
    }
    public void enterCourse(){}
    public void watchCourses(){
    }
    public void watchLectures(){
    }
    public void createReviews(Review newReview) {}
    public void createCourse(Course newCourse){}
    public void createLecture(Lecture newLecture){}
    public void createHomework(HomeWork newHomeWork){}


}
