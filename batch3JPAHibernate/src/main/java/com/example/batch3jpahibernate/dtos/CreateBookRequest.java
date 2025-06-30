package com.example.batch3jpahibernate.dtos;

import com.example.batch3jpahibernate.models.Book;
import com.example.batch3jpahibernate.models.Genre;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateBookRequest {

    private String name;

    @Length(max = 500)
    private String author;

    @NotBlank
    @Email
    private String authorEmail;

    private Genre genre;

    public Book toBook(){
        return Book
                .builder()
                .name(name)
                .author(author)
                .authorEmail(authorEmail)
                .genre(genre)
                .build();
    }
}