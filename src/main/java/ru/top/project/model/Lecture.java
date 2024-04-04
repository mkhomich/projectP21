package ru.top.project.model;
import java.math.BigInteger;
import java.util.*;

public class Lecture {
    private String teacher;
    private int id;
    List<HomeWork> homeWorks = new ArrayList<>();
    private int numberlecture;
    private String topic;
    private String payload;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return Objects.hash(teacher, homeWorks, numberlecture, topic, id);
    }

    public Lecture(){}
    public Lecture(int numberlecture) {
        this.numberlecture = numberlecture;
    }

    public String getTeacher() {
        return teacher;
    }
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getNumberlecture() {
        return numberlecture;
    }
    public void setNumberlecture(int numberlecture) {
        this.numberlecture = numberlecture;
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
        this.id = BigInteger.valueOf(id);
    }
}
