package com.example.demo.service;

import com.example.demo.model.TariffCategories;
import com.example.demo.repository.TariffCategoriesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor

public class TariffCategoriesService {
    private final TariffCategoriesRepository repository;
    public List<TariffCategories> getAllTariffCategories() {
        return repository.findAll();
    }
}
