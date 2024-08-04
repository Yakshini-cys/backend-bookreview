package com.example.demo.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(BookGenreId.class)
public class BookGenre {
    @Id
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Id
    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;
}

class BookGenreId implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long book;
    private Long genre;

    // Getters and setters
    public Long getBook() {
        return book;
    }

    public void setBook(Long book) {
        this.book = book;
    }

    public Long getGenre() {
        return genre;
    }

    public void setGenre(Long genre) {
        this.genre = genre;
    }
}
