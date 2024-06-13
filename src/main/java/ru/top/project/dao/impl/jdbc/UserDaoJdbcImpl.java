package ru.top.project.dao.impl.jdbc;

import ru.top.project.dao.UserDao;
import ru.top.project.model.User;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJdbcImpl implements UserDao {
    private static final String JDBC_URI = "jdbc:postgresql://localhost:5432/database";
    private static final String JDBC_LOGIN = "admin";
    private static final String JDBC_PASSWORD = "password";
    private static final String GET_ALL_CLIENTS_QUERY = "SELECT * FROM clients";
    private static final String GET_CLIENT_BY_ID_QUERY = "SELECT * FROM clients WHERE id = ?";

    @Override
    public User addUser(User user) {
        return null;
    }
    @Override
    public User removeUser(Long userId) {
        return null;
    }

    public User getUserById(BigInteger id) {
        try (Connection connection = DriverManager.getConnection(JDBC_URI, JDBC_LOGIN, JDBC_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(GET_CLIENT_BY_ID_QUERY);
             ResultSet resultSet = statement.executeQuery()) {

            statement.setBigDecimal(1, new BigDecimal(id));
            if (resultSet.next()) {
                BigInteger clientId = resultSet.getBigDecimal("id").toBigInteger();
                String clientLogin = resultSet.getString("clientLogin");
                String clientPassword = resultSet.getString("clientPassword");
                String clientName = resultSet.getString("clientName");
                String urlPhoto = resultSet.getString("urlPhoto");
                return new User(clientName, clientLogin, clientPassword, clientId, urlPhoto);
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
             PreparedStatement statement = connection.prepareStatement(GET_ALL_CLIENTS_QUERY);
             ResultSet results = statement.executeQuery()) {

            while (results.next()) {
                BigInteger clientId = results.getBigDecimal("id").toBigInteger();
                String clientName = results.getString("clientName");
                String clientLogin = results.getString("clientLogin");
                String clientPassword = results.getString("clientPassword");
                String urlPhoto = results.getString("urlPhoto");

                User user = new User(clientName, clientLogin, clientPassword, clientId, urlPhoto);
                users.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
    }
