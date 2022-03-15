package com.example.springapplication.services;

import com.example.springapplication.entity.Author;
import com.example.springapplication.vo.AuthorVO;

import java.util.List;

public interface AuthorService {

    AuthorVO mapToVo (Author author);

    List<AuthorVO> getAuthors();

    AuthorVO getAuthor(Long authorId);

    void addAuthor(AuthorVO authorVO);
}
