package com.example.librarymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// main entry point for spring boot
// note for self: It uses the @SpringBootApplication annotation which is a combination of @Configuration, @EnableAutoConfiguration, and @ComponentScan annotations
// note for self: objectoriented design - polymorphism through springboots dependency injection
@SpringBootApplication
public class LibraryManagementApplication {

    public static void main(String[] args) {
        // run the spring boot app
        SpringApplication.run(LibraryManagementApplication.class, args);
    }
}
