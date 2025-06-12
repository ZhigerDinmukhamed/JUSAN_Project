package com.example.demo.service;

import com.example.demo.model.AccountingPolicy;
import com.example.demo.repository.AccountingPolicyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor

public class AccountingPolicyService {
    private final AccountingPolicyRepository repository;
    public List<AccountingPolicy> getAllAccountingPolicies() {
        return repository.findAll();
    }
}
