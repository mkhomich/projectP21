package ru.top.project.dao.Impl;

import ru.top.project.dao.ReviewsDao;
import ru.top.project.model.Review;

import java.util.ArrayList;
import java.util.List;

public class ReviewsDaoImpl implements ReviewsDao {
    private final List<Review> reviewsList;

    public ReviewsDaoImpl() {
        this.reviewsList = new ArrayList<>();
    }

    @Override
    public Review addReview(Review review) {
        reviewsList.add(review);
        return review;
    }

    @Override
    public Review updateReview(Review review) {
        int index = reviewsList.indexOf(review);
        if (index != -1) {
            reviewsList.set(index, review);
        }
        return review;
    }

    @Override
    public void deleteReview(int reviewId) {
        Review reviewToRemove = null;
        for (Review review : reviewsList) {
            if (review.getId() == reviewId) {
                reviewToRemove = review;
                break;
            }
        }
        if (reviewToRemove != null) {
            reviewsList.remove(reviewToRemove);
        }
    }

    @Override
    public Review getReviewById(int reviewId) {
        for (Review review : reviewsList) {
            if (review.getId() == reviewId) {
                return review;
            }
        }
        return null;
    }

    @Override
    public List<Review> getAllReviewsForCourse(int courseId) {
        List<Review> reviewsForCourse = new ArrayList<>();
        for (Review review : reviewsList) {
            if (review.getCourseById().getId() == courseId) {
                reviewsForCourse.add(review);
            }
        }
        return reviewsForCourse;
    }
}
