package ru.top.project.dao.Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ru.top.project.dao.HomeWorkDao;
import ru.top.project.model.HomeWork;

public class HomeWorkDaoImpl implements HomeWorkDao {
    private final List<HomeWork> homeWorkList;

    public HomeWorkDaoImpl() {
        this.homeWorkList = (List<HomeWork>) new HashMap<>();
    }

    @Override
    public List<HomeWork> getAllHomeWorks() {
        return homeWorkList;
    }

    @Override
    public HomeWork getHomeWorkById(int id) {
        return homeWorkList.get(id);
    }

    @Override
    public HomeWork addHomeWork(HomeWork homeWork) {
        homeWork.setId(generateId());
        homeWorkList.set(homeWork.getId(), homeWork);
        return homeWork;
    }

    @Override
    public HomeWork updateHomeWork(HomeWork homeWork) {
        homeWorkList.get(homeWork.getId());
        return homeWork;
    }

    @Override
    public void deleteHomeWork(int id) {
        homeWorkList.remove(id);
    }

    private int generateId() {
        return homeWorkList.size() + 1;
    }
}
