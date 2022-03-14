package com.example.SpringApplication.services.impl;

import com.example.SpringApplication.entity.Book;
import com.example.SpringApplication.repository.BookRepository;
import com.example.SpringApplication.services.BookService;
import com.example.SpringApplication.vo.BookVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<BookVO> getBooks(){
        return ((List<BookVO>) bookRepository.findAll()
                .stream()
                .map(this::mapToVo)
                .collect(Collectors.toList()));
    }

    public void addBook(BookVO bookVO){
        bookRepository.save(this.mapFromVo(bookVO));
    }

    public BookVO mapToVo (Book book) {

        BookVO bookVo = new BookVO();

        bookVo.setId(book.getId());
        bookVo.setTitle(book.getTitle());
        bookVo.setIsbn(book.getIsbn());

        return bookVo;
    }

    public Book mapFromVo (BookVO bookVO) {

        Book book = new Book();

        book.setId(bookVO.getId());
        book.setTitle(bookVO.getTitle());
        book.setIsbn(bookVO.getIsbn());

        return book;
    }
}
