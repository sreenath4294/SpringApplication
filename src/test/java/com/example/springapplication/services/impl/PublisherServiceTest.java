package com.example.springapplication.services.impl;

import com.example.springapplication.entity.Publisher;
import com.example.springapplication.repository.PublisherRepository;
import com.example.springapplication.services.PublisherService;
import com.example.springapplication.vo.PublisherVO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PublisherServiceTest {

    @Mock
    private PublisherRepository publisherRepositoryTest;
    private PublisherService publisherService;

    @BeforeEach
    void setUp(){
        publisherService = new PublisherServiceImpl(publisherRepositoryTest);
    }

    @Test
    void canAddPublisher(){
        PublisherVO publisherVo = PublisherVO.builder()
                .name("Books")
                .addressLine1("Kochi")
                .addressLine2("Kerala")
                .build();

        publisherService.addPublisher(publisherVo);

        ArgumentCaptor<Publisher> publisherArgumentCaptor = ArgumentCaptor.forClass(Publisher.class);

        verify(publisherRepositoryTest).save(publisherArgumentCaptor.capture());

        Publisher capturedPublisher = publisherArgumentCaptor.getValue();

        assertEquals(capturedPublisher.getName(), publisherVo.getName());
        assertEquals(capturedPublisher.getAddressLine1(), publisherVo.getAddressLine1());
        assertEquals(capturedPublisher.getAddressLine2(), publisherVo.getAddressLine2());
    }

    @Test
    void canGetAuthors(){
        List<PublisherVO> authors = publisherService.getPublishers();
        List<PublisherVO> capturedAuthors = publisherRepositoryTest.findAll()
                .stream()
                .map(publisherService::mapToVo)
                .collect(Collectors.toList());
        assertThat(authors, is(capturedAuthors));
    }

    @Test
    void canMapToVo(){
        Publisher publisher = Publisher.builder()
                .name("Books")
                .addressLine1("Kochi")
                .addressLine2("Kerala")
                .build();

        PublisherVO publisherVO = PublisherVO.builder()
                .name("Books")
                .addressLine1("Kochi")
                .addressLine2("Kerala")
                .build();

        PublisherVO mappedPublisherVo = publisherService.mapToVo(publisher);

        assertEquals(mappedPublisherVo, publisherVO);

    }

    @Test
    void canMapFromVo(){
        Publisher publisher = Publisher.builder()
                .name("Books")
                .addressLine1("Kochi")
                .addressLine2("Kerala")
                .build();

        PublisherVO publisherVO = PublisherVO.builder()
                .name("Books")
                .addressLine1("Kochi")
                .addressLine2("Kerala")
                .build();

        Publisher mappedPublisher = publisherService.mapFromVo(publisherVO);

        assertEquals(mappedPublisher, publisher);

    }
}