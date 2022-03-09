package com.example.SpringApplication.controllers;

import com.example.SpringApplication.vo.AuthorVO;
import com.example.SpringApplication.services.AuthorService;
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

    @DeleteMapping("/delauthor/{authorId}")
    public void deleteAuthor(@PathVariable("authorId") Long id){
        authorService.deleteAuthor(id);
    }

    @PostMapping("/addauthor")
    public void addAuthor(@RequestBody AuthorVO author){
        authorService.addAuthor(author);
    }
}
