package ru.top.project;
import ru.top.project.dao.Impl.UserDaoJdbcImpl;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserDaoJdbcImpl jdbc = new UserDaoJdbcImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введиете id пользователя ");
        Integer id = scanner.nextInt();

        jdbc.printData(id);
    }
}
