package ru.top.project.dao.impl.jpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.top.project.dao.UserDao;
import ru.top.project.model.User;

import javax.net.ssl.HandshakeCompletedEvent;
import java.math.BigInteger;
import java.util.List;

@Repository
public class UserJpaDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> getAllUsers() {
        return getSession().createQuery("SELECT * FROM \"clients\"", User.class).getResultList();
    }

    @Transactional(readOnly = true)
    public User getUserById(BigInteger id) {
        return getSession().get(User.class, id);
    }

    @Transactional
    public User addUser(User user) {
        getSession().saveOrUpdate(user);
        return user;
    }

    @Override
    public User removeUser(String userId) {
        return null;
    }


    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}