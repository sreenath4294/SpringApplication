package com.example.SpringApplication.services.impl;

import com.example.SpringApplication.component.BookComponent;
import com.example.SpringApplication.services.BookService;
import com.example.SpringApplication.vo.BookVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookComponent bookComponent;

    public List<BookVO> getBooks(){
        return bookComponent.getBooks();
    }
//
//    public void addBook(BookVO book){
//        bookRepository.save(book);
//    }
}
