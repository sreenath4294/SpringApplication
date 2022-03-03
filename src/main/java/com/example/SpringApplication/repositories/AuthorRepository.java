package com.example.SpringApplication.repositories;

import com.example.SpringApplication.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
