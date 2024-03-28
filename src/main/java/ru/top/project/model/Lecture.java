package ru.top.project.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lecture {
    private String Teacher;
    private ArrayList<HomeWork> HW = new ArrayList<HomeWork>();
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
}
