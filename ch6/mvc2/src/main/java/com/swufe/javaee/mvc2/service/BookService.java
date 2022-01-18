package com.swufe.javaee.mvc2.service;

import com.swufe.javaee.mvc2.dao.BookDao;
import com.swufe.javaee.mvc2.entity.Book;
import com.swufe.javaee.mvc2.util.DBUtil;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {
    private BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public BookService() {
        this.bookDao = new BookDao();
    }

    public List<Book> getBooksOnNewYear() throws SQLException, ClassNotFoundException {
        List<Book> books = bookDao.getAllBooks();
        return books.stream().map(book -> {
            if (book.getPrice() > 20.0) {
                return new Book(book.getTitle(), book.getPrice() * 0.9);
            }
            return book;
        }).collect(Collectors.toList());
    }
}
