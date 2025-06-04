package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "nomenclature")
@Data
public class Nomenclature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "code", length = 255)
    private String Code;
    @Column(name = "name", length = 255)
    private String Name;
    @Column(name = "nomenclature", length = 255)
    private String Nomenclature;
}
