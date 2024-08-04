package com.example.demo.dto;

import lombok.Data;

@Data
public class UserProfileDTO {
    private Long profileId;
    private Long userId;
    private String name;
    private String bio;
    private int booksRead;
    private int readingGoal;
    private int totalReviews;
    private int readingStreak;
    private double avgReadingTime;
    private String favoriteQuote;
    private String favoriteQuoteBook;
}
