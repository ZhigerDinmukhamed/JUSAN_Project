package com.example.demo.controller;

import com.example.demo.model.Operations;
import com.example.demo.service.OperationsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/operations")
@RequiredArgsConstructor
public class OperationsController {
    private final OperationsService service;

    @GetMapping
    public List<Operations> getAllOperations() {
        return service.getAllOperations();
    }
}
