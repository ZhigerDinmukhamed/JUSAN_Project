package com.example.demo;

import com.example.demo.model.ContractTypes;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contract-types")
public class ContractTypesController {
    private final ContractTypesRepository contractTypesRepository;

    public ContractTypesController(ContractTypesRepository contractTypesRepository) {
        this.contractTypesRepository = contractTypesRepository;
    }

    @GetMapping
    public List<ContractTypes> getAll() {
        return contractTypesRepository.findAll();
    }

    @PostMapping
    public ContractTypes create(@RequestBody ContractTypes contractTypes) {
        return contractTypesRepository.save(contractTypes);
    }
}

