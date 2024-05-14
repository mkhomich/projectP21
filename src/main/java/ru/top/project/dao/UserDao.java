package ru.top.project.dao;

import ru.top.project.model.User;

public interface UserDao {
    User addUser(User user);
    String getUser(String userId);
    User removeUser(String userId);
    User getAllUsers();
}
