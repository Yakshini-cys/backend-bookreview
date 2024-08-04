package com.example.demo.service;

import com.example.demo.dto.GenreDTO;

public interface GenreService {
    GenreDTO createGenre(GenreDTO genreDTO);
    GenreDTO getGenreById(Long genreId);
    GenreDTO updateGenre(Long genreId, GenreDTO genreDTO);
    void deleteGenre(Long genreId);
}
