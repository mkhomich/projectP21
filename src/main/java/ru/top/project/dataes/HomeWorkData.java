package ru.top.project.dataes;

import ru.top.project.dao.HomeWorkDao;
import ru.top.project.model.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HomeWorkData implements HomeWorkDao {
    private static List<HomeWork> homeWorkList;

    private HomeWorkData() {
        homeWorkList = new ArrayList<>();
    }

    private static volatile HomeWorkData instance;

    @Override
    public Map<Integer, HomeWork> getAllHomeWorks() {
        return null;
    }

    @Override
    public HomeWork getHomeWorkById(int id) {
        return null;
    }

    public void addHomeWork(HomeWork homeWork) {
        homeWorkList.add(homeWork);
        System.out.println("Домашнее задание для лекции добавлено.");
    }

    @Override
    public void updateHomeWork(HomeWork homeWork) {

    }

    @Override
    public void deleteHomeWork(int id) {

    }

    public void removeHomeWork(HomeWork homeWork) {
        if (homeWorkList.contains(homeWork)) {
            homeWorkList.remove(homeWork);
            System.out.println("Домашнее задание для лекции удалено.");
        } else {
            System.out.println("Домашнее задание для лекции не найдено.");
        }
    }

    public void displayHomeWork() {
        if (!homeWorkList.isEmpty()) {
            System.out.println("Список домашних заданий:");
            for (HomeWork homeWork : homeWorkList) {
                System.out.println(homeWork);
            }
        } else {
            System.out.println("Нет доступных домашних заданий.");
        }
    }

    public List<HomeWork> getAllHomeWork() {
        return homeWorkList;
    }

    public static HomeWorkData getInstance() {
        HomeWorkData localInstance = instance;
        if (localInstance == null) {
            synchronized (HomeWorkData.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new HomeWorkData();
                }
            }
        }
        return localInstance;
    }
}
