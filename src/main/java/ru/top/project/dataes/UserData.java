package ru.top.project.dataes;

import ru.top.project.model.User;
import java.util.HashMap;
import java.util.Map;

public class UserData {
    private static Map<Integer, User> userMap;
    private static volatile UserData instance;

    static {
        userMap = new HashMap<>();
        userMap.put(1, new User(1, "Максим"));
        userMap.put(2, new User(2, "Миша"));
    }

    private UserData() {
    }

    public Map<Integer, User> getAllUsers() {
        return userMap;
    }

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
