package com.example.SpringApplication.services.impl;

import com.example.SpringApplication.services.AuthorService;
import com.example.SpringApplication.vo.Author;
import com.example.SpringApplication.repositories.AuthorRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAuthors(){
        return authorRepository.findAll();
    }

    public void addAuthor(Author author){
        authorRepository.save(author);
    }

    public Author getAuthor(Long authorId) {
        return authorRepository.findById(authorId).get();
    }

    public void deleteAuthor(Long id){
        authorRepository.deleteById(id);
    }
}
