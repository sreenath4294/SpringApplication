package com.example.SpringApplication.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "BOOK")
public class Book {

    private Long id;
    private String title;
    private String isbn;

    @Id
    @GeneratedValue
    @Column(name = "BOOK_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "ISBN")
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
