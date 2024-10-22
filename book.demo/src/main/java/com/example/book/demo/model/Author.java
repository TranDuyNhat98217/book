package com.example.book.demo.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity

public class Author {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String name;
private String description;

    @ManyToMany
    @JoinTable(name = "book_author",
            joinColumns = @JoinColumn(name = "author_ID"),
            inverseJoinColumns = @JoinColumn(name = "book_ID"))
    private Set<Book> books = new LinkedHashSet<>();

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
// Setters and Getters goes here...

}
