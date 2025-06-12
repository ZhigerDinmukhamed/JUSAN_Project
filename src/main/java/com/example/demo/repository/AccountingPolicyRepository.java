package com.example.demo.repository;

import com.example.demo.model.AccountingPolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AccountingPolicyRepository extends JpaRepository<AccountingPolicy, Long> {
}
