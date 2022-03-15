package com.example.springapplication.controllers;

import com.example.springapplication.vo.AuthorVO;
import com.example.springapplication.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class AuthorController {

    @Autowired
    public AuthorService authorService;

    @GetMapping("/authors")
    public List<AuthorVO> getAuthors(){
        return authorService.getAuthors();
    }

    @GetMapping("/author/{authorId}")
    public AuthorVO getAuthor(@PathVariable Long authorId){
        return authorService.getAuthor(authorId);
    }
//
//    @DeleteMapping("/delauthor/{authorId}")
//    public void deleteAuthor(@PathVariable("authorId") Long id){
//        authorService.deleteAuthor(id);
//    }

    @PostMapping("/addauthor")
    public void addAuthor(@RequestBody AuthorVO authorVO){
        authorService.addAuthor(authorVO);
    }
}
