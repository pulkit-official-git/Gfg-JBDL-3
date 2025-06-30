package com.example.batch3jpahibernate.repositories;

import com.example.batch3jpahibernate.models.Book;
import com.example.batch3jpahibernate.models.Genre;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByGenre(Genre genre);

    List<Book> findByGenreOrName(Genre genre, String name);

    @Transactional
    @Modifying
    @Query("update Book b set b.genre = :genre where b.id = :id")
    void updateBook(Integer id, Genre genre);

//    @Query(value = "select * from mybook",nativeQuery = true)
//    List<Book> getAll();

//    @Query(value = "select b from Book b") //JPQL
//    List<Book> getAll();
}
