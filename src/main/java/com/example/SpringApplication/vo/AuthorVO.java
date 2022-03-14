package com.example.SpringApplication.vo;

import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class AuthorVO implements Serializable {

    private Long id;
    private String firstname;
    private String lastname;

    private Set<BookVO> books;

    public AuthorVO(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
