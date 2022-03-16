package com.example.springapplication.services.impl;

import com.example.springapplication.entity.Author;
import com.example.springapplication.repository.AuthorRepository;
import com.example.springapplication.services.AuthorService;
import com.example.springapplication.vo.AuthorVO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
@Transactional
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<AuthorVO> getAuthors(){
        return authorRepository.findAll()
                .stream()
                .map(this::mapToVo)
                .collect(Collectors.toList());
    }

    @Override
    public AuthorVO getAuthor(Long authorId) {

        return this.mapToVo(authorRepository.
                findById(authorId)
                .get());
    }

    @Override
    public void addAuthor(AuthorVO authorVO){
        authorRepository.save(this.mapFromVo(authorVO));
    }

    public AuthorVO mapToVo (Author author) {

        return AuthorVO.builder()
                .id(author.getId())
                .firstname(author.getFirstname())
                .lastname(author.getLastname())
                .build();
    }

    public Author mapFromVo (AuthorVO authorVO){
        return Author.builder()
                .firstname(authorVO.getFirstname())
                .lastname(authorVO.getLastname())
                .build();
    }

}
