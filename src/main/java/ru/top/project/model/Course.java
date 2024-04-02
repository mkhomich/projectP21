package ru.top.project.model;
import java.util.*;

public class Course {


    private String creator;
    private String info_course;
    private String survey;
    private String tags;
    private ArrayList<Lecture> lecture = new ArrayList<Lecture>( );
    private ArrayList<Reviews> reviews = new ArrayList<Reviews>( );

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return Objects.hash(creator, info_course, survey, tags, lecture);
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

    public String getInfo_course() {
        return info_course;
    }
    public void setInfo_course(String info_course) {
        this.info_course = info_course;
    }

    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ArrayList<Lecture> getLecture() {
        return lecture;
    }

    public void setLecture(ArrayList<Lecture> lecture) {
        this.lecture = lecture;
    }

    public ArrayList<Reviews> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Reviews> reviews) {
        this.reviews = reviews;
    }
}
