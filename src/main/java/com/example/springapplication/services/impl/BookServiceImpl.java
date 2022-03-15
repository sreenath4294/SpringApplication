package com.example.springapplication.services.impl;

import com.example.springapplication.entity.Book;
import com.example.springapplication.repository.BookRepository;
import com.example.springapplication.services.BookService;
import com.example.springapplication.services.PublisherService;
import com.example.springapplication.vo.BookVO;
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

    @Autowired
    private PublisherService publisherService;

    public List<BookVO> getBooks(){
        return bookRepository.findAll()
                .stream()
                .map(this::mapToVo)
                .collect(Collectors.toList());
    }

    public void addBook(BookVO bookVO){
        bookRepository.save(this.mapFromVo(bookVO));
    }

    public BookVO mapToVo (Book book) {

        return BookVO.builder()
                .id(book.getId())
                .title(book.getTitle())
                .isbn(book.getIsbn())
                .publisher(publisherService.mapToVo(book.getPublisher()))
                .build();
    }

    public Book mapFromVo (BookVO bookVO) {

        return  Book.builder()
                .title(bookVO.getTitle())
                .isbn(bookVO.getIsbn())
                .publisher(publisherService.mapFromVo(bookVO.getPublisher()))
                .build();
    }
}
