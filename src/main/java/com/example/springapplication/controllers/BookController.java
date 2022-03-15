package com.example.springapplication.controllers;

import com.example.springapplication.vo.BookVO;
import com.example.springapplication.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class BookController {

    @Autowired
    public BookService bookService;

    @GetMapping("/books")
    public List<BookVO> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping("/addbook")
    public void addBook(@RequestBody BookVO book){
        bookService.addBook(book);
    }
}
