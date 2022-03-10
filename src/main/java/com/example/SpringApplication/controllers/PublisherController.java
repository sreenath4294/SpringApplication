package com.example.SpringApplication.controllers;

import com.example.SpringApplication.vo.PublisherVO;
import com.example.SpringApplication.services.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class PublisherController {

    @Autowired
    public PublisherService publisherService;


    @GetMapping("/publishers")
    public List<PublisherVO> getPublishers(){
        return publisherService.getPublishers();
    }

//    @PostMapping("/addpublisher")
//    public void addPublisher(@RequestBody PublisherVO publisher){
//        publisherService.addPublisher(publisher);
//    }
}
