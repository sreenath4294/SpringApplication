package com.example.SpringApplication.services;

import com.example.SpringApplication.entity.Publisher;
import com.example.SpringApplication.vo.PublisherVO;

import java.util.List;

public interface PublisherService {

    PublisherVO mapToVo (Publisher publisher);

    List<PublisherVO> getPublishers();

//    void addPublisher(PublisherVO publisher);
}
