package ru.top.project.dao;

import ru.top.project.model.User;

import java.math.BigInteger;
import java.util.List;

public interface UserDao {
    User addUser(User user);

    User removeUser(String userId);

    List<User> getAllUsers();

    public User getUserById(BigInteger id);


}
