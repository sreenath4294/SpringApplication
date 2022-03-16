package com.example.springapplication.services.impl;

import com.example.springapplication.entity.Book;
import com.example.springapplication.repository.BookRepository;
import com.example.springapplication.services.BookService;
import com.example.springapplication.vo.AuthorVO;
import com.example.springapplication.vo.BookVO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
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
        BookVO bookVO = BookVO.builder()
                .title("Harrry potter")
                .isbn("96824")
                .build();

        bookService.addBook(bookVO);

        ArgumentCaptor<Book> bookArgumentCaptor = ArgumentCaptor.forClass(Book.class);

        verify(bookRepositorytest).save(bookArgumentCaptor.capture());

        Book capturedBook = bookArgumentCaptor.getValue();

        assertEquals(capturedBook.getTitle(), bookVO.getTitle());
        assertEquals(capturedBook.getIsbn(), bookVO.getIsbn());
    }

    @Test
    void canGetBooks(){
        List<BookVO> authors = bookService.getBooks();
        List<BookVO> capturedAuthors = bookRepositorytest.findAll()
                .stream()
                .map(bookService::mapToVo)
                .collect(Collectors.toList());
        assertThat(authors, is(capturedAuthors));
    }

    @Test
    void canMapToVo(){
        Book book = Book.builder()
                .title("Harrry potter")
                .isbn("96824")
                .build();

        BookVO bookVo = BookVO.builder()
                .title("Harrry potter")
                .isbn("96824")
                .build();

        BookVO mappedAuthorVO = bookService.mapToVo(book);

        assertEquals(mappedAuthorVO, bookVo);

    }

    @Test
    void canMapFromVo(){
        Book book = Book.builder()
                .title("Harrry potter")
                .isbn("96824")
                .build();

        BookVO bookVO = BookVO.builder()
                .title("Harrry potter")
                .isbn("96824")
                .build();

        Book mappedBook = bookService.mapFromVo(bookVO);

        assertEquals(mappedBook, book);

    }

}