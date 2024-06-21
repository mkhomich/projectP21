package ru.top.project.model;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

//    @ManyToOne
    @Column(name = "creator")
    private BigInteger creator;

    @Column(name = "info_course")
    private String infoCourse;

    @Column(name = "photo_URL")
    private String urlPhotoCourse;

    @Column(name = "survey")
    private String survey;

//    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<User> users = new ArrayList<>();

    private List<Lecture> lectures = new ArrayList<>();

//    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Review> reviews = new ArrayList<>();

    private Course() {
    }

    @Override
    public String toString() {
        return "Курс: " +
                "id=" + id +
                ", создатель курса - '" + creator + '\'' +
                ", информация о курсе - '" + infoCourse + '\'';
    }

    public Course(BigInteger id, BigInteger creator, String infoCourse, String survey) {
        this.id = id;
        this.creator = creator;
        this.infoCourse = infoCourse;
        this.survey = survey;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Course course = (Course) obj;
        return id == course.id &&
                Objects.equals(creator, course.creator) &&
                Objects.equals(infoCourse, course.infoCourse) &&
                Objects.equals(survey, course.survey);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, creator, infoCourse, survey);
    }

    public String getSurvey() {
        return survey;
    }
    public void setSurvey(String survey) {
        this.survey = survey;
    }

    public String getInfoCourse() {
        return infoCourse;
    }
    public void setInfoCourse(String infoCourse) {
        this.infoCourse = infoCourse;
    }

    public BigInteger getCreator() {
        return creator;
    }
    public void setCreator(BigInteger creator) {
        this.creator = creator;
    }

    public BigInteger getId() {
        return id;
    }
    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getUrlPhotoCourse() {
        return urlPhotoCourse;
    }

    public void setUrlPhotoCourse(String urlPhotoCourse) {
        this.urlPhotoCourse = urlPhotoCourse;
    }
}
