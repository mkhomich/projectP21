package ru.top.project.dao;
import ru.top.project.model.HomeWork;

import java.util.List;
import java.util.Map;

public interface HomeWorkDao {
    // Метод для получения всех домашних заданий
    Map<Integer, HomeWork> getAllHomeWorks();

    // Метод для получения домашнего задания по его идентификатору
    HomeWork getHomeWorkById(int id);

    // Метод для добавления нового домашнего задания
    void addHomeWork(HomeWork homeWork);

    // Метод для обновления информации о домашнем задании
    void updateHomeWork(HomeWork homeWork);

    // Метод для удаления домашнего задания
    void deleteHomeWork(int id);
}
