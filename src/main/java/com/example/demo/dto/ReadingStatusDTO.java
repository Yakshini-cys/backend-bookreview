package com.example.demo.dto;

import lombok.Data;

@Data
public class ReadingStatusDTO {
    private Long statusId;
    private Long userId;
    private Long bookId;
    private String status;
    private String dateAdded;
}
