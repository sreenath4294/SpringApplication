package com.example.SpringApplication.controllers;

import com.example.SpringApplication.model.Book;
import com.example.SpringApplication.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    public final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping("/addbook/{book}")
    public void addBook(@PathVariable Book book){
        bookService.addBook(book);
    }
}
