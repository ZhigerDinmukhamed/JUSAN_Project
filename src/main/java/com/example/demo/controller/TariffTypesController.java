package com.example.demo.controller;

import com.example.demo.model.TariffTypes;
import com.example.demo.service.TariffTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tariff-types")
public class TariffTypesController {
    private final TariffTypesService tariffTypesService;
    @Autowired
    public TariffTypesController(TariffTypesService tariffTypesService) {
        this.tariffTypesService = tariffTypesService;
    }
    @PostMapping
    public TariffTypes create(@RequestBody TariffTypes tariffType) {
        return tariffTypesService.save(tariffType);
    }
    @GetMapping
    public List<TariffTypes> getAll() {
        return tariffTypesService.getAll();
    }
    @GetMapping(("/{id}"))
    public TariffTypes getById(@PathVariable Long id) {
        return tariffTypesService.getById(id);
    }
}
