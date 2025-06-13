package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tariff_categories")
@Data
public class TariffCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "begin_date")
    private Date beginDate;
    @Column(name = "end_date")
    private Date endDate;
    @Column(name = "is_standard")
    private Boolean isStandard;
    @ManyToOne
    @JoinColumn(name = "tariff_type_id")
    private TariffTypes tariffTypeId;
}

