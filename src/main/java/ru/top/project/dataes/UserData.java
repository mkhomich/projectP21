package ru.top.project.dataes;
import ru.top.project.model.User;


import java.util.List;

import java.util.*;

public class UserData {
    private static List<User> userList;
    private static volatile UserData instance;

    private UserData() {
        userList = new ArrayList<>();
        // Заполняем список пользователями по умолчанию
        userList.add(new User(1, "Максим"));
        userList.add(new User(2, "Миша"));
    }

    // Добавление нового пользователя
    public void addUser(User user) {
        userList.add(user);
    }

    // Получение списка всех пользователей
    public List<User> getAllUsers() {
        return userList;
    }

    // Получение экземпляра класса UserData (с использованием Singleton)
    public static UserData getInstance() {
        UserData localInstance = instance;
        if (localInstance == null) {
            synchronized (UserData.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new UserData();
                }
            }
        }
        return localInstance;
    }
}
