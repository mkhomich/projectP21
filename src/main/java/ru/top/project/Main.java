package ru.top.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ru.top.project.dao.impl.jdbc.UserDaoJdbcImpl;
import ru.top.project.model.*;
import ru.top.project.util.HibernateUtil;
import org.hibernate.cfg.Configuration;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.logging.Logger;

import static ru.top.project.util.HibernateUtil.getSessionFactory;

public class Main {
    public static void main(String[] args) {
        // Создание и настройка SessionFactory
        SessionFactory sessionFactory = getSessionFactory();

        // Открытие сессии
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            // Начало транзакции
            transaction = session.beginTransaction();

            // Тестирование CRUD операций для User
            User user = new User("John Doe", "john.doe", "password123", BigInteger.valueOf(1), "urlPhoto");
            session.save(user);
            user = session.get(User.class, BigInteger.valueOf(1));
            System.out.println("User: " + user.getUserName());
            user.setUserName("Jane Doe");
            session.update(user);
            session.delete(user);

            // Тестирование CRUD операций для Course
            Course course = new Course(BigInteger.valueOf(1),"Java Basics", "Introduction to Java", "survey");
            session.save(course);
            course = session.get(Course.class, BigInteger.valueOf(1));
            System.out.println("Course: " + course.getInfoCourse());
            course.setInfoCourse("Advanced Java");
            session.update(course);
            session.delete(course);

            // Тестирование CRUD операций для Lecture
            Lecture lecture = new Lecture(BigInteger.valueOf(1), "SSS", "ras");
            session.save(lecture);
            lecture = session.get(Lecture.class, lecture.getId());
            System.out.println("Lecture: " + lecture.getLectureNumber());
            lecture.setPayload("Updated Lecture 1");
            session.update(lecture);
            session.delete(lecture);

            // Тестирование CRUD операций для HomeWork
            HomeWork homework = new HomeWork("Homework 1", "Content of Homework 1","sassa","saasd","fddff","asdas");
            session.save(homework);
            homework = session.get(HomeWork.class, homework.getId());
            System.out.println("HomeWork: " + homework.getTitle());
            homework.setTitle("Updated Homework 1");
            session.update(homework);
            session.delete(homework);

            // Тестирование CRUD операций для Review
            Review review = new Review();
            session.save(review);
            review = session.get(Review.class, review.getId());
            System.out.println("Review: " + review.getComment());
            review.setComment("Updated review");
            session.update(review);
            session.delete(review);

            // Тестирование CRUD операций для Tag
            Tag tag = new Tag(course.getId(),"фывфы", BigInteger.valueOf(1));
            session.save(tag);
            tag = session.get(Tag.class, tag.getId());
            System.out.println("Tag: " + tag.getTag());
            tag.setTag("Updated Java");
            session.update(tag);
            session.delete(tag);

            // Тестирование CRUD операций для Teacher
            Teacher teacher = new Teacher("Dr. Smith","asdsad","asrwqd", BigInteger.valueOf(1),"asdefde");
            session.save(teacher);
            teacher = session.get(Teacher.class, BigInteger.valueOf(1));
            System.out.println("Teacher: " + teacher.getUserName());
            teacher.setUserName("Prof. Smith");
            session.update(teacher);
            session.delete(teacher);

            // Коммит транзакции
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            // Закрытие сессии
            session.close();
            sessionFactory.close();
        }
    }
}

