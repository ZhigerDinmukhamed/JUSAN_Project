package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "operation_types")
@Data
public class OperationTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code", length = 255)
    private String Code;
    @Column(name = "name", length = 255)
    private String Name;
}
