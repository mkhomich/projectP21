package ru.top.project;

import ru.top.project.model.Reviews;
import ru.top.project.dataes.ReviewsData;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Reviews> reviewsList = ReviewsData.getInstance().getAllReviews();
        for (Reviews reviews : reviewsList) {
            System.out.println("ID: " + reviews.getId() + ", Comment: " + reviews.getComment());
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Введите id нового комментария: ");
        int newID = in.nextInt();
        in.nextLine();
        System.out.println("Введите текст комментария: ");
        String newComment = in.nextLine();
        Reviews newReviews = new Reviews(newID, newComment);
        reviewsList.add(newReviews);

        for (Reviews reviews : reviewsList) {
            System.out.println("ID: " + reviews.getId() + ", Comment: " + reviews.getComment());
        }
    }
}