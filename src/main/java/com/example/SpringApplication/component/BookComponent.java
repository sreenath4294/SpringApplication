package com.example.SpringApplication.component;

import com.example.SpringApplication.vo.BookVO;
import org.springframework.stereotype.Component;

import java.util.List;

public interface BookComponent {

    List<BookVO> getBooks();
}
