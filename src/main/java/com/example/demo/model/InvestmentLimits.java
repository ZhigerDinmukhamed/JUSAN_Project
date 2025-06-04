package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "investment_limits")
@Data
public class InvestmentLimits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "asset_name", length = 255)
    private String assetName;
    @Column(name = "max_investment_amount_by_asset", precision = 38, scale = 2)
    private BigDecimal maxInvestmentAmountByAsset;
    @Column(name = "total_investment_size", precision = 38, scale = 2)
    private BigDecimal totalInvestmentSize;

}
