package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "accounting_policy")
public class AccountingPolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "policy_name")
    private String policyName;
    @Column(name = "period")
    private int period;
    @Column(name = "currency_period")
    private int currencyPeriod;
    @OneToOne(mappedBy = "accountingPolicy")
    private Quote quote;
}
