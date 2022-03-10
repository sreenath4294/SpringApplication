package com.example.SpringApplication.services;

import com.example.SpringApplication.vo.BookVO;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public interface BookService {

    List<BookVO> getBooks();

//    void addBook(BookVO book);
}
