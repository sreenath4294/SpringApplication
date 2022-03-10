package com.example.SpringApplication.dao.impl;

import com.example.SpringApplication.dao.BookDAO;
import com.example.SpringApplication.vo.BookVO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookDAOImpl implements BookDAO {


    @Override
    public List<BookVO> getBooks() {
        return null;
    }
}
