package com.example.batch3lombokjdbc.services;

import com.example.batch3lombokjdbc.models.Book;
import com.example.batch3lombokjdbc.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void createBook(Book book) throws SQLException {
        this.bookRepository.addBook(book);
    }

    public List<Book> getAll() throws SQLException {
        return this.bookRepository.getAll();
    }

    public Book getById(Long id) throws SQLException {
        return this.bookRepository.getById(id);
    }
}
