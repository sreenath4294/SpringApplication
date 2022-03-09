package com.example.SpringApplication.controllers;

import com.example.SpringApplication.vo.Author;
import com.example.SpringApplication.services.impl.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class AuthorController {

    public final AuthorServiceImpl authorService;

    @Autowired
    public AuthorController(AuthorServiceImpl authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public List<Author> getAuthors(){
        return authorService.getAuthors();
    }

    @GetMapping("/author/{authorId}")
    public Author getAuthor(@PathVariable Long authorId){
        return authorService.getAuthor(authorId);
    }

    @DeleteMapping("/delauthor/{authorId}")
    public void deleteAuthor(@PathVariable("authorId") Long id){
        authorService.deleteAuthor(id);
    }

    @PostMapping("/addauthor")
    public void addAuthor(@RequestBody Author author){
        authorService.addAuthor(author);
    }
}
