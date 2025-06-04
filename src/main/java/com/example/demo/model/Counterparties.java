package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "counterparties")
@Data
public class Counterparties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "code", length = 255)
    private String Code;
    @Column(name = "name", length = 255)
    private String Name;
}