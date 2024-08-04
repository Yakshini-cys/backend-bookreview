package com.example.demo.repository;

import com.example.demo.entity.ReadingStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadingStatusRepository extends JpaRepository<ReadingStatus, Long> {
}
