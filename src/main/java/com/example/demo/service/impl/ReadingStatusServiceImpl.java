package com.example.demo.service.impl;
import com.example.demo.exception.*;
import com.example.demo.dto.ReadingStatusDTO;
import com.example.demo.entity.ReadingStatus;
import com.example.demo.repository.ReadingStatusRepository;
import com.example.demo.service.ReadingStatusService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReadingStatusServiceImpl implements ReadingStatusService {

    @Autowired
    private ReadingStatusRepository readingStatusRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ReadingStatusDTO createReadingStatus(ReadingStatusDTO readingStatusDTO) {
        ReadingStatus readingStatus = modelMapper.map(readingStatusDTO, ReadingStatus.class);
        readingStatus = readingStatusRepository.save(readingStatus);
        return modelMapper.map(readingStatus, ReadingStatusDTO.class);
    }

    @Override
    public ReadingStatusDTO getReadingStatusById(Long statusId) {
        ReadingStatus readingStatus = readingStatusRepository.findById(statusId)
                .orElseThrow(() -> new ResourceNotFoundException("Reading Status not found"));
        return modelMapper.map(readingStatus, ReadingStatusDTO.class);
    }

    @Override
    public ReadingStatusDTO updateReadingStatus(Long statusId, ReadingStatusDTO readingStatusDTO) {
        ReadingStatus readingStatus = readingStatusRepository.findById(statusId)
                .orElseThrow(() -> new ResourceNotFoundException("Reading Status not found"));
        modelMapper.map(readingStatusDTO, readingStatus);
        readingStatus = readingStatusRepository.save(readingStatus);
        return modelMapper.map(readingStatus, ReadingStatusDTO.class);
    }

    @Override
    public void deleteReadingStatus(Long statusId) {
        ReadingStatus readingStatus = readingStatusRepository.findById(statusId)
                .orElseThrow(() -> new ResourceNotFoundException("Reading Status not found"));
        readingStatusRepository.delete(readingStatus);
    }
}
