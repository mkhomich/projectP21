package ru.top.project;

import ru.top.project.model.User;
import ru.top.project.dao.impl.data.UserData;

public class Main {
    public static void main(String[] args) {
        // Пример использования:
        // Создаем базу данных и добавляем пользователей
        UserData db = UserData.getInstance();
        User user1 = new User("Alice", "alice_login", "alice_password", "1");
        User user2 = new User("Bob", "bob_login", "bob_password", "2");
        db.addUser(user1);
        db.addUser(user2);

        // Получаем пользователя из базы данных
        User retrievedUser = db.getUser("1");
        if (retrievedUser != null) {
            System.out.println("Retrieved User: " + retrievedUser.getUserName());
        } else {
            System.out.println("User not found");
        }
    }
}
