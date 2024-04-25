package ru.top.project.dao.impl;

import ru.top.project.dao.UserDao;
import ru.top.project.model.User;

public class UserDaoImpl implements UserDao {
    @Override
    public User getUser(String userId) {return null;}
    @Override
    public User removeUser(String userId) {
        return null;
    }
    @Override
    public User getAllUsers() {
        return null;
    }
    public User addUser(User user) {
        return user;
    }
}
