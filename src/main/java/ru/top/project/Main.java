package ru.top.project;

import ru.top.project.dao.Impl.UserDaoJdbcImpl;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        UserDaoJdbcImpl jdbc = new UserDaoJdbcImpl() {
            public String getUser(String userId) {
                return "";
            }
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id пользователя:");

        try {
            int userId = scanner.nextInt();
        } catch (Exception e) {
            logger.severe("Ошибка при вводе id пользователя: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

