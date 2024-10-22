package com.example.book.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    private String ISBN;
    private String title;
    private String language;
    private String subject;
    private String publisher;
    private int numberOfPage;

//    @ManyToMany
//    @JoinTable(name = "book_author",
//            joinColumns = @JoinColumn(name = "book_ID"),
//            inverseJoinColumns = @JoinColumn(name = "author_ID"))
//    private Set<Author> authors = new LinkedHashSet<>();

//    public Set<Author> getAuthors() {
//        return authors;
//    }
//
//    public void setAuthors(Set<Author> authors) {
//        this.authors = authors;
//    }

    // Constructor
    public Book() {}

    // Getters and Setters
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }
}