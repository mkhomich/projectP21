package data;
import dao.UserDao;
import ru.top.project.model.User;

import java.util.ArrayList;
import java.util.List;
public class UserData implements UserDao {
    private static volatile UserData instance;

    List<User> usersList = new ArrayList<>();
    private UserData(){}
    public static UserData getInstance() {
        if (instance == null) {
            instance = new UserData();
        }
        return instance;
    }

    public void addUser(User user){
        usersList.add(user);
        System.out.println("Пользователь " + user.getUserName() + " добавлен.");
    }

    public User getUser(String userId){
        for(User user : usersList){
            return user;
        }
        return null;
    }

    public void removeUser(String userId) {
        User userToRemove = null;
        for (User user : usersList) {
            if (user.getUserId() == userId) {
                userToRemove = user;
                break;
            }
        }
        if (userToRemove != null) {
            usersList.remove(userToRemove);
        }
    }

    public void getAllUsers(){
        System.out.println("Все пользователи:");
        for (User user : usersList) {
            System.out.println(user.getUserName() + " (" + user.getUserLogin() + ")");
        }
    }
}

