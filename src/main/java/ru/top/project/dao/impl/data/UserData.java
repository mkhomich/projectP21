package ru.top.project.dao.impl.data;

import ru.top.project.model.User;
import ru.top.project.dao.UserDao;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;

public class UserData implements UserDao {
    private static volatile UserData instance;
    private static final Logger logger = Logger.getLogger(UserData.class.getName()); // Инициализация логгера
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
                logger.log(Level.INFO, "User retrieved: " + user);
                return user;
            }
        }
        logger.log(Level.INFO, "User with ID " + userId + " not found.");
        return null;
    }

    public User removeUser(String userId) {
        User userToRemove = null;
        for (User user : usersList) {
            if (user.getUserId().equals(userId)) {
                userToRemove = user;
                usersList.remove(userToRemove);
                logger.log(Level.INFO, "User removed: " + userToRemove);
                return userToRemove;
            }
        }
        logger.log(Level.INFO, "User with ID " + userId + " not found.");
        return null;
    }


    public User getAllUsers() {
        List<User> userList = new ArrayList<>();
        for (User user : usersList) {
            userList.add(user);
        }
        return (User) userList;
    }
}

