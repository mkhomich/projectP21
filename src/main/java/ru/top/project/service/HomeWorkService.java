package ru.top.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.top.project.dao.impl.jpa.HomeworkJpaDaoImpl;
import ru.top.project.model.HomeWork;

import java.math.BigInteger;
import java.util.List;

@Service
public class HomeWorkService {
    @Autowired
    private HomeworkJpaDaoImpl homeWorkDao;
    public HomeWorkService(){
    }

    @Transactional
    public HomeWork createHomeWork(HomeWork homeWork) {
        return null;
    }

    @Transactional
    public void updateHomeWork(HomeWork homeWork) {
    }

    @Transactional
    public void deleteHomeWork(BigInteger homeWorkId) {
    }

    @Transactional(readOnly = true)
    public HomeWork getHomeWorkById(BigInteger homeWorkId) {
        return null;
    }

    @Transactional(readOnly = true)
    public List<HomeWork> getAllHomeWorks() {
        return null;
    }
}
