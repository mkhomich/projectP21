package ru.top.project.model;
import java.util.*;

public class Course {

    private int id;
    private String creator;
    private String infoCourse;
    private String survey;
    private String tags;


    private List<Lecture> lectures = new ArrayList<>();
    private List<Reviews> reviews = new ArrayList<>();


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return Objects.hash(creator, infoCourse, survey, tags, id);
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
}
