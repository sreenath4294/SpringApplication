package com.example.SpringApplication.services;

import com.example.SpringApplication.entity.Author;
import com.example.SpringApplication.vo.AuthorVO;

import java.util.List;

public interface AuthorService {

    AuthorVO mapToVo (Author author);

    List<AuthorVO> getAuthors();

    AuthorVO getAuthor(Long authorId);

//    void deleteAuthor(Long id);

    void addAuthor(AuthorVO authorVO);
}
