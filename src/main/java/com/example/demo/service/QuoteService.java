package com.example.demo.service;

import com.example.demo.model.Quote;
import com.example.demo.repository.QuoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor

public class QuoteService {
    private final QuoteRepository repository;

    public List<Quote> getQuotes() {
        return repository.findAll();
    }
}
