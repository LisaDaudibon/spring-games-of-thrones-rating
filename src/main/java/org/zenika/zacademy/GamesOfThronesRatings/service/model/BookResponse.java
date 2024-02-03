package org.zenika.zacademy.GamesOfThronesRatings.service.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookResponse {
    private String name;
    private String isbn;
    private int numberOfPages;
    private String publisher;
    private String country;
}
