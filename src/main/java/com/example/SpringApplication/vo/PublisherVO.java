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

    public PublisherVO(String name, String addressLine1, String addressLine2) {
        this.name = name;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
    }
}
