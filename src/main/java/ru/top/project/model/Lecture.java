package ru.top.project.model;

import java.math.BigInteger;
import java.util.*;

//@Entity
//@Table(name = "lecture")
public class Lecture {

    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private BigInteger id;

    //    @Column(name = "teacher")
    private String teacher;

    //    @ManyToOne
//    @JoinColumn(name = "course_id")
    private Course course;

    //    @ManyToOne
//    @JoinColumn(name = "user_id")
    private User user;

    //    @OneToMany(mappedBy = "lecture", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HomeWork> homeWorks = new ArrayList<>();

    //    @Column(name = "lecture_number")
    private int lectureNumber;

    //    @Column(name = "topic")
    private String topic;

    //    @Column(name = "payload")
    private String payload;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacher, homeWorks, lectureNumber, topic, id);
    }

    public Lecture() {
    }

    public Lecture(int lectureNumber) {
        this.lectureNumber = lectureNumber;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getLectureNumber() {
        return lectureNumber;
    }

    public void setLectureNumber(int lectureNumber) {
        this.lectureNumber = lectureNumber;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public BigInteger getId() {
        return id;
    }


    public void setId(BigInteger id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<HomeWork> getHomeWorks() {
        return homeWorks;
    }

    public void setHomeWorks(List<HomeWork> homeWorks) {
        this.homeWorks = homeWorks;
    }

    public void addHomeWork(HomeWork homeWork) {
        homeWorks.add(homeWork);
    }

    public void removeHomeWork(HomeWork homeWork) {
        homeWorks.remove(homeWork);
    }
}
