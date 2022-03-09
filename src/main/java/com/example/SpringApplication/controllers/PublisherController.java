package com.example.SpringApplication.controllers;

import com.example.SpringApplication.vo.Publisher;
import com.example.SpringApplication.services.impl.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class PublisherController {

    public final PublisherServiceImpl publisherService;

    @Autowired
    public PublisherController(PublisherServiceImpl publisherService) {
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
