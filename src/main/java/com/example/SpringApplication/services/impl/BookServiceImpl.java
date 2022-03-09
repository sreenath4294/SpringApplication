package com.example.SpringApplication.services.impl;

import com.example.SpringApplication.vo.Book;
import com.example.SpringApplication.repositories.BookRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookServiceImpl {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    public void addBook(Book book){
        bookRepository.save(book);
    }
}
