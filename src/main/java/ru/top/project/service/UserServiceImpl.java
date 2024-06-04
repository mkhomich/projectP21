package ru.top.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.top.project.dao.UserDao;
import ru.top.project.model.User;

import java.math.BigInteger;
import java.util.List;

@Service
public class UserServiceImpl {
    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Transactional
    public void saveUser(User user) {
        userDao.addUser(user);
    }

    @Transactional(readOnly = true)
    public User getUser(BigInteger id) {
        return userDao.getUserById(id);
    }
}
