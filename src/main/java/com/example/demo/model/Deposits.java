package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "deposits")
@Data
public class Deposits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "deposit_amount")
    private double depositAmount;
    @Column(name = "interest_rate")
    private double interestRate;
    @Column(name = "maturity_date")
    private Date maturityDate;
    @Column(name = "name", length = 255)
    private String Name;
    @Column(name = "placement_date")
    private Date placementDate;
    @ManyToOne
    @JoinColumn(name = "currency_id")
    private CurrencyEntity depositCurrency;
}
