package com.example.springapplication.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "BOOK")
public class Book {

    @Id
    @GeneratedValue
    @Column(name = "BOOK_ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "ISBN")
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

//    @ManyToMany
//    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
//    inverseJoinColumns = @JoinColumn(name = "author_id"))
//    private Set<Author> authors = new HashSet<>();

    public Book(String title, String isbn
//            , Publisher publisher
    ) {
        this.title = title;
        this.isbn = isbn;
//        this.publisher = publisher;
    }
}
