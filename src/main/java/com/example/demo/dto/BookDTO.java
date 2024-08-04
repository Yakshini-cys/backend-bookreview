package com.example.demo.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BookDTO {
    private Long bookId;
    private String title;
    private String author;
    private String isbn;
    private LocalDate publicationDate;
    private String coverImage;
}
