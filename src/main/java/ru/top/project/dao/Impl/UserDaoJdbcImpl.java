package ru.top.project.dao.Impl;

import ru.top.project.dao.UserDao;
import ru.top.project.model.User;

import java.sql.*;

public class UserDaoJdbcImpl implements UserDao {
    private final Connection connection;
    private final Statement statement;
    private ResultSet results;

    {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "123");
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new IllegalStateException("Failed to establish database connection.", e);
        }
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public User getUser(String userId) {
        return null;
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
