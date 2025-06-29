package com.example.batch3lombokjdbc.repositories;

import com.example.batch3lombokjdbc.models.Book;
import com.example.batch3lombokjdbc.models.Genre;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    Connection connection;

    private String url;
    private String username;
    private String password;

    public BookRepository(@Value("${db.url}") String url, @Value("${db.username}") String username, @Value("${db.password}") String password) throws SQLException {
        this.url = url;
        this.username = username;
        this.password = password;
        createTable();
    }

    private Connection getConnection() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(this.url,this.username,this.password);
        }
        return connection;
    }

    public void createTable() throws SQLException {
        String query = "create table if not exists book" +
                "(id int primary key auto_increment,name varchar(20),authorName varchar(20)," +
                "authorEmail varchar(30) not null,genre varchar(20), createdOn date," +
                " updatedOn date);";

        Statement statement = getConnection().createStatement();
        statement.execute(query);

    }

    public void addBook(Book book) throws SQLException {

        String query = "insert into book(name, authorName, authorEmail, genre, createdOn, updatedOn)" +
                " values (?,?,?,?,?,?)";

        PreparedStatement preparedStatement = getConnection().prepareStatement(query);
//        preparedStatement.setInt(1, book.getId());
        preparedStatement.setString(1, book.getName());
        preparedStatement.setString(2, book.getAuthor());
        preparedStatement.setString(3, book.getAuthorEmail());
        preparedStatement.setString(4,book.getGenre().name());
        preparedStatement.setDate(5,new Date(book.getCreatedOn().getTime()));
        preparedStatement.setDate(6,new Date(book.getUpdatedOn().getTime()));

        preparedStatement.execute();
    }

    public List<Book> getAll() throws SQLException {

        String query = "select * from book;";

        Statement statement = getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        List<Book> books = new ArrayList<>();
        while(resultSet.next()) {
            Book book = new Book();
            book.setId(resultSet.getInt("id"));
            book.setName(resultSet.getString("name"));
            book.setAuthor(resultSet.getString("authorName"));
            book.setAuthorEmail(resultSet.getString("authorEmail"));
            book.setGenre(Enum.valueOf(Genre.class,resultSet.getString("genre")));
            book.setCreatedOn(resultSet.getDate("createdOn"));
            book.setUpdatedOn(resultSet.getDate("updatedOn"));
            books.add(book);
        }
        return books;
    }

    public Book getById(Long id) throws SQLException {
        String query = "select * from book where id = ?;";
        PreparedStatement preparedStatement = getConnection().prepareStatement(query);
        preparedStatement.setLong(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Book book = new Book();
        while(resultSet.next()) {
            book.setId(resultSet.getInt("id"));
            book.setName(resultSet.getString("name"));
            book.setAuthor(resultSet.getString("authorName"));
            book.setAuthorEmail(resultSet.getString("authorEmail"));
            book.setGenre(Enum.valueOf(Genre.class,resultSet.getString("genre")));
            book.setCreatedOn(resultSet.getDate("createdOn"));
            book.setUpdatedOn(resultSet.getDate("updatedOn"));
        }
        return book;
    }
}
