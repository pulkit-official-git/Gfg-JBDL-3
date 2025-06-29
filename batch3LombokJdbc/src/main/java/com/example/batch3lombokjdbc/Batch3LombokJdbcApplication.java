package com.example.batch3lombokjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Batch3LombokJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(Batch3LombokJdbcApplication.class, args);

//        Book book = new Book();
//        book.setExternalId("123");
//        System.out.println(book);

//        Book book2 = new Book(1,"a@b.com",null,null,"abx",Genre.MATHS,null,null);
//        System.out.println(book2);

//        Book book2 = new Book();
//        book2.setExternalId("123");
//        book2.setAuthor("John Doe");
//        System.out.println(book2);

//        Book book3 =Book
//                .builder()
//                .id(1)
//                .name("Book 3")
//                .author("Author 3")
//                .build();

//        System.out.println(book3);
//         Book.BookBuilder book4 = Book.builder().externalId("456");
//
//         book4.id(5)
//                 .author("posty")
//                 .build();
//         System.out.println(book4);
    }

}
