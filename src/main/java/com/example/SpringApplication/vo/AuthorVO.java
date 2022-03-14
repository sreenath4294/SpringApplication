package com.example.SpringApplication.vo;

import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorVO implements Serializable {

    private Long id;
    private String firstname;
    private String lastname;

    private Set<BookVO> books;
}
