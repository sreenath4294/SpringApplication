package com.example.springapplication.services.impl;

import com.example.springapplication.entity.Publisher;
import com.example.springapplication.repository.PublisherRepository;
import com.example.springapplication.services.PublisherService;
import com.example.springapplication.vo.PublisherVO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
@Transactional
public class PublisherServiceImpl implements PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    public List<PublisherVO> getPublishers(){
        return publisherRepository.findAll()
                .stream()
                .map(this::mapToVo)
                .collect(Collectors.toList());
    }

    public void addPublisher(PublisherVO publisher){
        publisherRepository.save(this.mapFromVo(publisher));
    }

    public PublisherVO mapToVo (Publisher publisher) {

       return PublisherVO.builder()
                .id(publisher.getId())
                .name(publisher.getName())
                .addressLine1(publisher.getAddressLine1())
                .addressLine2(publisher.getAddressLine2())
                .build();
    }

    public Publisher mapFromVo (PublisherVO publisherVO) {

        return Publisher.builder()
                .name(publisherVO.getName())
                .addressLine1(publisherVO.getAddressLine1())
                .addressLine2(publisherVO.getAddressLine2())
                .build();
    }
}
