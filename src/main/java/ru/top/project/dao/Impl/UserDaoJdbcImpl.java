package ru.top.project.dao.Impl;

import java.sql.*;

public class UserDaoJdbcImpl {
    private Connection connection;
    private Statement statement;
    private ResultSet results;

    public UserDaoJdbcImpl() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "123");
            statement = connection.createStatement();

            results = statement.executeQuery("SELECT * FROM users");
        } catch (SQLException e) {

            e.printStackTrace();

        }
    }

    public void printData(Integer id) {
        try {
            if (results != null) {
                while (results.next()) {
                    Integer idUser = results.getInt(1);
                    String name = results.getString(2);
                    if (idUser.equals(id)) { // Проверяем соответствие id пользователя
                        System.out.println(idUser + "\t" + name);
                        return; // Завершаем метод после вывода данных нужного пользователя
                    }
                }
                // Если не найдено записей с заданным id
                System.out.println("Пользователь с id " + id + " не найден.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
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

