package org.zenika.zacademy.GamesOfThronesRatings.repository;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.zenika.zacademy.GamesOfThronesRatings.configuration.GotConfig;
import org.zenika.zacademy.GamesOfThronesRatings.service.model.BookResponse;

import java.util.List;

@Component
public class BookClient {
    private final GotConfig gotConfig;
    private final RestTemplate restTemplate;

    public BookClient(GotConfig gotConfig) {
        this.gotConfig = gotConfig;
        restTemplate = new RestTemplate();
    }

    public List<BookResponse> getAll () {
        ResponseEntity<List<BookResponse>> responseEntity = restTemplate.exchange(
                gotConfig.getUrl() + "/books",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<BookResponse>>() {});

        return responseEntity.getBody();
    }
}
