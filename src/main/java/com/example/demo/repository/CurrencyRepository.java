package com.example.demo.repository;

import com.example.demo.model.CurrencyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface CurrencyRepository extends JpaRepository<CurrencyEntity, Long> {
}
