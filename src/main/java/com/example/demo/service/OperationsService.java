package com.example.demo.service;

import com.example.demo.model.Operations;
import com.example.demo.repository.OperationsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperationsService {
    private final OperationsRepository repository;

    public List<Operations> getAllOperations() {
        return repository.findAll();
    }
}
