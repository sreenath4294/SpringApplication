package com.example.SpringApplication.services;

import com.example.SpringApplication.model.Author;
import com.example.SpringApplication.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
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
