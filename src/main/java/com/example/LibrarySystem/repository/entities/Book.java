package com.example.LibrarySystem.repository.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Book {
    private @Id @GeneratedValue Long Id;
    private String bookName;
    private String bookSubject;
    private String bookDescription;

    public Book() {}
    public Book(String bookName, String bookSubject, String bookDescription) {
        this.bookName = bookName;
        this.bookSubject = bookSubject;
        this.bookDescription = bookDescription;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(Id, book.Id) &&
                Objects.equals(bookName, book.bookName) &&
                Objects.equals(bookSubject, book.bookSubject) &&
                Objects.equals(bookDescription, book.bookDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, bookName, bookSubject, bookDescription);
    }
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookSubject() {
        return bookSubject;
    }

    public void setBookSubject(String bookSubject) {
        this.bookSubject = bookSubject;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + Id +
                ", bookName='" + bookName + '\'' +
                ", bookSubject='" + bookSubject + '\'' +
                ", description='" + bookDescription + '\'' +
                '}';
    }
}
