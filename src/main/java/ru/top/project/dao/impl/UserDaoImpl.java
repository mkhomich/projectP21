package ru.top.project.dao.Impl;
import ru.top.project.dao.UserDao;
import ru.top.project.model.User;

import java.math.BigInteger;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public User removeUser(String userId) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    public User addUser(User user) {
        return user;
    }

    public User getUserById(BigInteger id) {
        return null;
    }
}