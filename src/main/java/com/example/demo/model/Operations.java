package com.example.demo.model;

import jakarta.persistence.*;
import jdk.jfr.ContentType;
import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "operations")
@Data
public class Operations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
    @Column(name = "comissions", precision = 38, scale = 2)
    private BigDecimal Comissions;
    @OneToMany
    @JoinColumn(name = "operation_type_id")
    private List<OperationTypes> OperationTypeId;
    @OneToMany
    @JoinColumn(name = "tariff_category_id")
    private List<TariffCategories> TariffCategoryId;
}