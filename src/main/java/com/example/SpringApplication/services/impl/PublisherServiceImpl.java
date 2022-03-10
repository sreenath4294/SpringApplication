package com.example.SpringApplication.services.impl;

import com.example.SpringApplication.component.PublisherComponent;
import com.example.SpringApplication.services.PublisherService;
import com.example.SpringApplication.vo.PublisherVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class PublisherServiceImpl implements PublisherService {

    @Autowired
    private PublisherComponent publisherComponent;

    public List<PublisherVO> getPublishers(){
        return publisherComponent.getPublishers();
    }

//    public void addPublisher(PublisherVO publisher){
//        publisherRepository.save(publisher);
//    }
}
