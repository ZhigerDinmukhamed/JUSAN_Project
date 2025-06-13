package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "accounting_policy")
public class AccountingPolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "period_revaluation")
    private String periodRevaluation;

    @Column(name = "revaluation")
    private String Revaluation;

    @OneToMany
    @JoinColumn(name = "quote")
    private List<Quote> Quote;
}