package com.example.demo.controller;

import com.example.demo.model.Quote;
import com.example.demo.service.QuoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contract")
@RequiredArgsConstructor

public class QuoteController {
    private final QuoteService service;

    @GetMapping("/sorts")
    public List<Quote> getQuotes() {
        return service.getQuotes();
    }
}
