package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "Liabilities")
@Data
public class Liabilities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "calculation_comission", length = 255)
    private String calculationComission;
    @Column(name = "comission_method", length = 255)
    private String comissionMethod;
    @Column(name = "name_comission_type", length = 255)
    private String nameComissionType;
    @Column(name = "name_custody", length = 255)
    private String nameCustody;
    @Column(name = "percent_per_year", length = 255)
    private String percentPerYear;
    @Column(name = "period", length = 255)
    private String Period;
    @Column(name = "sum_comission", precision = 38, scale = 2)
    private BigDecimal sumComission;
}
