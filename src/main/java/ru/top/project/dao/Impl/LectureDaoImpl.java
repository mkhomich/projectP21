package ru.top.project.dao.Impl;

import ru.top.project.dao.LectureDao;
import ru.top.project.model.Lecture;

import java.util.ArrayList;
import java.util.List;

public abstract class LectureDaoImpl implements LectureDao {
    private final List<Lecture> lectureList;

    public LectureDaoImpl() {
        this.lectureList = new ArrayList<>();
    }

    @Override
    public List<Lecture> getAllLectures() {
        return new ArrayList<>(lectureList);
    }

    @Override
    public Lecture getLectureById(int id) {
        for (Lecture lecture : lectureList) {
            if (lecture.getId() == id) {
                return lecture;
            }
        }
        return null;
    }

    @Override
    public Lecture addLecture(Lecture lecture) {
        lecture.setId(lecture.getId());
        lectureList.add(lecture);
        return lecture;
    }

    public Lecture updateLecture(Lecture lecture) {
        for (int i = 0; i < lectureList.size(); i++) {
            if (lectureList.get(i).getId() == lecture.getId()) {
                lectureList.set(i, lecture);
                return lecture;
            }
        }
        return lecture;
    }

    @Override
    public void deleteLecture(int id) {
        for (int i = 0; i < lectureList.size(); i++) {
            if (lectureList.get(i).getId() == id) {
                lectureList.remove(i);
                break;
            }
        }
    }

}
