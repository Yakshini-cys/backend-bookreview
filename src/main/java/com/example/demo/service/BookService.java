package com.example.demo.service;

import com.example.demo.dto.BookDTO;

public interface BookService {
    BookDTO createBook(BookDTO bookDTO);
    BookDTO getBookById(Long bookId);
    BookDTO updateBook(Long bookId, BookDTO bookDTO);
    void deleteBook(Long bookId);
}

