package com.example.SpringApplication.controllers;

import com.example.SpringApplication.model.Publisher;
import com.example.SpringApplication.repositories.AuthorRepository;
import com.example.SpringApplication.repositories.PublisherRepository;
import com.example.SpringApplication.services.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PublisherController {

    public final PublisherService publisherService;

    @Autowired
    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @GetMapping("/publishers")
    public List<Publisher> getPublishers(){
        return publisherService.getPublishers();
    }

    @PostMapping("/addpublisher/{publisher}")
    public void addPublisher(@PathVariable Publisher publisher){
        publisherService.addPublisher(publisher);
    }
}
