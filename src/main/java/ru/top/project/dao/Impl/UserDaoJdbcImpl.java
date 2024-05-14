package ru.top.project.dao.Impl;

import ru.top.project.dao.UserDao;
import ru.top.project.model.User;

import java.sql.*;

public class UserDaoJdbcImpl implements UserDao {
    private  Connection connection;
    private static final String JDBC_URI = "jdbc:postgresql://localhost:5432/postgres";
    private static final String JDBC_LOGIN = "postgres";
    private static final String JDBC_PASSWORD = "123";
    private final PreparedStatement statement;
    private ResultSet results;

    {
        try {
            connection = DriverManager.getConnection(
                    JDBC_URI,
                    JDBC_LOGIN, JDBC_PASSWORD);
            statement = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
        } catch (SQLException e) {
            throw new IllegalStateException("Failed to establish database connection.", e);
        }
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public String getUser(String userId) {
        return User.getUserId();
    }

    @Override
    public User removeUser(String userId) {
        return null;
    }

    public User getAllUsers() {
        try {
            results = statement.executeQuery("SELECT * FROM users");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    private void closeResources() {
        try {
            if (results != null) {
                results.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
