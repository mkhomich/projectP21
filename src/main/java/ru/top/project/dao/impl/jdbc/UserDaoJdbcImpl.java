package ru.top.project.dao.impl.jdbc;

import ru.top.project.dao.UserDao;
import ru.top.project.model.User;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJdbcImpl implements UserDao {
    private static final String JDBC_URI = "jdbc:postgresql://localhost:5432/postgres";
    private static final String JDBC_LOGIN = "postgres";
    private static final String JDBC_PASSWORD = "123";
    private static final String GET_ALL_USERS_QUERY = "SELECT * FROM users";
    private static final String GET_USER_BY_ID_QUERY = "SELECT * FROM users WHERE id = ?";

    @Override
    public User addUser(User user) {
        return null;
    }
    @Override
    public User removeUser(String userId) {
        return null;
    }

    public User getUserById(BigInteger id) {
        try (Connection connection = DriverManager.getConnection(JDBC_URI, JDBC_LOGIN, JDBC_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(GET_USER_BY_ID_QUERY);
             ResultSet resultSet = statement.executeQuery()) {

            statement.setBigDecimal(1, new BigDecimal(id));
            if (resultSet.next()) {
                BigInteger userId = resultSet.getBigDecimal("id").toBigInteger();
                String userLogin = resultSet.getString("userLogin");
                String userPassword = resultSet.getString("userPassword");
                String userName = resultSet.getString("userName");
                return new User(userName, userLogin, userPassword, userId);
            } else {
                return null;
            }

        } catch (SQLException e) {
            throw new IllegalStateException("Не удалось установить соединение с базой данных.", e);
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(JDBC_URI, JDBC_LOGIN, JDBC_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(GET_ALL_USERS_QUERY);
             ResultSet results = statement.executeQuery()) {

            while (results.next()) {
                BigInteger userId = results.getBigDecimal("id").toBigInteger();
                String userName = results.getString("userName");
                String userLogin = results.getString("userLogin");
                String userPassword = results.getString("userPassword");


                User user = new User(userName, userLogin, userPassword, userId);
                users.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
    }
