package ru.top.project.dao.impl.jpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.top.project.dao.ReviewsDao;
import ru.top.project.model.Review;

import java.math.BigInteger;
import java.util.List;

@Repository
public class ReviewsJpaDaoImpl implements ReviewsDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public Review addReview(Review review) {
        getSession().persist(review);
        return review;
    }

    @Transactional
    public Review updateReview(Review review) {
        return null;
    }

    @Override
    public void deleteReview(BigInteger reviewId) {
        Review review = getSession().find(Review.class, reviewId);
        getSession().createQuery("DELETE FROM Review WHERE id = :id").setParameter("id", review.getId()).executeUpdate();
    }

    @Transactional(readOnly = true)
    public Review getReviewById(BigInteger reviewId) {
        return getSession().get(Review.class, reviewId);
    }

    @Override
    public List<Review> getAllReviewsForCourse(BigInteger courseId) {
        return getSession().createQuery("SELECT a FROM Review a WHERE Course.id = courseId").getResultList();
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
