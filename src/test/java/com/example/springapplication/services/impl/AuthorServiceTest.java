package com.example.springapplication.services.impl;

import com.example.springapplication.entity.Author;
import com.example.springapplication.repository.AuthorRepository;
import com.example.springapplication.services.AuthorService;
import com.example.springapplication.vo.AuthorVO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class AuthorServiceTest {

    @Mock
    private AuthorRepository authorRepositorytest;
    private AuthorService authorService;

    @BeforeEach
    void setUp(){
        authorService = new AuthorServiceImpl(authorRepositorytest);
    }

    @Test
    void canAddAuthor(){
        AuthorVO authorVO = AuthorVO.builder()
                .id(1L)
                .firstname("John")
                .lastname("Honai")
                .build();

        authorService.addAuthor(authorVO);

        ArgumentCaptor<Author> authorArgumentCaptor = ArgumentCaptor.forClass(Author.class);

        verify(authorRepositorytest).save(authorArgumentCaptor.capture());

        Author capturedAuthor = authorArgumentCaptor.getValue();

        assertEquals(capturedAuthor.getFirstname(), authorVO.getFirstname());
        assertEquals(capturedAuthor.getLastname(), authorVO.getLastname());
    }

    @Test
    void canGetAuthors(){
        List<AuthorVO> authors = authorService.getAuthors();
        List<AuthorVO> capturedAuthors = authorRepositorytest.findAll()
                .stream()
                .map(authorService::mapToVo)
                .collect(Collectors.toList());
        assertThat(authors, is(capturedAuthors));
    }

    @Test
    void canMapToVo(){
        Author author = Author.builder()
                .firstname("John")
                .lastname("Honai")
                .build();

        AuthorVO authorVO = AuthorVO.builder()
                .firstname("John")
                .lastname("Honai")
                .build();

        AuthorVO mappedAuthorVO = authorService.mapToVo(author);

        assertEquals(mappedAuthorVO, authorVO);

    }

    @Test
    void canMapFromVo(){
        Author author = Author.builder()
                .firstname("John")
                .lastname("Honai")
                .build();

        AuthorVO authorVO = AuthorVO.builder()
                .firstname("John")
                .lastname("Honai")
                .build();

        Author mappedAuthor = authorService.mapFromVo(authorVO);

        assertEquals(mappedAuthor, author);

    }
}