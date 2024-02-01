package com.example.processos3_spring;

import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class ApiClient implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(ApiClient.class);

    private final RestTemplate restTemplate;

    public ApiClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        String quote = restTemplate.getForObject(
                "http://localhost:8080/bmw", String.class);
        log.info(quote);
    }
}

