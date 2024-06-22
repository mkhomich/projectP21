package ru.top.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import ru.top.project.model.Review;
import ru.top.project.service.ReviewsService;

import java.math.BigInteger;
import java.util.List;


@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewsService reviewsService;
    @PostMapping
    public void addReview(Review review) {
        reviewsService.addReview(review);
    }

    @Transactional
    public void updateReview(Review review) {
        reviewsService.updateReview(review);
    }

    @DeleteMapping("{/id}")
    public void deleteReview(BigInteger reviewId){ reviewsService.deleteReview(reviewId);}

    @GetMapping("{/id}")
    public Review getReviewById(BigInteger reviewId){ return reviewsService.getReviewById(reviewId);}

    @GetMapping
    public List<Review> getAllReviewsForCourse(BigInteger courseId){ return reviewsService.getAllReviewsForCourse(courseId);}

}
