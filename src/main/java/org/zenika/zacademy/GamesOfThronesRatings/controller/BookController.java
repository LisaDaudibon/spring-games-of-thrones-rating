package org.zenika.zacademy.GamesOfThronesRatings.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zenika.zacademy.GamesOfThronesRatings.repository.BookClient;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookClient bookClient;

    public BookController(BookClient bookClient) {
        this.bookClient = bookClient;
    }

    @GetMapping
    public String getAll (){
        return bookClient.getAll();
    }
}
