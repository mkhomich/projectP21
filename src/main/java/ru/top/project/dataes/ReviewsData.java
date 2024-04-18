package ru.top.project.dataes;
import ru.top.project.model.Reviews;
import ru.top.project.model.User;


import java.util.List;

import java.util.*;

public class ReviewsData {
    private static List<Reviews> reviewsList;
    private static volatile ReviewsData instance;

    private ReviewsData() {
        reviewsList = new ArrayList<>();
        reviewsList.add(new Reviews(1, "Максим"));
        reviewsList.add(new Reviews(2, "Миша"));
    }

    public void addReviews(Reviews reviews) {
        reviewsList.add(reviews);
    }

    // Получение списка всех пользователей
    public List<Reviews> getAllReviews() {
        return reviewsList;
    }


    // Получение экземпляра класса UserData (с использованием Singleton)
    public static ReviewsData getInstance() {
        ReviewsData localInstance = instance;
        if (localInstance == null) {
            synchronized (ReviewsData.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new ReviewsData();
                }
            }
        }
        return localInstance;
    }
}
