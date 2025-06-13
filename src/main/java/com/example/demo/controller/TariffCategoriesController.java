package com.example.demo.controller;

import com.example.demo.model.TariffCategories;
import com.example.demo.service.TariffCategoriesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tariff-categories")
public class TariffCategoriesController {
    private final TariffCategoriesService service;
    public TariffCategoriesController(TariffCategoriesService service){
        this.service=service;
    }
    @PostMapping
    public TariffCategories create(@RequestBody TariffCategories category){
        return service.save(category);
    }
    @GetMapping
    public List<TariffCategories> getAll(){
        return service.getAll();
    }
}