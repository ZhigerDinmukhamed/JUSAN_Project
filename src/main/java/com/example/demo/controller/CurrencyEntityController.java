package com.example.demo.controller;

import com.example.demo.model.CurrencyEntity;

import com.example.demo.service.CurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/currency")
public class CurrencyEntityController {

    private final CurrencyService service;

    @GetMapping("/types")
    public List<CurrencyEntity> getCurrencies() {
        return service.getCurrencies();
    }
}
