package com.example.SpringApplication.vo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class BookVO implements Serializable {

    private Long id;
    private String title;
    private String isbn;


//    @ManyToOne
//    private PublisherVO publisher;
//
//    @ManyToMany
//    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
//    inverseJoinColumns = @JoinColumn(name = "author_id"))
//    private Set<AuthorVO> authors = new HashSet<>();

//    public PublisherVO getPublisher() {
//        return publisher;
//    }

    public BookVO() {
    }

    public BookVO(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

//    public void setPublisher(PublisherVO publisher) {
//        this.publisher = publisher;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

//    public Set<AuthorVO> getAuthors() {
//        return authors;
//    }

//    public void setAuthors(Set<AuthorVO> authors) {
//        this.authors = authors;
//    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
//                ", authors=" + authors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookVO book = (BookVO) o;

        return id != null ? id.equals(book.id) : book.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
