package com.example.Account.controller;

import com.example.Account.bo.CreateAccountResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AccountController {

    private final RestTemplate restTemplate;

    @Value("${stock.service.url}")
    private String stockServiceUrl;

    public AccountController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/api/account")
    public CreateAccountResponse getAccountInfo() {
        // Call Stock Microservice
        return restTemplate.getForObject(stockServiceUrl + "/api/account", CreateAccountResponse.class);
    }
}
