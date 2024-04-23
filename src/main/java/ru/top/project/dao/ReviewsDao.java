package ru.top.project.dao;

import ru.top.project.model.Review;

import java.math.BigInteger;
import java.util.List;

public interface ReviewsDao {
    Review addReview(Review review);

    Review updateReview(Review review);

    void deleteReview(int reviewId);

    Review getReviewById(int reviewId);

    List<Review> getAllReviewsForCourse(int courseId);

    void deleteReview(BigInteger reviewId);

    Review getReviewById(BigInteger reviewId);

    List<Review> getAllReviewsForCourse(BigInteger courseId);
}
