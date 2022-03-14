package com.example.SpringApplication.controllers;

import com.example.SpringApplication.entity.Author;
import com.example.SpringApplication.services.AuthorService;
import com.example.SpringApplication.vo.AuthorVO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AuthorControllerTest {

    @Test
    @DisplayName("To get an author by the given Id")
    void getAuthorById() {
        AuthorService authorService = null;
//        Assertions.assertFalse(authorService.getAuthor(4L));
    }
}