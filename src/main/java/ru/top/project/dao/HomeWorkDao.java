package ru.top.project.dao;

import ru.top.project.model.HomeWork;

import java.math.BigInteger;
import java.util.List;

public interface HomeWorkDao {
    List<HomeWork> getAllHomeWorks();

    HomeWork getHomeWorkById(BigInteger id);

    HomeWork addHomeWork(HomeWork homeWork);

    HomeWork updateHomeWork(HomeWork homeWork);

    void deleteHomeWork(BigInteger id);
}
