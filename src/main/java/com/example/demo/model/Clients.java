package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="clients")
@Data
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
