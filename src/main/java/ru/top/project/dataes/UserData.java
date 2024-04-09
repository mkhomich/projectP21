package ru.top.project.dataes;
import ru.top.project.model.User;


import java.util.List;

public class UserData {
    static List<User> userList;
    private static volatile UserData instance;
    private static void AddUser(User user, int id) {
        userList = List.of(
                new User(id, user.getName())
        );
    }


    static{
        userList = List.of(
            new User(1, "Максим"),
            new User(2, "Миша")
    );}

    private UserData(){

    }

    public List<User> getAllUsers(){
        return userList;
    }

    public static UserData getInstance() {
        UserData localInstance = instance;
            if (localInstance == null) {
                synchronized (UserData.class) {
                    localInstance = instance;
                    if (localInstance == null) {
                        instance = localInstance = new UserData();
                    }
                }
            }
            return localInstance;
        }
//    public static void setInstance(UserData instance ) {
//        UserData.instance.getAllUsers().add(instance.getId(), instance.getName());
//    }


}
