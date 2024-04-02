package ru.top.project.model;
import java.util.*;

public class Course {


    private String creator;
    private String infoCourse;
    private String survey;
    private String tags;
    List lectures = new ArrayList();
    List reviews = new ArrayList();

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return Objects.hash(creator, infoCourse, survey, tags);
    }

    public static void ShowLecture(List <String> Lecture)
    {
        System.out.println(Arrays.toString(Lecture.toArray()));
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

}
