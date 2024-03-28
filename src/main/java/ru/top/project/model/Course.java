package ru.top.project.model;
import java.util.*;
import ru.top.project.model.Lecture;

public class Course {

    private String creator;
    private String Info_course;
    private String survey;
    private String Subject;
    private ArrayList<Lecture> lecture = new ArrayList<Lecture>();



    public static void Show_lecture(List <String> Lecture)
    {
        System.out.println(Arrays.toString(Lecture.toArray()));
    }
    public String getSubject() {
        return Subject;
    }
    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getSurvey() {
        return survey;
    }
    public void setSurvey(String survey) {
        this.survey = survey;
    }

    public String getInfo_course() {
        return Info_course;
    }
    public void setInfo_course(String info_course) {
        Info_course = info_course;
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
}
