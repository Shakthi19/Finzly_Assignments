package com.library;

import com.library.model.Book;
import com.library.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class LibraryManagementApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            // Add a new book
            Book newBook = new Book();
            newBook.setId(1);
            newBook.setTitle("DBMS");
            newBook.setAuthor("JAMES");
            newBook.setPublicationYear(2020);
            newBook.setIsbn("55555555");
            session.save(newBook);

            // Retrieve all books
            List<Book> books = session.createQuery("FROM Book").list();
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle() +
                        ", Author: " + book.getAuthor() +
                        ", Year: " + book.getPublicationYear() +
                        ", ISBN: " + book.getIsbn());
            }

            // Update book details
            Book bookToUpdate = session.get(Book.class, 2); // assuming you have a book with ID 1
            if (bookToUpdate != null) {
                bookToUpdate.setTitle("Updated Book Title");
                session.update(bookToUpdate);
            }

            // Delete a book
            Book bookToDelete = session.get(Book.class, 2); // assuming you have a book with ID 2
            if (bookToDelete != null) {
                session.delete(bookToDelete);
            }

            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            HibernateUtil.shutdown();
        }
    }
}
