package com.example.SpringApplication.controllers;

import com.example.SpringApplication.model.Publisher;
import com.example.SpringApplication.repositories.AuthorRepository;
import com.example.SpringApplication.repositories.PublisherRepository;
import com.example.SpringApplication.services.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
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

    @PostMapping("/addpublisher")
    public void addPublisher(@RequestBody Publisher publisher){
        publisherService.addPublisher(publisher);
    }
}
