package ru.top.project.model;

import java.math.BigInteger;
import java.util.Objects;

//@Entity
//@Table(name = "review")
public class Review {

    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private BigInteger id;

    //    @ManyToOne
//    @MapsId
//    @JoinColumn(name = "id")
    private Course course;

    //    @Column(name = "comment")
    private String comment;

    //    @Column(name = "mark")
    private String mark;

    public Review() {
    }

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
