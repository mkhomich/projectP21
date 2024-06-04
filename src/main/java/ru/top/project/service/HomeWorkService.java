package ru.top.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.top.project.dao.impl.jpa.HomeworkJpaDaoImpl;
import ru.top.project.model.HomeWork;

import java.math.BigInteger;
import java.util.List;


public class HomeWorkService {
    //@Autowired
    private HomeworkJpaDaoImpl homeWorkDao;
    public HomeWorkService(){
    }

    public HomeWork createHomeWork(HomeWork homeWork) {
        return null;
    }

    public void updateHomeWork(HomeWork homeWork) {
    }

    public void deleteHomeWork(BigInteger homeWorkId) {
    }

    public HomeWork getHomeWorkById(BigInteger homeWorkId) {
        return null;
    }

    public List<HomeWork> getAllHomeWorks() {
        return null;
    }
}
