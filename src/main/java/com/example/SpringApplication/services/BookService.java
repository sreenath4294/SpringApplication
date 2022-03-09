package com.example.SpringApplication.services;

import com.example.SpringApplication.vo.BookVO;

import java.util.List;

public interface BookService {

    List<BookVO> getBooks();

    void addBook(BookVO book);
}
