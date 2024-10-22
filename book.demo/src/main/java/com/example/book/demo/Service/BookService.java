package com.example.book.demo.Service;

import com.example.book.demo.Repository.BookRepository;
import com.example.book.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void createBook(Book newBook) throws IllegalArgumentException {
        if (newBook == null) return;
        try {
            bookRepository.save(newBook);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void updateBook(String ISBN, Book newBook) throws IllegalArgumentException {
        Optional<Book> bookOptional = bookRepository.findById(ISBN);
        if (bookOptional.isPresent()) {
            Book book = bookOptional.get();
            book.setTitle(newBook.getTitle());
            book.setISBN(newBook.getISBN());
            book.setLanguage(newBook.getLanguage());
            book.setSubject(newBook.getSubject());
            book.setPublisher(newBook.getPublisher());
            book.setNumberOfPage(newBook.getNumberOfPage());
            bookRepository.save(book);
        } else {
            throw new RuntimeException("Cannot update the book");
        }
    }

    public Optional<Book> getBook(String ISBN) throws IllegalArgumentException {
        return bookRepository.findById(ISBN);
    }

    public void deleteBook(String isbn) {
    }
}
