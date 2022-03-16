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

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PublisherServiceTest {

    @Mock
    private PublisherRepository publisherRepositorytest;
    private PublisherService publisherService;

    @BeforeEach
    void setUp(){
        publisherService = new PublisherServiceImpl(publisherRepositorytest);
    }

    @Test
    void canAddPublisher(){
        Publisher publisher = Publisher.builder()
                .name("Books")
                .addressLine1("Kochi")
                .addressLine2("Kerala")
                .build();

        publisherRepositorytest.save(publisher);

        ArgumentCaptor<Publisher> publisherArgumentCaptor = ArgumentCaptor.forClass(Publisher.class);

        verify(publisherRepositorytest).save(publisherArgumentCaptor.capture());

        Publisher capturedPublisher = publisherArgumentCaptor.getValue();

        assertSame(capturedPublisher, publisher);
    }

    @Test
    void getVoFromMapToVo(){
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

        assertEquals(mappedPublisherVo.getName(), publisherVO.getName());

    }

    @Test
    void getVoFromMapFromVo(){
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

        assertEquals(mappedPublisher.getName(), publisher.getName());

    }
}