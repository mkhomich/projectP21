package ru.top.project.model;

import java.math.BigInteger;
import java.util.Objects;

public class User {
    private String UserName;
    private String UserLogin;
    private String UserPassword;
    private static BigInteger UserId;

    public User(String userName, String userLogin, String userPassword, BigInteger userId) {
        UserName = userName;
        UserLogin = userLogin;
        UserPassword = userPassword;
        UserId = userId;
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

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + UserName + '\'' +
                ", UserLogin='" + UserLogin + '\'' +
                ", UserPassword='" + UserPassword + '\'' +
                ", UserId=" + UserId +
                '}';
    }
}

