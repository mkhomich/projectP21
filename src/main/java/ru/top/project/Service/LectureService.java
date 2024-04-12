package ru.top.project.Service;
import ru.top.project.dao.Impl.LectureDaoImpl;
import ru.top.project.model.Lecture;

import java.util.List;

public class LectureService {
    private final LectureDaoImpl lecture;

    public LectureService(LectureDaoImpl lecture) {
        this.lecture = lecture;
    }

    public void createLecture(int courseId, Lecture lecture) {
        lecture.setCourse(courseId);
        this.lecture.addLecture(lecture);
    }

    public void updateLecture(LectureDaoImpl lecture) {
        lecture.updateLecture(lecture);
    }

    public void deleteLecture(int lectureId) {
        lecture.deleteLecture(lectureId);
    }

    public Lecture getLectureById(int lectureId) {
        return lecture.getLectureById(lectureId);
    }

    public List<Lecture> getAllLecturesByCourse(int courseId) {
        return (List<Lecture>) lecture.getLectureById(courseId);
    }
}
