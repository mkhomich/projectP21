package ru.top.project.dao.impl.data;

import ru.top.project.model.User;
import ru.top.project.dao.UserDao;

import java.util.ArrayList;
import java.util.List;

public class UserData implements UserDao {
    private static volatile UserData instance;

    List<User> usersList = new ArrayList<>();

    private UserData() {
    }

    public static UserData getInstance() {
        if (instance == null) {
            instance = new UserData();
        }
        return instance;
    }

    public User addUser(User user) {
        usersList.add(user);
        return user;
    }

    public User getUser(String userId) {
        for (User user : usersList) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    public User removeUser(String userId) {
        User userToRemove = null;
        for (User user : usersList) {
            if (user.getUserId().equals(userId)) {
                userToRemove = user;
                break;
            }
        }
        if (userToRemove != null) {
            usersList.remove(userToRemove);
        }
        return userToRemove;
    }

    public User getAllUsers() {
        List<User> userList = new ArrayList<>();
        for (User user : usersList) {
            userList.add(user);
        }
        return (User) userList;
    }
}

