package ru.top.project.model;
import java.math.BigInteger;
import java.util.Objects;


public class Review {
    private BigInteger id;
    Course course ;
    private String comment;
    private String mark;


    public Review(){}

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return Objects.hash(comment, mark, id);
    }

    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

    public BigInteger getId() {
        return id;
    }
    public void setId(int id) {
        this.id = BigInteger.valueOf(id);
    }

    public Course getCourseById() {
        return course;
    }

    public void setCourseId(BigInteger courseId) {
        course.setId(courseId);
    }
}
