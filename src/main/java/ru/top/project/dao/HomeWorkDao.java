package ru.top.project.dao;
import ru.top.project.model.HomeWork;
import java.util.Map;

public interface HomeWorkDao {
    Map<Integer, HomeWork> getAllHomeWorks();
    HomeWork getHomeWorkById(int id);
    void addHomeWork(HomeWork homeWork);
    void updateHomeWork(HomeWork homeWork);
    void deleteHomeWork(int id);
}
