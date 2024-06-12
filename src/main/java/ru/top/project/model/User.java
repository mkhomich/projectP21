package ru.top.project.model;


import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "clients")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "name")
    private String userName;

    @Column(name = "login")
    private String userLogin;

    @Column(name = "password")
    private String userPassword;

    @Column(name = "photo_url")
    private String urlPhoto;

//    @ManyToOne
//    @MapsId
//    @JoinColumn(name = "creator")
//    private Course course;

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + userName + '\'' +
                ", UserLogin='" + userLogin + '\'' +
                ", UserPassword='" + userPassword + '\'' +
                ", urlPhoto='" + urlPhoto + '\'' +
                '}';
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }
    public User() {
    }

    public User(String userName, String userLogin, String userPassword, BigInteger userId, String urlPhoto) {
        userName = userName;
        userLogin = userLogin;
        userPassword = userPassword;
        userId = userId;
        urlPhoto = urlPhoto;
    }


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

//    public Course getCourse() {
//        return course;
//    }
//
//    public void setCourse(Course course) {
//        this.course = course;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(getUserId(), user.getUserId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId());
    }

}

