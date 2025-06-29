package com.example.batch3lombokjdbc.models;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    private Integer id;

//    private String externalId;
//
//    public void setExternalId(String externalId) {
//        this.externalId = "book::"+externalId;
//    }

    private String name;

    private String author;

    private String authorEmail;

    private Genre genre;

    private Date createdOn;

    private Date updatedOn;


}
