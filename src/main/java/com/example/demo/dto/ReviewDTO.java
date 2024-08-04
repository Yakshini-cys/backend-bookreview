package com.example.demo.dto;

import lombok.Data;

@Data
public class ReviewDTO {
    private Long reviewId;
    private Long userId;
    private Long bookId;
    private int rating;
    private String reviewText;
    private String reviewDate;
}
