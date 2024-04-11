package ru.top.project.model;

public interface UserDao {
    void addUser(User user);
    User getUser(String userId);
    void removeUser(String userId);
    void getAllUsers();










}
