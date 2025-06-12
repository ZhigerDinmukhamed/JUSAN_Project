package com.example.demo.controller;

import com.example.demo.model.ContractTypes;
import com.example.demo.service.ContractTypesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contract")
@RequiredArgsConstructor
public class ContractTypesController {

    private final ContractTypesService service;

    @GetMapping("/types")
    public List<ContractTypes> getAllContractTypes() {
        return service.findAllContractTypes();
    }
}
