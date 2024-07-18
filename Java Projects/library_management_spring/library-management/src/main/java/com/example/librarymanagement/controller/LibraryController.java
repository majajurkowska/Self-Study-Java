package com.example.librarymanagement.controller;

import com.example.librarymanagement.model.Book;
import com.example.librarymanagement.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// handle HTTP requests here
@RestController
@RequestMapping("/api/books")
public class LibraryController {

    // not for self annotations here use annotations (@RestController, @RequestMapping, @Autowired)
    // also use object oriented Design( Abstraction, Encapsulation, Polymorphism)

    @Autowired
    private LibraryService libraryService;

    // get all books
    // note for self functions here we define a function, return a type
    @GetMapping
    public List<Book> getAllBooks() {
        return libraryService.getAllBooks();
    }

    // get book by ISBN
    // note for self functions here we have a function with a parameter
    @GetMapping("/{isbn}")
    public ResponseEntity<Book> getBookByIsbn(@PathVariable String isbn) {
        Optional<Book> book = libraryService.getBookByIsbn(isbn);
        // note for myself - control structures: we are using Optional's map and orElseGet methods as alternatives to if statements
        return book.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // adding new book
    @PostMapping
    public void addBook(@RequestBody Book book) {
        libraryService.addBook(book);
    }

    // remove book by ISBN
    @DeleteMapping("/{isbn}")
    public void removeBook(@PathVariable String isbn) {
        libraryService.removeBook(isbn);
    }
}
