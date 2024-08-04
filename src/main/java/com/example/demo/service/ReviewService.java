package com.example.demo.service;

import com.example.demo.dto.ReviewDTO;

public interface ReviewService {
    ReviewDTO createReview(ReviewDTO reviewDTO);
    ReviewDTO getReviewById(Long reviewId);
    ReviewDTO updateReview(Long reviewId, ReviewDTO reviewDTO);
    void deleteReview(Long reviewId);
}
