package com.example.librarymanagement.service;

import com.example.librarymanagement.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// this class handles logic for managing books
@Service
public class LibraryService {

    // using a list to store books
    // note for self complex data structures here we use ArrayLists to store books
    private List<Book> books = new ArrayList<>();

    // get all books
    public List<Book> getAllBooks() {
        return new ArrayList<>(books); // using ArrayList
    }

    // get book by ISBN
    // note for self functions here we define a function, have parameters, return a type
    public Optional<Book> getBookByIsbn(String isbn) {
        return books.stream().filter(book -> book.getIsbn().equals(isbn)).findFirst();
    }

    // add book
    public void addBook(Book book) {
        books.add(book); // using ArrayList
    }

    // remove a book by ISBN
    // note for self control structures here we use lambda expression
    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn)); // using ArrayList
    }
}
