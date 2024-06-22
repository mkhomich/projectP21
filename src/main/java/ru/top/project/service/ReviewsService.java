package ru.top.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.top.project.dao.ReviewsDao;
import ru.top.project.model.Review;
import ru.top.project.dao.impl.jpa.ReviewsJpaDaoImpl;

import java.math.BigInteger;
import java.util.List;

@Service
public class ReviewsService {
    @Autowired
    private final ReviewsDao reviewsDao;
    @Transactional
    public void addReview(Review review) {
        reviewsDao.addReview(review);
    }

    public ReviewsService(ReviewsDao reviewsDao) {
        this.reviewsDao = reviewsDao;
    }

    @Transactional
    public void updateReview(Review review) {
        reviewsDao.updateReview(review);
    }

    @Transactional
    public void deleteReview(BigInteger reviewId){ reviewsDao.deleteReview(reviewId);}

    @Transactional(readOnly = true)
    public Review getReviewById(BigInteger reviewId){ return reviewsDao.getReviewById(reviewId);}

    @Transactional(readOnly = true)
    public List<Review> getAllReviewsForCourse(BigInteger courseId){ return reviewsDao.getAllReviewsForCourse(courseId);}

}
