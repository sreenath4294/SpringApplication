package com.example.SpringApplication.services.impl;

import com.example.SpringApplication.component.AuthorComponent;
import com.example.SpringApplication.services.AuthorService;
import com.example.SpringApplication.vo.AuthorVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorComponent authorComponent;

    public List<AuthorVO> getAuthors(){
        return authorComponent.getAuthors();
    }

//    public void addAuthor(AuthorVO authorVO){
//        authorComponent.addAuthor(authorVO);
//    }
//
//    public AuthorVO getAuthor(Long authorId) {
//        return authorComponent.getAuthor(authorId);
//    }
//
//    public void deleteAuthor(Long id){
//        authorComponent.deleteAuthor(id);
//    }
}
