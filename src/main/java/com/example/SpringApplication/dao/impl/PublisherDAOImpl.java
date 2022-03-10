package com.example.SpringApplication.dao.impl;

import com.example.SpringApplication.dao.PublisherDAO;
import com.example.SpringApplication.vo.PublisherVO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PublisherDAOImpl implements PublisherDAO {

    @Override
    public List<PublisherVO> getPublishers() {
        return null;
    }
}
