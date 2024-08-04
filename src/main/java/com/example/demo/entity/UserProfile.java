package com.example.demo.entity;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profileId;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

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
