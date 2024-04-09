package ru.top.project;
import ru.top.project.dataes.UserData;
import ru.top.project.model.User;
import java.util.List;

import java.util.List;
import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {

        List<User> userList = UserData.getInstance().getAllUsers();
        for (User user : userList) {
            System.out.println("ID: " + user.getId() + ", Name: " + user.getName());
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Введите id нового пользователя:  ");
        int newID = in.nextInt();
        System.out.println("Введите новое имя пользователя:  ");
        String newNameUser = in.nextLine();
        User newUser= new User(newID, newNameUser);
        newUser.setName(newNameUser);
        newUser.setId(newID);
        userList.add(newUser);

    }
}


