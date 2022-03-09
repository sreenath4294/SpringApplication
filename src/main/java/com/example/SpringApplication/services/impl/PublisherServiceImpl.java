package com.example.SpringApplication.services.impl;

import com.example.SpringApplication.vo.PublisherVO;
import com.example.SpringApplication.repositories.PublisherRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PublisherServiceImpl {

    private final PublisherRepository publisherRepository;

    public PublisherServiceImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    public List<PublisherVO> getPublishers(){
        return publisherRepository.findAll();
    }

    public void addPublisher(PublisherVO publisher){
        publisherRepository.save(publisher);
    }
}
