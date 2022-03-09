package com.example.SpringApplication.repositories;

import com.example.SpringApplication.vo.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
