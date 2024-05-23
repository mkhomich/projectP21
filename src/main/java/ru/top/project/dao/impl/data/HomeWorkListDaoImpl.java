package ru.top.project.dao.impl.data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import ru.top.project.dao.HomeWorkDao;
import ru.top.project.model.HomeWork;
@Repository
public class HomeWorkListDaoImpl implements HomeWorkDao {
    private final List<HomeWork> homeWorkList;

    public HomeWorkListDaoImpl() {
        this.homeWorkList = new ArrayList<>();
    }

    @Override
    public List<HomeWork> getAllHomeWorks() {
        return homeWorkList;
    }

    public HomeWork getHomeWorkById(BigInteger id) {
        for (HomeWork homeWork : homeWorkList) {
            if (homeWork.getId() == id) {
                return homeWork;
            }
        }
        return null;
    }

    @Override
    public HomeWork addHomeWork(HomeWork homeWork) {
        homeWork.setId(generateId());
        homeWorkList.add(homeWork);
        return homeWork;
    }

    @Override
    public HomeWork updateHomeWork(HomeWork homeWork) {
        for (int i = 0; i < homeWorkList.size(); i++) {
            if (homeWorkList.get(i).getId() == homeWork.getId()) {
                homeWorkList.set(i, homeWork);
                return homeWork;
            }
        }
        return null;
    }

    public void deleteHomeWork(BigInteger id) {
        for (int i = 0; i < homeWorkList.size(); i++) {
            if (homeWorkList.get(i).getId() == id) {
                homeWorkList.remove(i);
                return;
            }
        }
    }

    private BigInteger generateId() {
        return BigInteger.valueOf(homeWorkList.size() + 1);
    }
}
