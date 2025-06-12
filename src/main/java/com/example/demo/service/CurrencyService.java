package com.example.demo.service;

import com.example.demo.model.CurrencyEntity;
import com.example.demo.model.CurrencyEntity;
import com.example.demo.repository.CurrencyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class CurrencyService {
    private final CurrencyRepository repository;

    public List<CurrencyEntity> getCurrencies() {
        return repository.findAll();
    }
}

