package ru.top.project.dao;
import ru.top.project.model.Lecture;

import java.math.BigInteger;
import java.util.List;

public interface LectureDao {
    List<Lecture> getAllLectures();
    Lecture getLectureById(int id);

    Lecture getLectureById(BigInteger id);

    Lecture addLecture(Lecture lecture);
    void deleteLecture(int id);

    void deleteLecture(BigInteger id);
}

