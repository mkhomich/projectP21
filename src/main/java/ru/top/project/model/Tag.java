package ru.top.project.model;

import java.math.BigInteger;
import java.util.Objects;

public class Tag {
    private BigInteger id;
    private String tag;
    private BigInteger course_id;

    public Tag(BigInteger course_id, String tag, BigInteger id) {
        this.course_id = course_id;
        this.tag = tag;
        this.id = id;
    }

    public BigInteger getId() {
        return id;
    }

    public String getTag() {
        return tag;
    }

    public BigInteger getCourse_id() {
        return course_id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setCourse_id(BigInteger course_id) {
        this.course_id = course_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag1 = (Tag) o;
        return Objects.equals(id, tag1.id) && Objects.equals(tag, tag1.tag) && Objects.equals(course_id, tag1.course_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tag, course_id);
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", tag='" + tag + '\'' +
                ", course_id=" + course_id +
                '}';
    }
}
