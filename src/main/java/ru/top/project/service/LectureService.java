package ru.top.project.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.top.project.dao.impl.data.LectureListDaoImpl;
import ru.top.project.model.Lecture;

import java.util.List;
@Service
public class LectureService {
    private LectureListDaoImpl lectureListDaoImpl;
    @Autowired
    public LectureService(LectureListDaoImpl lecture) {
        this.lectureListDaoImpl = lecture;
    }
    public Lecture createLecture(Lecture lecture) {
        lecture.setId(lecture.getId());
        this.lectureListDaoImpl.addLecture(lecture);
        return lecture;
    }
    public void updateLecture(Lecture lecture) {
        lectureListDaoImpl.updateLecture(lecture);
    }
    public void deleteLecture(int lectureId) {
        lectureListDaoImpl.deleteLecture(lectureId);
    }
    public Lecture getLectureById(int lectureId) {
        return lectureListDaoImpl.getLectureById(lectureId);
    }
    public List<Lecture> getAllLecturesByCourse(int courseId) {
        return (List<Lecture>) lectureListDaoImpl.getLectureById(courseId);
    }
}
