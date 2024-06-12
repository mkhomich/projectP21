package ru.top.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.top.project.model.User;
import ru.top.project.service.UserServiceImpl;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/clients")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable BigInteger id) {
        return userService.getUser(id);
    }
}
