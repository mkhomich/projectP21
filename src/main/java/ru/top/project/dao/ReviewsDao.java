package ru.top.project.dao;

import ru.top.project.model.Reviews;

import java.util.List;

public interface ReviewsDao {
    void addReview(Reviews review);

    void updateReview(Reviews review);

    void deleteReview(int reviewId);

    Reviews getReviewById(int reviewId);

    List<Reviews> getAllReviewsForCourse(int courseId);
}
