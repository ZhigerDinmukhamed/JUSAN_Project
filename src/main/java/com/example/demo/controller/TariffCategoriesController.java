package com.example.demo.controller;

import com.example.demo.model.TariffCategories;
import com.example.demo.service.TariffCategoriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tariffs")
@RequiredArgsConstructor

public class TariffCategoriesController {
    private final TariffCategoriesService service;

    @GetMapping("/categories")
    public List<TariffCategories> getAllTariffCategories() {
        return service.getAllTariffCategories();
    }
}
