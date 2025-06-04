package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "security_quotes")
@Data
public class SecurityQuotes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "emission", length = 255)
    private String Emission;
    @Column(name = "financial_instrument", length = 255)
    private String financialInstrument;
    @Column(name = "instrument_code", length = 255)
    private String instrumentCode;
    @Column(name = "instrument_trade_date")
    private Date instrumentTradeDate;
    @Column(name = "isin", length = 255)
    private String Isin;
    @Column(name = "liquidity", length = 255)
    private String Liquidity;
    @Column(name = "market_maker", length = 255)
    private String marketMaker;
    @Column(name = "note", length = 255)
    private String Note;
    @Column(name = "price", precision = 38, scale = 2)
    private BigDecimal Price;
    @Column(name = "trade_date")
    private Date tradeDate;
    @Column(name = "valuation_type", length = 255)
    private String valuationType;
    @Column(name = "value", precision = 38, scale = 2)
    private BigDecimal Value;
}
