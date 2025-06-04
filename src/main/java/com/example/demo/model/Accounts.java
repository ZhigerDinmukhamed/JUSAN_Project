package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "accounts")
@Data
public class Accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "account_number", length = 255)
    private String accountNumber;

    @Column(name = "closed_at")
    private Date closedAt;

    @Column(name = "note", length = 255)
    private String note;

    @Column(name = "opened_at")
    private Date openedAt;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Clients clientId;

    @ManyToOne
    @JoinColumn(name = "currency_id")
    private CurrencyEntity currencyId;

    @Column(name = "account", length = 255)
    private String account;

    @Column(name = "bic", length = 255)
    private String bic;

    @Column(name = "code_client", length = 255)
    private String codeClient;

    @Column(name = "date_closed", precision = 6)
    private Date dateClosed;

    @Column(name = "date_opened", precision = 6)
    private Date dateOpened;

    @ManyToOne
    @JoinColumn(name = "account_type")
    private AccountTypes accountType;
}