package com.example.SpringApplication.services;

import com.example.SpringApplication.entity.Book;
import com.example.SpringApplication.vo.BookVO;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public interface BookService {

    public BookVO mapToVo (Book book);

    List<BookVO> getBooks();


    void addBook(BookVO book);
}
