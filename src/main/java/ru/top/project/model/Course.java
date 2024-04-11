package ru.top.project.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Course {
    private int id;
    private String creator;
    private String infoCourse;
    private String survey;
    private String tags;

    private Map<Integer, User> users = new HashMap<>();
    private Map<Integer, Lecture> lectures = new HashMap<>();
    private Map<Integer, Reviews> reviews = new HashMap<>();

    private Course() {
    }

    @Override
    public String toString() {
        return "Курс: " +
                "id=" + id +
                ", создатель курса - '" + creator + '\'' +
                ", информация о курсе - '" + infoCourse + '\'';
    }

    public Course(int id, String creator, String infoCourse, String survey, String tags) {
        this.id = id;
        this.creator = creator;
        this.infoCourse = infoCourse;
        this.survey = survey;
        this.tags = tags;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Course course = (Course) obj;
        return id == course.id &&
                Objects.equals(creator, course.creator) &&
                Objects.equals(infoCourse, course.infoCourse) &&
                Objects.equals(survey, course.survey) &&
                Objects.equals(tags, course.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, creator, infoCourse, survey, tags);
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Integer, User> getUsers() {
        return users;
    }

    public void setUsers(Map<Integer, User> users) {
        this.users = users;
    }

    public Map<Integer, Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(Map<Integer, Lecture> lectures) {
        this.lectures = lectures;
    }

    public Map<Integer, Reviews> getReviews() {
        return reviews;
    }

    public void setReviews(Map<Integer, Reviews> reviews) {
        this.reviews = reviews;
    }
}
