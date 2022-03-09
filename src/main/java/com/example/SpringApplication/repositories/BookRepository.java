package com.example.SpringApplication.repositories;

import com.example.SpringApplication.vo.BookVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookVO, Long> {

}
