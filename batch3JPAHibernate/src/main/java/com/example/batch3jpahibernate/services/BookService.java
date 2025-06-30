package com.example.batch3jpahibernate.services;

import com.example.batch3jpahibernate.models.Book;
import com.example.batch3jpahibernate.models.Genre;
import com.example.batch3jpahibernate.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void createBook(Book book) {
        this.bookRepository.save(book);
    }

    public List<Book> getAll() {
        return this.bookRepository.findAll();
    }
//
    public Book getById(Integer id) {
        return this.bookRepository.findById(id).orElse(null);
    }

    public List<Book> getByGenre(Genre genre) {
        return this.bookRepository.findByGenre(genre);
    }

    public List<Book> getByGenreOrName(Genre genre, String name) {
        return this.bookRepository.findByGenreOrName(genre,name);
    }

    public void updateBook(Integer id, Genre genre) {
        Book book =this.bookRepository.findById(id).orElse(null);
        if(book!=null){
            this.bookRepository.updateBook(id,genre);
        }
    }
}
