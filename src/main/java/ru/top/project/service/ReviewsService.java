package ru.top.project.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.top.project.dao.ReviewsDao;
import ru.top.project.model.Review;
import java.util.List;
@Service
public class ReviewsService {
    private final ReviewsDao reviewsDao;
    @Autowired
    public ReviewsService(ReviewsDao reviewsDao) {
        this.reviewsDao = reviewsDao;
    }

    public void addReview(Review review) {
        reviewsDao.addReview(review);
    }

    public void updateReview(Review review) {
        reviewsDao.updateReview(review);
    }

    public void deleteReview(int reviewId) {
        reviewsDao.deleteReview(reviewId);
    }

    public Review getReviewById(int reviewId) {
        return reviewsDao.getReviewById(reviewId);
    }

    public List<Review> getAllReviewsByCourceId(int courseId) {
        return reviewsDao.getAllReviewsForCourse(courseId);
    }


}
