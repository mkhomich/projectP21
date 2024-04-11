package ru.top.project.model;

import java.util.List;

public class User {
    private int id;
    private List<Course> getCourse;
    private String name;
    private User(){}
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
