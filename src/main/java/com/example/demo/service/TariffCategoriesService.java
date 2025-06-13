package com.example.demo.service;

import com.example.demo.model.TariffCategories;
import com.example.demo.repository.TariffCategoriesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TariffCategoriesService {
    private final TariffCategoriesRepository repository;
    public TariffCategoriesService(TariffCategoriesRepository repository){
        this.repository=repository;
    }
    public TariffCategories save(TariffCategories category){
        return repository.save(category);
    }
    public List<TariffCategories> getAll(){
        return repository.findAll();
    }
}
