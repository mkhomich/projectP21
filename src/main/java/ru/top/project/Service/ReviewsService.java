package ru.top.project.Service;
import ru.top.project.dao.ReviewsDao;
import ru.top.project.model.Reviews;
import java.util.List;

public class ReviewsService {
    private final ReviewsDao reviewsDao;

    public ReviewsService(ReviewsDao reviewsDao) {
        this.reviewsDao = reviewsDao;
    }

    public void addReview(Reviews review) {
        reviewsDao.addReview(review);
    }

    public void updateReview(Reviews review) {
        reviewsDao.updateReview(review);
    }

    public void deleteReview(int reviewId) {
        reviewsDao.deleteReview(reviewId);
    }

    public Reviews getReviewById(int reviewId) {
        return reviewsDao.getReviewById(reviewId);
    }

    public List<Reviews> getAllReviewsCourse(int courseId) {
        return reviewsDao.getAllReviewsForCourse(courseId);
    }


}
