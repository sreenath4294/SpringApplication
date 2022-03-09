package com.example.SpringApplication.dao;

import com.example.SpringApplication.vo.AuthorVO;

import java.util.List;

public interface AuthorDao {
    
    List<AuthorVO> getAuthors();

    void addAuthor(AuthorVO author);

    AuthorVO getAuthor(Long authorId);

    void deleteAuthor(Long id);
}
