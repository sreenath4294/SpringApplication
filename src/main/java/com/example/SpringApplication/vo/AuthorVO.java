package com.example.SpringApplication.vo;

import java.io.Serializable;
import java.util.Set;

public class AuthorVO implements Serializable {

    private Long id;
    private String firstname;
    private String lastname;

    private Set<BookVO> books;

    public AuthorVO() {
    }

    public AuthorVO(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Set<BookVO> getBooks() {
        return books;
    }

    public void setBooks(Set<BookVO> books) {
        this.books = books;
    }

    @Override
    public String  toString() {
        return "Author{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
//                ", books=" + books +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthorVO author = (AuthorVO) o;

        return id != null ? id.equals(author.id) : author.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
