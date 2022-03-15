package com.example.springapplication.services;

import com.example.springapplication.entity.Book;
import com.example.springapplication.vo.BookVO;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public interface BookService {

    public BookVO mapToVo (Book book);

    List<BookVO> getBooks();


    void addBook(BookVO book);
}
