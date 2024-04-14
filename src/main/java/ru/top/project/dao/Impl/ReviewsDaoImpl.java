package ru.top.project.dao.Impl;

import ru.top.project.dao.ReviewsDao;
import ru.top.project.model.Reviews;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReviewsDaoImpl implements ReviewsDao {
    private final Map<Integer, Reviews> reviewsMap;

    public ReviewsDaoImpl() {
        this.reviewsMap = new HashMap<>();
    }

    @Override
    public void addReview(Reviews review) {
        reviewsMap.put(review.getId(), review);
    }

    @Override
    public void updateReview(Reviews review) {
        reviewsMap.put(review.getId(), review);
    }

    @Override
    public void deleteReview(int reviewId) {
        reviewsMap.remove(reviewId);
    }

    @Override
    public Reviews getReviewById(int reviewId) {
        return reviewsMap.get(reviewId);
    }

    @Override
    public List<Reviews> getAllReviewsForCourse(int courseId) {
        List<Reviews> reviewsForCourse = new ArrayList<>();
        for (Reviews review : reviewsMap.values()) {
            if (review.getCourseById() == courseId) {
                reviewsForCourse.add(review);
            }
        }
        return reviewsForCourse;
    }
}
