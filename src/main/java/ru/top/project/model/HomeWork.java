package ru.top.project.model;
import java.util.Objects;

public class HomeWork {
    private int id;
    private String title;
    private String deadline;
    private String mark;
    private String infoHomework;
    private String userPassed;
    private String nameTeacher;



    public HomeWork() {}

    public HomeWork(String title, String date, String mark, String info, String passed, String teacher) {
        this.title = title;
        this.deadline = date;
        this.mark = mark;
        this.infoHomework = info;
        this.userPassed = passed;
        this.nameTeacher = teacher;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, deadline, mark, infoHomework, userPassed, nameTeacher, id);
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeadline() {
        return deadline;
    }
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getInfoHomework() {
        return infoHomework;
    }
    public void setInfoHomework(String infoHomework) {
        this.infoHomework = infoHomework;
    }

    public String getUserPassed() {
        return userPassed;
    }
    public void setUserPassed(String userPassed) {
        this.userPassed = userPassed;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }
    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
