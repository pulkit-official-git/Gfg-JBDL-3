package com.example.batch3jpahibernate.controllers;

import com.example.batch3jpahibernate.dtos.CreateBookRequest;
import com.example.batch3jpahibernate.models.Book;
import com.example.batch3jpahibernate.models.Genre;
import com.example.batch3jpahibernate.services.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/create")
    public void createBook(@Valid @RequestBody CreateBookRequest createBookRequest) {
        this.bookService.createBook(createBookRequest.toBook());
    }

    @GetMapping("/all")
    public List<Book> getAllBooks(){
        return this.bookService.getAll();
    }
//
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Integer id){
        return this.bookService.getById(id);
    }

    @GetMapping("/genre/{genre}")
    public List<Book> getByGenre(@PathVariable Genre genre){
        return this.bookService.getByGenre(genre);
    }

    @GetMapping("/genre/{genre}/name/{name}")
    public List<Book> getByGenreOrName(@PathVariable Genre genre,
                                        @PathVariable String name){
        return this.bookService.getByGenreOrName(genre,name);
    }

    @PatchMapping("/update/{id}/{genre}")
    public void updateBook(@PathVariable Integer id, @PathVariable Genre genre){
        this.bookService.updateBook(id,genre);
    }


//    @DeleteMapping("/del/{id}")
//    public void deleteBook(@PathVariable Integer id){
//        this
//    }


}
