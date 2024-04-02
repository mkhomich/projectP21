package ru.top.project.model;

import java.util.Objects;

public class Reviews {
    private String comment;
    private String mark;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comment, mark);
    }

    public void showCom(String comment)
    {
        System.out.println(comment);
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
}
