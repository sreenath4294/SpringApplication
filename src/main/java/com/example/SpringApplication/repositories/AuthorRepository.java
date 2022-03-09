package com.example.SpringApplication.repositories;

import com.example.SpringApplication.vo.AuthorVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorVO, Long> {

}
