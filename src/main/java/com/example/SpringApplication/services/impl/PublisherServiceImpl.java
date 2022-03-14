package com.example.SpringApplication.services.impl;

import com.example.SpringApplication.entity.Publisher;
import com.example.SpringApplication.repository.PublisherRepository;
import com.example.SpringApplication.services.PublisherService;
import com.example.SpringApplication.vo.PublisherVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Transactional
public class PublisherServiceImpl implements PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    public List<PublisherVO> getPublishers(){
        return ((List<PublisherVO>) publisherRepository.findAll()
                .stream()
                .map(this::mapToVo)
                .collect(Collectors.toList()));
    }

    public void addPublisher(PublisherVO publisher){
        publisherRepository.save(this.mapFromVo(publisher));
    }

    public PublisherVO mapToVo (Publisher publisher) {

        PublisherVO publisherVo = PublisherVO.builder()
                .id(publisher.getId())
                .name(publisher.getName())
                .addressLine1(publisher.getAddressLine1())
                .addressLine2(publisher.getAddressLine2())
                .build();

        return publisherVo;
    }

    public Publisher mapFromVo (PublisherVO publisherVO) {

        Publisher publisher = Publisher.builder()
                .name(publisherVO.getName())
                .addressLine1(publisherVO.getAddressLine1())
                .addressLine2(publisherVO.getAddressLine2())
                .build();

        return publisher;
    }
}
