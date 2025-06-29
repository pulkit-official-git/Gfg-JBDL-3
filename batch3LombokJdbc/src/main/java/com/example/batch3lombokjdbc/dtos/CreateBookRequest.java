package com.example.batch3lombokjdbc.dtos;

import com.example.batch3lombokjdbc.models.Book;
import com.example.batch3lombokjdbc.models.Genre;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

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
    private String authorEmail;

    private Genre genre;

    public Book toBook(){
        return Book
                .builder()
                .name(name)
                .author(author)
                .authorEmail(authorEmail)
                .genre(genre)
                .createdOn(new Date())
                .updatedOn(new Date())
                .build();
    }
}
