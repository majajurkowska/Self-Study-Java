package com.example.librarymanagement.model;

import java.io.Serializable;

// represents a book in the app
// note for self: Data Types - Non-primitive data types (Classes)
// note for self: Object-Oriented Design - Encapsulation
public class Book implements Serializable {
    private String title;  // string data type
    private String author;
    private String isbn;

    // default constructor
    // note for self: constructors are special functions
    public Book() {
    }

    // parameterized constructor
    // note for self: another constructor with parameters
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // getters and setters for encapsulation
    // note for self: these methods allow us to access and modify private variables
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Overriding the toString() method
    // note for self: this method helps to print the book details nicely
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
