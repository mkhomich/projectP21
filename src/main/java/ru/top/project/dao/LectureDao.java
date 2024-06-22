package ru.top.project.dao;

import ru.top.project.dao.impl.data.LectureListDaoImpl;
import ru.top.project.model.Lecture;

import java.math.BigInteger;
import java.util.List;

public interface LectureDao {
    List<Lecture> getAllLectures();
    Lecture getLectureById(BigInteger id);

    Lecture addLecture(Lecture lecture);

    Lecture updateLecture(LectureListDaoImpl lecture);

    void deleteLecture(BigInteger id);
}

