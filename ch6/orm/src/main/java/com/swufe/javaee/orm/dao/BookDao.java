package com.swufe.javaee.orm.dao;

import com.swufe.javaee.orm.entity.Book;
import com.swufe.javaee.orm.util.DBUtil;
import org.hibernate.Session;

import java.util.List;

public class BookDao {
    public void addBook(Book book) {
        try (Session session = DBUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(book);
            session.getTransaction().commit();
        }
    }

    public List<Book> getBooks() {
        try (Session session = DBUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            List<Book> result = (List<Book>) session.createQuery("from Book").list();
            session.getTransaction().commit();
            return result;
        }
    }
}
