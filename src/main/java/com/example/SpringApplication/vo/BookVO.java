package com.example.SpringApplication.vo;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class BookVO implements Serializable {

    private Long id;
    private String title;
    private String isbn;

    private PublisherVO publisher;
    private Set<AuthorVO> authors = new HashSet<>();

    public PublisherVO getPublisher() {
        return publisher;
    }

    public BookVO(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public void setPublisher(PublisherVO publisher) {
        this.publisher = publisher;
    }
}
