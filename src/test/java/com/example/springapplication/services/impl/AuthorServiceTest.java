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
        Author author = Author.builder()
                .firstname("John")
                .lastname("Honai")
                .build();

        authorRepositorytest.save(author);

        ArgumentCaptor<Author> authorArgumentCaptor = ArgumentCaptor.forClass(Author.class);

        verify(authorRepositorytest).save(authorArgumentCaptor.capture());

        Author capturedAuthor = authorArgumentCaptor.getValue();

       assertSame(capturedAuthor, author);
    }

//    @Test
//    void canGetAuthors(){
//        List<AuthorVO> authorVos = authorService.getAuthors();
////        verify(authorRepositorytest.findAll());
//
//        List<Author> capturedAuthors = authorRepositorytest.findAll();
//
//        assertSame(capturedAuthors, authorVos);
//    }

    @Test
    void getVoFromMapToVo(){
        Author author = Author.builder()
                .firstname("John")
                .lastname("Honai")
                .build();

        AuthorVO authorVO = AuthorVO.builder()
                .firstname("John")
                .lastname("Honai")
                .build();

        AuthorVO mappedAuthorVO = authorService.mapToVo(author);

        assertEquals(mappedAuthorVO.getFirstname(), authorVO.getFirstname());

    }

    @Test
    void getVoFromMapFromVo(){
        Author author = Author.builder()
                .firstname("John")
                .lastname("Honai")
                .build();

        AuthorVO authorVO = AuthorVO.builder()
                .firstname("John")
                .lastname("Honai")
                .build();

        Author mappedAuthor = authorService.mapFromVo(authorVO);

        assertEquals(mappedAuthor.getFirstname(), author.getFirstname());

    }
}