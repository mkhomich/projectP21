package dao;

import ru.top.project.model.User;

public interface UserDao {
    void addUser(User user);
    User getUser(String userId);
    void removeUser(String userId);
    void getAllUsers();










}
