package com.example.SpringApplication.vo;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookVO implements Serializable {

    private Long id;
    private String title;
    private String isbn;

    private PublisherVO publisher;
    private Set<AuthorVO> authors = new HashSet<>();
}
