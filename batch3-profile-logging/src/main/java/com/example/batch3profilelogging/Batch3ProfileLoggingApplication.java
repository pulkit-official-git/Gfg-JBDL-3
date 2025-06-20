package com.example.batch3profilelogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Batch3ProfileLoggingApplication implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(Batch3ProfileLoggingApplication.class);

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${library.books.count}")
    private int booksCount;

    public static void main(String[] args) {
        SpringApplication.run(Batch3ProfileLoggingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("Hello World!" + "thread name" + Thread.currentThread().getName());
//        System.out.println("url: " + url);
//        System.out.println("booksCount: " + booksCount);
        logger.info("booksCount: {} ",booksCount);
        logger.error("booksCount: {} ",booksCount);
    }
}

//beta gamma prod
//staging pre prod prod
