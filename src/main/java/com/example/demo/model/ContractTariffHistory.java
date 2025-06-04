package com.example.demo.model;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "contract_tariff_history")
public class ContractTariffHistory {
    @Id
    @GeneratedValue()
            private Long id;
    @Column(name = "contract_id")
    BigInteger contractId;
    @Column(name = "effective_from")
    Date effectiveFrom;
    @Column(name = "effective_to")
    Date effectiveTo;
    @Column(name = "is_standard")
    Boolean isStandard;
    @OneToOne
    @JoinColumn(name = "tariff_category_id")
    private TariffCategories tariffCategoryId;
}




