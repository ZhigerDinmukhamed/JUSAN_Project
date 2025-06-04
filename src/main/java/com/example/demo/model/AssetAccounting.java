package com.example.demo.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "asset_accounting")
public class AssetAccounting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
    @Column(name = "amount", precision = 38, scale = 2)
    private BigDecimal amount;
    @Column(name = "comission", precision = 38, scale = 2)
    private BigDecimal comission;
    @Column(name = "from_value")
    BigInteger fromValue;
    @Column(name = "is_fixed")
    private boolean isFixed;
    @Column(name = "to_value")
    private BigInteger toValue;
    @OneToOne
    @JoinColumn(name = "tariff_category_id")
    private TariffCategories tariffCategoryId;
}
