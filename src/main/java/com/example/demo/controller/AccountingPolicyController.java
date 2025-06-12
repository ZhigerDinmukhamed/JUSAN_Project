package com.example.demo.controller;

import com.example.demo.model.AccountingPolicy;
import com.example.demo.service.AccountingPolicyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contract")
@RequiredArgsConstructor
public class AccountingPolicyController {
    private final AccountingPolicyService service;

    @GetMapping("/kinds")
    public List<AccountingPolicy> getAllAccountingPolicies(){
        return service.getAllAccountingPolicies();
    }
}
