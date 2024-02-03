package org.zenika.zacademy.GamesOfThronesRatings.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zenika.zacademy.GamesOfThronesRatings.repository.BookClient;
import org.zenika.zacademy.GamesOfThronesRatings.service.model.BookResponse;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookClient bookClient;

    public BookController(BookClient bookClient) {
        this.bookClient = bookClient;
    }

    @GetMapping
    public List<BookResponse> getAll (){
        return bookClient.getAll();
    }
}
