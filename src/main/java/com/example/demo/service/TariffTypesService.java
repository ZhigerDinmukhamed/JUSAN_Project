package com.example.demo.service;

import com.example.demo.model.TariffTypes;
import com.example.demo.repository.TariffTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TariffTypesService {
    private final TariffTypesRepository repository;
    @Autowired
    public TariffTypesService(TariffTypesRepository repository){
        this.repository=repository;
    }
    public TariffTypes save(TariffTypes type){
        return repository.save(type);
    }
    public List<TariffTypes> getAll(){
        return repository.findAll();
    }
    public TariffTypes getById(long id){
        return repository.findById(id).orElse(null);
    }
}
