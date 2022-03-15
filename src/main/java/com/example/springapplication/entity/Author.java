package com.example.springapplication.entity;

import lombok.*;

import javax.persistence.*;

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
