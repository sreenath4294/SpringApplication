package com.example.SpringApplication.services;

import com.example.SpringApplication.model.Publisher;
import com.example.SpringApplication.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Service
public class PublisherService {

    private final PublisherRepository publisherRepository;

    public PublisherService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    public List<Publisher> getPublishers(){
        return publisherRepository.findAll();
    }

    public void addPublisher(Publisher publisher){
        publisherRepository.save(publisher);
    }
}
