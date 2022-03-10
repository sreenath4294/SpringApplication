package com.example.SpringApplication.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "AUTHOR")
public class Author {

    private Long id;
    private String firstname;
    private String lastname;

    @Id
    @Column(name = "Author_ID")
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "FIRSTNAME")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Column(name = "LASTNAME")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
