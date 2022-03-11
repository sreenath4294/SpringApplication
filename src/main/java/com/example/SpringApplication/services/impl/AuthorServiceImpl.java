package com.example.SpringApplication.services.impl;

import com.example.SpringApplication.entity.Author;
import com.example.SpringApplication.repository.AuthorRepository;
import com.example.SpringApplication.services.AuthorService;
import com.example.SpringApplication.vo.AuthorVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@Transactional
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<AuthorVO> getAuthors(){
        return ((List<AuthorVO>) authorRepository.findAll()
                .stream()
                .map(this::mapToVo)
                .collect(Collectors.toList()));
    }

    @Override
    public AuthorVO getAuthor(Long authorId) {
       return this.mapToVo(authorRepository.findById(authorId).get());
    }

    @Override
    public void addAuthor(AuthorVO authorVO){
        authorRepository.save(this.mapFromVo(authorVO));
    }

    public AuthorVO mapToVo (Author author) {

        AuthorVO authorVO = new AuthorVO();

        authorVO.setId(author.getId());
        authorVO.setFirstname(author.getFirstname());
        authorVO.setLastname(author.getLastname());
//        authorVO.setBooks(author.getBooks());

        return authorVO;
    }

    public Author mapFromVo (AuthorVO authorVO){
        Author author = new Author();

        author.setFirstname(authorVO.getFirstname());
        author.setLastname(authorVO.getLastname());
        return author;
    }

//    public void deleteAuthor(Long id){
//        authorComponent.deleteAuthor(id);
//    }
}
