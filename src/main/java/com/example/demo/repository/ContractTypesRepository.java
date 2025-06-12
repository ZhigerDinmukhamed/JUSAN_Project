package com.example.demo.repository;

import com.example.demo.model.ContractTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ContractTypesRepository extends JpaRepository<ContractTypes, Long> {

}
