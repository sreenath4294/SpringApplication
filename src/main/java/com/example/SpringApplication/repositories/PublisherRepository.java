package com.example.SpringApplication.repositories;

import com.example.SpringApplication.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
