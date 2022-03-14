package com.example.SpringApplication.vo;

import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PublisherVO implements Serializable {

    private Long id;

    private String name;
    private String addressLine1;
    private String addressLine2;

    private Set<BookVO> books;
}
