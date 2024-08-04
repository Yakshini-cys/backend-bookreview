package com.example.demo.service;

import com.example.demo.dto.ReadingStatusDTO;

public interface ReadingStatusService {
    ReadingStatusDTO createReadingStatus(ReadingStatusDTO readingStatusDTO);
    ReadingStatusDTO getReadingStatusById(Long statusId);
    ReadingStatusDTO updateReadingStatus(Long statusId, ReadingStatusDTO readingStatusDTO);
    void deleteReadingStatus(Long statusId);
}
