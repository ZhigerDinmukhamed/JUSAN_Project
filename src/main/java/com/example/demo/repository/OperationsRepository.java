package com.example.demo.repository;

import com.example.demo.model.Operations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationsRepository extends JpaRepository<Operations, Long> {
}
