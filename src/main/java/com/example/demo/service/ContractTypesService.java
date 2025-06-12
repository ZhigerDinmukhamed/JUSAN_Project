package com.example.demo.service;

import com.example.demo.model.ContractTypes;
import com.example.demo.repository.ContractTypesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class ContractTypesService {
    private final ContractTypesRepository repository;

    public List<ContractTypes> findAllContractTypes() {
        return repository.findAll();
    }
}
