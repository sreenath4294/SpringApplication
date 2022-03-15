package com.example.springapplication.controllers;

import com.example.springapplication.vo.PublisherVO;
import com.example.springapplication.services.PublisherService;
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

    @PostMapping("/addpublisher")
    public void addPublisher(@RequestBody PublisherVO publisher){
        publisherService.addPublisher(publisher);
    }
}
