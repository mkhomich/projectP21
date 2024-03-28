package ru.top.project.model;

public class HomeWork {
    private String title;
    private String date_todo;
    private String mark;
    private String info_hw;
    private String user_passed;
    private String name_teacher;
    //конструктор
    public HomeWork(String title, String date, String mark, String info, String passed, String teacher) {
        this.title = title;
        this.date_todo = date;
        this.mark = mark;
        this.info_hw = info;
        this.user_passed = passed;
        this.name_teacher = teacher;
    }

    //создание домашней работы
    public static void Create_hw()
    {

    }
    //сдача домашней работы
    public static void Passed_hw()
    {

    }
    //выставить отметку
    public static void Give_mark()
    {

    }
    //пересдача
    public static void Retake_request() {

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate_todo() {
        return date_todo;
    }

    public void setDate_todo(String date_todo) {
        this.date_todo = date_todo;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getInfo_hw() {
        return info_hw;
    }

    public void setInfo_hw(String info_hw) {
        this.info_hw = info_hw;
    }

    public String getUser_passed() {
        return user_passed;
    }

    public void setUser_passed(String user_passed) {
        this.user_passed = user_passed;
    }

    public String getName_teacher() {
        return name_teacher;
    }

    public void setName_teacher(String name_teacher) {
        this.name_teacher = name_teacher;
    }
}
