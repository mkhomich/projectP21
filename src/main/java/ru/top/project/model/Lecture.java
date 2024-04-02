package ru.top.project.model;

import java.util.*;

public class Lecture {
    private String teacher;
    private ArrayList<HomeWork> HW = new ArrayList<HomeWork>();
    private int numberlecture;
    private String topic;
    private String payload;
    public Lecture(int numberlecture) {
        this.numberlecture = numberlecture;
    }

    //вывод домашних работ
    public static void ShowHW(List<String> HomeWork)
    {
        System.out.println(Arrays.toString(HomeWork.toArray()));
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public ArrayList<HomeWork> getHW() {
        return HW;
    }

    public void setHW(ArrayList<HomeWork> HW) {
        this.HW = HW;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacher, HW, numberlecture, topic);
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
}
