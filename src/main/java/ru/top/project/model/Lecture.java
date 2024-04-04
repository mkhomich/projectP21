package ru.top.project.model;
import java.util.*;

public class Lecture {
    private String teacher;
    private int id;
    List<HomeWork> homeWorks = new ArrayList<>();
    private int numberLecture;
    private String topic;
    private String payload;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return Objects.hash(teacher, homeWorks, numberLecture, topic, id);
    }

    public Lecture(){}
    public Lecture(int numberlecture) {
        this.numberLecture = numberlecture;
    }

    public String getTeacher() {
        return teacher;
    }
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getNumberLecture() {
        return numberLecture;
    }
    public void setNumberLecture(int numberLecture) {
        this.numberLecture = numberLecture;
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

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
