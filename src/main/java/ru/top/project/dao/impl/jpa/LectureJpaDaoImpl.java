package ru.top.project.dao.impl.jpa;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;
import ru.top.project.dao.LectureDao;
import ru.top.project.dao.impl.data.LectureListDaoImpl;
import ru.top.project.model.HomeWork;
import ru.top.project.model.Lecture;

import java.math.BigInteger;
import java.util.List;

@Repository
public class LectureJpaDaoImpl implements LectureDao     {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Lecture> getAllLectures() {
        return getSession().createQuery("SELECT a FROM Lecture a", Lecture.class).getResultList();
    }
    @Transactional(readOnly = true)
    public Lecture getLectureById(BigInteger id) {
        return getSession().get(Lecture.class, id);
    }

    @Transactional
    public Lecture addLecture(Lecture lecture) {
        getSession().persist(lecture);
        return lecture;
    }

    @Override
    public Lecture updateLecture(LectureListDaoImpl lecture) {
        return null;
    }

    @Override
    public void deleteLecture(BigInteger id) {
        Lecture lecture = getSession().find(Lecture.class, id);
        getSession().createQuery("DELETE FROM Lecture WHERE id = :id").setParameter("id", lecture.getId()).executeUpdate();

    }
    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
