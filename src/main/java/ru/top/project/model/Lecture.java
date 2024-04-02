package ru.top.project.model;

import java.util.*;

public class Lecture {
    private String Teacher;
    private ArrayList<HomeWork> HW = new ArrayList<HomeWork>();
    private int NumberLecture;

    public Lecture(int numberlecture) {
        NumberLecture = numberlecture;
    }

    //вывод домашних работ
    public static void show_hw(List<String> HomeWork)
    {
        System.out.println(Arrays.toString(HomeWork.toArray()));
    }

    public String getTeacher() {
        return Teacher;
    }

    public void setTeacher(String teacher) {
        Teacher = teacher;
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


    public int getNumberLecture() {
        return NumberLecture;
    }

    public void setNumberLecture(int numberLecture) {
        NumberLecture = numberLecture;
    }
}
