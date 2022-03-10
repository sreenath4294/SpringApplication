package com.example.SpringApplication.component.impl;

import com.example.SpringApplication.component.PublisherComponent;
import com.example.SpringApplication.dao.BookDAO;
import com.example.SpringApplication.dao.PublisherDAO;
import com.example.SpringApplication.vo.BookVO;
import com.example.SpringApplication.vo.PublisherVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PublisherComponentImpl implements PublisherComponent {

    @Autowired
    private PublisherDAO publisherDAO;

    public List<PublisherVO> getPublishers() {
        return publisherDAO.getPublishers();
    }
}
