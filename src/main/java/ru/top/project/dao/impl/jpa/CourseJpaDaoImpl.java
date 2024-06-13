package ru.top.project.dao.impl.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.top.project.model.Course;

import java.math.BigInteger;

@Repository
public interface CourseJpaDaoImpl extends JpaRepository<Course, BigInteger> {
}
