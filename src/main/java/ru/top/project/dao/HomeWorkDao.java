package ru.top.project.dao;
import ru.top.project.model.HomeWork;

import java.util.List;

public interface HomeWorkDao {
    List<HomeWork> getAllHomeWorks();

    HomeWork getHomeWorkById(int id);

    HomeWork addHomeWork(HomeWork homeWork);

    HomeWork updateHomeWork(HomeWork homeWork);

    void deleteHomeWork(int id);
}
