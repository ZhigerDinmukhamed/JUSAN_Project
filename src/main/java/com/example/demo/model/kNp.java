package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Currency;

@Entity
@Table(name = "knp")
@Data
public class kNp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "classification", length = 255)
    private String Classification;
    @Column(name = "code", length = 255)
    private String Code;
    @Column(name = "name", length = 255)
    private String Name;
    @ManyToOne
    @JoinColumn(name = "asset_types_id")
    private AssetTypes assetTypes;
    @ManyToOne
    @JoinColumn(name = "currency_id")
    private CurrencyEntity CurrencyId;
    @ManyToOne
    @JoinColumn(name = "operation_types_id")
    private OperationTypes OperationTypesId;


}
