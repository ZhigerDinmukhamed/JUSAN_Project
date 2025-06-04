package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "account_categories")
@Data
public class AccountCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "market_price")
    private int marketPrice;
    @Column(name = "tools_evaluation", length = 255)
    private String toolsEvaluation;
}
