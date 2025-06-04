package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "tariffs")
@Data
public class Tariffs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "market_price")
    private int marketPrice;

    @OneToMany
    @JoinColumn(name = "type")
    private List<TariffTypes> Type;
}