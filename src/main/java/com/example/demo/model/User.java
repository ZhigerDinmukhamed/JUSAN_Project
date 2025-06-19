package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long JusanId;
    @Column(name = "iin", length = 255)
    private String IIN;
    @Column(name = "full_name", length = 255)
    private String FullName;
    @Column(name = "first_name", length = 255)
    private String FirstName;
    @Column(name = "last_name", length = 255)
    private String LastName;
    @Column(name = "client_type", length = 255)
    private String ClientType;
    @Column(name = "client_code", length = 255)
    private String ClientCode;
    @Column(name = "doctype", length = 255)
    private String Doctype;
    @Column(name = "file_name", length = 255)
    private String FileName;
    @Column(name = "file_bytes", length = 255)
    private String FileBytes;
    @Column(name = "user_code", length = 255)
    private String UserCode;

}
