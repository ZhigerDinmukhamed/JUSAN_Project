package com.example.demo.service;

import com.example.demo.model.TariffTypes;
import com.example.demo.repository.TariffTypesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor

public class TariffTypesService {
    private final TariffTypesRepository repository;
    public List<TariffTypes> getAllTariffTypes() {
        return repository.findAll();
    }
}
