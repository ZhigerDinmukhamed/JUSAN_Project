package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "rating_agencies")
@Data
public class RatingAgencies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "hierarchy")
    private int hierarchy;
    @Column(name = "name", length = 255)
    private String Name;
    @Column(name = "rating", length = 255)
    private String Rating;
}
