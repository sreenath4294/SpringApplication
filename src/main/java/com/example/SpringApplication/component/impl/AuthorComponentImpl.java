package com.example.SpringApplication.component.impl;

import com.example.SpringApplication.component.AuthorComponent;
import com.example.SpringApplication.dao.AuthorDao;
import com.example.SpringApplication.vo.AuthorVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorComponentImpl implements AuthorComponent {

    @Autowired
    private AuthorDao authorDAO;

    public List<AuthorVO> getAuthors(){
        return authorDAO.getAuthors();
    }

//    public void addAuthor(AuthorVO authorVO){
//        authorDAO.addAuthor(authorVO);
//    }
//
//    public AuthorVO getAuthor(Long authorId) {
//        return authorDAO.getAuthor(authorId);
//    }
//
//    public void deleteAuthor(Long id){
//        authorDAO.deleteAuthor(id);
//    }
}
