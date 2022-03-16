package com.example.springapplication.services;

import com.example.springapplication.entity.Book;
import com.example.springapplication.vo.BookVO;

import java.util.List;

public interface BookService {

    public BookVO mapToVo (Book book);

    List<BookVO> getBooks();

    void addBook(BookVO book);

    Book mapFromVo(BookVO bookVO);
}
