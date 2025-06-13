package com.example.demo.repository;

import com.example.demo.model.TariffTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TariffTypesRepository extends JpaRepository<TariffTypes, Long> {
}
