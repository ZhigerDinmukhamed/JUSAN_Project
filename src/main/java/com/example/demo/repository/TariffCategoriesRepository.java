package com.example.demo.repository;

import com.example.demo.model.TariffCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TariffCategoriesRepository extends JpaRepository<TariffCategories, Long> {
}
