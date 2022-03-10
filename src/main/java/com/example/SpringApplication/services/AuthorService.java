package com.example.SpringApplication.services;

import com.example.SpringApplication.vo.AuthorVO;

import java.util.List;

public interface AuthorService {
    
    List<AuthorVO> getAuthors();

//    AuthorVO getAuthor(Long authorId);
//
//    void deleteAuthor(Long id);
//
//    void addAuthor(AuthorVO authorVO);
}
