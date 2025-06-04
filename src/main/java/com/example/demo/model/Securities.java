package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "securities")
@Data
public class Securities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "base_coupon_payment", length = 255)
    private String baseCouponPayment;
    @Column(name = "coupon_type", length = 255)
    private String couponType;
    @Column(name = "date_coupon_payment")
    private Date dateCouponPayment;
    @Column(name = "date_fixed_registry")
    private Date dateFixedRegistry;
    @Column(name = "date_payment")
    private Date datePayment;
    @Column(name = "date_started")
    private Date dateStarted;
    @Column(name = "isin", length = 12)
    private String Isin;
    @Column(name = "nominal")
    private int Nominal;
    @Column(name = "nominal_currency", length = 255)
    private String nominalCurrency;
    @Column(name = "percentage_rate")
    private int percentageRate;
    @Column(name = "rating", length = 255)
    private String Rating;
    @Column(name = "rating_agency", length = 255)
    private String ratingAgency;
    @Column(name = "sec_type", length = 255)
    private String secType;
    @Column(name = "stock_market", length = 255)
    private String stockMarket;
    @Column(name = "type", length = 255)
    private String Type;
    @ManyToOne
    @JoinColumn(name = "trading_platforms_code")
    private TradingPlatforms tradingPlatformsCode;
}
