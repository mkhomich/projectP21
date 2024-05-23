package ru.top.project.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;


@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private static BigInteger UserId;

    @Column(name = "name")
    private String UserName;

    @Column(name = "login")
    private String UserLogin;

    @Column(name = "password")
    private String UserPassword;

    @Column(name = "photo_URL")
    private String urlPhoto;

    @ManyToOne
    @MapsId
    @JoinColumn(name = "creator")
    private Course course;

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + UserName + '\'' +
                ", UserLogin='" + UserLogin + '\'' +
                ", UserPassword='" + UserPassword + '\'' +
                ", urlPhoto='" + urlPhoto + '\'' +
                '}';
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public User(String userName, String userLogin, String userPassword, BigInteger userId, String UrlPhoto) {
        UserName = userName;
        UserLogin = userLogin;
        UserPassword = userPassword;
        UserId = userId;
        urlPhoto = UrlPhoto;
    }


    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserLogin() {
        return UserLogin;
    }

    public void setUserLogin(String userLogin) {
        UserLogin = userLogin;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public static BigInteger getUserId() {
        return UserId;
    }

    public void setUserId(BigInteger userId) {
        UserId = userId;
    }

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

