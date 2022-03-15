package com.example.springapplication.services;

import com.example.springapplication.entity.Publisher;
import com.example.springapplication.vo.PublisherVO;

import java.util.List;

public interface PublisherService {

    PublisherVO mapToVo (Publisher publisher);

    Publisher mapFromVo(PublisherVO publisherVO);

    List<PublisherVO> getPublishers();

    void addPublisher(PublisherVO publisher);
}
