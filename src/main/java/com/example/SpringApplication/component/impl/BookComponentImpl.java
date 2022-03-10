package com.example.SpringApplication.component.impl;

import com.example.SpringApplication.component.BookComponent;
import com.example.SpringApplication.dao.AuthorDao;
import com.example.SpringApplication.dao.BookDAO;
import com.example.SpringApplication.vo.AuthorVO;
import com.example.SpringApplication.vo.BookVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookComponentImpl implements BookComponent {

    @Autowired
    private BookDAO bookDAO;

    public List<BookVO> getBooks() {
        return bookDAO.getBooks();
    }
}
