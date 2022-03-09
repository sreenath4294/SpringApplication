package com.example.SpringApplication.dao.impl;

import com.example.SpringApplication.dao.AuthorDao;
import com.example.SpringApplication.vo.AuthorVO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorDaoImpl implements AuthorDao {

    @Override
    public List<AuthorVO> getAuthors() {
        return null;
    }

    @Override
    public void addAuthor(AuthorVO author) {

    }

    @Override
    public AuthorVO getAuthor(Long authorId) {
        return null;
    }

    @Override
    public void deleteAuthor(Long id) {

    }
}
