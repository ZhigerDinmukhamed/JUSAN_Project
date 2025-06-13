package com.example.demo.controller;

import com.example.demo.model.TariffTypes;
import com.example.demo.service.TariffTypesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contract")
@RequiredArgsConstructor

public class TariffTypesController {
    private final TariffTypesService service;

    @GetMapping("/types")
    public List<TariffTypes> getAllTariffTypes() {
        return service.getAllTariffTypes();
    }
}
