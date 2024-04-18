package ru.top.project.dao.Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ru.top.project.dao.HomeWorkDao;
import ru.top.project.model.HomeWork;

public class HomeWorkDaoImpl implements HomeWorkDao {
    private final Map<Integer, HomeWork> homeWorkMap;

    public HomeWorkDaoImpl() {
        this.homeWorkMap = new HashMap<>();
    }

    @Override
    public Map<Integer, HomeWork> getAllHomeWorks() {
        return (Map<Integer, HomeWork>) new ArrayList<>(homeWorkMap.values());
    }

    @Override
    public HomeWork getHomeWorkById(int id) {
        return homeWorkMap.get(id);
    }

    @Override
    public void addHomeWork(HomeWork homeWork) {
        homeWork.setId(generateId());
        homeWorkMap.put(homeWork.getId(), homeWork);
    }

    @Override
    public void updateHomeWork(HomeWork homeWork) {
        homeWorkMap.put(homeWork.getId(), homeWork);
    }

    @Override
    public void deleteHomeWork(int id) {
        homeWorkMap.remove(id);
    }

    private int generateId() {
        return homeWorkMap.size() + 1;
    }
}
