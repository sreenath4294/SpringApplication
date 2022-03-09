package com.example.SpringApplication.services.impl;

import com.example.SpringApplication.vo.Publisher;
import com.example.SpringApplication.repositories.PublisherRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PublisherServiceImpl {

    private final PublisherRepository publisherRepository;

    public PublisherServiceImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    public List<Publisher> getPublishers(){
        return publisherRepository.findAll();
    }

    public void addPublisher(Publisher publisher){
        publisherRepository.save(publisher);
    }
}
