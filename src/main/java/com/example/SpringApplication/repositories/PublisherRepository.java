package com.example.SpringApplication.repositories;

import com.example.SpringApplication.vo.PublisherVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<PublisherVO, Long> {
}
