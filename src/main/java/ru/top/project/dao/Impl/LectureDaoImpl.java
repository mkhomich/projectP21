package ru.top.project.dao.Impl;
import ru.top.project.dao.LectureDao;
import ru.top.project.model.Lecture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LectureDaoImpl implements LectureDao {
    private final Map<Integer, Lecture> lectureMap;

    public LectureDaoImpl() {
        this.lectureMap = new HashMap<>();
    }

    @Override
    public List<Lecture> getAllLectures() {
        return new ArrayList<>(lectureMap.values());
    }

    @Override
    public Lecture getLectureById(int id) {
        return lectureMap.get(id);
    }

    @Override
    public void addLecture(Lecture lecture) {
        lecture.setId(generateId());
        lectureMap.put(lecture.getId(), lecture);
    }

    @Override
    public void updateLecture(Lecture lecture) {
        lectureMap.put(lecture.getId(), lecture);
    }

    @Override
    public void deleteLecture(int id) {
        lectureMap.remove(id);
    }

    private int generateId() {
        return lectureMap.size() + 1;
    }
}

