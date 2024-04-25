package ru.top.project.dao.impl.da;

import ru.top.project.dao.ReviewsDao;
import ru.top.project.model.Review;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReviewsDaoImpl implements ReviewsDao {
    private List<Review> reviewsList;
    private static final Logger logger = Logger.getLogger(ReviewsDao.class.getName());

    public ReviewsDaoImpl() {
        this.reviewsList = new ArrayList<>();
    }

    @Override
    public Review addReview(Review review) {
        reviewsList.add(review);

        logger.log(Level.INFO, "Review add: " + review );
        return review;
    }

    @Override
    public Review updateReview(Review review) {
        int index = reviewsList.indexOf(review);
        if (index != -1) {
            reviewsList.set(index, review);
        }
        logger.log(Level.INFO, "Review update: " + review );
        return review;
    }

    @Override
    public void deleteReview(int reviewId) {

    }

    @Override
    public Review getReviewById(int reviewId) {
        return null;
    }

    @Override
    public List<Review> getAllReviewsForCourse(int courseId) {
        return null;
    }

    @Override
    public void deleteReview(BigInteger reviewId) {
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
    public Review getReviewById(BigInteger reviewId) {
        for (Review review : reviewsList) {
            if (review.getId() == reviewId) {
                return review;
            }
        }
        return null;
    }

    @Override
    public List<Review> getAllReviewsForCourse(BigInteger courseId) {
        List<Review> reviewsForCourse = new ArrayList<>();
        for (Review review : reviewsList) {
            if (review.getCourseById().getId() == courseId) {
                reviewsForCourse.add(review);
            }
        }
        return reviewsForCourse;
    }
}
