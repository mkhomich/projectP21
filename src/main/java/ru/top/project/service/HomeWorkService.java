package ru.top.project.service;

import ru.top.project.dao.HomeWorkDao;
import ru.top.project.model.HomeWork;

import java.math.BigInteger;
import java.util.List;

public class HomeWorkService {
    private  HomeWorkDao homeWorkDao;
    public HomeWorkService(){    }

    public HomeWorkService(HomeWorkDao homeWorkDao) {
        this.homeWorkDao = homeWorkDao;
    }

    public HomeWork createHomeWork(HomeWork homeWork) {
        homeWorkDao.addHomeWork(homeWork);
        return homeWork;
    }

    public void updateHomeWork(HomeWork homeWork) {
        homeWorkDao.updateHomeWork(homeWork);
    }

    public void deleteHomeWork(BigInteger homeWorkId) {
        homeWorkDao.deleteHomeWork(homeWorkId);
    }

    public HomeWork getHomeWorkById(BigInteger homeWorkId) {
        return homeWorkDao.getHomeWorkById(homeWorkId);
    }

    public List<HomeWork> getAllHomeWorks() {
        List<HomeWork> homeWorkList = homeWorkDao.getAllHomeWorks();
        return homeWorkList;
    }
}
