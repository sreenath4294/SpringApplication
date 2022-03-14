package com.example.SpringApplication.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "AUTHOR")
public class Author {

    @Id
    @Column(name = "Author_ID")
    @GeneratedValue
    private Long id;

    @Column(name = "FIRSTNAME")
    private String firstname;

    @Column(name = "LASTNAME")
    private String lastname;

//    @ManyToMany (mappedBy = "authors")
//    private Set<Book> books = new HashSet<>();


    public Author(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
