package ru.top.project.service;
import ru.top.project.dao.impl.data.LectureDaoImpl;
import ru.top.project.model.Lecture;

import java.util.List;

public class LectureService {
    private LectureDaoImpl lectureDaoImpl;
    public LectureService(LectureDaoImpl lecture) {
        this.lectureDaoImpl = lecture;
    }
    public Lecture createLecture(Lecture lecture) {
        //lecture.setCourse(lecture.getId());
        this.lectureDaoImpl.addLecture(lecture);
        return lecture;
    }


    public void updateLecture(Lecture lecture) {
        lectureDaoImpl.updateLecture(lecture);
    }
    public void deleteLecture(int lectureId) {
        lectureDaoImpl.deleteLecture(lectureId);
    }
    public Lecture getLectureById(int lectureId) {
        return lectureDaoImpl.getLectureById(lectureId);
    }
    public List<Lecture> getAllLecturesByCourse(int courseId) {
        return (List<Lecture>) lectureDaoImpl.getLectureById(courseId);
    }
}
