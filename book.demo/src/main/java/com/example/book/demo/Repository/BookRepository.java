package com.example.book.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.book.demo.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
}
