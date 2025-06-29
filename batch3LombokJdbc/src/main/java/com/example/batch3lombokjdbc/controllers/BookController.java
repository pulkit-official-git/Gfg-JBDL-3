package com.example.batch3lombokjdbc.controllers;

import com.example.batch3lombokjdbc.dtos.CreateBookRequest;
import com.example.batch3lombokjdbc.models.Book;
import com.example.batch3lombokjdbc.services.BookService;
import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/create")
    public void createBook(@Valid @RequestBody CreateBookRequest createBookRequest) throws SQLException {
        this.bookService.createBook(createBookRequest.toBook());
    }

    @GetMapping("/all")
    public List<Book> getAllBooks() throws SQLException{
        return this.bookService.getAll();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) throws SQLException{
        return this.bookService.getById(id);
    }
}
