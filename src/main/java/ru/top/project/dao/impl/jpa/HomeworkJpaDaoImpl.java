package ru.top.project.dao.impl.jpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.html.HTMLObjectElement;
import ru.top.project.dao.HomeWorkDao;
import ru.top.project.model.HomeWork;

import java.math.BigInteger;
import java.util.List;

@Repository
public class HomeworkJpaDaoImpl implements HomeWorkDao {

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<HomeWork> getAllHomeWorks() {
        return getSession().createQuery("SELECT a FROM HomeWork a", HomeWork.class).getResultList();
    }

    @Transactional(readOnly = true)
    public HomeWork getHomeWorkById(BigInteger id) {
        return getSession().get(HomeWork.class, id);
    }

    @Transactional
    public HomeWork addHomeWork(HomeWork homeWork) {
        getSession().persist(homeWork);
        return homeWork;
    }

    @Override
    public HomeWork updateHomeWork(HomeWork homeWork) {
        return null;
    }

    @Override
    public void deleteHomeWork(BigInteger id) {
        HomeWork homeWork = getSession().find(HomeWork.class, id);
        getSession().createQuery("DELETE FROM HomeWork WHERE id = :id").setParameter("id", homeWork.getId()).executeUpdate();
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
