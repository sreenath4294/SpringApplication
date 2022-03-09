package com.example.SpringApplication.controllers;

import com.example.SpringApplication.vo.Book;
import com.example.SpringApplication.services.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class BookController {

    public final BookServiceImpl bookService;

    @Autowired
    public BookController(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping("/addbook")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }
}
