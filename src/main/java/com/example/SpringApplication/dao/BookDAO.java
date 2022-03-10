package com.example.SpringApplication.dao;

import com.example.SpringApplication.vo.AuthorVO;
import com.example.SpringApplication.vo.BookVO;

import java.util.List;

public interface BookDAO {

    List<BookVO> getBooks();
}
