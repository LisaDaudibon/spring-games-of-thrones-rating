package org.zenika.zacademy.GamesOfThronesRatings.repository;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.zenika.zacademy.GamesOfThronesRatings.configuration.GotConfig;

@Component
public class BookClient {
    private final GotConfig gotConfig;
    private final RestTemplate restTemplate;

    public BookClient(GotConfig gotConfig) {
        this.gotConfig = gotConfig;
        restTemplate = new RestTemplate();
    }

    public String getAll () {
        return restTemplate.getForObject(gotConfig.getUrl() + "/books", String.class);
    }
}
