package ru.top.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.top.project.model.HomeWork;
import ru.top.project.service.HomeWorkService;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/homework")
public class HomeWorkController {
    @Autowired
    private HomeWorkService homeWorkService;

    @GetMapping
    public HomeWork createHomeWork(HomeWork homeWork) {
        return null;
    }

    @GetMapping
    public void updateHomeWork(HomeWork homeWork) {
    }

    @DeleteMapping("/{id}")
    public void deleteHomeWork(BigInteger homeWorkId) {
    }

    @GetMapping("/{id}")
    public HomeWork getHomeWorkById(BigInteger homeWorkId) {
        return null;
    }

    @GetMapping
    public List<HomeWork> getAllHomeWorks() {
        return homeWorkService.getAllHomeWorks();
    }
}
