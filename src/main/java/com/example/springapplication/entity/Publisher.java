package com.example.springapplication.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "PUBLISHER")
public class Publisher {

    @Id
    @Column(name = "PUBLISHER_ID")
    @GeneratedValue
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ADDRESS_LINE1")
    private String addressLine1;

    @Column(name = "ADDRESS_LINE2")
    private String addressLine2;

    @OneToMany
    private Set<Book> books = new HashSet<>();

    public Publisher(String name, String addressLine1, String addressLine2) {
        this.name = name;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
    }
}
