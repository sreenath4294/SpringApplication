package com.example.springapplication.vo;

import lombok.*;

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
