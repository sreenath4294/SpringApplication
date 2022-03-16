package com.example.springapplication.services.impl;

import com.example.springapplication.entity.Book;
import com.example.springapplication.repository.BookRepository;
import com.example.springapplication.services.BookService;
import com.example.springapplication.vo.BookVO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {

    @Mock
    private BookRepository bookRepositorytest;
    private BookService bookService;

    @BeforeEach
    void setUp(){
        bookService = new BookServiceImpl(bookRepositorytest);
    }

    @Test
    void canAddAuthor(){
        Book book = Book.builder()
                .title("Harrry potter")
                .isbn("96824")
                .build();

        bookRepositorytest.save(book);

        ArgumentCaptor<Book> bookArgumentCaptor = ArgumentCaptor.forClass(Book.class);

        verify(bookRepositorytest).save(bookArgumentCaptor.capture());

        Book capturedBook = bookArgumentCaptor.getValue();

        assertSame(capturedBook, book);
    }


    @Test
    void getVoFromMapToVo(){
        Book book = Book.builder()
                .title("Harrry potter")
                .isbn("96824")
                .build();

        BookVO bookVo = BookVO.builder()
                .title("Harrry potter")
                .isbn("96824")
                .build();

        BookVO mappedAuthorVO = bookService.mapToVo(book);

        assertEquals(mappedAuthorVO.getTitle(), bookVo.getTitle());

    }

    @Test
    void getVoFromMapFromVo(){
        Book book = Book.builder()
                .title("Harrry potter")
                .isbn("96824")
                .build();

        BookVO bookVO = BookVO.builder()
                .title("Harrry potter")
                .isbn("96824")
                .build();

        Book mappedBook = bookService.mapFromVo(bookVO);

        assertEquals(mappedBook.getTitle(), book.getTitle());

    }

}