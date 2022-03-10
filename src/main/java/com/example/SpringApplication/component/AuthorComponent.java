package com.example.SpringApplication.component;

import com.example.SpringApplication.vo.AuthorVO;

import java.util.List;

public interface AuthorComponent {
    
    List<AuthorVO> getAuthors();

//    void addAuthor(AuthorVO authorVO);
//
//    AuthorVO getAuthor(Long authorId);
//
//    void deleteAuthor(Long id);
}
